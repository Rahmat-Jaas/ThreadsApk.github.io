package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGFxLinkedAccountsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FxLinkedAccounts extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"cac_creator_destination_migration_enabled", "cac_destination_migration_enabled", "cac_destination_picker_enabled", "linked_account_has_fx", "linked_account_has_fx_in_cl", "should_delete_invalid_tokens_for_business_users"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxLinkedAccounts.class, "fx_linked_accounts");
    }
}
