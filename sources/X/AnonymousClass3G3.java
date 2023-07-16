package X;

import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxComparatorShape302S0100000_1_I2;
import com.facebook.redex.IDxComparatorShape94S0000000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.unifiedfeedback.api.graphql.FBCommentImpl;
import com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl;
import com.instagram.unifiedfeedback.api.graphql.TopLevelCommentsImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* renamed from: X.3G3  reason: invalid class name */
public final class AnonymousClass3G3 {
    public TopLevelCommentsImpl.PageInfo A00;
    public AnonymousClass3TH A01;
    public String A02;
    public final List A03;
    public final List A04;
    public final Set A05 = C18200wM.A0u();

    public final void A00(FBFeedbackImpl fBFeedbackImpl, C61723Vc r13, boolean z) {
        TreeJNI reinterpret;
        ImmutableList treeList;
        TopLevelCommentsImpl.PageInfo pageInfo;
        TreeJNI reinterpret2;
        if (fBFeedbackImpl.getStringValue("strong_id__") != null) {
            String str = this.A02;
            String stringValue = fBFeedbackImpl.getStringValue("strong_id__");
            if (str == null) {
                this.A02 = stringValue;
            } else if (!str.equals(stringValue)) {
                throw C18180wK.A0a(AnonymousClass00U.A0e("attempt to add feedback(id=", fBFeedbackImpl.getStringValue("strong_id__"), ") to FbFeedbackCollection(feedbackId=", this.A02, ')'));
            }
            if (!z) {
                TreeJNI treeValue = fBFeedbackImpl.getTreeValue("top_level_comments(after:$after_cursor,first:$page_size)", FBFeedbackImpl.TopLevelComments.class);
                if (treeValue == null || (reinterpret2 = treeValue.reinterpret(TopLevelCommentsImpl.class)) == null) {
                    pageInfo = null;
                } else {
                    pageInfo = (TopLevelCommentsImpl.PageInfo) reinterpret2.getTreeValue("page_info", TopLevelCommentsImpl.PageInfo.class);
                }
                this.A00 = pageInfo;
            }
            TreeJNI treeValue2 = fBFeedbackImpl.getTreeValue("top_level_comments(after:$after_cursor,first:$page_size)", FBFeedbackImpl.TopLevelComments.class);
            if (!(treeValue2 == null || (reinterpret = treeValue2.reinterpret(TopLevelCommentsImpl.class)) == null || (treeList = reinterpret.getTreeList("nodes", TopLevelCommentsImpl.Nodes.class)) == null)) {
                ArrayList A0x = AnonymousClass0wJ.A0x(treeList, 10);
                Iterator it = treeList.iterator();
                while (it.hasNext()) {
                    A0x.add(C18210wN.A0G(it).reinterpret(FBCommentImpl.class));
                }
                List<FBCommentImpl> A0W = AnonymousClass00J.A0W(A0x, new IDxComparatorShape94S0000000_1_I2(10));
                if (A0W != null) {
                    ArrayList A0x2 = AnonymousClass0wJ.A0x(A0W, 10);
                    for (FBCommentImpl fBCommentImpl : A0W) {
                        Set set = this.A05;
                        if (!AnonymousClass00J.A0k(set, fBCommentImpl.getStringValue("strong_id__"))) {
                            String stringValue2 = fBCommentImpl.getStringValue("strong_id__");
                            if (stringValue2 != null) {
                                set.add(stringValue2);
                            }
                            this.A04.add(new C61723Vc(fBCommentImpl, r13, (String) null, (String) null, (String) null));
                        }
                        A0x2.add(Unit.A00);
                    }
                }
            }
            List list = this.A04;
            C73654Tg r1 = C73654Tg.A00;
            C04220Ms.A0C(r1, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
            C001300p.A0y(list, new IDxComparatorShape302S0100000_1_I2(8, (Comparator) new IDxComparatorShape302S0100000_1_I2(11, (Comparator) r1)));
            return;
        }
        throw C18180wK.A0a("fbFeedback.id is null");
    }

    public AnonymousClass3G3() {
        List synchronizedList = Collections.synchronizedList(AnonymousClass0wJ.A0v());
        C04220Ms.A06(synchronizedList);
        this.A04 = synchronizedList;
        this.A03 = synchronizedList;
    }
}
