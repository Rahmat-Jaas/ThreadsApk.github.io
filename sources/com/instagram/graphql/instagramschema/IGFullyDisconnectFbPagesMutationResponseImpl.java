package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGFullyDisconnectFbPagesMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class IgFullyDisconnectFbPages extends TreeJNI implements C81204nM {

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
        return AnonymousClass0wJ.A1a(IgFullyDisconnectFbPages.class, "ig_fully_disconnect_fb_pages");
    }
}
