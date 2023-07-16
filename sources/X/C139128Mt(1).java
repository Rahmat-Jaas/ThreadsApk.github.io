package X;

import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.EmailResponseImpl;

/* renamed from: X.8Mt  reason: invalid class name and case insensitive filesystem */
public final class C139128Mt extends C02220Ah implements AnonymousClass0YY {
    public static final C139128Mt A00 = new C139128Mt();

    public C139128Mt() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ComponentDataMutationResponseImpl.FbpayAccountMutation A002;
        ComponentDataMutationResponseImpl.FbpayAccountMutation.EmailResponse A003;
        ComponentDataMutationResponseImpl componentDataMutationResponseImpl = (ComponentDataMutationResponseImpl) obj;
        if (componentDataMutationResponseImpl == null || (A002 = componentDataMutationResponseImpl.A00()) == null || (A003 = A002.A00()) == null) {
            return null;
        }
        return A003.reinterpret(EmailResponseImpl.class);
    }
}
