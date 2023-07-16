package X;

import com.facebook.graphql.impls.PreprocessingMutationResponseImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7Sk  reason: invalid class name */
public final class AnonymousClass7Sk implements C142618fJ {
    public static final AnonymousClass7Sk A00 = new AnonymousClass7Sk();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        TreeJNI A0M;
        SharedPaymentsErrorImpl sharedPaymentsErrorImpl;
        TreeJNI treeJNI = (TreeJNI) obj;
        if (treeJNI == null || (treeValue = treeJNI.getTreeValue("payment_preprocessing_mutation(input:$input)", PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.class)) == null || (A0M = C86154wM.A0M(treeValue, PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.Error.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(A0M)) == null) {
            return null;
        }
        return AnonymousClass7Fb.A01(sharedPaymentsErrorImpl);
    }
}
