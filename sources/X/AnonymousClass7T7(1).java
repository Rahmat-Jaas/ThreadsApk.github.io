package X;

import com.facebook.graphql.impls.PayoutDetailImpl;
import com.facebook.graphql.impls.PayoutReleaseDetailsViewQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7T7  reason: invalid class name */
public final class AnonymousClass7T7 implements C142618fJ {
    public static final AnonymousClass7T7 A00 = new AnonymousClass7T7();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        TreeJNI treeValue2 = ((TreeJNI) obj).getTreeValue("xfb_business_payments_hub(interface_type:$interface_type)", PayoutReleaseDetailsViewQueryResponseImpl.XfbBusinessPaymentsHub.class);
        if (treeValue2 == null || (treeValue = treeValue2.getTreeValue("payout_details_view(fe_id:$fe_id,managed_merchant_acc_id:$mma_id,payout_release_id:$payout_release_id,session_id:$session_id)", PayoutReleaseDetailsViewQueryResponseImpl.XfbBusinessPaymentsHub.PayoutDetailsView.class)) == null) {
            return null;
        }
        return treeValue.reinterpret(PayoutDetailImpl.class);
    }
}
