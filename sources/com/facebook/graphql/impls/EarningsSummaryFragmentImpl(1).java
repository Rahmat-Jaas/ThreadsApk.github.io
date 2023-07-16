package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class EarningsSummaryFragmentImpl extends TreeJNI implements C81204nM {

    public final class BalanceInfo extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{BalanceInfoFragmentImpl.class};
        }
    }

    public final class BalanceInfoBloksComponent extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayBloksComponentImpl.class};
        }
    }

    public final class EarningsBreakdownBySource extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{EarningsBreakdownFragmentImpl.class};
        }
    }

    public final class LastTotalEarnings extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"formatted_amount"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"accessibility_label", "last_total_earnings_date_delta_text", "last_total_earnings_percentage_delta", "last_total_earnings_percentage_delta_text"};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(LastTotalEarnings.class, "last_total_earnings", false), C18190wL.A0G(BalanceInfo.class, "balance_info", true), C18190wL.A0G(EarningsBreakdownBySource.class, "earnings_breakdown_by_source", true), C18190wL.A0G(BalanceInfoBloksComponent.class, "balance_info_bloks_component", false)};
    }
}
