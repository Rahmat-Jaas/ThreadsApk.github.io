package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class FBPayFormFieldImpl extends TreeJNI implements C81204nM {

    public final class ValidationRules extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayFormValidationRulesImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{DevServerEntity.COLUMN_DESCRIPTION, "error_message", "field_id", "field_type", "is_optional", "label", "placeholder", "value_type"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(ValidationRules.class, "validation_rules");
    }
}
