package X;

/* renamed from: X.52c  reason: invalid class name */
public final class AnonymousClass52c extends C1203479u {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass52c)) {
            return false;
        }
        AnonymousClass52c r4 = (AnonymousClass52c) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A02 == this.A02 && r4.A03 == this.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A00), this.A01), this.A02), this.A03);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AnimationVector4D: v1 = ");
        A0s.append(this.A00);
        A0s.append(", v2 = ");
        A0s.append(this.A01);
        A0s.append(", v3 = ");
        A0s.append(this.A02);
        A0s.append(", v4 = ");
        A0s.append(this.A03);
        return A0s.toString();
    }

    public AnonymousClass52c(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}
