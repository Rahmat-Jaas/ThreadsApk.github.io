package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.fbpay.hub.transactions.graphql.IGFBPayShareableTransactionsQueryResponseImpl;

/* renamed from: X.7SJ  reason: invalid class name */
public final class AnonymousClass7SJ implements C142618fJ {
    public final /* synthetic */ C107396gg A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass7SJ(C107396gg r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C113806sA r3 = (C113806sA) obj;
        C106126eX r4 = this.A00.A01;
        String str = this.A01;
        boolean z = this.A02;
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        int i = 50;
        if (z) {
            i = 4;
        }
        A002.A0C(Integer.valueOf(i), "num_items");
        A002.A0F(str, "after");
        C67463zb A003 = C67463zb.A00();
        C67463zb A004 = C67463zb.A00();
        A003.A02(A002, AnonymousClass000.A00(1026));
        return AnonymousClass6BW.A00(r3, r4.A00, new PandoGraphQLRequest(C63233h2.A01(), "IGFBPayShareableTransactionsQuery", A003.getParamsCopy(), A004.getParamsCopy(), IGFBPayShareableTransactionsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, (String) null), AnonymousClass7nU.A00);
    }
}
