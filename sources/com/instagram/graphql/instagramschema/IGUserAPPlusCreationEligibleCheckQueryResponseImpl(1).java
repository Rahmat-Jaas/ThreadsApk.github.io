package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass4v1;
import X.AnonymousClass4v2;
import X.C108776iv;
import com.facebook.pando.TreeJNI;

public final class IGUserAPPlusCreationEligibleCheckQueryResponseImpl extends TreeJNI implements AnonymousClass4v2 {

    public final class XfbShadowInstagramUser extends TreeJNI implements AnonymousClass4v1 {
        public final String[] getScalarFields() {
            return new String[]{"id", "is_eligible_for_ap_plus_creation"};
        }

        public final boolean Apt() {
            return getBooleanValue("is_eligible_for_ap_plus_creation");
        }
    }

    public final AnonymousClass4v1 BMW() {
        return (AnonymousClass4v1) getTreeValue("xfb_shadow_instagram_user(query_params:$query_params)", XfbShadowInstagramUser.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbShadowInstagramUser.class, "xfb_shadow_instagram_user(query_params:$query_params)");
    }
}
