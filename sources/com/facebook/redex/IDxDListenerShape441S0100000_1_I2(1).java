package com.facebook.redex;

import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass3OP;
import X.AnonymousClass3WK;
import X.AnonymousClass49F;
import X.AnonymousClass49G;
import X.AnonymousClass7Ko;
import X.C10390iG;
import X.C10450iM;
import X.C12090lI;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C25531no;
import X.C28161tl;
import X.C30877GaH;
import X.C31155GhB;
import X.C32165H8c;
import X.C61943Wl;
import X.C63233h2;
import X.C63803iN;
import X.C63873iU;
import X.C67463zb;
import X.GQH;
import android.app.PendingIntent;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.graphql.instagramschema.SessionSurveyUriQueryResponseImpl;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70;

public class IDxDListenerShape441S0100000_1_I2 implements C10390iG {
    public Object A00;
    public final int A01;

    public IDxDListenerShape441S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onAppBackgrounded() {
        int A03;
        int i;
        switch (this.A01) {
            case 0:
                A03 = C14030oh.A03(960751612);
                AnonymousClass49F r4 = (AnonymousClass49F) this.A00;
                IDxACallbackShape35S0200000_1_I2 iDxACallbackShape35S0200000_1_I2 = new IDxACallbackShape35S0200000_1_I2(26, new KtLambdaShape90S0100000_I2_70(r4, 17), r4);
                C32165H8c A002 = AnonymousClass3OP.A00(r4.A04, "post_and_comments");
                A002.A00 = iDxACallbackShape35S0200000_1_I2;
                C31155GhB.A03(A002);
                i = -186478108;
                break;
            case 1:
                A03 = C14030oh.A03(-836549613);
                long A09 = C18240wQ.A09(5000);
                AnonymousClass49G r6 = (AnonymousClass49G) this.A00;
                long j = A09 - r6.A00;
                UserSession userSession = r6.A08;
                if (j >= ((long) (((double) 1000) * C63803iN.A00(AnonymousClass0TJ.A06, userSession, 37156530876973075L))) && j <= TimeUnit.HOURS.toMillis(24)) {
                    IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(r6, 172);
                    String B1d = C12090lI.A00(userSession).B1d();
                    if (B1d == null || B1d.length() == 0) {
                        C10450iM.A03("session_survey_controller", "Pigeon session id is null");
                    } else {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        HashMap hashMap = r6.A09;
                        Iterator A0u = C18190wL.A0u(hashMap);
                        while (A0u.hasNext()) {
                            Map.Entry A0o = C18180wK.A0o(A0u);
                            String A0p = C18200wM.A0p(A0o);
                            String A0u2 = C18230wP.A0u(A0o);
                            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                            GraphQlCallInput.A05(A003, A0p, "context_key");
                            GraphQlCallInput.A05(A003, A0u2, "context_value");
                            A0v.add(A003);
                        }
                        ImmutableList A0S = C18220wO.A0S(A0v);
                        hashMap.clear();
                        C67463zb A004 = C67463zb.A00();
                        C67463zb A005 = C67463zb.A00();
                        A004.A05(C61943Wl.A01(21, 10, 92), B1d);
                        A004.A05("integration_point_id", "449092836056930");
                        A004.A06("survey_context_data", A0S);
                        AnonymousClass7Ko.A0B(true);
                        AnonymousClass3WK.A02(new PandoGraphQLRequest(C63233h2.A03(true), "SessionSurveyUriQuery", GraphQlCallInput.A03(A004), GraphQlCallInput.A03(A005), SessionSurveyUriQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_end_session_survey_uri_root_query"), A06, userSession);
                    }
                }
                i = -480622648;
                break;
            default:
                A03 = C14030oh.A03(1290421692);
                i = 1981146696;
                break;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onAppForegrounded() {
        int A03;
        int i;
        switch (this.A01) {
            case 0:
                A03 = C14030oh.A03(-587697691);
                AnonymousClass49F r0 = (AnonymousClass49F) this.A00;
                PendingIntent A002 = AnonymousClass49F.A00(r0);
                if (A002 != null) {
                    r0.A01.cancel(A002);
                }
                i = 2017332168;
                break;
            case 1:
                A03 = C14030oh.A03(-1231753962);
                AnonymousClass49G r5 = (AnonymousClass49G) this.A00;
                long currentTimeMillis = System.currentTimeMillis();
                r5.A00 = currentTimeMillis;
                long A05 = currentTimeMillis - C18180wK.A05(C28161tl.A04(r5.A08), "last_session_survey_notification_seen_timestamp_ms");
                if (r5.A06 && TimeUnit.MILLISECONDS.toMinutes(A05) >= 5) {
                    C30877GaH.A00().A00.A00.cancel("session_level_survey_notification", 0);
                    r5.A06 = false;
                }
                i = -1010960715;
                break;
            default:
                A03 = C14030oh.A03(594657886);
                GQH.A03.CwT(new C25531no(this));
                i = -656424520;
                break;
        }
        C14030oh.A0A(i, A03);
    }
}
