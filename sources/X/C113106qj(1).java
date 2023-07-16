package X;

/* renamed from: X.6qj  reason: invalid class name and case insensitive filesystem */
public final class C113106qj {
    public int A00 = 3;
    public CharSequence A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public boolean A07;
    public boolean A08 = true;

    public final E9E A00() {
        CharSequence charSequence;
        if (this.A03 == null && (((charSequence = this.A01) == null || charSequence.length() == 0) && this.A02 == null)) {
            throw C18190wL.A0a("Banners must have at least body text or action set.");
        }
        String str = this.A06;
        Integer num = this.A05;
        Integer num2 = this.A03;
        CharSequence charSequence2 = this.A01;
        boolean z = this.A07;
        Integer num3 = this.A02;
        boolean z2 = this.A08;
        return new E9E(charSequence2, num, num2, num3, this.A04, str, this.A00, z, z2);
    }
}
