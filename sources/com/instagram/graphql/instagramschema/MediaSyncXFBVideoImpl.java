package com.instagram.graphql.instagramschema;

import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import X.I17;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class MediaSyncXFBVideoImpl extends TreeJNI implements C81204nM {

    public final class Image extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{IgReactMediaPickerNativeModule.HEIGHT, "uri", IgReactMediaPickerNativeModule.WIDTH};
        }
    }

    public final class VideoAvailableCaptionsLocales extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"locale", "localized_country", "localized_creation_method", "localized_language"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"can_viewer_report", "cowatch_content_rating_text", "dash_manifest", IgReactMediaPickerNativeModule.HEIGHT, "id", I17.A00(114), "playable_duration_in_ms", "playable_url", IgReactMediaPickerNativeModule.WIDTH};
    }

    public final class Message extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final class Title extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(VideoAvailableCaptionsLocales.class, "video_available_captions_locales", true), C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Message.class, DialogModule.KEY_MESSAGE, false), C18190wL.A0G(Image.class, "image", false)};
    }
}
