package com.instagram.business.onelink.queries.adaccount;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IGOneLinkMiddlewareAdAccountQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbOneLinkMonoschema extends TreeJNI implements C81204nM {

        public final class AdAccountInfo extends TreeJNI implements C81204nM {

            public final class DefaultAdAccount extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"id", "legacy_account_id", FXPFAccessLibraryDebugFragment.NAME};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(DefaultAdAccount.class, "default_ad_account");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AdAccountInfo.class, "ad_account_info");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbOneLinkMonoschema.class, "xfb_one_link_monoschema(input:$input)");
    }
}
