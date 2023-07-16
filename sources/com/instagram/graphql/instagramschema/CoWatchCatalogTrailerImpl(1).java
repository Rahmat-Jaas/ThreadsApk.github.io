package com.instagram.graphql.instagramschema;

import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class CoWatchCatalogTrailerImpl extends TreeJNI implements C81204nM {

    public final class Image extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CoWatchCatalogImageInfoImpl.class};
        }
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
        return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Message.class, DialogModule.KEY_MESSAGE, false), C18190wL.A0G(Image.class, "image", false)};
    }

    public final Class[] getInlineClasses() {
        return new Class[]{CoWatchCatalogVideoInfoImpl.class};
    }

    public final String[] getScalarFields() {
        return C18210wN.A1Z();
    }
}
