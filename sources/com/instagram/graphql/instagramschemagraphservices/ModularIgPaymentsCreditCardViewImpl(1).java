package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ModularIgPaymentsCreditCardViewImpl extends TreeJNI implements C81204nM {

    public final class BillingAddress extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ModularIgPaymentsBillingAddressImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"card_association_image_url", "card_holder_name", "card_type", "cc_subtitle", "cc_title", "expiry_month", "expiry_year", "id", "is_bound_to_device(device_key_pub_b64:$dev_pub_key)", "is_expired", "last4"};
    }

    public final BillingAddress A00() {
        return (BillingAddress) getTreeValue("billing_address", BillingAddress.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(BillingAddress.class, "billing_address");
    }
}
