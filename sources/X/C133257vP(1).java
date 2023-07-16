package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.7vP  reason: invalid class name and case insensitive filesystem */
public final class C133257vP implements C34022Hz3 {
    public C67463zb A00 = C67463zb.A00();
    public boolean A01 = false;

    public final /* bridge */ /* synthetic */ C34022Hz3 Cir(ImmutableList immutableList) {
        this.A00.A06("capability_types", immutableList);
        this.A01 = AnonymousClass0wJ.A1W(immutableList);
        return this;
    }

    public final /* bridge */ /* synthetic */ C34022Hz3 CqJ(ImmutableList immutableList) {
        this.A00.A06("supported_compressions", immutableList);
        return this;
    }

    public final /* bridge */ /* synthetic */ C146418mD build() {
        AnonymousClass7Ko.A0B(this.A01);
        return new C67473zc(this.A00, C89575Fx.class, "FetchCapabilityMetadataQuery");
    }
}
