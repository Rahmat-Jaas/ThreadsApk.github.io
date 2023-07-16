package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ShippingAddressComponentImpl extends TreeJNI implements C81204nM {

    public final class AddressFormFieldsConfig extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayAddressFormConfigFragmentImpl.class};
        }
    }

    public final class OneTimeShippingAddressV2 extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ShippingAddressesImpl.class};
        }
    }

    public final class ShippingAddresses extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ShippingAddressesImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(ShippingAddresses.class, "shipping_addresses", true), C18190wL.A0G(AddressFormFieldsConfig.class, "address_form_fields_config", false), C18190wL.A0G(OneTimeShippingAddressV2.class, "one_time_shipping_address_v2", false)};
    }
}
