package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebookpay.form.model.AddressFormFieldsConfig;

/* renamed from: X.5hS  reason: invalid class name and case insensitive filesystem */
public final class C92015hS extends C92055hW {
    public final AddressFormFieldsConfig A00;

    public C92015hS(Country country, AddressFormFieldsConfig addressFormFieldsConfig, String str, int i, boolean z, boolean z2) {
        super(i, z, z2);
        SparseArray sparseArray = this.A04;
        sparseArray.put(9, str == null ? "" : str);
        sparseArray.put(10, country == null ? Country.A00((Country) null, C86164wN.A0f(addressFormFieldsConfig.A00)) : country);
        this.A05.A0H(sparseArray.clone());
        this.A00 = addressFormFieldsConfig;
        A0N();
    }
}
