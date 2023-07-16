package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.graphql.instagramschema.IGFxLinkedAccountsQueryResponseImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.60e  reason: invalid class name and case insensitive filesystem */
public final class C954060e extends FR1 {
    public final /* synthetic */ UserSession A00;

    public final /* bridge */ /* synthetic */ Object call() {
        C146418mD maxToleratedCacheAgeMs = new PandoGraphQLRequest(C63233h2.A00(), "IGFxLinkedAccountsQuery", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), IGFxLinkedAccountsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_linked_accounts").setMaxToleratedCacheAgeMs(0);
        UserSession userSession = this.A00;
        AnonymousClass3WK.A01(userSession).A07(maxToleratedCacheAgeMs, new IDxACallbackShape112S0100000_2_I2(userSession, 16));
        return null;
    }

    public final int getRunnableId() {
        return 713;
    }

    public C954060e(UserSession userSession) {
        this.A00 = userSession;
    }
}
