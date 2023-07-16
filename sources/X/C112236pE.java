package X;

import android.view.View;

/* renamed from: X.6pE  reason: invalid class name and case insensitive filesystem */
public final class C112236pE {
    public final View A00;
    public final C25812DsR A01;

    public final void A00() {
        if (C63643hy.A08()) {
            this.A01.A0B((double) 4.0f);
        } else {
            this.A00.post(new C135707zv(this));
        }
    }

    public C112236pE(View view) {
        this.A00 = view;
        C25812DsR A0O = C86134wK.A0O();
        A0O.A0E(new C90865fB(this));
        A0O.A09(1.0d);
        this.A01 = A0O;
    }
}
