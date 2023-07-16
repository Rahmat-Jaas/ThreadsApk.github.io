package X;

import com.facebook.graphql.impls.FamilyDeviceIDAppScopedDeviceIDSyncMutationResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7fY  reason: invalid class name and case insensitive filesystem */
public final class C126627fY implements C143358ga {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C85754vi AB4() {
        return new PandoGraphQLRequest(C63233h2.A04(this.A02), "FamilyDeviceIDAppScopedDeviceIDSyncMutation", this.A00.getParamsCopy(), this.A01.getParamsCopy(), FamilyDeviceIDAppScopedDeviceIDSyncMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "fdid_sync_client_ids");
    }
}
