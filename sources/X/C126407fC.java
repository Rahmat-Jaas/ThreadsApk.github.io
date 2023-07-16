package X;

import com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7fC  reason: invalid class name and case insensitive filesystem */
public final class C126407fC implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;

    public final /* bridge */ /* synthetic */ C146418mD build() {
        AnonymousClass7Ko.A0B(this.A05);
        AnonymousClass7Ko.A0B(this.A03);
        AnonymousClass7Ko.A0B(this.A06);
        AnonymousClass7Ko.A0B(this.A07);
        AnonymousClass7Ko.A0B(this.A04);
        return new PandoGraphQLRequest(C63233h2.A04(this.A02), "FetchAddressSuggestionsQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), FetchAddressSuggestionsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch_address_suggestions");
    }
}
