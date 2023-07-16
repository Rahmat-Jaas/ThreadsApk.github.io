package X;

/* renamed from: X.6sR  reason: invalid class name and case insensitive filesystem */
public final class C113956sR {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final long A05;
    public final AnonymousClass54A A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113956sR) {
                C113956sR r8 = (C113956sR) obj;
                if (!("".equals("") && C18180wK.A1W(Float.compare(this.A01, r8.A01)) && C18180wK.A1W(Float.compare(this.A00, r8.A00)) && this.A03 == r8.A03 && this.A02 == r8.A02 && C04220Ms.A0I(this.A06, r8.A06) && this.A05 == r8.A05 && this.A04 == r8.A04 && this.A07 == r8.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C86104wH.A06(AnonymousClass0wJ.A05(this.A06, C86104wH.A05(C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A01), this.A00), this.A03), this.A02)), this.A05) + this.A04) * 31) + C86124wJ.A04(this.A07 ? 1 : 0);
    }

    public C113956sR(AnonymousClass54A r1, float f, float f2, float f3, float f4, int i, long j, boolean z) {
        this.A01 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A06 = r1;
        this.A05 = j;
        this.A04 = i;
        this.A07 = z;
    }
}
