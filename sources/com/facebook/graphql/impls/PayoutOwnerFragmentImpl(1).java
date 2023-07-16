package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

public final class PayoutOwnerFragmentImpl extends TreeJNI implements C81204nM {

    public final class OwnerAddress extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"address_city", "address_state", "country_code", "first_name", "last_name", "middle_name", "street1", "street2", ServerW3CShippingAddressConstants.POSTAL_CODE};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(OwnerAddress.class, "owner_address");
    }
}
