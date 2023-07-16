package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayECPHandleCheckoutEventMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class HandleCheckoutEvent extends TreeJNI implements C81204nM {

        public final class PaymentDetailsUpdates extends TreeJNI implements C81204nM {

            public final class ShippingOptions extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBPayECPShippingOptionsFragmentImpl.class};
                }
            }

            public final class Error extends TreeJNI implements C81204nM {

                public final class UserFacingError extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{SharedPaymentsErrorImpl.class};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(UserFacingError.class, "user_facing_error");
                }
            }

            public final class OfferCredentialIds extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"credential_ids"};
                }
            }

            public final class PriceItems extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBPayECPPriceInfoImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"order_id"};
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(PriceItems.class, "price_items", true), C18190wL.A0G(ShippingOptions.class, "shipping_options", false), C18190wL.A0G(Error.class, "error", false), C18190wL.A0G(OfferCredentialIds.class, "offer_credential_ids", false)};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(PaymentDetailsUpdates.class, "payment_details_updates");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(HandleCheckoutEvent.class, "handle_checkout_event(input:$input)");
    }
}
