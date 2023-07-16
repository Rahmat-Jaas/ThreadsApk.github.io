package com.facebook.redex;

import X.AnonymousClass00J;
import X.AnonymousClass1dM;
import X.AnonymousClass3G3;
import X.C143338gY;
import X.C18250wR;
import X.C61723Vc;
import X.C685344e;
import X.C83334rD;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.unifiedfeedback.api.graphql.CXPCommentHideMutationResponseImpl;
import com.instagram.unifiedfeedback.api.graphql.CXPFetchFeedbackQueryResponseImpl;
import com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl;

public class IDxFCallbackShape12S0210000_1_I2 implements C83334rD {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public IDxFCallbackShape12S0210000_1_I2(AnonymousClass1dM r1, C61723Vc r2, int i, boolean z) {
        this.A03 = i;
        if (i != 0) {
            this.A01 = r1;
            this.A00 = r2;
            this.A02 = z;
        } else {
            this.A00 = r2;
            this.A02 = z;
            this.A01 = r1;
        }
    }

    public final void onFailure(Throwable th) {
        AnonymousClass1dM r1;
        if (this.A03 != 0) {
            ((C61723Vc) this.A00).A01 = Boolean.valueOf(this.A02);
            r1 = (AnonymousClass1dM) this.A01;
            r1.A0A = false;
        } else {
            r1 = (AnonymousClass1dM) this.A01;
        }
        AnonymousClass1dM.A00(r1);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        TreeJNI A032;
        ImmutableList treeList;
        TreeJNI treeJNI;
        FBFeedbackImpl fBFeedbackImpl;
        TreeJNI A033;
        ImmutableList treeList2;
        TreeJNI treeJNI2;
        TreeJNI treeValue;
        C143338gY r6 = (C143338gY) obj;
        if (this.A03 != 0) {
            if (!(r6 == null || (A033 = C685344e.A03(r6)) == null || (treeList2 = A033.getTreeList("xcxp_dispatch_comment_hide(destinations:[$destination],params:$params)", CXPCommentHideMutationResponseImpl.XcxpDispatchCommentHide.class)) == null || (treeJNI2 = (TreeJNI) AnonymousClass00J.A0D(treeList2)) == null || (treeValue = treeJNI2.getTreeValue("data", CXPCommentHideMutationResponseImpl.XcxpDispatchCommentHide.Data.class)) == null)) {
                C61723Vc r2 = (C61723Vc) this.A00;
                if (treeValue.hasFieldValue("hidden")) {
                    r2.A01 = C18250wR.A0S(treeValue, "hidden");
                }
            }
            ((AnonymousClass1dM) this.A01).A0A = false;
        } else if (r6 != null && (A032 = C685344e.A03(r6)) != null && (treeList = A032.getTreeList("xcxp_fetch_feedback(content_destinations:$content_destinations,content_source:$content_source,id:$content_id)", CXPFetchFeedbackQueryResponseImpl.XcxpFetchFeedback.class)) != null && (treeJNI = (TreeJNI) treeList.get(0)) != null && treeJNI.isFulfilled("XFBFeedback") && (fBFeedbackImpl = (FBFeedbackImpl) treeJNI.reinterpret(FBFeedbackImpl.class)) != null) {
            C61723Vc r3 = (C61723Vc) this.A00;
            ((AnonymousClass3G3) r3.A0A.getValue()).A00(fBFeedbackImpl, r3, this.A02);
            AnonymousClass1dM.A00((AnonymousClass1dM) this.A01);
        }
    }
}
