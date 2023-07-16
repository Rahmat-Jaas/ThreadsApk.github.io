package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class QEOverrideResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbQeOverride extends TreeJNI implements C81204nM {

        public final class InlineXFBQECheck extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"condition_name", "experiment_name", "qe_universe"};
            }
        }

        public final Class[] getInlineClasses() {
            return new Class[]{InlineXFBQECheck.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbQeOverride.class, "xfb_qe_override(data:$data)");
    }
}
