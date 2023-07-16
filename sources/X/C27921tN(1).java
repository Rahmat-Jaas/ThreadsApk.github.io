package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1tN  reason: invalid class name and case insensitive filesystem */
public final class C27921tN extends AnonymousClass5NL implements C0S {
    public final List AvH() {
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(1498308178, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                C18180wK.A1U(A0w, it);
            }
            return A0w;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final StoryGroupMentionTappableData D1V(C144028hi r2) {
        return D1U(new C112176p7(r2));
    }

    public final String getId() {
        String stringValueByHashCode = getStringValueByHashCode(3355);
        if (stringValueByHashCode != null) {
            return stringValueByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String Abz() {
        return getStringValueByHashCode(1940351839);
    }

    public final Integer BDz() {
        return getOptionalIntValueByHashCode(1457597201);
    }

    public final String BFt() {
        return getStringValueByHashCode(3556653);
    }

    public final StoryGroupMentionTappableData D1U(C112176p7 r7) {
        String stringValueByHashCode = getStringValueByHashCode(1940351839);
        String id = getId();
        List AvH = AvH();
        ArrayList A0w = AnonymousClass0wJ.A0w(AvH);
        Iterator it = AvH.iterator();
        while (it.hasNext()) {
            C18190wL.A1Q(r7, A0w, it);
        }
        return new StoryGroupMentionTappableData(getOptionalIntValueByHashCode(1457597201), stringValueByHashCode, id, getStringValueByHashCode(3556653), A0w);
    }
}
