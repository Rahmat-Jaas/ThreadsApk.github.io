package com.instagram.unifiedfeedback.api.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBReactorOfContentImpl extends TreeJNI implements C81204nM {

    public final class FeedbackReactionInfo extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"key", "localized_name"};
        }

        public final class FaceImage extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18230wP.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FaceImage.class, "face_image(height:50,width:50)");
        }
    }

    public final class Node extends TreeJNI implements C81204nM {

        public final class ProfilePicture100 extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18230wP.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(ProfilePicture100.class, "profile_picture(height:200,width:200)");
        }

        public final String[] getScalarFields() {
            return C18210wN.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(Node.class, "node", false), FeedbackReactionInfo.class, "feedback_reaction_info", false);
    }
}
