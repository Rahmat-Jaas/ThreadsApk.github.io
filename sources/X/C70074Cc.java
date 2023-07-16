package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.EndRoomMutationResponseImpl;

/* renamed from: X.4Cc  reason: invalid class name and case insensitive filesystem */
public final class C70074Cc implements C28095EyS {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C85754vi AB4() {
        return new PandoGraphQLRequest(C63233h2.A03(this.A02), "EndRoomMutation", GraphQlCallInput.A03(this.A00), GraphQlCallInput.A03(this.A01), EndRoomMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 12, "input", "end_ig_room_call");
    }

    public final /* bridge */ /* synthetic */ C28095EyS Cm1(GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000) {
        C67463zb.A01(gQLCallInputCInputShape1S0000000, this.A00);
        this.A02 = true;
        return this;
    }
}
