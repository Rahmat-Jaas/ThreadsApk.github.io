package X;

/* renamed from: X.3Gr  reason: invalid class name and case insensitive filesystem */
public final class C58673Gr {
    public final boolean A00;
    public final Class A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C58673Gr)) {
            return false;
        }
        C58673Gr r4 = (C58673Gr) obj;
        if (!r4.A01.equals(this.A01) || r4.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A00).hashCode();
    }

    public C58673Gr(Class cls, boolean z) {
        this.A01 = cls;
        this.A00 = z;
    }
}
