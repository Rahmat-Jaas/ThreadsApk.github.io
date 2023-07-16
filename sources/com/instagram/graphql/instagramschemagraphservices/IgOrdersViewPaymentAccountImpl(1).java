package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IgOrdersViewPaymentAccountImpl extends TreeJNI implements C81204nM {

    public final class PaymentTransactionsShoppingBagOnUser extends TreeJNI implements C81204nM {

        public final class Edges extends TreeJNI implements C81204nM {

            public final class Node extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{IgOrdersListItemViewListRowImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Node.class, "node");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Edges.class, "edges");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PaymentTransactionsShoppingBagOnUser.class, "payment_transactions_shopping_bag_on_user(first:$first,payment_order_types:[\"IG_MOR_DONATIONS\",\"IG_NMOR_DONATION_P4P\",\"IG_NMOR_P2B\",\"IG_NMOR_SHOPPING\",\"NMOR_CHECKOUT_EXPERIENCES\",\"NMOR_INSTAGRAM_P2B\"])");
    }
}
