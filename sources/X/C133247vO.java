package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.FXGrowthLogImpressionForISUpsellResponseImpl;

/* renamed from: X.7vO  reason: invalid class name and case insensitive filesystem */
public final class C133247vO implements C148578rJ {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C85754vi AB4() {
        return new PandoGraphQLRequest(C63233h2.A03(this.A02), "FXGrowthLogImpressionForISUpsell", this.A00.getParamsCopy(), this.A01.getParamsCopy(), FXGrowthLogImpressionForISUpsellResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_growth_log_impression_for_is_upsell");
    }

    public final /* bridge */ /* synthetic */ C148578rJ Cr3(String str) {
        this.A00.A05("upsell_name", str);
        this.A02 = AnonymousClass0wJ.A1W(str);
        return this;
    }
}
