package com.instagram.graphql.instagramschema;

import X.L4O;
import com.facebook.pando.TreeJNI;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

public final class AddressFragmentImpl extends TreeJNI implements L4O {
    public final String[] getScalarFields() {
        return new String[]{"address_city", "address_state", "country_code", "first_name", "id", "last_name", "middle_name", "street1", "street2", "street3", ServerW3CShippingAddressConstants.POSTAL_CODE};
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

    public final String Aih() {
        return getStringValue("first_name");
    }

    public final String ArA() {
        return getStringValue("last_name");
    }

    public final String Avc() {
        return getStringValue("middle_name");
    }

    public final String BEK() {
        return getStringValue("street1");
    }

    public final String BMp() {
        return getStringValue(ServerW3CShippingAddressConstants.POSTAL_CODE);
    }
}
