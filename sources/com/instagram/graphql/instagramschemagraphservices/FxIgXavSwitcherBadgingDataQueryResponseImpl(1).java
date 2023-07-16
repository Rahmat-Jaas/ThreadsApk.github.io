package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FxIgXavSwitcherBadgingDataQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class SwitcherAccountsData extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"badge_count", "id", "instagram_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(SwitcherAccountsData.class, "switcher_accounts_data(account_types:[\"FACEBOOK\",\"INSTAGRAM\"],caller_name:$caller_name,family_device_id:$family_device_id)");
    }
}
