package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class WellbeingScreenTimeSubscriptionResponseImpl extends TreeJNI implements C81204nM {

    public final class IgSupervisedUserScreenTimeSettingsSubscribe extends TreeJNI implements C81204nM {

        public final class LatestValidTimeLimitExtensionRequest extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"decision_actor_username", "granted_extension_time_seconds", "id", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"daily_limit_without_extensions_seconds", "screen_time_daily_limit_seconds"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(LatestValidTimeLimitExtensionRequest.class, "latest_valid_time_limit_extension_request");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgSupervisedUserScreenTimeSettingsSubscribe.class, "ig_supervised_user_screen_time_settings_subscribe(data:$input)");
    }
}
