package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;

public final class XFBCreateIabLinkHistoryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbCreateIabLinkHistory extends TreeJNI implements C81204nM {

        public final class IabLinkHistory extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"end_time", "page_url", C61963Wn.A01(12, 10, 44), TraceFieldType.StartTime};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(IabLinkHistory.class, "iab_link_history");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbCreateIabLinkHistory.class, "xfb_create_iab_link_history(data:$data)");
    }
}
