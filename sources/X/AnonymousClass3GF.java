package X;

/* renamed from: X.3GF  reason: invalid class name */
public final class AnonymousClass3GF {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass3GF(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A01 = z;
        this.A09 = z9;
        this.A04 = z4;
        this.A08 = z8;
        this.A05 = z5;
        this.A02 = z2;
        this.A06 = z6;
        this.A03 = z3;
        this.A07 = z7;
        this.A0A = z10;
        this.A00 = str;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Login failure with reason: ");
        if (this.A01) {
            A0s.append("has error;");
        }
        if (this.A02) {
            A0s.append(" bad password;");
        }
        if (this.A03) {
            A0s.append(" checkpoint required;");
        }
        if (this.A04) {
            A0s.append(" inactive user error;");
        }
        if (this.A06) {
            A0s.append("invalid one tap nonce error;");
        }
        if (this.A08) {
            A0s.append("invalid user error;");
        }
        if (this.A05) {
            A0s.append("invalid Google token nonce;");
        }
        if (this.A07) {
            A0s.append("invalid trusted device nonce;");
        }
        if (this.A0A) {
            A0s.append("unusable password, forced password reset;");
        }
        return A0s.toString();
    }
}
