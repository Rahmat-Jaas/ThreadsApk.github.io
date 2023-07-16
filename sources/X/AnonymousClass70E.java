package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.70E  reason: invalid class name */
public final class AnonymousClass70E {
    public static C127397h3 A01(C127397h3 r5, List list, int i) {
        if (list != null) {
            if (i < list.size()) {
                C127397h3 A0Q = C86154wM.A0Q(list, i);
                if (A0Q.A02 == r5.A02) {
                    return A0Q;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C127397h3 A0V = C86144wL.A0V(it);
                if (A0V.A02 == r5.A02) {
                    return A0V;
                }
            }
        }
        return null;
    }

    public static C127397h3 A00(C127397h3 r2, C127397h3 r3, Object obj, int i) {
        if (r2 != r3 || !C100986Pl.A00(C127397h3.A0A(r3, i), obj)) {
            if (r2 == r3) {
                r2 = new C127397h3(r3, r3, r3.A07, r3.A02);
            }
            r2.A04.put(i, obj);
        }
        return r2;
    }
}
