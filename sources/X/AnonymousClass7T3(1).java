package X;

import com.facebook.graphql.impls.FBPayMerchantServicesEarningsDetailsQueryResponseImpl;
import com.facebook.graphql.impls.PayoutRecordImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7T3  reason: invalid class name */
public final class AnonymousClass7T3 implements C142618fJ {
    public static final AnonymousClass7T3 A00 = new AnonymousClass7T3();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue = ((TreeJNI) obj).getTreeValue("pay_financial_entity_wrapper(id:$id)", FBPayMerchantServicesEarningsDetailsQueryResponseImpl.PayFinancialEntityWrapper.class);
        if (treeValue != null) {
            return treeValue.reinterpret(PayoutRecordImpl.class);
        }
        return null;
    }
}
