package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschemagraphservices.IgPaymentsUpdatePaymentAccountNameMutationResponseImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.7kT  reason: invalid class name and case insensitive filesystem */
public final class C128847kT implements C145368kO {
    public final C31580Grx A00;

    public final C145388kQ Cc3(SparseArray sparseArray, C113806sA r3) {
        throw C86134wK.A0s("removeMutation not supported for Full Name on Instagram");
    }

    public C128847kT(UserSession userSession) {
        this.A00 = AnonymousClass3WK.A01(userSession);
    }

    public final C145388kQ Ch4(SparseArray sparseArray, C113806sA r15) {
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        C86154wM.A1M(A0L);
        A0L.A0D(C86114wI.A0m(sparseArray, 2), "payer_name");
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        A002.A02(A0L, "input");
        return AnonymousClass6BW.A00(r15, this.A00, new PandoGraphQLRequest(C63233h2.A01(), "IgPaymentsUpdatePaymentAccountNameMutation", A002.getParamsCopy(), A003.getParamsCopy(), IgPaymentsUpdatePaymentAccountNameMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "payment_account_update_payer_name"), C103216Yg.A00);
    }
}
