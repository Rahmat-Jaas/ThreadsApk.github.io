package X;

/* renamed from: X.5IG  reason: invalid class name */
public final class AnonymousClass5IG extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public AnonymousClass5IG(Integer num, Integer num2, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        C18210wN.A1M(num, 4, num2);
        this.A07 = z;
        this.A01 = i;
        this.A04 = str;
        this.A03 = num;
        this.A06 = z2;
        this.A00 = i2;
        this.A05 = str2;
        this.A02 = num2;
        this.A08 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IG) {
                AnonymousClass5IG r5 = (AnonymousClass5IG) obj;
                if (!(this.A07 == r5.A07 && this.A01 == r5.A01 && C04220Ms.A0I(this.A04, r5.A04) && this.A03 == r5.A03 && this.A06 == r5.A06 && this.A00 == r5.A00 && C04220Ms.A0I(this.A05, r5.A05) && this.A02 == r5.A02 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A07;
        int i = 1;
        if (z) {
            z = true;
        }
        int A062 = (((((((z ? 1 : 0) * true) + this.A01) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + C100946Pg.A00(this.A03)) * 31;
        boolean z2 = this.A06;
        if (z2) {
            z2 = true;
        }
        int A09 = (((((((A062 + (z2 ? 1 : 0)) * 31) + this.A00) * 31) + C18200wM.A09(this.A05)) * 31) + C100946Pg.A00(this.A02)) * 31;
        if (!this.A08) {
            i = 0;
        }
        return A09 + i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5IG() {
        /*
            r10 = this;
            r3 = 0
            r5 = 0
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r0 = r10
            r2 = r1
            r4 = r3
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5IG.<init>():void");
    }
}
