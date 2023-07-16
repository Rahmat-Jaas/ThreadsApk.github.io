package com.instagram.profile.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class ImageVersion2Impl extends TreeJNI implements C81204nM {

    public final class AdditionalCandidates extends TreeJNI implements C81204nM {

        public final class FirstFrame extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{ImageCandidateImpl.class};
            }
        }

        public final class IgtvFirstFrame extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{ImageCandidateImpl.class};
            }
        }

        public final class SmartFrame extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{ImageCandidateImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(FirstFrame.class, "first_frame", false), C18190wL.A0G(IgtvFirstFrame.class, "igtv_first_frame", false), C18190wL.A0G(SmartFrame.class, "smart_frame", false)};
        }
    }

    public final class AnimatedThumbnailSpritesheetInfoCandidates extends TreeJNI implements C81204nM {

        public final class Default extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{SpriteSheetInfoImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        }
    }

    public final class Candidates extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ImageCandidateImpl.class};
        }
    }

    public final class ScrubberSpritesheetInfoCandidates extends TreeJNI implements C81204nM {

        public final class Default extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{SpriteSheetInfoImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"smart_thumbnail_enabled", "trace_token"};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(AdditionalCandidates.class, "additional_candidates", false), C18190wL.A0G(AnimatedThumbnailSpritesheetInfoCandidates.class, "animated_thumbnail_spritesheet_info_candidates", false), C18190wL.A0G(Candidates.class, "candidates", true), C18190wL.A0G(ScrubberSpritesheetInfoCandidates.class, "scrubber_spritesheet_info_candidates", false)};
    }
}
