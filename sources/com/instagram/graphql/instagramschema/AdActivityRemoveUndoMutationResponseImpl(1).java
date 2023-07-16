package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class AdActivityRemoveUndoMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbUndoDeleteRecentAdActivity extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"success"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbUndoDeleteRecentAdActivity.class, "xfb_undo_delete_recent_ad_activity(data:$input)");
    }
}
