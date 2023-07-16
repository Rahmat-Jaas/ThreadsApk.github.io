package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CrossPostingContentCompatibilityConfigV2ResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpUnifiedCrosspostingConfigsRoot extends TreeJNI implements C81204nM {

        public final class ContentCompatibilityConfigsV2 extends TreeJNI implements C81204nM {

            public final class SourceNativeFeatures extends TreeJNI implements C81204nM {

                public final class DestinationNativeFeatures extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{NativeFeatureImpl.class};
                    }
                }

                public final class SourceNativeFeature extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{NativeFeatureImpl.class};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(SourceNativeFeature.class, "source_native_feature", false), DestinationNativeFeatures.class, "destination_native_features", true);
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(SourceNativeFeatures.class, "source_native_features");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(ContentCompatibilityConfigsV2.class, "content_compatibility_configs_v2");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XcxpUnifiedCrosspostingConfigsRoot.class, C18170wI.A00(529));
    }
}
