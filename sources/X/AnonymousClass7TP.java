package X;

import com.facebook.graphql.impls.AdditionalAuthenticationErrorImpl;
import com.facebook.graphql.impls.AuthFactorRequirementImpl;
import com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TP  reason: invalid class name */
public final class AnonymousClass7TP implements C142618fJ {
    public static final AnonymousClass7TP A00 = new AnonymousClass7TP();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        SharedPaymentsErrorImpl sharedPaymentsErrorImpl;
        TreeJNI treeJNI;
        TreeJNI treeValue;
        AuthFactorRequirementImpl authFactorRequirementImpl;
        TreeJNI A0M;
        TreeJNI treeJNI2 = (TreeJNI) obj;
        if (treeJNI2 == null) {
            return null;
        }
        Class<CreatePayContainerMutationResponseImpl.RequestPaymentContainer> cls = CreatePayContainerMutationResponseImpl.RequestPaymentContainer.class;
        TreeJNI treeValue2 = treeJNI2.getTreeValue("request_payment_container(input:$input)", cls);
        if (treeValue2 == null || (A0M = C86154wM.A0M(treeValue2, CreatePayContainerMutationResponseImpl.RequestPaymentContainer.Error.class)) == null) {
            sharedPaymentsErrorImpl = null;
        } else {
            sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(A0M);
        }
        TreeJNI treeValue3 = treeJNI2.getTreeValue("request_payment_container(input:$input)", cls);
        if (treeValue3 == null || (treeValue = treeValue3.getTreeValue("additional_authentication_error", CreatePayContainerMutationResponseImpl.RequestPaymentContainer.AdditionalAuthenticationError.class)) == null) {
            treeJNI = null;
        } else {
            treeJNI = treeValue.reinterpret(AdditionalAuthenticationErrorImpl.class);
            if (treeJNI != null) {
                if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7HK.A00(), 36315735194995447L)) {
                    Class<AdditionalAuthenticationErrorImpl.AuthFactorRequirements> cls2 = AdditionalAuthenticationErrorImpl.AuthFactorRequirements.class;
                    TreeJNI treeValue4 = treeJNI.getTreeValue("auth_factor_requirements", cls2);
                    if (treeValue4 != null) {
                        Class<AuthFactorRequirementImpl> cls3 = AuthFactorRequirementImpl.class;
                        if (treeValue4.reinterpret(cls3) != null) {
                            TreeJNI treeValue5 = treeJNI.getTreeValue("auth_factor_requirements", cls2);
                            if (treeValue5 != null && (authFactorRequirementImpl = (AuthFactorRequirementImpl) treeValue5.reinterpret(cls3)) != null) {
                                return new C92885kB(C99036Hw.A00(authFactorRequirementImpl));
                            }
                            throw AnonymousClass0wJ.A0b();
                        }
                    }
                    return new C92885kB(new C114746tp(AnonymousClass0ZV.A00, 0));
                }
            }
        }
        if (sharedPaymentsErrorImpl != null) {
            return AnonymousClass7Fb.A01(sharedPaymentsErrorImpl);
        }
        if (treeJNI == null) {
            return null;
        }
        AnonymousClass0LU.A0B("PaymentRepositoryImpl", "Auth error is not expected from server when DA is not enabled");
        return null;
    }
}
