package X;

import com.instagram.common.task.IDxCallbackShape24S0300000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.4Bj  reason: invalid class name */
public final class AnonymousClass4Bj implements C82514pp {
    public final /* synthetic */ C25691of A00;

    public AnonymousClass4Bj(C25691of r1) {
        this.A00 = r1;
    }

    public final void onSuccess() {
        C25691of r1 = this.A00;
        UserSession A0X = AnonymousClass0wJ.A0X(r1.A06);
        String A0q = C18200wM.A0q(r1.A01);
        boolean A1Z = AnonymousClass0wJ.A1Z(A0X, A0q);
        AnonymousClass0TJ r5 = AnonymousClass0TJ.A05;
        if (!C63803iN.A0E(r5, A0X, 2342163271304091527L)) {
            C32159H7t A002 = C32159H7t.A00(A0X);
            C04220Ms.A06(A002);
            A002.A04(A0q);
        }
        HEL A01 = H8D.A01(C60883Qx.A00(A0X), A0q);
        if (A01 != null) {
            ArrayList A012 = C41061Lvh.A01(A01.AvD());
            if (C63803iN.A0E(r5, A0X, 2342163271304091527L)) {
                C31155GhB.A05(C32159H7t.A01(new IDxCallbackShape24S0300000_1_I2(A1Z ? 1 : 0, A012, A0X, A01), A0X), 1967622104, 2, false, false);
                return;
            }
            C32159H7t A003 = C32159H7t.A00(A0X);
            C04220Ms.A06(A003);
            C30839GYn.A00(A003, A01, A0X, A012);
        }
    }
}
