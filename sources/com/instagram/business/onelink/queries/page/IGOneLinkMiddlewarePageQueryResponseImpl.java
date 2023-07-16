package com.instagram.business.onelink.queries.page;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGOneLinkMiddlewarePageQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbOneLinkMonoschema extends TreeJNI implements C81204nM {

        public final class PageInfo extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"is_bpl_and_ads_page_consistent"};
            }

            public final class AdsPage extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1b();
                }
            }

            public final class BplPage extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1b();
                }
            }

            public final class BplPageWithIabpFallback extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1b();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(BplPage.class, "bpl_page", false), C18190wL.A0G(AdsPage.class, "ads_page", false), C18190wL.A0G(BplPageWithIabpFallback.class, "bpl_page_with_iabp_fallback", false)};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PageInfo.class, "page_info");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbOneLinkMonoschema.class, "xfb_one_link_monoschema(input:$input)");
    }
}
