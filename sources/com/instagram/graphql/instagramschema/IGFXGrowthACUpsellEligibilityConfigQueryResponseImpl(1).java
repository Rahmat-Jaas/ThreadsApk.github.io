package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FxGrowth extends TreeJNI implements C81204nM {

        public final class AcUpsellEligibilityConfig extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"is_eligibile", "linking_scenario", "target_account_name"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AcUpsellEligibilityConfig.class, "ac_upsell_eligibility_config(entry_point:$entry_point,holdout_type:$holdout_type,impression_limit_check_enabled:$impression_limit_check_enabled,native_token:$native_token,recently_seen_check_enabled:$recently_seen_check_enabled,target_account_type:$target_account_type,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxGrowth.class, "fx_growth");
    }
}
