package com.instagram.direct.ordermanagement.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C28174Ezk;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class IGP2MOrderManagementOrderListQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbIgP2mGetOrders extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"currency", "notes", "order_id", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, C28174Ezk.A00(799), "time_last_updated", "total_amount"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(XfbIgP2mGetOrders.class, "xfb_ig_p2m_get_orders(buyer_id:$buyerID,merchant_id:$merchantID)");
    }
}
