package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18220wO;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class MobileBuildsDogfoodingInfoQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbMobileBuildsDogfoodingInfoQuery extends TreeJNI implements C81204nM {

        public final class LatestAlphaBuild extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18220wO.A1a();
            }
        }

        public final class LatestBetaBuild extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18220wO.A1a();
            }
        }

        public final class RecommendedBuild extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18220wO.A1a();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(LatestAlphaBuild.class, "latest_alpha_build", false), C18190wL.A0G(LatestBetaBuild.class, "latest_beta_build", false), C18190wL.A0G(RecommendedBuild.class, "recommended_build", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbMobileBuildsDogfoodingInfoQuery.class, "xfb_mobile_builds_dogfooding_info_query(app_id:$app_id)");
    }
}
