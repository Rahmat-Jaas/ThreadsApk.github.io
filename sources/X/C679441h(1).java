package X;

import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.unifiedfeedback.api.graphql.CXPFetchFeedbackQueryResponseImpl;
import com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl;

/* renamed from: X.41h  reason: invalid class name and case insensitive filesystem */
public final class C679441h implements C83334rD {
    public final /* synthetic */ AnonymousClass1dM A00;
    public final /* synthetic */ boolean A01;

    public C679441h(AnonymousClass1dM r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final void onFailure(Throwable th) {
        AnonymousClass1dM.A00(this.A00);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        TreeJNI A03;
        ImmutableList treeList;
        TreeJNI treeJNI;
        FBFeedbackImpl fBFeedbackImpl;
        String str;
        Integer num;
        Integer num2;
        String str2;
        String str3;
        String str4;
        FBFeedbackImpl.OwningProfile owningProfile;
        TreeJNI treeValue;
        C143338gY r0 = (C143338gY) obj;
        if (r0 != null && (A03 = C685344e.A03(r0)) != null && (treeList = A03.getTreeList("xcxp_fetch_feedback(content_destinations:$content_destinations,content_source:$content_source,id:$content_id)", CXPFetchFeedbackQueryResponseImpl.XcxpFetchFeedback.class)) != null && (treeJNI = (TreeJNI) treeList.get(0)) != null && treeJNI.isFulfilled("XFBFeedback") && (fBFeedbackImpl = (FBFeedbackImpl) treeJNI.reinterpret(FBFeedbackImpl.class)) != null) {
            boolean z = this.A01;
            AnonymousClass1dM r2 = this.A00;
            if (z) {
                r2.A09 = true;
                AnonymousClass3G3 r5 = r2.A0E;
                FBFeedbackImpl.OwningProfile owningProfile2 = (FBFeedbackImpl.OwningProfile) fBFeedbackImpl.getTreeValue("owning_profile", FBFeedbackImpl.OwningProfile.class);
                String stringValue = fBFeedbackImpl.getStringValue("post_message");
                TreeJNI treeValue2 = fBFeedbackImpl.getTreeValue("first_photo(height:100,width:100)", FBFeedbackImpl.PostThumbnail100.class);
                if (treeValue2 != null) {
                    str = C18250wR.A0Y(treeValue2);
                } else {
                    str = null;
                }
                String A0m = C18220wO.A0m(fBFeedbackImpl);
                TreeJNI treeValue3 = fBFeedbackImpl.getTreeValue("reactors", FBFeedbackImpl.Reactors.class);
                if (treeValue3 != null) {
                    num = C18240wQ.A0Y(treeValue3, "count");
                } else {
                    num = null;
                }
                Class<FBFeedbackImpl.ViewerFeedbackReactionInfo> cls = FBFeedbackImpl.ViewerFeedbackReactionInfo.class;
                TreeJNI treeValue4 = fBFeedbackImpl.getTreeValue("viewer_feedback_reaction_info", cls);
                if (treeValue4 != null) {
                    num2 = C18240wQ.A0Y(treeValue4, "key");
                } else {
                    num2 = null;
                }
                TreeJNI treeValue5 = fBFeedbackImpl.getTreeValue("viewer_feedback_reaction_info", cls);
                if (treeValue5 != null) {
                    str2 = treeValue5.getStringValue("localized_name");
                } else {
                    str2 = null;
                }
                AnonymousClass3TH r9 = new AnonymousClass3TH(owningProfile2, num, num2, stringValue, str, A0m, str2);
                r5.A01 = r9;
                FBFeedbackImpl.OwningProfile owningProfile3 = r9.A03;
                if (owningProfile3 != null) {
                    str3 = C18220wO.A0l(owningProfile3);
                } else {
                    str3 = null;
                }
                AnonymousClass3TH r02 = r5.A01;
                if (r02 == null || (owningProfile = r02.A03) == null || (treeValue = owningProfile.getTreeValue("profile_picture(scale:1,width:150)", FBFeedbackImpl.OwningProfile.ProfilePicture.class)) == null) {
                    str4 = null;
                } else {
                    str4 = C18250wR.A0Y(treeValue);
                }
                if (!(str3 == null || str4 == null)) {
                    AnonymousClass4AC r03 = r2.A08;
                    if (r03 == null) {
                        C04220Ms.A0E("composerController");
                        throw null;
                    }
                    r03.A00(str3, str4);
                }
            }
            r2.A0E.A00(fBFeedbackImpl, (C61723Vc) null, false);
            AnonymousClass1dM.A00(r2);
        }
    }
}
