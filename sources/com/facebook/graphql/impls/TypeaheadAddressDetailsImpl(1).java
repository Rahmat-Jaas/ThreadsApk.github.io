package com.facebook.graphql.impls;

import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class TypeaheadAddressDetailsImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{"address_line_1", "address_line_2", ServerW3CShippingAddressConstants.CITY, "country", "country_code", "postal_code", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, "state_code"};
    }
}
