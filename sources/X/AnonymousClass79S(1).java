package X;

import com.google.gson.annotations.SerializedName;

/* renamed from: X.79S  reason: invalid class name */
public final class AnonymousClass79S {
    @SerializedName("amount")
    public final String A00;
    @SerializedName("currency")
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79S) {
                AnonymousClass79S r5 = (AnonymousClass79S) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("AuthAmount(currency=", this.A01, ", amount=", this.A00, ')');
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A06(this.A01) * 31) + C18200wM.A09(this.A00);
    }

    public AnonymousClass79S(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public AnonymousClass79S() {
        this((String) null, (String) null);
    }
}
