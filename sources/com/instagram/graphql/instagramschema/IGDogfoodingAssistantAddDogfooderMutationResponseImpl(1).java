package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGDogfoodingAssistantAddDogfooderMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbDaSessionAddViewerDogfooder extends TreeJNI implements C81204nM {

        public final class DaSession extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(DaSession.class, "da_session");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbDaSessionAddViewerDogfooder.class, "xfb_da_session_add_viewer_dogfooder(data:$input)");
    }
}
