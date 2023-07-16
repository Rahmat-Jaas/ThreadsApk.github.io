package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;

public final class TypeaheadMatchedStringImpl extends TreeJNI implements C81204nM {

    public final class MatchedSubstring extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"length", "offset"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(MatchedSubstring.class, "matched_substring");
    }
}
