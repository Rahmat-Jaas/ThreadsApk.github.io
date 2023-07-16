package X;

import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.EmailResponseImpl;
import com.facebook.graphql.impls.PhoneResponseImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7SF  reason: invalid class name */
public final class AnonymousClass7SF implements C142618fJ {
    public final /* synthetic */ AnonymousClass7j5 A00;
    public final /* synthetic */ int A01;

    public AnonymousClass7SF(AnonymousClass7j5 r1, int i) {
        this.A00 = r1;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ComponentDataMutationResponseImpl.FbpayAccountMutation A002;
        PhoneResponseImpl phoneResponseImpl;
        TreeJNI treeJNI;
        SharedPaymentsErrorImpl sharedPaymentsErrorImpl;
        EmailResponseImpl emailResponseImpl;
        ComponentDataMutationResponseImpl componentDataMutationResponseImpl = (ComponentDataMutationResponseImpl) obj;
        int i = this.A01;
        if (componentDataMutationResponseImpl == null || (A002 = componentDataMutationResponseImpl.A00()) == null) {
            return null;
        }
        if (i != 0) {
            ComponentDataMutationResponseImpl.FbpayAccountMutation.EmailResponse A003 = A002.A00();
            if (A003 == null || (emailResponseImpl = (EmailResponseImpl) A003.reinterpret(EmailResponseImpl.class)) == null) {
                return null;
            }
            treeJNI = (EmailResponseImpl.Error) C86154wM.A0M(emailResponseImpl, EmailResponseImpl.Error.class);
        } else {
            ComponentDataMutationResponseImpl.FbpayAccountMutation.PhoneResponse A012 = A002.A01();
            if (A012 == null || (phoneResponseImpl = (PhoneResponseImpl) A012.reinterpret(PhoneResponseImpl.class)) == null) {
                return null;
            }
            treeJNI = (PhoneResponseImpl.Error) C86154wM.A0M(phoneResponseImpl, PhoneResponseImpl.Error.class);
        }
        if (treeJNI == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(treeJNI)) == null) {
            return null;
        }
        return AnonymousClass7Fb.A01(sharedPaymentsErrorImpl);
    }
}
