package com.instagram.share.facebook.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CrossPostingContentCompatibilityConfigResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpUnifiedCrosspostingConfigsRoot extends TreeJNI implements C81204nM {

        public final class ContentCompatibilityConfigs extends TreeJNI implements C81204nM {

            public final class CrosspostDestinationAppSurface extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"destination_app", "destination_surface", "source_surface"};
                }
            }

            public final class FeatureLists extends TreeJNI implements C81204nM {

                public final class FeatureList extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{CXPFeatureImpl.class};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"post_content_types"};
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(FeatureList.class, "feature_list");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(CrosspostDestinationAppSurface.class, "crosspost_destination_app_surface", false), FeatureLists.class, "feature_lists", true);
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(ContentCompatibilityConfigs.class, "content_compatibility_configs");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XcxpUnifiedCrosspostingConfigsRoot.class, "xcxp_unified_crossposting_configs_root(configs_request:$configs_request)");
    }
}
