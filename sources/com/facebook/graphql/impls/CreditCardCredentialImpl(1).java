package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CreditCardCredentialImpl extends TreeJNI implements C81204nM {

    public final class AuthenticationTicketsWithPttKidFiltering extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayAuthTicketFragmentImpl.class};
        }
    }

    public final class BillingAddress extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{BillingAddressImpl.class};
        }
    }

    public final class FieldsNeedingVerification extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{CardVerificationFieldsImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"__typename", "card_association", "card_association_image_url", "card_holder_name", "cc_subtitle", "cc_title", "cc_type", "credential_id", "credential_type", "expiry_month", "expiry_year", "id", "is_expired", "last_four_digits"};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(FieldsNeedingVerification.class, "fields_needing_verification(product_id:$payment_product_id)", false), C18190wL.A0G(BillingAddress.class, "billing_address", false), C18190wL.A0G(AuthenticationTicketsWithPttKidFiltering.class, "authentication_tickets_with_ptt_kid_filtering", true)};
    }
}
