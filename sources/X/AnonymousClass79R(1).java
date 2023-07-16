package X;

import com.facebookpay.otc.models.OtcInput;

/* renamed from: X.79R  reason: invalid class name */
public final class AnonymousClass79R {
    public final OtcInput A00;
    public final String A01;

    public static AnonymousClass79R A00(AnonymousClass69P r1, AnonymousClass587 r2, String str) {
        return new AnonymousClass79R(r2.A02(r1, true), str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79R) {
                AnonymousClass79R r5 = (AnonymousClass79R) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18180wK.A03(this.A01) + AnonymousClass0wJ.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ProductComponent(productId=");
        A0s.append(this.A01);
        A0s.append(", otcInput=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public AnonymousClass79R(OtcInput otcInput, String str) {
        this.A01 = str;
        this.A00 = otcInput;
    }
}
