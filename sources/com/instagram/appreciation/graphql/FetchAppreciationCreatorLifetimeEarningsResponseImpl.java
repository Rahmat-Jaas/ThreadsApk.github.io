package com.instagram.appreciation.graphql;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchAppreciationCreatorLifetimeEarningsResponseImpl extends TreeJNI implements C81204nM {

    public final class Viewer extends TreeJNI implements C81204nM {

        public final class User extends TreeJNI implements C81204nM {

            public final class ContentAppreciationInsights extends TreeJNI implements C81204nM {

                public final class LifetimeEstimatedEarnings extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{ContentAppreciationMetricsDataImpl.class};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(LifetimeEstimatedEarnings.class, AnonymousClass000.A00(178));
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(ContentAppreciationInsights.class, AnonymousClass000.A00(150));
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(User.class, "user");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Viewer.class, "viewer");
    }
}
