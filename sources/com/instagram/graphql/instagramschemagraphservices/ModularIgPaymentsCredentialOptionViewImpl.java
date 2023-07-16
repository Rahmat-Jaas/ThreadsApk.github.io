package com.instagram.graphql.instagramschemagraphservices;

import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class ModularIgPaymentsCredentialOptionViewImpl extends TreeJNI implements C81204nM {

    public final class InlineNewCreditCardOption extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{DialogModule.KEY_TITLE};
        }
    }

    public final class InlineNewPaypalBillingAgreement extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"login_ref_id", DialogModule.KEY_TITLE, "url"};
        }
    }

    public final class InlineNewShopPayOption extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{DialogModule.KEY_TITLE};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"credential_type"};
    }

    public final InlineNewPaypalBillingAgreement A00() {
        if (!isFulfilled("NewPaypalBillingAgreement")) {
            return null;
        }
        return (InlineNewPaypalBillingAgreement) reinterpret(InlineNewPaypalBillingAgreement.class);
    }

    public final Class[] getInlineClasses() {
        return new Class[]{InlineNewPaypalBillingAgreement.class, InlineNewCreditCardOption.class, InlineNewShopPayOption.class};
    }
}
