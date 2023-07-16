package X;

import com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl;
import java.util.List;

/* renamed from: X.79r  reason: invalid class name and case insensitive filesystem */
public final class C1203179r {
    public FBPayAddressFormConfigFragmentImpl A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C1203179r(FBPayAddressFormConfigFragmentImpl fBPayAddressFormConfigFragmentImpl, String str, String str2, List list, List list2, List list3, List list4, boolean z, boolean z2) {
        C18190wL.A1S(list, 1, fBPayAddressFormConfigFragmentImpl);
        this.A02 = list;
        this.A04 = list2;
        this.A03 = list3;
        this.A01 = list4;
        this.A00 = fBPayAddressFormConfigFragmentImpl;
        this.A05 = str;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = str2;
    }

    public static /* synthetic */ C1203179r A00(C1203179r r10, String str, List list, int i) {
        List list2;
        List list3;
        List list4;
        FBPayAddressFormConfigFragmentImpl fBPayAddressFormConfigFragmentImpl;
        boolean z;
        boolean z2;
        String str2 = str;
        List list5 = list;
        String str3 = null;
        if ((i & 1) != 0) {
            list5 = r10.A02;
        }
        if ((i & 2) != 0) {
            list2 = r10.A04;
        } else {
            list2 = null;
        }
        if ((i & 4) != 0) {
            list3 = r10.A03;
        } else {
            list3 = null;
        }
        if ((i & 8) != 0) {
            list4 = r10.A01;
        } else {
            list4 = null;
        }
        if ((i & 16) != 0) {
            fBPayAddressFormConfigFragmentImpl = r10.A00;
        } else {
            fBPayAddressFormConfigFragmentImpl = null;
        }
        if ((i & 32) != 0) {
            str2 = r10.A05;
        }
        if ((i & 64) != 0) {
            z = r10.A08;
        } else {
            z = false;
        }
        if ((i & 128) != 0) {
            z2 = r10.A07;
        } else {
            z2 = false;
        }
        if ((i & 256) != 0) {
            str3 = r10.A06;
        }
        AnonymousClass0wJ.A1N(list5, list2);
        AnonymousClass0wJ.A1Q(list3, list4);
        C04220Ms.A0B(fBPayAddressFormConfigFragmentImpl, 4);
        return new C1203179r(fBPayAddressFormConfigFragmentImpl, str2, str3, list5, list2, list3, list4, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1203179r) {
                C1203179r r5 = (C1203179r) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A05, r5.A05) || this.A08 != r5.A08 || this.A07 != r5.A07 || !C04220Ms.A0I(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = (AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A04, C18210wN.A04(this.A02))))) + AnonymousClass0wJ.A06(this.A05)) * 31;
        boolean z = this.A08;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A052 + (z ? 1 : 0)) * 31;
        if (!this.A07) {
            i = 0;
        }
        return ((i2 + i) * 31) + C18200wM.A09(this.A06);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PaymentMethodComponentData(availablePaymentMethods=");
        A0s.append(this.A02);
        A0s.append(", unsupportedPaymentMethods=");
        A0s.append(this.A04);
        A0s.append(", newCredentialOptions=");
        A0s.append(this.A03);
        A0s.append(", apmOptions=");
        A0s.append(this.A01);
        A0s.append(", paymentAddressFormConfig=");
        A0s.append(this.A00);
        A0s.append(", addedPaymentMethodId=");
        A0s.append(this.A05);
        A0s.append(", shouldOrderNewOptionsFirst=");
        A0s.append(this.A08);
        A0s.append(", shouldDeprioritizeCreditCard=");
        A0s.append(this.A07);
        A0s.append(", orderId=");
        A0s.append(this.A06);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
