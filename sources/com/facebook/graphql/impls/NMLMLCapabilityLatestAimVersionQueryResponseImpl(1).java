package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class NMLMLCapabilityLatestAimVersionQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class AimModelVersionManifest extends TreeJNI implements C81204nM {

        public final class Models extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"force_download_group_identifier", "is_ard_version", FXPFAccessLibraryDebugFragment.NAME, ClientCookie.VERSION_ATTR};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Models.class, "models");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AimModelVersionManifest.class, "aim_model_version_manifest(models:$models)");
    }
}
