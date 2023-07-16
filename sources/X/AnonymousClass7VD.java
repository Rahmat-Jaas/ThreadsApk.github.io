package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.7VD  reason: invalid class name */
public final class AnonymousClass7VD implements WindowInsets {
    public final WindowInsets A00;
    public final WindowInsets A01;

    public final int Aro(C147168nV r3, AnonymousClass69J r4) {
        C04220Ms.A0B(r4, 1);
        return Math.max(this.A00.Aro(r3, r4), this.A01.Aro(r3, r4));
    }

    public final int B8D(C147168nV r3, AnonymousClass69J r4) {
        C04220Ms.A0B(r4, 1);
        return Math.max(this.A00.B8D(r3, r4), this.A01.B8D(r3, r4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7VD)) {
            return false;
        }
        AnonymousClass7VD r4 = (AnonymousClass7VD) obj;
        return C04220Ms.A0I(r4.A00, this.A00) && C04220Ms.A0I(r4.A01, this.A01);
    }

    public final int AU2(C147168nV r3) {
        return Math.max(this.A00.AU2(r3), this.A01.AU2(r3));
    }

    public final int BHQ(C147168nV r3) {
        return Math.max(this.A00.BHQ(r3), this.A01.BHQ(r3));
    }

    public final int hashCode() {
        return this.A00.hashCode() + C18210wN.A04(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("(");
        A0s.append(this.A00);
        A0s.append(" ∪ ");
        return C86104wH.A0y(this.A01, A0s);
    }

    public AnonymousClass7VD(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.A00 = windowInsets;
        this.A01 = windowInsets2;
    }
}
