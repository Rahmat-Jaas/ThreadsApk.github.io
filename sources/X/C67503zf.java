package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.MobileBuildIOSSelfUpdateQueryResponseImpl;

/* renamed from: X.3zf  reason: invalid class name and case insensitive filesystem */
public final class C67503zf implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A03(this.A02), "MobileBuildIOSSelfUpdateQuery", GraphQlCallInput.A03(this.A00), GraphQlCallInput.A03(this.A01), MobileBuildIOSSelfUpdateQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_mobile_build_ios_self_update");
    }
}
