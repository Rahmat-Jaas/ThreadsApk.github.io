package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IgMakePageConnectionConsistentMutationV2ResponseImpl extends TreeJNI implements C81204nM {

    public final class IgMakePageConnectionConsistentV2 extends TreeJNI implements C81204nM {

        public final class Viewer extends TreeJNI implements C81204nM {

            public final class User extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1Z();
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

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgMakePageConnectionConsistentV2.class, "ig_make_page_connection_consistent_v2(data:$input)");
    }
}
