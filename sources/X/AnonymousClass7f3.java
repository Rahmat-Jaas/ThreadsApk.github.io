package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.LeadGenContextualInputQueryResponseImpl;

/* renamed from: X.7f3  reason: invalid class name */
public final class AnonymousClass7f3 implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A03(this.A02), "LeadGenContextualInputQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), LeadGenContextualInputQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_fetch_lead_gen_deep_link_data");
    }
}
