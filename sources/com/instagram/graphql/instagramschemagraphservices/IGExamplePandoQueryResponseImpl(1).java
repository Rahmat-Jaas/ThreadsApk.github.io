package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IGExamplePandoQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class Me extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{FXPFAccessLibraryDebugFragment.NAME, C61963Wn.A00()};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Me.class, "me");
    }
}
