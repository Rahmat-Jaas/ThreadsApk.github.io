package com.instagram.unifiedfeedback.api.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class FBCommentImpl extends TreeJNI implements C81204nM {

    public final class Attachments extends TreeJNI implements C81204nM {

        public final class Media extends TreeJNI implements C81204nM {

            public final class AnimatedImage extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{IgReactMediaPickerNativeModule.HEIGHT, "uri", IgReactMediaPickerNativeModule.WIDTH};
                }
            }

            public final class Image extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{IgReactMediaPickerNativeModule.HEIGHT, "uri", IgReactMediaPickerNativeModule.WIDTH};
                }
            }

            public final class InlineXFBVideo extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"playable_duration", "playable_url"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Image.class, "image", false), AnimatedImage.class, "animated_image", false);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{InlineXFBVideo.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"style_list"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Media.class, "media");
        }
    }

    public final class Author extends TreeJNI implements C81204nM {

        public final class ProfilePicture100 extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18230wP.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(ProfilePicture100.class, "profile_picture(scale:1,width:100)");
        }

        public final String[] getScalarFields() {
            return C18210wN.A1b();
        }
    }

    public final class Body extends TreeJNI implements C81204nM {

        public final class Ranges extends TreeJNI implements C81204nM {

            public final class Entity extends TreeJNI implements C81204nM {

                public final class InlineXFBUser extends TreeJNI implements C81204nM {

                    public final class ProfilePicture100 extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return C18230wP.A1Z();
                        }
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(ProfilePicture100.class, "profile_picture(scale:1,width:100)");
                    }

                    public final String[] getScalarFields() {
                        return C18210wN.A1b();
                    }
                }

                public final Class[] getInlineClasses() {
                    return new Class[]{InlineXFBUser.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"length", "offset"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Entity.class, "entity");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Ranges.class, "ranges");
        }

        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final class Feedback extends TreeJNI implements C81204nM {

        public final class Reactors extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"count", "count_reduced"};
            }
        }

        public final class TopLevelComments extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"count"};
            }
        }

        public final class ViewerFeedbackReactionInfo extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"key", "localized_name"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"can_viewer_react", "id"};
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(ViewerFeedbackReactionInfo.class, "viewer_feedback_reaction_info", false), C18190wL.A0G(Reactors.class, "reactors", false), C18190wL.A0G(TopLevelComments.class, "top_level_comments", false)};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"created_time", "id", "is_hidden_by_viewer"};
    }

    public final Feedback A00() {
        return (Feedback) getTreeValue("feedback", Feedback.class);
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(Attachments.class, "attachments", true), C18190wL.A0G(Feedback.class, "feedback", false), C18190wL.A0G(Author.class, "author", false), C18190wL.A0G(Body.class, "body", false)};
    }
}
