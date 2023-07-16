package com.instagram.business.onelink.queries.businessaccount;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbOneLinkMonoschema extends TreeJNI implements C81204nM {

        public final class BusinessInfo extends TreeJNI implements C81204nM {

            public final class Business extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"id", "is_hidden", "is_two_factor_enabled", FXPFAccessLibraryDebugFragment.NAME};
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
