package com.instagram.business.onelink.queries.whatsappbusiness;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGOneLinkMiddlewareWhatsAppBusinessQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbOneLinkMonoschema extends TreeJNI implements C81204nM {

        public final class WhatsappInfo extends TreeJNI implements C81204nM {

            public final class LinkedWhatsappAccount extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"is_whatsapp_number_banned"};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"is_business_verification_eligible", "is_risky_tier_account_for_ctwa", "linked_whatsapp_account_type", "linked_whatsapp_phone_number"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(LinkedWhatsappAccount.class, "linked_whatsapp_account");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(WhatsappInfo.class, "whatsapp_info");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbOneLinkMonoschema.class, "xfb_one_link_monoschema(input:$input)");
    }
}
