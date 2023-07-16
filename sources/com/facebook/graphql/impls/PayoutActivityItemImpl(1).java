package com.facebook.graphql.impls;

import X.AnonymousClass67O;
import X.C108776iv;
import X.C147908q7;
import X.C147918q8;
import X.C148448r4;
import X.C148458r5;
import X.C148528rE;
import X.C18190wL;
import X.C18220wO;
import X.C86104wH;
import X.C86154wM;
import X.C968066t;
import com.facebook.pando.TreeJNI;

public final class PayoutActivityItemImpl extends TreeJNI implements C148528rE {

    public final class PayoutDetailView extends TreeJNI implements C148448r4 {
        public final String[] getScalarFields() {
            return new String[]{"payout_detail_title", "payout_status_detail", "payout_status_header", "payout_support_link_text"};
        }

        public final String B0c() {
            return getStringValue("payout_detail_title");
        }

        public final String B0q() {
            return getStringValue("payout_status_detail");
        }

        public final String B0r() {
            return getStringValue("payout_status_header");
        }
    }

    public final class PayoutMethodView extends TreeJNI implements C148458r5 {
        public final String[] getScalarFields() {
            return new String[]{"payout_credential_type", "payout_method_detail", "payout_method_title"};
        }

        public final AnonymousClass67O B0b() {
            return (AnonymousClass67O) C86104wH.A0a(this, AnonymousClass67O.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "payout_credential_type");
        }

        public final String B0j() {
            return getStringValue("payout_method_detail");
        }

        public final String B0k() {
            return getStringValue("payout_method_title");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"bank_account_number", "bank_name", "id", "payment_date", "payment_id", "payout_batch_item_status", "payout_batch_item_status_text", "paypal_email"};
    }

    public final class PayoutBatchItemPayoutAmount extends TreeJNI implements C147908q7 {
        public final String[] getScalarFields() {
            return new String[]{"formatted_amount"};
        }

        public final String AjX() {
            return C86154wM.A0k(this);
        }
    }

    public final class PayoutRecordsB2cTaxAmountSum extends TreeJNI implements C147918q8 {
        public final String[] getScalarFields() {
            return new String[]{"formatted_amount"};
        }

        public final String AjX() {
            return C86154wM.A0k(this);
        }
    }

    public final String B0O() {
        return getStringValue("payment_date");
    }

    public final String B0P() {
        return getStringValue("payment_id");
    }

    public final C147908q7 B0V() {
        return (C147908q7) getTreeValue("payout_batch_item_payout_amount", PayoutBatchItemPayoutAmount.class);
    }

    public final C968066t B0X() {
        return (C968066t) C86104wH.A0a(this, C968066t.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "payout_batch_item_status");
    }

    public final String B0Z() {
        return getStringValue("payout_batch_item_status_text");
    }

    public final C148448r4 B0d() {
        return (C148448r4) getTreeValue("payout_detail_view", PayoutDetailView.class);
    }

    public final C148458r5 B0l() {
        return (C148458r5) getTreeValue("payout_method_view", PayoutMethodView.class);
    }

    public final C147918q8 B0o() {
        return (C147918q8) getTreeValue("payout_records_b2c_tax_amount_sum", PayoutRecordsB2cTaxAmountSum.class);
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(PayoutBatchItemPayoutAmount.class, "payout_batch_item_payout_amount", false), C18190wL.A0G(PayoutRecordsB2cTaxAmountSum.class, "payout_records_b2c_tax_amount_sum", false), C18190wL.A0G(PayoutDetailView.class, "payout_detail_view", false), C18190wL.A0G(PayoutMethodView.class, "payout_method_view", false)};
    }

    public final String getId() {
        return C18220wO.A0m(this);
    }
}
