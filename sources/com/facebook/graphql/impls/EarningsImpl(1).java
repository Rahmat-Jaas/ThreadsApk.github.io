package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class EarningsImpl extends TreeJNI implements C81204nM {

    public final class EarningsIncludedInPayout extends TreeJNI implements C81204nM {

        public final class TableRows extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"accessibility_label", "amount", "date_range", "image_uri", "image_uri_dark", "payee_name", "payout_record_id", "product_name"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"section_title"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(TableRows.class, "table_rows");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(EarningsIncludedInPayout.class, "earnings_included_in_payout");
    }
}
