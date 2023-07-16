package com.instagram.graphql.instagramschema;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import org.webrtc.MediaStreamTrack;

public final class CoWatchCatalogMovieImpl extends TreeJNI implements C81204nM {

    public final class CoverPhoto extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CoWatchCatalogImageInfoImpl.class};
        }
    }

    public final class Poster extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CoWatchCatalogImageInfoImpl.class};
        }
    }

    public final class TrailersAndMore extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CoWatchCatalogVideoImpl.class};
        }
    }

    public final class Video extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CoWatchCatalogVideoInfoImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{DevServerEntity.COLUMN_DESCRIPTION, "duration", "id", DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(Poster.class, "poster", false), C18190wL.A0G(CoverPhoto.class, "cover_photo", false), C18190wL.A0G(Video.class, MediaStreamTrack.VIDEO_TRACK_KIND, false), C18190wL.A0G(TrailersAndMore.class, "trailers_and_more", true)};
    }
}
