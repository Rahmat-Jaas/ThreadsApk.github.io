package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7vR  reason: invalid class name and case insensitive filesystem */
public final class C133277vR implements C34023Hz4 {
    public C67463zb A00 = C67463zb.A00();
    public boolean A01 = false;

    public final /* bridge */ /* synthetic */ C34023Hz4 Cj1(GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000) {
        this.A00.A02(gQLCallInputCInputShape0S0000000, "client_capability_metadata");
        return this;
    }

    public final /* bridge */ /* synthetic */ C34023Hz4 Cn6(ImmutableList immutableList) {
        this.A00.A06("model_request_metadatas", immutableList);
        this.A01 = AnonymousClass0wJ.A1W(immutableList);
        return this;
    }

    public final /* bridge */ /* synthetic */ C146418mD build() {
        AnonymousClass7Ko.A0B(this.A01);
        return new C67473zc(this.A00, C89695Gj.class, "NativeMLModelBatchedQuery");
    }
}
