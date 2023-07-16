package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148028qK;
import X.C148558rH;
import X.C18170wI;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class IABAutofillMultiDataResponseImpl extends TreeJNI implements C148028qK {

    public final class IgIabAutofillDataMultiEntries extends TreeJNI implements C148558rH {
        public final String[] getScalarFields() {
            return new String[]{"address_level1", "address_level2", "address_line1", "address_line2", "country", C18170wI.A00(160), "email", "ent_id", "family_name", "given_name", "last_update_time", "postal_code", "tel"};
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

        public final String Afv() {
            return getStringValue("ent_id");
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

    public final ImmutableList Any() {
        return getTreeList("ig_iab_autofill_data_multi_entries", IgIabAutofillDataMultiEntries.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(IgIabAutofillDataMultiEntries.class, "ig_iab_autofill_data_multi_entries");
    }
}
