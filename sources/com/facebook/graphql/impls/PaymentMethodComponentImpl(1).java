package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PaymentMethodComponentImpl extends TreeJNI implements C81204nM {

    public final class AddressFormFieldsConfig extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayAddressFormConfigFragmentImpl.class};
        }
    }

    public final class ApmOptions extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{APMOptionImpl.class};
        }
    }

    public final class AvailablePaymentCredentials extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PaymentCredentialImpl.class};
        }
    }

    public final class NewPaymentCredentialOptions extends TreeJNI implements C81204nM {
        public final NewCreditCardOptionImpl A00() {
            if (!isFulfilled("NewCreditCardOption")) {
                return null;
            }
            return (NewCreditCardOptionImpl) reinterpret(NewCreditCardOptionImpl.class);
        }

        public final NewPaypalBillingAgreementImpl A01() {
            if (!isFulfilled("NewPaypalBillingAgreement")) {
                return null;
            }
            return (NewPaypalBillingAgreementImpl) reinterpret(NewPaypalBillingAgreementImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{NewCreditCardOptionImpl.class, NewPaypalBillingAgreementImpl.class};
        }
    }

    public final class UnsupportedPaymentCredentials extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PaymentCredentialImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"should_de_prioritize_credit_cards", "should_order_new_options_first"};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(UnsupportedPaymentCredentials.class, "unsupported_payment_credentials", true), C18190wL.A0G(AvailablePaymentCredentials.class, "available_payment_credentials", true), C18190wL.A0G(NewPaymentCredentialOptions.class, "new_payment_credential_options", true), C18190wL.A0G(AddressFormFieldsConfig.class, "address_form_fields_config", false), C18190wL.A0G(ApmOptions.class, "apm_options", true)};
    }
}
