package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class NewPaypalBillingAgreementImpl extends TreeJNI implements C81204nM {

    public final class AdditionalFields extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{AdditionalFieldsImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"credential_type", "icon_uri", "id", "login_ref_id", "readable_payment_option_name", DialogModule.KEY_TITLE, "url"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(AdditionalFields.class, "additional_fields");
    }
}
