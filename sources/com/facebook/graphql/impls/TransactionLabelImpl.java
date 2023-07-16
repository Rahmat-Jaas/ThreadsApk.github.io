package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class TransactionLabelImpl extends TreeJNI implements C81204nM {

    public final class TransactionStatus extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYTextWithLinksFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"transaction_description_subtitle", "transaction_description_title", "transaction_id", "transaction_source_label", "transaction_status_style", "transaction_type", "transaction_type_label"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(TransactionStatus.class, "transaction_status");
    }
}
