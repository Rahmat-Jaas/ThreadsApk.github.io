package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.UpdateRoomMutationResponseImpl;

/* renamed from: X.7vW  reason: invalid class name and case insensitive filesystem */
public final class C133327vW implements C28097EyU {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C85754vi AB4() {
        return new PandoGraphQLRequest(C63233h2.A03(this.A02), "UpdateRoomMutation", this.A00.getParamsCopy(), this.A01.getParamsCopy(), UpdateRoomMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 12, "input", "update_ig_native_room");
    }

    public final /* bridge */ /* synthetic */ C28097EyU Cm3(GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000) {
        C67463zb.A01(gQLCallInputCInputShape1S0000000, this.A00);
        this.A02 = true;
        return this;
    }
}
