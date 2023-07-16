package com.instagram.profile.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18170wI;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class ImageCandidateImpl extends TreeJNI implements C81204nM {

    public final class Fallback extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"url"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"color_preview_hex", "estimated_scans_sizes", IgReactMediaPickerNativeModule.HEIGHT, "imageSourceHeight", "imageSourceWidth", "scans_profile", "url", C18170wI.A00(64), IgReactMediaPickerNativeModule.WIDTH};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Fallback.class, "fallback");
    }
}
