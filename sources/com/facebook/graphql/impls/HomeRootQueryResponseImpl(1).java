package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class HomeRootQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbBusinessPaymentsHub extends TreeJNI implements C81204nM {

        public final class PaymentsHubTopDialog extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{TopLevelDialogImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PaymentsHubTopDialog.class, "payments_hub_top_dialog");
        }

        public final Class[] getInlineClasses() {
            return new Class[]{PaymentsTabsFragmentImpl.class, CareLinkFragmentImpl.class, FinancialEntitiesFragmentImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbBusinessPaymentsHub.class, "xfb_business_payments_hub(interface_type:$interface_type,page_id:$page_id)");
    }
}
