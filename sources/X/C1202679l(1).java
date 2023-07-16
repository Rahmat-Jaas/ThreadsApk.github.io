package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* renamed from: X.79l  reason: invalid class name and case insensitive filesystem */
public final class C1202679l {
    public static final C1202679l A04 = new C1202679l(0, false);
    public final int A00;
    public final int A01 = 1;
    public final int A02 = 1;
    public final boolean A03;

    public C1202679l(int i, boolean z) {
        this.A03 = z;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1202679l) {
                C1202679l r5 = (C1202679l) obj;
                if (!(this.A03 == r5.A03 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((C86124wJ.A04(this.A03 ? 1 : 0) * 31) + this.A00) * 31) + 1231) * 31) + 1) * 31) + 1;
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("ImeOptions(singleLine=");
        A0s.append(this.A03);
        A0s.append(", capitalization=");
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
        A0s.append(", autoCorrect=");
        A0s.append(true);
        A0s.append(", keyboardType=");
        A0s.append("Text");
        A0s.append(", imeAction=");
        return C86104wH.A0y(ServerW3CShippingAddressConstants.DEFAULT, A0s);
    }
}
