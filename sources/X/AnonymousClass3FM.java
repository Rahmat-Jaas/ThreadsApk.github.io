package X;

import android.content.Context;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.graphql.instagramschemagraphservices.ServerSmartPrefetchQueryResponseImpl;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3FM  reason: invalid class name */
public final class AnonymousClass3FM {
    public final Context A00;
    public final C83304rA A01;
    public final UserSession A02;

    public AnonymousClass3FM(UserSession userSession, Context context) {
        int A022 = C18200wM.A02(1, userSession, context);
        C31580Grx A012 = AnonymousClass3WK.A01(userSession);
        Context A09 = C18230wP.A09(context);
        C04220Ms.A0B(A012, A022);
        this.A02 = userSession;
        this.A01 = A012;
        this.A00 = A09;
    }

    public final void A00(Integer num, Map map) {
        String str;
        UserSession userSession = this.A02;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36317835433086994L)) {
            C67463zb A002 = C67463zb.A00();
            C67463zb A003 = C67463zb.A00();
            switch (num.intValue()) {
                case 0:
                    str = "STARTUP";
                    break;
                case 1:
                    str = "USER_PROFILE_PAGE";
                    break;
                default:
                    str = "STORES_TAB";
                    break;
            }
            A002.A05("entrypoint", str);
            ArrayList A0w = C18220wO.A0w(map);
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
                GraphQlCallInput.A05(A004, C18200wM.A0p(A0o), "key");
                GraphQlCallInput.A05(A004, C18230wP.A0u(A0o), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                A0w.add(A004);
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0w);
            A002.A06("params", copyOf);
            boolean A1W = AnonymousClass0wJ.A1W(copyOf);
            AnonymousClass7Ko.A0B(true);
            this.A01.AMA(new PandoGraphQLRequest(C63233h2.A04(A1W), "ServerSmartPrefetchQuery", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), ServerSmartPrefetchQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_ssp"), new C679341f(this.A00, userSession));
            return;
        }
        AnonymousClass0LU.A0C("SSP", "SSP disabled");
    }
}
