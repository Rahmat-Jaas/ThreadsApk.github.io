package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayLinkableTextImpl extends TreeJNI implements C81204nM {

    public final class Ranges extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"length", "offset", "override_uri"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(Ranges.class, "ranges");
    }

    public final String[] getScalarFields() {
        return C18210wN.A1a();
    }
}
