package X;

import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6rk  reason: invalid class name and case insensitive filesystem */
public final class C113576rk {
    public final AddressFormFieldsConfig A00;
    public final ImmutableList A01;

    public C113576rk(AddressFormFieldsConfig addressFormFieldsConfig, ImmutableList immutableList) {
        AnonymousClass3ZT.A02(immutableList, "addresses");
        this.A01 = immutableList;
        this.A00 = addressFormFieldsConfig;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113576rk) {
                C113576rk r5 = (C113576rk) obj;
                if (!AnonymousClass3ZT.A03(this.A01, r5.A01) || !AnonymousClass3ZT.A03(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C86124wJ.A0E(this.A01) * 31) + AnonymousClass0wJ.A03(this.A00);
    }
}
