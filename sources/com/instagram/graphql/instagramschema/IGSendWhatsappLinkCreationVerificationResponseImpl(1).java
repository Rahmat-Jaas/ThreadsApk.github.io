package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C85384uy;
import X.C85394uz;
import com.facebook.pando.TreeJNI;

public final class IGSendWhatsappLinkCreationVerificationResponseImpl extends TreeJNI implements C85394uz {

    public final class IsWhatsappBusinessPhoneNumber extends TreeJNI implements C85384uy {
        public final String[] getScalarFields() {
            return new String[]{"result"};
        }

        public final boolean B7w() {
            return getBooleanValue("result");
        }
    }

    public final C85384uy AqD() {
        return (C85384uy) getTreeValue("is_whatsapp_business_phone_number(data:$input)", IsWhatsappBusinessPhoneNumber.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IsWhatsappBusinessPhoneNumber.class, "is_whatsapp_business_phone_number(data:$input)");
    }
}
