package com.instagram.business.onelink.queries.whatsappbusiness;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGOneLinkLoggedOutWAMiddlewareQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbOneLinkLoggedOutWhatsappInfoMonoschema extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"linked_whatsapp_phone_number"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbOneLinkLoggedOutWhatsappInfoMonoschema.class, "xfb_one_link_logged_out_whatsapp_info_monoschema(input:$input)");
    }
}
