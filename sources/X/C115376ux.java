package X;

/* renamed from: X.6ux  reason: invalid class name and case insensitive filesystem */
public final class C115376ux {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115376ux) {
                C115376ux r5 = (C115376ux) obj;
                if (!(this.A05 == r5.A05 && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A07 == r5.A07 && this.A06 == r5.A06 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((((((((((((this.A05 * 31) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A07) * 31) + this.A06) * 31;
        boolean z = this.A08;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("OnComputePositionInfo(screenWidth=");
        A0s.append(this.A05);
        A0s.append(", screenHeight=");
        A0s.append(this.A04);
        A0s.append(", anchorX=");
        A0s.append(this.A02);
        A0s.append(", anchorY=");
        A0s.append(this.A03);
        A0s.append(", anchorWidth=");
        A0s.append(this.A01);
        A0s.append(", anchorHeight=");
        A0s.append(this.A00);
        A0s.append(", tooltipIntrinsicWidth=");
        A0s.append(this.A07);
        A0s.append(", tooltipIntrinsicHeight=");
        A0s.append(this.A06);
        A0s.append(", isRtl=");
        A0s.append(this.A08);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115376ux(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.A05 = i;
        this.A04 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = i7;
        this.A06 = i8;
        this.A08 = z;
    }
}
