package com.instagram.ondevicetech.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class AndroidAppHistoryPlistQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class IgAndroidAppHistoryPlistQuery extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"app_id", "package_name"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(IgAndroidAppHistoryPlistQuery.class, "ig_android_app_history_plist_query");
    }
}
