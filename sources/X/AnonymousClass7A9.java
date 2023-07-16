package X;

/* renamed from: X.7A9  reason: invalid class name */
public class AnonymousClass7A9 {
    public static final AnonymousClass5NA A02 = new AnonymousClass5NA();
    public final AnonymousClass7A9 A00;
    public final C145838lB A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18190wL.A1Y(this, obj)) {
                return false;
            }
            AnonymousClass7A9 r4 = (AnonymousClass7A9) obj;
            if (!C04220Ms.A0I(this.A00, r4.A00) || !C04220Ms.A0I(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final AnonymousClass7A9 A00(AnonymousClass7A9 r3) {
        if (r3 == null) {
            return this;
        }
        AnonymousClass7A9 r1 = this;
        if (this == A02) {
            r1 = null;
        }
        return new AnonymousClass5NB(r1, r3);
    }

    public final void A01(MFM mfm, MNZ mnz) {
        A02(C86164wN.A11(mnz, mfm, 37));
    }

    public final void A02(AnonymousClass0YY r3) {
        if (this instanceof AnonymousClass5NB) {
            AnonymousClass5NB r1 = (AnonymousClass5NB) this;
            C04220Ms.A0B(r3, 0);
            AnonymousClass7A9 r0 = r1.A00;
            if (r0 != null) {
                r0.A02(r3);
            }
            r1.A01.A02(r3);
            return;
        }
        C04220Ms.A0B(r3, 0);
        AnonymousClass7A9 r02 = this.A00;
        if (r02 != null) {
            r02.A02(r3);
        }
        C145838lB r03 = this.A01;
        if (r03 != null) {
            r3.invoke(r03);
        }
    }

    public int hashCode() {
        int i = 0;
        int A05 = C18230wP.A05(this.A00) * 31;
        C145838lB r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return A05 + i;
    }

    public AnonymousClass7A9(AnonymousClass7A9 r1, C145838lB r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
