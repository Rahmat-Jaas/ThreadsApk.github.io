package X;

import com.facebook.pando.TreeJNI;
import com.instagram.unifiedfeedback.api.graphql.FBCommentImpl;

/* renamed from: X.3Vc  reason: invalid class name and case insensitive filesystem */
public final class C61723Vc {
    public AnonymousClass39D A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public final FBCommentImpl A05;
    public final C61723Vc A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final C04530Oa A0A;

    public C61723Vc() {
        this((FBCommentImpl) null, (C61723Vc) null, (String) null, (String) null, (String) null);
    }

    public final int A00() {
        FBCommentImpl.Feedback A002;
        TreeJNI treeValue;
        Integer num = this.A02;
        if (num != null) {
            return num.intValue();
        }
        FBCommentImpl fBCommentImpl = this.A05;
        if (fBCommentImpl == null || (A002 = fBCommentImpl.A00()) == null || (treeValue = A002.getTreeValue("reactors", FBCommentImpl.Feedback.Reactors.class)) == null) {
            return 0;
        }
        return treeValue.getIntValue("count");
    }

    public final AnonymousClass39D A01() {
        FBCommentImpl.Feedback A002;
        TreeJNI treeValue;
        AnonymousClass39D r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        FBCommentImpl fBCommentImpl = this.A05;
        if (fBCommentImpl == null || (A002 = fBCommentImpl.A00()) == null || (treeValue = A002.getTreeValue("viewer_feedback_reaction_info", FBCommentImpl.Feedback.ViewerFeedbackReactionInfo.class)) == null) {
            return null;
        }
        return new AnonymousClass39D(treeValue.getIntValue("key"), treeValue.getStringValue("localized_name"));
    }

    public final boolean A02() {
        FBCommentImpl fBCommentImpl;
        Boolean bool = this.A01;
        if (bool == null && ((fBCommentImpl = this.A05) == null || (bool = C18250wR.A0S(fBCommentImpl, "is_hidden_by_viewer")) == null)) {
            return false;
        }
        return bool.booleanValue();
    }

    public C61723Vc(FBCommentImpl fBCommentImpl, C61723Vc r5, String str, String str2, String str3) {
        int i;
        FBCommentImpl.Feedback A002;
        TreeJNI treeValue;
        this.A05 = fBCommentImpl;
        this.A06 = r5;
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A0A = AnonymousClass0OY.A02(C77404fj.A00);
        if (fBCommentImpl == null || (A002 = fBCommentImpl.A00()) == null || (treeValue = A002.getTreeValue("top_level_comments", FBCommentImpl.Feedback.TopLevelComments.class)) == null) {
            i = 0;
        } else {
            i = treeValue.getIntValue("count");
        }
        this.A03 = Integer.valueOf(i);
    }
}
