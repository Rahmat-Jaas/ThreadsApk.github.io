package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchProductConfigQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchProductConfig extends TreeJNI implements C81204nM {

        public final class CheckoutScreenConfig extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayCheckoutScreenConfigImpl.class};
            }
        }

        public final class EcpAvailability extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayECPAvailabilityImpl.class};
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

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(EcpAvailability.class, "ecp_availability", false), C18190wL.A0G(CheckoutScreenConfig.class, "checkout_screen_config", false), C18190wL.A0G(PaymentConfig.class, "payment_config", false), C18190wL.A0G(LoggingPolicy.class, "logging_policy", false)};
        }
    }

    public final FetchProductConfig A00() {
        return (FetchProductConfig) getTreeValue("fetch_product_config(input:$input)", FetchProductConfig.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchProductConfig.class, "fetch_product_config(input:$input)");
    }
}
