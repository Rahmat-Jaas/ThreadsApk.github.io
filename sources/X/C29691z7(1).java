package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape313S0100000_1_I2;
import com.facebook.redex.IDxMCallbackShape396S0100000_1_I2;
import com.instagram.graphql.instagramschemagraphservices.FXAICQueryResponseImpl;
import com.instagram.graphql.instagramschemagraphservices.FxIgXavSwitcherBadgingDataQueryResponseImpl;
import com.instagram.service.session.UserSession;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

/* renamed from: X.1z7  reason: invalid class name and case insensitive filesystem */
public final class C29691z7 extends C58973Ix implements AnonymousClass0i4 {
    public FxCalAccountLinkageInfo A00;
    public FxCalAccountLinkageInfoForSwitcher A01;
    public String A02;
    public final AnonymousClass49V A03;
    public final UserSession A04;
    public final C33369HmW A05;
    public final MailboxCallback A06;

    public C29691z7(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = (AnonymousClass49V) userSession.A01(AnonymousClass49V.class, new KtLambdaShape75S0100000_I2_55(userSession, 43));
        this.A00 = A01();
        this.A01 = A02();
        this.A02 = "";
        this.A05 = new AnonymousClass405(this);
        this.A06 = new IDxMCallbackShape396S0100000_1_I2(this, 1);
        A06();
    }

    public final void A0E(CallerContext callerContext, C83954sG r18, Boolean bool, String str) {
        Object r4;
        boolean A0E;
        PandoGraphQLRequest pandoGraphQLRequest;
        C31580Grx A012;
        int i;
        String str2 = str;
        CallerContext callerContext2 = callerContext;
        boolean A1Z = AnonymousClass0wJ.A1Z(str2, callerContext2);
        UserSession userSession = this.A04;
        if (C63793iM.A0E(userSession) && "".equals(this.A02)) {
            C31152Gh4 A002 = C60833Qr.A00(C10600ic.A00).A00("FX_CACHE_FDID_STORE");
            C04220Ms.A06(A002);
            String A0A = A002.A0A("fdid", "");
            C04220Ms.A06(A0A);
            this.A02 = A0A;
        }
        C83954sG r6 = r18;
        if (!A09()) {
            AnonymousClass49V r3 = this.A03;
            String str3 = callerContext2.A02;
            C04220Ms.A06(str3);
            r3.A04("manual_fetch_attempt", str2, (List) null, C63203gz.A03("caller_class", str3));
            r4 = new AnonymousClass3HK(callerContext2, this, r6, str2);
            String str4 = this.A02;
            AnonymousClass0wJ.A1M(userSession, 0, str4);
            if (bool != null) {
                A0E = bool.booleanValue();
            } else {
                A0E = C63793iM.A0E(userSession);
            }
            if (A0E) {
                C67463zb A003 = C67463zb.A00();
                C67463zb A004 = C67463zb.A00();
                A003.A05("family_device_id", str4);
                pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A04(A1Z), "FXAICQuery", GraphQlCallInput.A03(A003), GraphQlCallInput.A03(A004), FXAICQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_aic");
                pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
                A012 = AnonymousClass3WK.A01(userSession);
                i = 8;
            } else {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(r4, userSession, (C146958n9) null, 22), C84874u0.A00(C18250wR.A0J((AnonymousClass0gW) null, 3), 1793449280, 3), 3);
                return;
            }
        } else if (C63793iM.A0E(userSession)) {
            AnonymousClass49V r32 = this.A03;
            String str5 = callerContext2.A02;
            C04220Ms.A06(str5);
            r32.A04("manual_fetch_attempt", str2, (List) null, C63203gz.A03("caller_class", str5));
            r4 = new AnonymousClass3BP(callerContext2, this, r6, str2);
            String str6 = this.A02;
            AnonymousClass0wJ.A1M(userSession, 0, str6);
            C67463zb A005 = C67463zb.A00();
            C67463zb A006 = C67463zb.A00();
            A005.A05("caller_name", "fx_company_identity_switcher");
            A005.A05("family_device_id", str6);
            AnonymousClass7Ko.A0B(A1Z);
            pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A04(A1Z), "FxIgXavSwitcherBadgingDataQuery", GraphQlCallInput.A03(A005), GraphQlCallInput.A03(A006), FxIgXavSwitcherBadgingDataQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "switcher_accounts_data");
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
            A012 = AnonymousClass3WK.A01(userSession);
            i = 9;
        } else if (r18 != null) {
            r6.onFailure();
            return;
        } else {
            return;
        }
        A012.AMB(pandoGraphQLRequest, new IDxFCallbackShape313S0100000_1_I2(r4, i), new AnonymousClass0gP(1793449280));
    }

    public static final String A00(FxCalAccountLinkageInfo fxCalAccountLinkageInfo) {
        List list = fxCalAccountLinkageInfo.A01;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            if (((FxCalAccount) next).A02.equalsIgnoreCase("FACEBOOK")) {
                A0v.add(next);
            }
        }
        FxCalAccount fxCalAccount = (FxCalAccount) AnonymousClass00J.A0D(A0v);
        if (fxCalAccount != null) {
            return fxCalAccount.A01;
        }
        return null;
    }

    public final void onSessionWillEnd() {
        A04();
        this.A04.A03(C29691z7.class);
        A09();
    }

    public C29691z7() {
    }
}
