package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1t2  reason: invalid class name and case insensitive filesystem */
public final class C27711t2 extends AnonymousClass5NL implements C82064p1 {
    public final AnonymousClass18Q Cyk(C112176p7 r8) {
        ArrayList arrayList;
        String stringValueByHashCode = getStringValueByHashCode(-1068784020);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1358599159);
        String stringValueByHashCode2 = getStringValueByHashCode(110371416);
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(111578632, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                C18180wK.A1U(A0x, it);
            }
            arrayList = AnonymousClass0wJ.A0x(A0x, 10);
            Iterator it2 = A0x.iterator();
            while (it2.hasNext()) {
                C18190wL.A1Q(r8, arrayList, it2);
            }
        } else {
            arrayList = null;
        }
        return new AnonymousClass18Q(optionalBooleanValueByHashCode, stringValueByHashCode, stringValueByHashCode2, arrayList);
    }
}
