package X;

import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.CredentialResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TK  reason: invalid class name */
public final class AnonymousClass7TK implements C142618fJ {
    public static final AnonymousClass7TK A00 = new AnonymousClass7TK();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ComponentDataMutationResponseImpl.FbpayAccountMutation A002;
        TreeJNI treeValue;
        ComponentDataMutationResponseImpl componentDataMutationResponseImpl = (ComponentDataMutationResponseImpl) obj;
        if (componentDataMutationResponseImpl == null || (A002 = componentDataMutationResponseImpl.A00()) == null || (treeValue = A002.getTreeValue("credential_response", ComponentDataMutationResponseImpl.FbpayAccountMutation.CredentialResponse.class)) == null) {
            return null;
        }
        return treeValue.reinterpret(CredentialResponseImpl.class);
    }
}
