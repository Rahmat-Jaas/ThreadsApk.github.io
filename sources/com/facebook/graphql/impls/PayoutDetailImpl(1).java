package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PayoutDetailImpl extends TreeJNI implements C81204nM {

    public final class StatusInfo extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{StatusInfoDetailsImpl.class};
        }
    }

    public final class SupportInfo extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{SupportImpl.class};
        }
    }

    public final class TotalSummary extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{SummaryDetailsImpl.class};
        }
    }

    public final class TransactionInfo extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{InfoDetailsImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(TotalSummary.class, "total_summary", false), C18190wL.A0G(StatusInfo.class, "status_info", false), C18190wL.A0G(TransactionInfo.class, "transaction_info", false), C18190wL.A0G(SupportInfo.class, "support_info", false)};
    }

    public final Class[] getInlineClasses() {
        return new Class[]{EarningsImpl.class};
    }
}
