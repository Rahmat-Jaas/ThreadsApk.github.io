package com.instagram.graphql.instagramschema;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import org.webrtc.MediaStreamTrack;

public final class CoWatchCatalogVideoImpl extends TreeJNI implements C81204nM {

    public final class Thumbnail extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CoWatchCatalogImageInfoImpl.class};
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
        return C18180wK.A1a(C18190wL.A0G(Thumbnail.class, "thumbnail", false), Video.class, MediaStreamTrack.VIDEO_TRACK_KIND, false);
    }
}
