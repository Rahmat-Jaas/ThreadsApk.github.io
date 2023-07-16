package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.ResolveRoomLinkQueryResponseImpl;

/* renamed from: X.7vU  reason: invalid class name and case insensitive filesystem */
public final class C133307vU implements C41869MfI {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C41869MfI Cju(GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000) {
        this.A00.A02(gQLCallInputCInputShape0S0000000, "data");
        this.A02 = true;
        return this;
    }

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A03(this.A02), "ResolveRoomLinkQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), ResolveRoomLinkQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "resolve_ig_room_link_query");
    }
}
