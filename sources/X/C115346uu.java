package X;

/* renamed from: X.6uu  reason: invalid class name and case insensitive filesystem */
public final class C115346uu {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final C143058g2 A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115346uu) {
                C115346uu r5 = (C115346uu) obj;
                if (!(C04220Ms.A0I(this.A06, r5.A06) && this.A05 == r5.A05 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05((((((((C18210wN.A04(this.A06) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31, this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ParagraphInfo(paragraph=");
        A0s.append(this.A06);
        A0s.append(", startIndex=");
        A0s.append(this.A05);
        A0s.append(", endIndex=");
        A0s.append(this.A04);
        A0s.append(", startLineIndex=");
        A0s.append(this.A03);
        A0s.append(", endLineIndex=");
        A0s.append(this.A02);
        A0s.append(", top=");
        A0s.append(this.A01);
        A0s.append(", bottom=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115346uu(C143058g2 r1, float f, float f2, int i, int i2, int i3, int i4) {
        this.A06 = r1;
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = f;
        this.A00 = f2;
    }
}
