package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.graphql.instagramschema.FetchCapabilityMetadataQueryResponseImpl;

/* renamed from: X.7vQ  reason: invalid class name and case insensitive filesystem */
public final class C133267vQ implements C34022Hz3 {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C34022Hz3 Cir(ImmutableList immutableList) {
        this.A00.A06("capability_types", immutableList);
        this.A02 = AnonymousClass0wJ.A1W(immutableList);
        return this;
    }

    public final /* bridge */ /* synthetic */ C34022Hz3 CqJ(ImmutableList immutableList) {
        this.A00.A06("supported_compressions", immutableList);
        return this;
    }

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A03(this.A02), "FetchCapabilityMetadataQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), FetchCapabilityMetadataQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "latest_versioned_capabilities");
    }
}
