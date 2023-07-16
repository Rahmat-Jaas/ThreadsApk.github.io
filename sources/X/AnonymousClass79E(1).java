package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* renamed from: X.79E  reason: invalid class name */
public final class AnonymousClass79E {
    public static final AnonymousClass79E A01 = new AnonymousClass79E(0);
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass79E) && this.A00 == ((AnonymousClass79E) obj).A00);
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + 1231) * 31) + 1) * 31) + 1;
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("KeyboardOptions(capitalization=");
        int i = this.A00;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else {
            str = "Sentences";
        }
        A0s.append(str);
        C86164wN.A1M(A0s, ", autoCorrect=");
        A0s.append(", keyboardType=");
        A0s.append("Text");
        A0s.append(", imeAction=");
        return C86104wH.A0y(ServerW3CShippingAddressConstants.DEFAULT, A0s);
    }

    public AnonymousClass79E(int i) {
        this.A00 = i;
    }
}
