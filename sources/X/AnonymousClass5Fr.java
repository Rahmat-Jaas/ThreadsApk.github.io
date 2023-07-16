package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import org.json.JSONObject;

/* renamed from: X.5Fr  reason: invalid class name */
public final class AnonymousClass5Fr extends C58933Ih implements L4O {
    public final String APZ() {
        return A05("address_city");
    }

    public final String APe() {
        return A05("address_state");
    }

    public final String AaB() {
        return A05("country_code");
    }

    public final String Aih() {
        return A05("first_name");
    }

    public final String ArA() {
        return A05("last_name");
    }

    public final String Avc() {
        return A05("middle_name");
    }

    public final String BEK() {
        return A05("street1");
    }

    public final String BMp() {
        return A05(ServerW3CShippingAddressConstants.POSTAL_CODE);
    }

    public AnonymousClass5Fr(JSONObject jSONObject) {
        super(jSONObject);
    }
}
