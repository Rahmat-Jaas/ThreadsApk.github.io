package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class EmailOptInComponentImpl extends TreeJNI implements C81204nM {

    public final class ToggleContent extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYLinkableTextFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"is_default_toggle_state_on"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ToggleContent.class, "toggle_content");
    }
}
