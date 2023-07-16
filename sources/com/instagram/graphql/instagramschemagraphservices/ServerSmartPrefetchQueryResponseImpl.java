package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ServerSmartPrefetchQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbSsp extends TreeJNI implements C81204nM {

        public final class Screens extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"screen", "tti"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Screens.class, "screens");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbSsp.class, "xfb_ssp(entrypoint:$entrypoint,params:$params)");
    }
}
