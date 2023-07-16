package com.instagram.clips.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class ClipsProfileLightweightMediaImpl extends TreeJNI implements C81204nM {

    public final class ImageVersions2 extends TreeJNI implements C81204nM {

        public final class AdditionalCandidates extends TreeJNI implements C81204nM {

            public final class FirstFrame extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{IgReactMediaPickerNativeModule.HEIGHT, "scans_profile", "url", IgReactMediaPickerNativeModule.WIDTH};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(FirstFrame.class, "first_frame");
            }
        }

        public final class Candidates extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{IgReactMediaPickerNativeModule.HEIGHT, "scans_profile", "url", IgReactMediaPickerNativeModule.WIDTH};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"smart_thumbnail_enabled"};
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(AdditionalCandidates.class, "additional_candidates", false), Candidates.class, "candidates", true);
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"id", "media_type", "original_height", "original_width", "pk", "play_count"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ImageVersions2.class, "image_versions2");
    }
}
