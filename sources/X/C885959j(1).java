package X;

/* renamed from: X.59j  reason: invalid class name and case insensitive filesystem */
public final class C885959j extends C1202279h {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C885959j)) {
            return false;
        }
        C885959j r4 = (C885959j) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00 && this.A03 == r4.A03 && this.A02 == r4.A02 && this.A00 == r4.A00 && this.A01 == r4.A01;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ViewportHint.Access(\n            |    pageOffset=");
        A0s.append(this.A01);
        A0s.append(",\n            |    indexInPage=");
        A0s.append(this.A00);
        A0s.append(",\n            |    presentedItemsBefore=");
        C1202279h.A00(this, A0s);
        return AnonymousClass4n8.A09(C18180wK.A0i(",\n            |)", A0s), "|");
    }

    public C885959j(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.A01 = i;
        this.A00 = i2;
    }

    public final int hashCode() {
        return super.hashCode() + this.A01 + this.A00;
    }
}
