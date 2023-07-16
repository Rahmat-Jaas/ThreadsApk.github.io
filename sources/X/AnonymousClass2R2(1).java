package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.model.business.Address;
import java.io.StringWriter;

/* renamed from: X.2R2  reason: invalid class name */
public final class AnonymousClass2R2 {
    public static String A00(Address address) {
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        String str = address.A04;
        if (str != null) {
            A0K.A0d("address_street", str);
        }
        String str2 = address.A00;
        if (str2 != null) {
            A0K.A0d("city_id", str2);
        }
        String str3 = address.A02;
        if (str3 != null) {
            A0K.A0d(ServerW3CShippingAddressConstants.POSTAL_CODE, str3);
        }
        return C18180wK.A0h(A0K, A0d);
    }
}
