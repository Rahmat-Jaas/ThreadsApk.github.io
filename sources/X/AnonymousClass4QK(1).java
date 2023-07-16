package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape113S0200000_1_I2;
import com.instagram.unifiedfeedback.api.graphql.CXPCommentDeleteMutationResponseImpl;
import com.instagram.unifiedfeedback.api.graphql.FBCommentImpl;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;

/* renamed from: X.4QK  reason: invalid class name */
public final class AnonymousClass4QK implements Runnable {
    public final /* synthetic */ AnonymousClass1dM A00;

    public AnonymousClass4QK(AnonymousClass1dM r1) {
        this.A00 = r1;
    }

    public final void run() {
        FBCommentImpl.Feedback A002;
        String A0m;
        AnonymousClass1dM r6 = this.A00;
        Set set = r6.A0G;
        Set<C61723Vc> A0c = AnonymousClass00J.A0c(set);
        set.clear();
        ArrayList A0w = AnonymousClass0wJ.A0w(A0c);
        for (C61723Vc r2 : A0c) {
            FBCommentImpl fBCommentImpl = r2.A05;
            Unit unit = null;
            if (!(fBCommentImpl == null || (A002 = fBCommentImpl.A00()) == null || (A0m = C18220wO.A0m(A002)) == null)) {
                AnonymousClass36T r1 = r6.A06;
                if (r1 == null) {
                    C04220Ms.A0E("feedbackApi");
                    throw null;
                }
                IDxFCallbackShape113S0200000_1_I2 iDxFCallbackShape113S0200000_1_I2 = new IDxFCallbackShape113S0200000_1_I2(6, r6, r2);
                C31580Grx grx = r1.A00;
                C67463zb A003 = C67463zb.A00();
                C67463zb A004 = C67463zb.A00();
                A003.A02(GraphQlCallInput.A01(A003, A0m), "params");
                AnonymousClass7Ko.A0B(true);
                grx.AMA(new PandoGraphQLRequest(C63233h2.A04(true), "CXPCommentDeleteMutation", GraphQlCallInput.A03(A003), GraphQlCallInput.A03(A004), CXPCommentDeleteMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_dispatch_comment_delete"), iDxFCallbackShape113S0200000_1_I2);
                unit = Unit.A00;
            }
            A0w.add(unit);
        }
    }
}
