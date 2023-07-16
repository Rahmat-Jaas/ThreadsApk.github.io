package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;

public final class InfoDetailsImpl extends TreeJNI implements C81204nM {

    public final class InfoItems extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"accessibility_label", "label", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"section_title"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(InfoItems.class, "info_items");
    }
}
