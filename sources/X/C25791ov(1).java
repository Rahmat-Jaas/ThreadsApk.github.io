package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0011000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2;

/* renamed from: X.1ov  reason: invalid class name and case insensitive filesystem */
public final class C25791ov extends C35142Mg {
    public final KtCSuperShape0S0011000_I2 A00;
    public final KtCSuperShape0S1001000_I2 A01;
    public final KtCSuperShape0S1010000_I2 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25791ov) {
                C25791ov r5 = (C25791ov) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A01, r5.A01) || this.A06 != r5.A06 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = (((AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A03, C18210wN.A04(this.A02))) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31;
        boolean z = this.A06;
        if (z) {
            z = true;
        }
        return ((A07 + (z ? 1 : 0)) * 31) + C18200wM.A07(this.A00);
    }

    public C25791ov(KtCSuperShape0S0011000_I2 ktCSuperShape0S0011000_I2, KtCSuperShape0S1001000_I2 ktCSuperShape0S1001000_I2, KtCSuperShape0S1010000_I2 ktCSuperShape0S1010000_I2, String str, String str2, String str3, boolean z) {
        this.A02 = ktCSuperShape0S1010000_I2;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = ktCSuperShape0S1001000_I2;
        this.A06 = z;
        this.A00 = ktCSuperShape0S0011000_I2;
    }
}
