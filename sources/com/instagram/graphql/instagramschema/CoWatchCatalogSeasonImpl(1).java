package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class CoWatchCatalogSeasonImpl extends TreeJNI implements C81204nM {

    public final class Episodes extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CoWatchCatalogVideoImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"id", "season_number", DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(Episodes.class, "episodes");
    }
}
