package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGFBPayOrderInfoSectionQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FbpayAccountExtended extends TreeJNI implements C81204nM {

        public final class FbpayAccount extends TreeJNI implements C81204nM {

            public final class Emails extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"is_default", "normalized_email_address"};
                }
            }

            public final class ShippingAddresses extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"is_default", "label"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Emails.class, "emails", true), ShippingAddresses.class, "shipping_addresses", true);
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FbpayAccount.class, "fbpay_account");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayAccountExtended.class, "fbpay_account_extended");
    }
}
