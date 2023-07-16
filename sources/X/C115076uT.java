package X;

/* renamed from: X.6uT  reason: invalid class name and case insensitive filesystem */
public final class C115076uT {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115076uT) {
                C115076uT r5 = (C115076uT) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A00), this.A01), this.A02), this.A03);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RippleAlpha(draggedAlpha=");
        A0s.append(this.A00);
        A0s.append(", focusedAlpha=");
        A0s.append(this.A01);
        A0s.append(", hoveredAlpha=");
        A0s.append(this.A02);
        A0s.append(", pressedAlpha=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115076uT(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}
