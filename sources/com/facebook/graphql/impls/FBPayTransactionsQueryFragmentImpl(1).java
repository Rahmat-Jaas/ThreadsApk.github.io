package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayTransactionsQueryFragmentImpl extends TreeJNI implements C81204nM {

    public final class TransactionHubHistoryQuery extends TreeJNI implements C81204nM {

        public final class Transactions extends TreeJNI implements C81204nM {

            public final class OpenReceiptAction extends TreeJNI implements C81204nM {

                public final class ActionData extends TreeJNI implements C81204nM {

                    public final class InlinePAYFBPayOpenReceiptActionData extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"transaction_id"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"action_type"};
                    }

                    public final Class[] getInlineClasses() {
                        return new Class[]{InlinePAYFBPayOpenReceiptActionData.class};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(ActionData.class, "action_data");
                }
            }

            public final class TransactionAmountWithEntities extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{PAYTextWithEntitiesFragmentImpl.class};
                }
            }

            public final class TransactionStatusAndDate extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{PAYTextWithEntitiesFragmentImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"creation_date", "legacy_receipt_view_uri", "receiver_name", "receiver_profile_image_uri", "show_legacy_receipt_view", "transaction_amount_formatted", "transaction_amount_subtitle", "transaction_id", "transaction_item_images", "transaction_payment_type"};
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(TransactionAmountWithEntities.class, "transaction_amount_with_entities", false), C18190wL.A0G(TransactionStatusAndDate.class, "transaction_status_and_date", false), C18190wL.A0G(OpenReceiptAction.class, "open_receipt_action", false)};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"last_transaction_index"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Transactions.class, "transactions");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(TransactionHubHistoryQuery.class, "transaction_hub_history_query(pagination:$pagination)");
    }
}
