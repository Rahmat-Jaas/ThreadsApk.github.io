package X;

/* renamed from: X.3Vh  reason: invalid class name and case insensitive filesystem */
public final class C61773Vh {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C61773Vh r5 = (C61773Vh) obj;
            return this.A02 == r5.A02 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A07 == r5.A07 && this.A06 == r5.A06 && this.A05 == r5.A05;
        }
        return false;
    }

    public final C61773Vh A00(C61773Vh r10) {
        return new C61773Vh(this.A02 + r10.A02, this.A04 + r10.A04, this.A03 + r10.A03, this.A01 + r10.A01, this.A00 + r10.A00, this.A07 + r10.A07, this.A06 + r10.A06, r10.A05 + this.A05);
    }

    public final int hashCode() {
        return (((((((((((((this.A02 * 31) + this.A04) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A07) * 31) + this.A06) * 31) + this.A05;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ChangeSetStats{mEffectiveChangesCount=");
        A0s.append(this.A02);
        A0s.append(", mInsertSingleCount=");
        A0s.append(this.A04);
        A0s.append(", mInsertRangeCount=");
        A0s.append(this.A03);
        A0s.append(", mDeleteSingleCount=");
        A0s.append(this.A01);
        A0s.append(", mDeleteRangeCount=");
        A0s.append(this.A00);
        A0s.append(", mUpdateSingleCount=");
        A0s.append(this.A07);
        A0s.append(", mUpdateRangeCount=");
        A0s.append(this.A06);
        A0s.append(", mMoveCount=");
        A0s.append(this.A05);
        return C18190wL.A0o(A0s);
    }

    public C61773Vh() {
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07 = 0;
        this.A06 = 0;
        this.A05 = 0;
    }

    public C61773Vh(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = i6;
        this.A06 = i7;
        this.A05 = i8;
    }
}
