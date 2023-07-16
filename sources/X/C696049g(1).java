package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.common.api.base.IDxACallbackShape4S1100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.49g  reason: invalid class name and case insensitive filesystem */
public final class C696049g implements AnonymousClass0i4, CallerContextable {
    public static final CallerContext A05 = CallerContext.A00(C696049g.class);
    public static final C62173Xp A06 = new C62173Xp();
    public static final String __redex_internal_original_name = "CrossPostingDestinationPickerManager";
    public long A00 = System.currentTimeMillis();
    public ImmutableList A01;
    public AnonymousClass3CV A02;
    public C83794s0 A03;
    public final UserSession A04;

    public final void A01(String str) {
        String str2 = str;
        C04220Ms.A0B(str, 0);
        UserSession userSession = this.A04;
        if (C62173Xp.A01(userSession)) {
            C60373Ot.A01(userSession, "destinations_fetch_attempted", str2, (String) null, 0);
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            C67463zb A003 = C67463zb.A00();
            C67463zb.A01(A002, A003);
            AnonymousClass7Ko.A0B(true);
            C67473zc A004 = C67473zc.A00(A003, AnonymousClass16L.class, "IGToFBXPostingDestinationsQuery");
            IDxACallbackShape4S1100000_1_I2 iDxACallbackShape4S1100000_1_I2 = new IDxACallbackShape4S1100000_1_I2(str, this, 6);
            C32165H8c A0R = C18180wK.A0R(A004, userSession);
            A0R.A00 = iDxACallbackShape4S1100000_1_I2;
            C31155GhB.A05(A0R, 709, 3, true, true);
        }
    }

    public final void onSessionWillEnd() {
        this.A04.A03(C696049g.class);
    }

    public C696049g(UserSession userSession) {
        this.A04 = userSession;
        ImmutableList of = ImmutableList.of();
        C04220Ms.A06(of);
        this.A01 = of;
    }

    public static final void A00(C696049g r5) {
        long currentTimeMillis = System.currentTimeMillis() - r5.A00;
        UserSession userSession = r5.A04;
        if (C60413Oy.A01(userSession, currentTimeMillis)) {
            ImmutableList of = ImmutableList.of();
            C04220Ms.A06(of);
            r5.A01 = of;
            r5.A02 = null;
            C60413Oy.A00(userSession, "clear_stale_destination_picker_model", currentTimeMillis);
        }
    }
}
