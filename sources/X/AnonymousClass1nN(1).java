package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.1nN  reason: invalid class name */
public final class AnonymousClass1nN extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nN(C697249u r7) {
        super("fetchFacebookCrosspostingSettingFromServer", 763, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        new AnonymousClass3zG(userSession).A04(true, "app_start", true, true);
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36325317266121774L)) {
            C49222r2.A00(userSession).A04((C83804s1) null, "app_start", (String) null);
        } else {
            C63073bQ.A00(userSession).A05();
        }
        C49222r2.A00(userSession).A03();
        if (C696249i.A00(userSession)) {
            C63073bQ.A00(userSession).A06();
            C63073bQ.A00(userSession).A07();
        }
        if (C63803iN.A0E(r2, userSession, 36327915721402591L)) {
            C04220Ms.A0B(userSession, 0);
            C67053yn r5 = (C67053yn) userSession.A01(C67053yn.class, new KtLambdaShape116S0100000_I2_96(userSession, 20));
            UserSession userSession2 = r5.A01;
            if (!C63803iN.A0E(r2, userSession2, 36327915721468128L) || C67373zR.A08(userSession2)) {
                GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
                C67463zb A003 = C67463zb.A00();
                C67463zb.A01(A002, A003);
                AnonymousClass7Ko.A0B(true);
                C67473zc A004 = C67473zc.A00(A003, AnonymousClass16L.class, "IGToFBXPostingDestinationsQuery");
                IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(r5, 162);
                C32165H8c A0R = C18180wK.A0R(A004, userSession2);
                A0R.A00 = A06;
                C31155GhB.A05(A0R, 1207975954, 3, true, true);
            }
        }
    }
}
