package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.7VC  reason: invalid class name */
public final class AnonymousClass7VC implements WindowInsets {
    public final WindowInsets A00;
    public final WindowInsets A01;

    public final int AU2(C147168nV r4) {
        int AU2 = this.A01.AU2(r4) - this.A00.AU2(r4);
        if (AU2 < 0) {
            return 0;
        }
        return AU2;
    }

    public final int BHQ(C147168nV r4) {
        int BHQ = this.A01.BHQ(r4) - this.A00.BHQ(r4);
        if (BHQ < 0) {
            return 0;
        }
        return BHQ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7VC)) {
            return false;
        }
        AnonymousClass7VC r4 = (AnonymousClass7VC) obj;
        return C04220Ms.A0I(r4.A01, this.A01) && C04220Ms.A0I(r4.A00, this.A00);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18210wN.A04(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("(");
        A0s.append(this.A01);
        A0s.append(" - ");
        return C86104wH.A0y(this.A00, A0s);
    }

    public AnonymousClass7VC(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.A01 = windowInsets;
        this.A00 = windowInsets2;
    }

    public final int Aro(C147168nV r4, AnonymousClass69J r5) {
        int A1V = C18210wN.A1V(r5);
        int Aro = this.A01.Aro(r4, r5) - this.A00.Aro(r4, r5);
        if (Aro < A1V) {
            return 0;
        }
        return Aro;
    }

    public final int B8D(C147168nV r4, AnonymousClass69J r5) {
        int A1V = C18210wN.A1V(r5);
        int B8D = this.A01.B8D(r4, r5) - this.A00.B8D(r4, r5);
        if (B8D < A1V) {
            return 0;
        }
        return B8D;
    }
}
