package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class OverviewFragmentImpl extends TreeJNI implements C81204nM {

    public final class PaymentsHubOverview extends TreeJNI implements C81204nM {

        public final class EarningsSummary extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{EarningsSummaryFragmentImpl.class};
            }
        }

        public final class PayoutsSummary extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{PayoutsSummaryFragmentImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(EarningsSummary.class, "earnings_summary", false), PayoutsSummary.class, "payouts_summary", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PaymentsHubOverview.class, "payments_hub_overview(fe_id:$fe_id,input:$input,session_id:$session_id)");
    }
}
