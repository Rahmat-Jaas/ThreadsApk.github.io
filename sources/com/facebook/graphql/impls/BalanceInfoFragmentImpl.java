package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class BalanceInfoFragmentImpl extends TreeJNI implements C81204nM {

    public final class BalanceAmount extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"formatted_amount"};
        }
    }

    public final class BalanceTooltip extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYTextWithLinksFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"accessibility_label", "balance_status_text", "balance_text", "balance_type"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(BalanceAmount.class, "balance_amount", false), BalanceTooltip.class, "balance_tooltip", true);
    }
}
