package X;

import com.facebook.graphql.impls.FBPayFormFieldImpl;
import java.util.List;

/* renamed from: X.6ub  reason: invalid class name and case insensitive filesystem */
public final class C115156ub {
    public final FBPayFormFieldImpl A00;
    public final C114696tk A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115156ub) {
                C115156ub r5 = (C115156ub) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A05(this.A00, C18210wN.A04(this.A03)) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A07(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FBPayPhoneNumbersComponent(phoneNumbers=");
        A0s.append(this.A03);
        A0s.append(", phoneFormFieldConfig=");
        A0s.append(this.A00);
        A0s.append(", addedPhoneNumberId=");
        A0s.append(this.A02);
        A0s.append(", updatedPhoneNumberIdParams=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C115156ub(FBPayFormFieldImpl fBPayFormFieldImpl, C114696tk r2, String str, List list) {
        this.A03 = list;
        this.A00 = fBPayFormFieldImpl;
        this.A02 = str;
        this.A01 = r2;
    }
}
