package com.instagram.unifiedfeedback.api.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBFeedbackImpl extends TreeJNI implements C81204nM {

    public final class OwningProfile extends TreeJNI implements C81204nM {

        public final class ProfilePicture extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18230wP.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture(scale:1,width:150)");
        }

        public final String[] getScalarFields() {
            return C18210wN.A1b();
        }
    }

    public final class Reactors extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"count", "count_reduced"};
        }
    }

    public final class TopLevelComments extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{TopLevelCommentsImpl.class};
        }
    }

    public final class ViewerFeedbackReactionInfo extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"key", "localized_name"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"id", "post_message"};
    }

    public final class PostThumbnail100 extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18230wP.A1Z();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(PostThumbnail100.class, "first_photo(height:100,width:100)", false), C18190wL.A0G(OwningProfile.class, "owning_profile", false), C18190wL.A0G(ViewerFeedbackReactionInfo.class, "viewer_feedback_reaction_info", false), C18190wL.A0G(Reactors.class, "reactors", false), C18190wL.A0G(TopLevelComments.class, "top_level_comments(after:$after_cursor,first:$page_size)", false)};
    }
}
