package X;

import com.facebook.graphql.impls.FBPayMerchantServicesEarningsQueryResponseImpl;
import com.facebook.graphql.impls.PayoutRecordItemImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7T5  reason: invalid class name */
public final class AnonymousClass7T5 implements C142618fJ {
    public static final AnonymousClass7T5 A00 = new AnonymousClass7T5();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        ImmutableList treeList;
        TreeJNI reinterpret;
        TreeJNI treeValue2 = ((TreeJNI) obj).getTreeValue("pay_financial_entity_wrapper(id:$id)", FBPayMerchantServicesEarningsQueryResponseImpl.PayFinancialEntityWrapper.class);
        if (treeValue2 == null || (treeValue = treeValue2.getTreeValue("payout_records(after:$after,batch_item_id:$batch_item_id,first:$first)", FBPayMerchantServicesEarningsQueryResponseImpl.PayFinancialEntityWrapper.PayoutRecords.class)) == null || (treeList = treeValue.getTreeList("edges", FBPayMerchantServicesEarningsQueryResponseImpl.PayFinancialEntityWrapper.PayoutRecords.Edges.class)) == null) {
            return null;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = treeList.iterator();
        while (it.hasNext()) {
            TreeJNI treeValue3 = C18210wN.A0G(it).getTreeValue("node", FBPayMerchantServicesEarningsQueryResponseImpl.PayFinancialEntityWrapper.PayoutRecords.Edges.Node.class);
            if (!(treeValue3 == null || (reinterpret = treeValue3.reinterpret(PayoutRecordItemImpl.class)) == null)) {
                A0v.add(reinterpret);
            }
        }
        return ImmutableList.copyOf((Collection) A0v);
    }
}
