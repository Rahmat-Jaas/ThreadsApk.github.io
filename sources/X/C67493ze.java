package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.IGFxCanUserSeeISUpsellQueryResponseImpl;

/* renamed from: X.3ze  reason: invalid class name and case insensitive filesystem */
public final class C67493ze implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A00(), "IGFxCanUserSeeISUpsellQuery", GraphQlCallInput.A03(this.A00), GraphQlCallInput.A03(this.A01), IGFxCanUserSeeISUpsellQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_growth");
    }
}
