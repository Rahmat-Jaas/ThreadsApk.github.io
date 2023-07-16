package X;

/* renamed from: X.7Vo  reason: invalid class name and case insensitive filesystem */
public final class C123157Vo implements C142798fc, AnonymousClass8d3 {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C123157Vo) && C18180wK.A1W(Float.compare(this.A00, ((C123157Vo) obj).A00)));
    }

    public final float CxM(C147168nV r2, long j) {
        return r2.CxL(this.A00);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0Q("CornerSize(size = ", ".dp)", this.A00);
    }

    public C123157Vo(float f) {
        this.A00 = f;
    }
}
