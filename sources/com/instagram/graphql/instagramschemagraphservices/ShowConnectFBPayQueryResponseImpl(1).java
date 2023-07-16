package com.instagram.graphql.instagramschemagraphservices;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ShowConnectFBPayQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FbpayAccountExtended extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"should_show_connect_in_hub", "should_show_orders_in_hub"};
        }
    }

    public final class TransactionHubMetadata extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"show_all_payment_activities_button"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(TransactionHubMetadata.class, "transaction_hub_metadata", false), FbpayAccountExtended.class, "fbpay_account_extended", false);
    }
}
