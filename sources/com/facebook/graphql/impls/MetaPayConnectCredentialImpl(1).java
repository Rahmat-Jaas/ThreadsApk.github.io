package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class MetaPayConnectCredentialImpl extends TreeJNI implements C81204nM {

    public final class DefaultCredentials extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"is_default_for_consumer", "is_eligible_for_consumer"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"__typename", "card_expiry_month", "card_expiry_year", "credential_id", "credential_type", "icon_url", "is_card_expired", "last_four_digits", DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(DefaultCredentials.class, "default_credentials");
    }
}
