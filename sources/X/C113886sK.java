package X;

import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6sK  reason: invalid class name and case insensitive filesystem */
public final class C113886sK {
    public final AddressFormFieldsConfig A00;
    public final FbPayNewCreditCardOption A01;
    public final FbPayNewPayPalOption A02;
    public final C113396rK A03;
    public final ImmutableList A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113886sK) {
                C113886sK r5 = (C113886sK) obj;
                if (!AnonymousClass3ZT.A03(this.A00, r5.A00) || !AnonymousClass3ZT.A03(this.A01, r5.A01) || !AnonymousClass3ZT.A03(this.A02, r5.A02) || !AnonymousClass3ZT.A03(this.A03, r5.A03) || !AnonymousClass3ZT.A03(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A04);
    }

    public C113886sK(C110346lX r3) {
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        ImmutableList immutableList = r3.A04;
        AnonymousClass3ZT.A02(immutableList, "paymentMethods");
        this.A04 = immutableList;
    }
}
