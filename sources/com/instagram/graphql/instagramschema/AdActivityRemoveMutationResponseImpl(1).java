package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class AdActivityRemoveMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbDeleteRecentAdActivity extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"success"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbDeleteRecentAdActivity.class, "xfb_delete_recent_ad_activity(data:$input)");
    }
}
