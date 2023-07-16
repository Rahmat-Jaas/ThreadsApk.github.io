package X;

import com.facebook.graphql.impls.FbpayConvertPaypalBaToCibResponseImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TT  reason: invalid class name */
public final class AnonymousClass7TT implements C142618fJ {
    public static final AnonymousClass7TT A00 = new AnonymousClass7TT();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        TreeJNI treeValue2;
        SharedPaymentsErrorImpl sharedPaymentsErrorImpl;
        TreeJNI treeJNI = (TreeJNI) obj;
        if (treeJNI == null || (treeValue = treeJNI.getTreeValue("fbpay_convert_paypal_ba_to_cib(data:$input)", FbpayConvertPaypalBaToCibResponseImpl.FbpayConvertPaypalBaToCib.class)) == null || (treeValue2 = treeValue.getTreeValue("payments_error", FbpayConvertPaypalBaToCibResponseImpl.FbpayConvertPaypalBaToCib.PaymentsError.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(treeValue2)) == null) {
            return null;
        }
        return AnonymousClass7Fb.A01(sharedPaymentsErrorImpl);
    }
}
