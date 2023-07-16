package X;

import com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7Sh  reason: invalid class name */
public final class AnonymousClass7Sh implements C142618fJ {
    public static final AnonymousClass7Sh A00 = new AnonymousClass7Sh();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ImmutableList treeList;
        TreeJNI treeValue = ((TreeJNI) obj).getTreeValue("submit_payment_container(input:$input)", SubmitPayContainerMutationResponseImpl.SubmitPaymentContainer.class);
        if (treeValue == null || (treeList = treeValue.getTreeList("submit_payment_container_response_list", SubmitPayContainerMutationResponseImpl.SubmitPaymentContainer.SubmitPaymentContainerResponseList.class)) == null) {
            return null;
        }
        return ((TreeJNI) treeList.get(0)).getTreeValue("confirmation_component", SubmitPayContainerMutationResponseImpl.SubmitPaymentContainer.SubmitPaymentContainerResponseList.ConfirmationComponent.class);
    }
}
