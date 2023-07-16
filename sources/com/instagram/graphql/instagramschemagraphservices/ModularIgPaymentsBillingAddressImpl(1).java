package com.instagram.graphql.instagramschemagraphservices;

import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class ModularIgPaymentsBillingAddressImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{ServerW3CShippingAddressConstants.CITY, "country", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, "street1", "street2", ServerW3CShippingAddressConstants.POSTAL_CODE};
    }
}
