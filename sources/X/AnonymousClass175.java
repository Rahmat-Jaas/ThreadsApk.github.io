package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4300000_I2;

/* renamed from: X.175  reason: invalid class name */
public final class AnonymousClass175 extends AnonymousClass0Sf {
    public final KtCSuperShape0S4300000_I2 A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass175) {
                AnonymousClass175 r5 = (AnonymousClass175) obj;
                if (this.A01 != r5.A01 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + AnonymousClass0wJ.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ViewState(isLoading=");
        A0s.append(this.A01);
        A0s.append(", promotionInformationData=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass175(KtCSuperShape0S4300000_I2 ktCSuperShape0S4300000_I2, boolean z) {
        this.A01 = z;
        this.A00 = ktCSuperShape0S4300000_I2;
    }
}
