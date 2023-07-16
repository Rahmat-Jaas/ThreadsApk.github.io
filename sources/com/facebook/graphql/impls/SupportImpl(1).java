package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class SupportImpl extends TreeJNI implements C81204nM {

    public final class SupportUri extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYTextWithLinksFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"section_title"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(SupportUri.class, "support_uri");
    }
}
