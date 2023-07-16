package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CoWatchMediaSyncContentQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FbMediaSyncContent extends TreeJNI implements C81204nM {

        public final class FbVideo extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{MediaSyncXFBVideoImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"contains_licensed_music", "content_id", "is_non_interactable"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FbVideo.class, "fb_video");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbMediaSyncContent.class, "fb_media_sync_content(id:$content_id)");
    }
}
