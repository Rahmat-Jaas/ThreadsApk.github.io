package X;

import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7TR  reason: invalid class name */
public final class AnonymousClass7TR implements C142618fJ {
    public static final AnonymousClass7TR A00 = new AnonymousClass7TR();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        ImmutableList treeList;
        TreeJNI treeJNI;
        TreeJNI treeValue2;
        SharedPaymentsErrorImpl sharedPaymentsErrorImpl;
        TreeJNI treeJNI2 = (TreeJNI) obj;
        if (treeJNI2 == null || (treeValue = treeJNI2.getTreeValue("submit_payment_container(input:$input)", SubmitPayContainerMutationResponseImpl.SubmitPaymentContainer.class)) == null || (treeList = treeValue.getTreeList("submit_payment_container_response_list", SubmitPayContainerMutationResponseImpl.SubmitPaymentContainer.SubmitPaymentContainerResponseList.class)) == null || (treeJNI = (TreeJNI) treeList.get(0)) == null || (treeValue2 = treeJNI.getTreeValue("payment_error", SubmitPayContainerMutationResponseImpl.SubmitPaymentContainer.SubmitPaymentContainerResponseList.PaymentError.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(treeValue2)) == null) {
            return null;
        }
        return AnonymousClass7Fb.A01(sharedPaymentsErrorImpl);
    }
}
