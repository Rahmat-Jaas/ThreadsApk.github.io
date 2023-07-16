package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ComponentDataMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class FbpayAccountMutation extends TreeJNI implements C81204nM {

        public final class CredentialResponse extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{CredentialResponseImpl.class};
            }
        }

        public final class EmailResponse extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{EmailResponseImpl.class};
            }
        }

        public final class PayerNameResponse extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{PayerNameResponseImpl.class};
            }
        }

        public final class PhoneResponse extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{PhoneResponseImpl.class};
            }
        }

        public final class ShippingAddressResponse extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{ShippingAddressResponseImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"actor_id", "client_mutation_id"};
        }

        public final EmailResponse A00() {
            return (EmailResponse) getTreeValue("email_response", EmailResponse.class);
        }

        public final PhoneResponse A01() {
            return (PhoneResponse) getTreeValue("phone_response", PhoneResponse.class);
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(CredentialResponse.class, "credential_response", false), C18190wL.A0G(ShippingAddressResponse.class, "shipping_address_response", false), C18190wL.A0G(EmailResponse.class, "email_response", false), C18190wL.A0G(PhoneResponse.class, "phone_response", false), C18190wL.A0G(PayerNameResponse.class, "payer_name_response", false)};
        }
    }

    public final FbpayAccountMutation A00() {
        return (FbpayAccountMutation) getTreeValue("fbpay_account_mutation(input:$input)", FbpayAccountMutation.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayAccountMutation.class, "fbpay_account_mutation(input:$input)");
    }
}
