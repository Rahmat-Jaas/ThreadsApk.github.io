package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import java.util.List;

/* renamed from: X.65g  reason: invalid class name and case insensitive filesystem */
public final class C965165g extends AnonymousClass6VU {
    public final int A00;
    public final KtCSuperShape0S0400000_I2 A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    public C965165g(KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I2, Integer num, String str, String str2, List list, int i, boolean z) {
        C04220Ms.A0B(str, 5);
        this.A05 = list;
        this.A00 = i;
        this.A01 = ktCSuperShape0S0400000_I2;
        this.A07 = z;
        this.A04 = str;
        this.A02 = num;
        this.A03 = str2;
        this.A06 = C18180wK.A1X(str.length());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C965165g) {
                C965165g r5 = (C965165g) obj;
                if (!C04220Ms.A0I(this.A05, r5.A05) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01) || this.A07 != r5.A07 || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A01, (C18210wN.A04(this.A05) + this.A00) * 31);
        boolean z = this.A07;
        if (z) {
            z = true;
        }
        return ((AnonymousClass0wJ.A07(this.A04, (A052 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A09(this.A03);
    }
}
