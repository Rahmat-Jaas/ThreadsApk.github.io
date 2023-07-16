package X;

/* renamed from: X.6uZ  reason: invalid class name and case insensitive filesystem */
public final class C115136uZ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115136uZ) {
                C115136uZ r5 = (C115136uZ) obj;
                if (!(this.A03 == r5.A03 && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C86104wH.A05(this.A03 * 31, this.A00), this.A01), this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Shadow(color=");
        A0s.append(this.A03);
        A0s.append(AnonymousClass000.A00(521));
        A0s.append(this.A00);
        A0s.append(AnonymousClass000.A00(522));
        A0s.append(this.A01);
        A0s.append(", radius=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115136uZ(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }
}
