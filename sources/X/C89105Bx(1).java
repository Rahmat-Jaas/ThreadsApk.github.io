package X;

import android.view.View;

/* renamed from: X.5Bx  reason: invalid class name and case insensitive filesystem */
public class C89105Bx extends M5O {
    public final void A00() {
        C113656rv r0;
        if (this instanceof C92575ij) {
            C92575ij r1 = (C92575ij) this;
            C113656rv r02 = r1.A00;
            if (r02 != null) {
                r02.A01();
            }
            C113656rv r03 = r1.A01;
            if (r03 != null) {
                r03.A01();
            }
            r0 = r1.A02;
        } else if (this instanceof C92555ih) {
            for (C89105Bx A00 : ((C92555ih) this).A02) {
                A00.A00();
            }
            return;
        } else if (this instanceof C92565ii) {
            C92565ii r12 = (C92565ii) this;
            C113656rv r04 = r12.A01;
            if (r04 != null) {
                r04.A01();
            }
            r0 = r12.A00;
        } else {
            return;
        }
        if (r0 != null) {
            r0.A01();
        }
    }

    public C89105Bx(View view) {
        super(view);
    }
}
