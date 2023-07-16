package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class NewCreditCardOptionImpl extends TreeJNI implements C81204nM {

    public final class AdditionalFields extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{AdditionalFieldsImpl.class};
        }
    }

    public final class AvailableCardTypesV2 extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{AvailableCardTypesImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"available_card_categories", "credential_type", "icon_uri", "id", DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(AdditionalFields.class, "additional_fields", true), AvailableCardTypesV2.class, "available_card_types_v2", true);
    }
}
