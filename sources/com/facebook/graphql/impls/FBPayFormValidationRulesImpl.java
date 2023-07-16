package com.facebook.graphql.impls;

import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;

public final class FBPayFormValidationRulesImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{"error_message", "type", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
    }
}
