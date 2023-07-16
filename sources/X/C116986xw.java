package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6xw  reason: invalid class name and case insensitive filesystem */
public final class C116986xw {
    public static void A01(C104986ch r10, C109826kg r11, Iterator it, Map map, Map map2) {
        Iterator it2 = it;
        C109826kg r5 = r11;
        Map map3 = map2;
        if (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            C112936qR r3 = new C112936qR(r10, r5, A0k, it2, map3, map);
            C107416gi r0 = r10.A00;
            r0.A00.CuA((C120967Dk) C86104wH.A0h(A0k, r0.A01), r3, (byte[]) C86104wH.A0h(A0k, map));
            return;
        }
        r11.A01.A02.execute(new C1360080z(r11, map2));
    }

    public static C107416gi A00(C143698hA r4, Set set) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C120967Dk r1 = (C120967Dk) it.next();
            A0y.put(r1.A05, r1);
        }
        return new C107416gi(r4, A0y);
    }
}
