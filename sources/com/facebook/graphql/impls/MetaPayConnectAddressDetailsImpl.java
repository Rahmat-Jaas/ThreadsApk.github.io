package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class MetaPayConnectAddressDetailsImpl extends TreeJNI implements C81204nM {

    public final class Address extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"address_level_1", "address_level_2", "address_line_1", "address_line_2", "country", "country_name", "postal_code"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"__typename", "single_line_address"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Address.class, "address");
    }
}
