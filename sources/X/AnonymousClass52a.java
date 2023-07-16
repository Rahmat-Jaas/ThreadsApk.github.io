package X;

/* renamed from: X.52a  reason: invalid class name */
public final class AnonymousClass52a extends C1203479u {
    public float A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass52a) || ((AnonymousClass52a) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0I("AnimationVector1D: value = ", this.A00);
    }

    public AnonymousClass52a(float f) {
        this.A00 = f;
    }
}
