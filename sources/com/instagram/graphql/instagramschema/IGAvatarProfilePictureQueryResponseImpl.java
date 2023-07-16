package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGAvatarProfilePictureQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XigAvatarProfileSetting extends TreeJNI implements C81204nM {

        public final class Backgrounds extends TreeJNI implements C81204nM {

            public final class Edges extends TreeJNI implements C81204nM {

                public final class Node extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"accessibility_label", "id", "template_id"};
                    }

                    public final class Image extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return C18230wP.A1Z();
                        }
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Image.class, "image(size:$size)");
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Node.class, "node");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Edges.class, "edges");
            }
        }

        public final class CurrentSelection extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"background_id", "background_template_id", "pose_id", "pose_template_id"};
            }
        }

        public final class Poses extends TreeJNI implements C81204nM {

            public final class Edges extends TreeJNI implements C81204nM {

                public final class Node extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"accessibility_label", "id", "template_id"};
                    }

                    public final class Image extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return C18230wP.A1Z();
                        }
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Image.class, "image(size:$size)");
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Node.class, "node");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Edges.class, "edges");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(CurrentSelection.class, "current_selection", false), C18190wL.A0G(Poses.class, "poses", false), C18190wL.A0G(Backgrounds.class, "backgrounds", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigAvatarProfileSetting.class, "xig_avatar_profile_setting");
    }
}
