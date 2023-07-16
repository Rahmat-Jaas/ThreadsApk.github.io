package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchPaymentDetailsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchPaymentDetails extends TreeJNI implements C81204nM {

        public final class ConfirmationSection extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayConfirmationSectionImpl.class};
            }
        }

        public final class Error extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{ECPUserFacingErrorMaybeDeadImpl.class};
            }
        }

        public final class LinkAvailability extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayLinkAvailabilityImpl.class};
            }
        }

        public final class ReceiverInfo extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{ECPReceiverInfoFragmentImpl.class};
            }
        }

        public final class TransactionInfo extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayTransactionInfoImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(ReceiverInfo.class, "receiver_info", false), C18190wL.A0G(ConfirmationSection.class, "confirmation_section", false), C18190wL.A0G(TransactionInfo.class, "transaction_info", false), C18190wL.A0G(LinkAvailability.class, "link_availability", false), C18190wL.A0G(Error.class, "error", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchPaymentDetails.class, "fetch_payment_details(input:$input)");
    }
}
