package X;

import com.facebook.pando.TreeJNI;
import com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl;

/* renamed from: X.48T  reason: invalid class name */
public final class AnonymousClass48T implements C41882MfV {
    public final FBReactorOfContentImpl A00;

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && C18190wL.A1Y(this, obj)) {
            Class<FBReactorOfContentImpl.Node> cls = FBReactorOfContentImpl.Node.class;
            TreeJNI treeValue = this.A00.getTreeValue("node", cls);
            String str2 = null;
            if (treeValue != null) {
                str = C18250wR.A0X(treeValue);
            } else {
                str = null;
            }
            TreeJNI treeValue2 = ((AnonymousClass48T) obj).A00.getTreeValue("node", cls);
            if (treeValue2 != null) {
                str2 = C18250wR.A0X(treeValue2);
            }
            return C04220Ms.A0I(str, str2);
        }
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        TreeJNI treeValue = this.A00.getTreeValue("node", FBReactorOfContentImpl.Node.class);
        if (treeValue != null) {
            return C18250wR.A0X(treeValue);
        }
        return null;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Integer num;
        TreeJNI treeValue;
        AnonymousClass48T r7 = (AnonymousClass48T) obj;
        Class<FBReactorOfContentImpl.FeedbackReactionInfo> cls = FBReactorOfContentImpl.FeedbackReactionInfo.class;
        TreeJNI treeValue2 = this.A00.getTreeValue("feedback_reaction_info", cls);
        Integer num2 = null;
        if (treeValue2 != null) {
            num = C18240wQ.A0Y(treeValue2, "key");
        } else {
            num = null;
        }
        if (!(r7 == null || (treeValue = r7.A00.getTreeValue("feedback_reaction_info", cls)) == null)) {
            num2 = C18240wQ.A0Y(treeValue, "key");
        }
        return C04220Ms.A0I(num, num2);
    }

    public AnonymousClass48T(FBReactorOfContentImpl fBReactorOfContentImpl) {
        this.A00 = fBReactorOfContentImpl;
    }
}
