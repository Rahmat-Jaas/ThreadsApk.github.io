package com.facebook.graphql.impls;

import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ShippingAddressesImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{"care_of", "city_name", "country_name", "id", "is_default", "label", "postal_code", "state_name", "street1", "street2", "verified"};
    }

    public final Class[] getInlineClasses() {
        return new Class[]{ExternalShippingAddressImpl.class};
    }
}
