package X;

import android.view.View;

/* renamed from: X.5f6  reason: invalid class name and case insensitive filesystem */
public final class C90815f6 extends C127237gm {
    public View A00;
    public final C25812DsR A01;

    public final void CLi(C25812DsR dsR) {
        C25812DsR dsR2 = dsR;
        C04220Ms.A0B(dsR2, 0);
        View view = this.A00;
        if (view != null) {
            DON don = dsR2.A09;
            float A002 = (float) C98896Hi.A00(don.A00, 0.0d, 1.0d, 1.0d, 0.9800000190734863d);
            view.setScaleX(A002);
            view.setScaleY(A002);
            view.setAlpha((float) C98896Hi.A00(don.A00, 0.0d, 1.0d, 1.0d, 0.699999988079071d));
        }
    }

    public C90815f6() {
        C25812DsR A0O = C86134wK.A0O();
        A0O.A0D(C25757DrU.A00(5.0d, 10.0d));
        A0O.A0E(this);
        this.A01 = A0O;
    }
}
