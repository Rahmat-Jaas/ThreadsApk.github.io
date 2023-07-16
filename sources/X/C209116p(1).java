package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;

/* renamed from: X.16p  reason: invalid class name and case insensitive filesystem */
public final class C209116p extends AnonymousClass0Sf {
    public final KtCSuperShape0S0200000_I2 A00;
    public final C305922a A01;
    public final C304020x A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C209116p) {
                C209116p r5 = (C209116p) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && C04220Ms.A0I(this.A00, r5.A00) && this.A03 == r5.A03 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A01, C18210wN.A04(this.A02)));
        boolean z = this.A03;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A05 + (z ? 1 : 0)) * 31;
        if (!this.A04) {
            i = 0;
        }
        return i2 + i;
    }

    public C209116p(KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2, C305922a r3, C304020x r4, boolean z, boolean z2) {
        AnonymousClass0wJ.A1O(r4, r3);
        C04220Ms.A0B(ktCSuperShape0S0200000_I2, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = ktCSuperShape0S0200000_I2;
        this.A03 = z;
        this.A04 = z2;
    }
}
