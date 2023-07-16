package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.AnonymousClass6H6;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import X.C86114wI;
import com.facebook.pando.TreeJNI;

public final class IgFbPayPaymentMethodsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FbpayAccountExtended extends TreeJNI implements C81204nM {

        public final class FbpayAccount extends TreeJNI implements C81204nM {

            public final class ConsumerPaymentCredentials extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"credential_type", "id"};
                }

                public final Class[] getInlineClasses() {
                    return new Class[]{ModularIgPaymentsCredentialMethodViewImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(ConsumerPaymentCredentials.class, "consumer_payment_credentials(payment_type:$payment_type)");
            }
        }

        public final class NewPaymentCredentialOptions extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{ModularIgPaymentsCredentialOptionViewImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(FbpayAccount.class, "fbpay_account", false), NewPaymentCredentialOptions.class, "new_payment_credential_options(payment_type:$payment_type)", true);
        }
    }

    public final class PaymentsAddressFormFieldsConfig extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            try {
                return new Class[]{AnonymousClass6H6.A00(-1659328637)};
            } catch (ClassNotFoundException e) {
                throw C86114wI.A0k(e);
            }
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(FbpayAccountExtended.class, "fbpay_account_extended", false), PaymentsAddressFormFieldsConfig.class, "payments_address_form_fields_config(query_params:{\"payment_type\":$payment_type})", false);
    }
}
