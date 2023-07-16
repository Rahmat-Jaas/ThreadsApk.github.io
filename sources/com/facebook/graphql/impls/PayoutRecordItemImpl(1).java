package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutRecordItemImpl extends TreeJNI implements C81204nM {

    public final class Payee extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"payee_name", "payee_profile_uri"};
        }
    }

    public final class PayoutRecordPayoutAmount extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"formatted_amount"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"id", "payout_record_end_date", "payout_record_product_subtype_name", "payout_record_start_date", "payout_subtype"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(PayoutRecordPayoutAmount.class, "payout_record_payout_amount", false), Payee.class, "payee", false);
    }
}
