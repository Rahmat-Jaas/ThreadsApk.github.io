package com.instagram.graphql.instagramschema;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class LeadGenContextualInputQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class Node extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"__typename", "id"};
        }

        public final Class[] getInlineClasses() {
            return new Class[]{LeadGenContextualInputFragmentImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Node.class, AnonymousClass000.A00(1180));
    }
}
