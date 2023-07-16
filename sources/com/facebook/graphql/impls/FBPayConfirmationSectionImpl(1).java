package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class FBPayConfirmationSectionImpl extends TreeJNI implements C81204nM {

    public final class UpsellActions extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"icon_name", "link_uri", DialogModule.KEY_TITLE, "type"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"cta_type", "upsell_section_title"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(UpsellActions.class, "upsell_actions");
    }
}
