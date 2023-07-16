package com.instagram.graphql.instagramschema;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class CoWatchCatalogShowImpl extends TreeJNI implements C81204nM {

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

    public final class Seasons extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CoWatchCatalogSeasonImpl.class};
        }
    }

    public final class Trailer extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CoWatchCatalogTrailerImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"id", DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(Poster.class, "poster", false), C18190wL.A0G(CoverPhoto.class, "cover_photo", false), C18190wL.A0G(Trailer.class, "trailer", false), C18190wL.A0G(Seasons.class, "seasons", true)};
    }
}
