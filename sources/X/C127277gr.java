package X;

import android.view.View;

/* renamed from: X.7gr  reason: invalid class name and case insensitive filesystem */
public final class C127277gr implements C27927Evd {
    public static final C25757DrU A02 = C25757DrU.A00(8.0d, 40.0d);
    public final C25812DsR A00;
    public final View A01;

    public final void CLf(C25812DsR dsR) {
    }

    public final void CLh(C25812DsR dsR) {
    }

    public final void CLg(C25812DsR dsR) {
        C25812DsR dsR2 = this.A00;
        if (dsR2.A01 == 1.25d) {
            dsR2.A09(1.25d);
            dsR2.A0A(1.0d);
        }
    }

    public final void CLi(C25812DsR dsR) {
        float f = (float) dsR.A09.A00;
        View view = this.A01;
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public C127277gr(View view) {
        C25812DsR A0O = C86134wK.A0O();
        A0O.A0D(A02);
        A0O.A06 = true;
        this.A00 = A0O;
        this.A01 = view;
    }
}
