package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2;

/* renamed from: X.5LX  reason: invalid class name */
public final class AnonymousClass5LX extends AnonymousClass0Sf implements C142308ee {
    public final KtCSuperShape0S0310000_I2 A00;
    public final KtCSuperShape0S1201000_I2 A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LX) {
                AnonymousClass5LX r5 = (AnonymousClass5LX) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A02 != r5.A02 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A04 = C18210wN.A04(this.A01);
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return ((A04 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A00);
    }

    public AnonymousClass5LX(KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I2, KtCSuperShape0S1201000_I2 ktCSuperShape0S1201000_I2, boolean z) {
        this.A01 = ktCSuperShape0S1201000_I2;
        this.A02 = z;
        this.A00 = ktCSuperShape0S0310000_I2;
    }
}
