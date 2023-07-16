package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.graphql.instagramschema.NativeMLModelBatchedQueryResponseImpl;

/* renamed from: X.7vS  reason: invalid class name and case insensitive filesystem */
public final class C133287vS implements C34023Hz4 {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C34023Hz4 Cj1(GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000) {
        this.A00.A02(gQLCallInputCInputShape0S0000000, "client_capability_metadata");
        return this;
    }

    public final /* bridge */ /* synthetic */ C34023Hz4 Cn6(ImmutableList immutableList) {
        this.A00.A06("model_request_metadatas", immutableList);
        this.A02 = AnonymousClass0wJ.A1W(immutableList);
        return this;
    }

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A03(this.A02), "NativeMLModelBatchedQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), NativeMLModelBatchedQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "aim_model_batched_manifest");
    }
}
