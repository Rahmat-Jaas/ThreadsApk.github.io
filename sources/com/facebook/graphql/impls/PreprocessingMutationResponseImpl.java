package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PreprocessingMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class PaymentPreprocessingMutation extends TreeJNI implements C81204nM {

        public final class Error extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{SharedPaymentsErrorImpl.class};
            }
        }

        public final class PaymentAvailabilityResponse extends TreeJNI implements C81204nM {

            public final class LoggingPolicy extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBPayLoggingPolicyImpl.class};
                }
            }

            public final class ReceiverInfo extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBPayReceiverInfoImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"payment_availability", "payment_availability_reason"};
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(ReceiverInfo.class, "receiver_info", false), LoggingPolicy.class, "logging_policy", false);
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"actor_id", "checkout_components", "client_mutation_id", "order_id", "ux_type"};
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(PaymentAvailabilityResponse.class, "payment_availability_response", true), Error.class, "error", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PaymentPreprocessingMutation.class, "payment_preprocessing_mutation(input:$input)");
    }
}
