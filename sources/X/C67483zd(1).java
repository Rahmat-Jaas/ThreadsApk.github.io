package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.unifiedfeedback.api.graphql.CXPFetchFeedbackQueryResponseImpl;

/* renamed from: X.3zd  reason: invalid class name and case insensitive filesystem */
public final class C67483zd implements C27604EqD {
    public static C146418mD A00(C67463zb r7, C67463zb r8, boolean z, boolean z2) {
        AnonymousClass7Ko.A0B(true);
        AnonymousClass7Ko.A0B(true);
        AnonymousClass7Ko.A0B(z);
        return new PandoGraphQLRequest(C63233h2.A04(z2), "CXPFetchFeedbackQuery", GraphQlCallInput.A03(r7), GraphQlCallInput.A03(r8), CXPFetchFeedbackQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_fetch_feedback");
    }
}
