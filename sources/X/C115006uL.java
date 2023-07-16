package X;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: X.6uL  reason: invalid class name and case insensitive filesystem */
public final class C115006uL {
    @SerializedName("factors")
    public final List<C115406v0> A00;
    @SerializedName("num_required_factors")
    public final int A01;
    @SerializedName("allow_user_select")
    public final boolean A02;

    public C115006uL(List list, int i, boolean z) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
        this.A02 = z;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115006uL) {
                C115006uL r5 = (C115006uL) obj;
                if (!(C04220Ms.A0I(this.A00, r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A04 = C18210wN.A04(this.A00);
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return ((A04 + (z ? 1 : 0)) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AuthFactorGroup(authFactors=");
        A0s.append(this.A00);
        A0s.append(", allowUserSelect=");
        A0s.append(this.A02);
        A0s.append(", numRequiredFactors=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
