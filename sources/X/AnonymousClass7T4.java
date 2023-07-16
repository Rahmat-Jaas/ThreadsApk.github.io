package X;

import com.facebook.graphql.impls.EarningDetailImpl;
import com.facebook.graphql.impls.PayoutRecordDetailsViewQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7T4  reason: invalid class name */
public final class AnonymousClass7T4 implements C142618fJ {
    public static final AnonymousClass7T4 A00 = new AnonymousClass7T4();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        TreeJNI treeValue2;
        TreeJNI treeJNI = (TreeJNI) obj;
        if (treeJNI == null || (treeValue = treeJNI.getTreeValue("xfb_business_payments_hub(interface_type:$interface_type)", PayoutRecordDetailsViewQueryResponseImpl.XfbBusinessPaymentsHub.class)) == null || (treeValue2 = treeValue.getTreeValue("earning_details_view(fe_id:$fe_id,managed_merchant_acc_id:$mma_id,payout_record_id:$payout_record_id,session_id:$session_id)", PayoutRecordDetailsViewQueryResponseImpl.XfbBusinessPaymentsHub.EarningDetailsView.class)) == null) {
            return null;
        }
        return treeValue2.reinterpret(EarningDetailImpl.class);
    }
}
