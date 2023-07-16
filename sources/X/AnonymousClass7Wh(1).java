package X;

/* renamed from: X.7Wh  reason: invalid class name */
public final class AnonymousClass7Wh implements C141758cu {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7Wh) && Float.compare(this.A00, ((AnonymousClass7Wh) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0C("Vertical(bias=", ')', this.A00);
    }

    public AnonymousClass7Wh(float f) {
        this.A00 = f;
    }
}
