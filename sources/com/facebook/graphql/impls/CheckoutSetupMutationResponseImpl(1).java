package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;

public final class CheckoutSetupMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class CheckoutSetupMutation extends TreeJNI implements C81204nM {

        public final class EcpCustomFields extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"key", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
            }
        }

        public final class CheckoutScreenConfig extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayCheckoutScreenConfigImpl.class};
            }
        }

        public final class ConfirmationSection extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayConfirmationSectionImpl.class};
            }
        }

        public final class EcpAvailability extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayECPAvailabilityImpl.class};
            }
        }

        public final class EmbeddedBloksApmButtons extends TreeJNI implements C81204nM {

            public final class Component extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBPayBloksComponentImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Component.class, "component");
            }
        }

        public final class Error extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayUserFacingErrorFragmentImpl.class};
            }
        }

        public final class LinkAvailability extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayLinkAvailabilityImpl.class};
            }
        }

        public final class LoggingPolicy extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayLoggingPolicyImpl.class};
            }
        }

        public final class PaymentConfig extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayPaymentConfigImpl.class};
            }
        }

        public final class ReceiverInfo extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayReceiverInfoImpl.class};
            }
        }

        public final class TransactionInfo extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayTransactionInfoImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"order_id"};
        }

        public final ReceiverInfo A00() {
            return (ReceiverInfo) getTreeValue("receiver_info", ReceiverInfo.class);
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(ReceiverInfo.class, "receiver_info", false), C18190wL.A0G(CheckoutScreenConfig.class, "checkout_screen_config", false), C18190wL.A0G(PaymentConfig.class, "payment_config", false), C18190wL.A0G(EcpAvailability.class, "ecp_availability", false), C18190wL.A0G(LoggingPolicy.class, "logging_policy", false), C18190wL.A0G(ConfirmationSection.class, "confirmation_section", false), C18190wL.A0G(TransactionInfo.class, "transaction_info", false), C18190wL.A0G(LinkAvailability.class, "link_availability", false), C18190wL.A0G(Error.class, "error", false), C18190wL.A0G(EmbeddedBloksApmButtons.class, "embedded_bloks_apm_buttons", false), C18190wL.A0G(EcpCustomFields.class, "ecp_custom_fields", true)};
        }
    }

    public final CheckoutSetupMutation A00() {
        return (CheckoutSetupMutation) getTreeValue("checkout_setup_mutation(input:$input)", CheckoutSetupMutation.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(CheckoutSetupMutation.class, "checkout_setup_mutation(input:$input)");
    }
}
