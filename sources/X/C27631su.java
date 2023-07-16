package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1su  reason: invalid class name and case insensitive filesystem */
public final class C27631su extends AnonymousClass5NL implements C21543Bw7 {
    public final AnonymousClass18M Cxj(C144028hi r2) {
        return Cxi(new C112176p7(r2));
    }

    public final AnonymousClass18M Cxi(C112176p7 r6) {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(94851343);
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
                C18190wL.A1Q(r6, arrayList, it2);
            }
        } else {
            arrayList = null;
        }
        return new AnonymousClass18M(optionalIntValueByHashCode, arrayList);
    }
}
