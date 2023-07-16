package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C313025c;
import X.C85054uR;
import X.C85064uS;
import X.C85074uT;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class FxIgCanUserSeeACUpsellMultiNativeAuthQueryResponseImpl extends TreeJNI implements C85074uT {

    public final class FxGrowth extends TreeJNI implements C85064uS {

        public final class CanUserSeeAcUpsellMultiNativeAuth extends TreeJNI implements C85054uR {
            public final String[] getScalarFields() {
                return new String[]{"account_source", "account_type", "app_source", "eligibility", "linking_scenario", "opaque_target_account_id", "target_account_name"};
            }

            public final C313025c AfG() {
                return (C313025c) getEnumValue("eligibility", C313025c.A02);
            }
        }

        public final ImmutableList AW7() {
            return getTreeList("can_user_see_ac_upsell_multi_native_auth(entry_point:$entry_point,holdout_type:$holdout_type,impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,target_account_type:$target_account_type,target_accounts:$target_accounts,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)", CanUserSeeAcUpsellMultiNativeAuth.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(CanUserSeeAcUpsellMultiNativeAuth.class, "can_user_see_ac_upsell_multi_native_auth(entry_point:$entry_point,holdout_type:$holdout_type,impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,target_account_type:$target_account_type,target_accounts:$target_accounts,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
        }
    }

    public final C85064uS AkM() {
        return (C85064uS) getTreeValue("fx_growth", FxGrowth.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxGrowth.class, "fx_growth");
    }
}
