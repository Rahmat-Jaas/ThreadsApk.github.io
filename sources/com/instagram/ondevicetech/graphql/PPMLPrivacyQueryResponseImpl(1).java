package com.instagram.ondevicetech.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PPMLPrivacyQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class PpmlPrivacy extends TreeJNI implements C81204nM {

        public final class Data extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"is_eligible"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Data.class, "data");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PpmlPrivacy.class, "ppml_privacy");
    }
}
