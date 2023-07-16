package X;

import android.content.Context;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.service.session.UserSession;

/* renamed from: X.77g  reason: invalid class name and case insensitive filesystem */
public final class C1198477g {
    public final UserSession A00;
    public final C84714tk A01;

    public C1198477g(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new IDxFlowShape94S0200000_2_I2(19, (Object) AnonymousClass7J0.A04(C86164wN.A0M(true), AnonymousClass7E6.A00(userSession).A02(C26254E5w.class), AnonymousClass7E6.A00(userSession).A02(E6C.class)), (Object) this);
    }

    private final String A00(String str) {
        PendingMedia A06 = PendingMediaStore.A01(this.A00).A06(str);
        if (A06 == null) {
            return null;
        }
        if (A06.A11()) {
            return A06.A2Y;
        }
        String str2 = A06.A2n;
        if (str2 != null) {
            return A00(str2);
        }
        return A06.A2o;
    }

    public final void A01(String str, C11630kW r6) {
        String A002 = A00(str);
        if (A002 != null) {
            C24919DcD dcD = EAW.A0I;
            Context context = C10600ic.A00;
            C04220Ms.A06(context);
            dcD.A00(context, this.A00).A0S(A002, r6);
        }
    }
}
