package X;

/* renamed from: X.3Gg  reason: invalid class name and case insensitive filesystem */
public final class C58563Gg {
    public final String A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18190wL.A1Y(this, obj)) {
            return false;
        }
        C58563Gg r4 = (C58563Gg) obj;
        String str = this.A00;
        if (str != null) {
            return str.equals(r4.A00);
        }
        return false;
    }

    public final int hashCode() {
        return C18220wO.A07(this.A00);
    }

    public C58563Gg(String str) {
        this.A00 = str;
    }
}
