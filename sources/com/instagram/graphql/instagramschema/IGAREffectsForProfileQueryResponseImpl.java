package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18230wP;
import X.C28174Ezk;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IGAREffectsForProfileQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class AttributedArEffects extends TreeJNI implements C81204nM {

        public final class Nodes extends TreeJNI implements C81204nM {

            public final class AttributionUser extends TreeJNI implements C81204nM {

                public final class ProfilePicture extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18230wP.A1Z();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture");
                }

                public final String[] getScalarFields() {
                    return new String[]{"instagram_user_id", C61963Wn.A00()};
                }
            }

            public final class Media extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{C28174Ezk.A00(693)};
                }
            }

            public final class EffectActionSheet extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"primary_actions", "secondary_actions"};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"device_position", "failure_code", TraceFieldType.FailureReason, "id", FXPFAccessLibraryDebugFragment.NAME, "save_status"};
            }

            public final class ThumbnailImage extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18230wP.A1Z();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(EffectActionSheet.class, "effect_action_sheet(surface:\"PROFILE\")", false), C18190wL.A0G(Media.class, "media", false), C18190wL.A0G(ThumbnailImage.class, "thumbnail_image", false), C18190wL.A0G(AttributionUser.class, "attribution_user", false)};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Nodes.class, "nodes");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AttributedArEffects.class, "attributed_ar_effects(after:$after,device_capabilities:$device_capabilities,first:$first,user_igid2:$target_user_id)");
    }
}
