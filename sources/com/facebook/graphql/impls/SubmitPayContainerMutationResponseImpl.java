package com.facebook.graphql.impls;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class SubmitPayContainerMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class SubmitPaymentContainer extends TreeJNI implements C81204nM {

        public final class SubmitPaymentContainerResponseList extends TreeJNI implements C81204nM {

            public final class ConfirmationComponent extends TreeJNI implements C81204nM {

                public final class ReceiptText extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{PAYLinkableTextFragmentImpl.class};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"confirmation_email_text", AnonymousClass000.A00(28), "upsell_pin_text"};
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(ReceiptText.class, "receipt_text");
                }
            }

            public final class PaymentError extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{SharedPaymentsErrorImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"order_id", "payment_status"};
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(PaymentError.class, "payment_error", false), ConfirmationComponent.class, "confirmation_component", false);
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(SubmitPaymentContainerResponseList.class, "submit_payment_container_response_list");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(SubmitPaymentContainer.class, "submit_payment_container(input:$input)");
    }
}
