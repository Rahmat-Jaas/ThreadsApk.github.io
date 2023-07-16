package com.instagram.adsdatapreferences.consentgrowth.controller;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGAdsPreferencesIsOptedOutFromThirdPartyMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class UpdateIgOptOutFromThirdParty extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"is_account_opt_out"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(UpdateIgOptOutFromThirdParty.class, "update_ig_opt_out_from_third_party(is_account_opt_out:$is_account_opt_out)");
    }
}
