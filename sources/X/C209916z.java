package X;

/* renamed from: X.16z  reason: invalid class name and case insensitive filesystem */
public final class C209916z extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Float A04;
    public final Integer A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C209916z(Float f, Integer num, Long l, String str, String str2, String str3, int i, int i2, long j, long j2) {
        C04220Ms.A0B(str, 2);
        this.A00 = i;
        this.A08 = str;
        this.A03 = j;
        this.A05 = num;
        this.A07 = str2;
        this.A01 = i2;
        this.A06 = l;
        this.A04 = f;
        this.A09 = str3;
        this.A02 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C209916z) {
                C209916z r8 = (C209916z) obj;
                if (this.A00 != r8.A00 || !C04220Ms.A0I(this.A08, r8.A08) || this.A03 != r8.A03 || !C04220Ms.A0I(this.A05, r8.A05) || !C04220Ms.A0I(this.A07, r8.A07) || this.A01 != r8.A01 || !C04220Ms.A0I(this.A06, r8.A06) || !C04220Ms.A0I(this.A04, r8.A04) || !C04220Ms.A0I(this.A09, r8.A09) || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A08, this.A00 * 31);
        long j = this.A03;
        long j2 = this.A02;
        return ((((((((((((((A072 + ((int) (j ^ (j >>> 32)))) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + this.A01) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + C18200wM.A09(this.A09)) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
