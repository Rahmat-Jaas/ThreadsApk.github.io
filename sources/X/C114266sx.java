package X;

/* renamed from: X.6sx  reason: invalid class name and case insensitive filesystem */
public final class C114266sx {
    public final float A00;

    public final boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof C114266sx) || Float.compare(f, ((C114266sx) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0C("BaselineShift(multiplier=", ')', this.A00);
    }

    public /* synthetic */ C114266sx(float f) {
        this.A00 = f;
    }
}
