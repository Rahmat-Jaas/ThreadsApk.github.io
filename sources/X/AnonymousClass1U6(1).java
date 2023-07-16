package X;

import java.util.Arrays;

/* renamed from: X.1U6  reason: invalid class name */
public final class AnonymousClass1U6 extends AnonymousClass1j3 {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18190wL.A1Y(this, obj)) {
                return false;
            }
            AnonymousClass1U6 r4 = (AnonymousClass1U6) obj;
            if (!C04220Ms.A0I(this.A06, r4.A06) || !C04220Ms.A0I(this.A01, r4.A01) || !C04220Ms.A0I(this.A02, r4.A02) || !C04220Ms.A0I(this.A0A, r4.A0A) || !C04220Ms.A0I(this.A09, r4.A09) || !C04220Ms.A0I(this.A08, r4.A08) || !C04220Ms.A0I(this.A04, r4.A04) || !C04220Ms.A0I(this.A03, r4.A03) || this.A0B != r4.A0B || !C04220Ms.A0I(this.A00, r4.A00) || !C04220Ms.A0I(this.A05, r4.A05) || !C04220Ms.A0I(this.A07, r4.A07)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A01, this.A02, this.A0A, this.A09, this.A08, this.A04, this.A03, Boolean.valueOf(this.A0B), this.A00, this.A05, this.A07});
    }
}
