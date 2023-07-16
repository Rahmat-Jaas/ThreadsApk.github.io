package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.1tQ  reason: invalid class name and case insensitive filesystem */
public final class C27951tQ extends AnonymousClass5NL implements C82144p9 {
    public final AnonymousClass18k D2d(C112176p7 r6) {
        ArrayList arrayList;
        Class<C27961tR> cls = C27961tR.class;
        ImmutableList<C82154pA> optionalTreeListByHashCode = getOptionalTreeListByHashCode(-1547473904, cls);
        C210018l r3 = null;
        if (optionalTreeListByHashCode != null) {
            arrayList = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            for (C82154pA D2e : optionalTreeListByHashCode) {
                arrayList.add(D2e.D2e(r6));
            }
        } else {
            arrayList = null;
        }
        String stringValueByHashCode = getStringValueByHashCode(1769642752);
        if (stringValueByHashCode != null) {
            C82154pA r0 = (C82154pA) getTreeValueByHashCode(339043230, cls);
            if (r0 != null) {
                r3 = r0.D2e(r6);
            }
            return new AnonymousClass18k(r3, stringValueByHashCode, arrayList);
        }
        throw AnonymousClass0wJ.A0b();
    }
}
