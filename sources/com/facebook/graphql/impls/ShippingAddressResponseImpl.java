package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ShippingAddressResponseImpl extends TreeJNI implements C81204nM {

    public final class Error extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{SharedPaymentsErrorImpl.class};
        }
    }

    public final class ShippingAddress extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ShippingAddressesImpl.class};
        }
    }

    public final class SuggestedAddress extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"suggested_city", "suggested_postal_code", "suggested_state", "suggested_street1", "suggested_street2"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"error_step"};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(ShippingAddress.class, "shipping_address", false), C18190wL.A0G(SuggestedAddress.class, "suggested_address", false), C18190wL.A0G(Error.class, "error", false)};
    }
}
