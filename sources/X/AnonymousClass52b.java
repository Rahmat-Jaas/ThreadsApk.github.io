package X;

/* renamed from: X.52b  reason: invalid class name */
public final class AnonymousClass52b extends C1203479u {
    public float A00;
    public float A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass52b)) {
            return false;
        }
        AnonymousClass52b r4 = (AnonymousClass52b) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C86144wL.A03(C86134wK.A03(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AnimationVector2D: v1 = ");
        A0s.append(this.A00);
        A0s.append(", v2 = ");
        A0s.append(this.A01);
        return A0s.toString();
    }

    public AnonymousClass52b(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
