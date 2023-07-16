package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148008qI;
import X.C148018qJ;
import X.C148538rF;
import com.facebook.pando.TreeJNI;

public final class IABAutofillDataResponseImpl extends TreeJNI implements C148018qJ {

    public final class IabAutofillData extends TreeJNI implements C148008qI {

        public final class Data extends TreeJNI implements C148538rF {
            public final String[] getScalarFields() {
                return new String[]{"address_level1", "address_level2", "address_line1", "address_line2", "country", "email", "family_name", "given_name", "postal_code", "tel"};
            }

            public final String APa() {
                return getStringValue("address_level1");
            }

            public final String APb() {
                return getStringValue("address_level2");
            }

            public final String APc() {
                return getStringValue("address_line1");
            }

            public final String APd() {
                return getStringValue("address_line2");
            }

            public final String Aa7() {
                return getStringValue("country");
            }

            public final String AfO() {
                return getStringValue("email");
            }

            public final String AhD() {
                return getStringValue("family_name");
            }

            public final String Akj() {
                return getStringValue("given_name");
            }

            public final String B2P() {
                return getStringValue("postal_code");
            }

            public final String BFn() {
                return getStringValue("tel");
            }
        }

        public final C148538rF Ac5() {
            return (C148538rF) getTreeValue("data", Data.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Data.class, "data");
        }
    }

    public final C148008qI AnJ() {
        return (C148008qI) getTreeValue("iab_autofill_data(query_params:$query_params)", IabAutofillData.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IabAutofillData.class, "iab_autofill_data(query_params:$query_params)");
    }
}
