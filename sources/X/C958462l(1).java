package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.62l  reason: invalid class name and case insensitive filesystem */
public final class C958462l extends AnonymousClass5NL implements C144118hr {
    public final AnonymousClass5Ka CyC() {
        ArrayList arrayList;
        Long optionalTimeValueByHashCode = getOptionalTimeValueByHashCode(-1174282985);
        ImmutableList<C144128hs> optionalTreeListByHashCode = getOptionalTreeListByHashCode(896355159, C958562m.class);
        if (optionalTreeListByHashCode != null) {
            arrayList = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            for (C144128hs CyD : optionalTreeListByHashCode) {
                arrayList.add(CyD.CyD());
            }
        } else {
            arrayList = null;
        }
        return new AnonymousClass5Ka(optionalTimeValueByHashCode, arrayList);
    }
}
