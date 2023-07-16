package X;

/* renamed from: X.6uS  reason: invalid class name and case insensitive filesystem */
public final class C115066uS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C115066uS)) {
            return false;
        }
        C115066uS r4 = (C115066uS) obj;
        return this.A01 == r4.A01 && this.A03 == r4.A03 && this.A02 == r4.A02 && this.A00 == r4.A00;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass00U.A0f("InsetsValues(left=", ", top=", ", right=", ", bottom=", ')', this.A01, this.A03, this.A02, this.A00);
    }

    public C115066uS(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
