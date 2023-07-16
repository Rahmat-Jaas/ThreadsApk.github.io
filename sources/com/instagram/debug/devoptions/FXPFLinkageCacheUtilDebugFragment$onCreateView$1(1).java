package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3BQ;
import X.AnonymousClass3WK;
import X.AnonymousClass49A;
import X.AnonymousClass49B;
import X.AnonymousClass49V;
import X.AnonymousClass7Ko;
import X.C04220Ms;
import X.C14030oh;
import X.C18250wR;
import X.C63203gz;
import X.C63233h2;
import X.C67463zb;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.graphql.instagramschemagraphservices.FxIGObIdEqualityQueryResponseImpl;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class FXPFLinkageCacheUtilDebugFragment$onCreateView$1 implements View.OnClickListener {
    public final /* synthetic */ IgEditText $obIdInput1;
    public final /* synthetic */ IgEditText $obIdInput2;
    public final /* synthetic */ FXPFLinkageCacheUtilDebugFragment this$0;

    public FXPFLinkageCacheUtilDebugFragment$onCreateView$1(IgEditText igEditText, IgEditText igEditText2, FXPFLinkageCacheUtilDebugFragment fXPFLinkageCacheUtilDebugFragment) {
        this.$obIdInput1 = igEditText;
        this.$obIdInput2 = igEditText2;
        this.this$0 = fXPFLinkageCacheUtilDebugFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1106148670);
        String A0n = AnonymousClass0wJ.A0n(this.$obIdInput1);
        String A0n2 = AnonymousClass0wJ.A0n(this.$obIdInput2);
        FXPFLinkageCacheUtilDebugFragment fXPFLinkageCacheUtilDebugFragment = this.this$0;
        FXPFLinkageCacheUtilDebugFragment$onCreateView$1$listener$1 fXPFLinkageCacheUtilDebugFragment$onCreateView$1$listener$1 = new FXPFLinkageCacheUtilDebugFragment$onCreateView$1$listener$1(fXPFLinkageCacheUtilDebugFragment);
        AnonymousClass49A r0 = fXPFLinkageCacheUtilDebugFragment.linkageCacheUtil;
        if (r0 == null) {
            C04220Ms.A0E("linkageCacheUtil");
            throw null;
        }
        String str = fXPFLinkageCacheUtilDebugFragment.callerName;
        CallerContext callerContext = fXPFLinkageCacheUtilDebugFragment.callerContext;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, callerContext);
        AnonymousClass0wJ.A1Q(A0n, A0n2);
        AnonymousClass49B r4 = r0.A00;
        AnonymousClass49V r3 = r4.A00;
        String str2 = callerContext.A02;
        C04220Ms.A06(str2);
        r3.A04("compare_obid_fetch_attempt", str, (List) null, C63203gz.A03("caller_class", str2));
        AnonymousClass3BQ r32 = new AnonymousClass3BQ(callerContext, fXPFLinkageCacheUtilDebugFragment$onCreateView$1$listener$1, r4, str);
        UserSession userSession = r4.A01;
        C04220Ms.A0B(userSession, 0);
        C67463zb A00 = C67463zb.A00();
        C67463zb A002 = C67463zb.A00();
        A00.A05("obfuscated_id_1", A0n);
        A00.A05("obfuscated_id_2", A0n2);
        A00.A05("caller_name", "fx_product_foundation_client_FXOnline_client_cache");
        AnonymousClass7Ko.A0B(A1Z);
        AnonymousClass7Ko.A0B(A1Z);
        C18250wR.A12(new PandoGraphQLRequest(C63233h2.A04(A1Z), "FxIGObIdEqualityQuery", GraphQlCallInput.A03(A00), GraphQlCallInput.A03(A002), FxIGObIdEqualityQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_compare_ob_id"), AnonymousClass3WK.A01(userSession), r32, 10);
        C14030oh.A0C(-1530008539, A05);
    }
}
