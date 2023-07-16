package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class IgCoPresenceAccuracyQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class IgCoPresenceAccuracy extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{DialogModule.KEY_MESSAGE};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgCoPresenceAccuracy.class, "ig_co_presence_accuracy(request:$request)");
    }
}
