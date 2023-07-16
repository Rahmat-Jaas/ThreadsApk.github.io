package X;

import com.facebook.graphql.impls.FBPayMerchantServicesPayoutsQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7T8  reason: invalid class name */
public final class AnonymousClass7T8 implements C142618fJ {
    public static final AnonymousClass7T8 A00 = new AnonymousClass7T8();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        TreeJNI treeValue2 = ((TreeJNI) obj).getTreeValue("pay_financial_entity_wrapper(id:$id)", FBPayMerchantServicesPayoutsQueryResponseImpl.PayFinancialEntityWrapper.class);
        if (treeValue2 == null || (treeValue = treeValue2.getTreeValue("payout_batch_items(after:$after,first:$first)", FBPayMerchantServicesPayoutsQueryResponseImpl.PayFinancialEntityWrapper.PayoutBatchItems.class)) == null) {
            return null;
        }
        return treeValue.getTreeList("edges", FBPayMerchantServicesPayoutsQueryResponseImpl.PayFinancialEntityWrapper.PayoutBatchItems.Edges.class);
    }
}
