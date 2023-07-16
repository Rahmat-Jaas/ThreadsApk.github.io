package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchAddressDetailsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchAddressDetails extends TreeJNI implements C81204nM {

        public final class Address extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{TypeaheadAddressDetailsImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Address.class, "address");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchAddressDetails.class, "fetch_address_details(address_id:$address_id,payment_product_id:$payment_product_id,session_id:$session_id,upl_session_id:$upl_session_id)");
    }
}
