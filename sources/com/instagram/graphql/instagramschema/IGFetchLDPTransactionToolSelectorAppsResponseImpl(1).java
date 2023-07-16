package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IGFetchLDPTransactionToolSelectorAppsResponseImpl extends TreeJNI implements C81204nM {

    public final class IgLdpAppStoreAppsRootWrapper extends TreeJNI implements C81204nM {

        public final class IgLdpAppStoreApps extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"app_id", "authentication_url", "logo_url", FXPFAccessLibraryDebugFragment.NAME};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(IgLdpAppStoreApps.class, "ig_ldp_app_store_apps");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgLdpAppStoreAppsRootWrapper.class, "ig_ldp_app_store_apps_root_wrapper");
    }
}
