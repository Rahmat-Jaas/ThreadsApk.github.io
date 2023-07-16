package X;

import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.PhoneResponseImpl;

/* renamed from: X.8Mu  reason: invalid class name and case insensitive filesystem */
public final class C139138Mu extends C02220Ah implements AnonymousClass0YY {
    public static final C139138Mu A00 = new C139138Mu();

    public C139138Mu() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ComponentDataMutationResponseImpl.FbpayAccountMutation A002;
        ComponentDataMutationResponseImpl.FbpayAccountMutation.PhoneResponse A01;
        ComponentDataMutationResponseImpl componentDataMutationResponseImpl = (ComponentDataMutationResponseImpl) obj;
        if (componentDataMutationResponseImpl == null || (A002 = componentDataMutationResponseImpl.A00()) == null || (A01 = A002.A01()) == null) {
            return null;
        }
        return A01.reinterpret(PhoneResponseImpl.class);
    }
}
