package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class EditLinksFragmentImpl extends TreeJNI implements C81204nM {

    public final class SettingsEditLinks extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"admin_update_uri", "company_detail_update_uri", "owner_info_update_uri", "payout_method_update_uri", "update_tax_uri"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(SettingsEditLinks.class, "settings_edit_links(interface_type:$interface_type)");
    }
}
