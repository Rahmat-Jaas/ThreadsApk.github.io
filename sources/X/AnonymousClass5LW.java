package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2;

/* renamed from: X.5LW  reason: invalid class name */
public final class AnonymousClass5LW extends AnonymousClass0Sf implements C142308ee {
    public final KtCSuperShape0S0310000_I2 A00;
    public final KtCSuperShape0S1201000_I2 A01;

    public AnonymousClass5LW(KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I2, KtCSuperShape0S1201000_I2 ktCSuperShape0S1201000_I2) {
        C04220Ms.A0B(ktCSuperShape0S0310000_I2, 2);
        this.A01 = ktCSuperShape0S1201000_I2;
        this.A00 = ktCSuperShape0S0310000_I2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LW) {
                AnonymousClass5LW r5 = (AnonymousClass5LW) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18210wN.A04(this.A01));
    }
}
