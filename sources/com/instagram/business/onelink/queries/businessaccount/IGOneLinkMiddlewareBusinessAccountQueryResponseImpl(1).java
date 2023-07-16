package com.instagram.business.onelink.queries.businessaccount;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGOneLinkMiddlewareBusinessAccountQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbOneLinkMonoschema extends TreeJNI implements C81204nM {

        public final class BusinessInfo extends TreeJNI implements C81204nM {

            public final class Business extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1b();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Business.class, "business");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(BusinessInfo.class, "business_info");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbOneLinkMonoschema.class, "xfb_one_link_monoschema(input:$input)");
    }
}
