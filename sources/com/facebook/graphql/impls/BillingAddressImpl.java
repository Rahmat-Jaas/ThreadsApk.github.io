package com.facebook.graphql.impls;

import X.C148488rA;
import com.facebook.pando.TreeJNI;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

public final class BillingAddressImpl extends TreeJNI implements C148488rA {
    public final String[] getScalarFields() {
        return new String[]{"address_city", "address_state", "country_code", "first_name", "last_name", "middle_name", "street1", "street2", "street3", ServerW3CShippingAddressConstants.POSTAL_CODE};
    }

    public final String APZ() {
        return getStringValue("address_city");
    }

    public final String APe() {
        return getStringValue("address_state");
    }

    public final String AaB() {
        return getStringValue("country_code");
    }

    public final String BEK() {
        return getStringValue("street1");
    }

    public final String BEL() {
        return getStringValue("street2");
    }

    public final String BMp() {
        return getStringValue(ServerW3CShippingAddressConstants.POSTAL_CODE);
    }
}
