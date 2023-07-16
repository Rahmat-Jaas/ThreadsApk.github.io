package X;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: X.6tp  reason: invalid class name and case insensitive filesystem */
public final class C114746tp {
    @SerializedName("auth_factors_groups")
    public final List<C115006uL> A00;
    @SerializedName("num_required_groups")
    public final int A01;

    public C114746tp(List list, int i) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114746tp) {
                C114746tp r5 = (C114746tp) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A00) + this.A01;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AuthFactorRequirement(authFactorsGroups=");
        A0s.append(this.A00);
        A0s.append(", numRequiredGroups=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
