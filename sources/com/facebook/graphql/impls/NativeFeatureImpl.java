package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class NativeFeatureImpl extends TreeJNI implements C81204nM {

    public final class ChildNativeFeatureConfigs extends TreeJNI implements C81204nM {

        public final class AdditionalEligibilityRules extends TreeJNI implements C81204nM {

            public final class Settings extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{FXPFAccessLibraryDebugFragment.NAME, "values"};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"instructions", FXPFAccessLibraryDebugFragment.NAME};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Settings.class, "settings");
            }
        }

        public final class ContentTypeControllers extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{TraceFieldType.ContentType};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"client_behavior", "surfaces"};
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(ContentTypeControllers.class, "content_type_controllers", true), AdditionalEligibilityRules.class, "additional_eligibility_rules", true);
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"app_name", "client_native_feature_id", "direction"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(ChildNativeFeatureConfigs.class, "child_native_feature_configs");
    }
}
