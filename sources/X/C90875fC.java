package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.5fC  reason: invalid class name and case insensitive filesystem */
public final class C90875fC extends C127237gm {
    public final /* synthetic */ C134077wz A00;

    public final void CLg(C25812DsR dsR) {
        double y;
        View view;
        C04220Ms.A0B(dsR, 0);
        if (dsR.A0I(1.0d)) {
            C134077wz r3 = this.A00;
            r3.A02.A0A(0.0d);
            C25812DsR dsR2 = r3.A03;
            boolean z = r3.A00;
            C04530Oa r5 = r3.A06;
            View A0I = C86144wL.A0I(r5);
            if (z) {
                y = (-((double) A0I.getY())) - ((double) C86144wL.A0I(r5).getHeight());
            } else {
                ViewParent parent = A0I.getParent();
                if (!(parent instanceof View) || (view = (View) parent) == null) {
                    y = (double) C86144wL.A0I(r5).getY();
                } else {
                    y = (double) view.getHeight();
                }
            }
            dsR2.A0A(y);
        }
    }

    public final void CLi(C25812DsR dsR) {
        C04220Ms.A0B(dsR, 0);
        C04530Oa r5 = this.A00.A06;
        View A0I = C86144wL.A0I(r5);
        DON don = dsR.A09;
        A0I.setScaleX((float) don.A00);
        C86144wL.A0I(r5).setScaleY((float) don.A00);
        C86144wL.A0I(r5).setAlpha((float) don.A00);
    }

    public C90875fC(C134077wz r1) {
        this.A00 = r1;
    }
}
