package X;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Ps  reason: invalid class name and case insensitive filesystem */
public final class C101056Ps {
    public static C127397h3 A00(C111246n1 r11, C127397h3 r12, C127397h3 r13, List list, List list2, Map map) {
        C127397h3 r2;
        SparseArray sparseArray;
        C127397h3 r1;
        if (list2 != null) {
            Object A0b = C18240wQ.A0b(list2);
            String A0p = C18190wL.A0p(list2, 2);
            if (A0b instanceof Number) {
                int A04 = AnonymousClass0wJ.A04(A0b);
                List A0Q = r12.A0Q(143);
                if (A04 < 0 || A04 >= A0Q.size()) {
                    StringBuilder A0s = C18190wL.A0s("[");
                    Iterator it = A0Q.iterator();
                    while (it.hasNext()) {
                        A0s.append(C86144wL.A0V(it).A03);
                        C86144wL.A1T(A0s);
                    }
                    A0s.append("]");
                    StringBuilder A0s2 = C18190wL.A0s("BloksCrash: children-binding index ");
                    A0s2.append(A04);
                    A0s2.append(" scopeKey: ");
                    A0s2.append(A0p);
                    A0s2.append(" out of bounds for array of size ");
                    A0s2.append(A0Q.size());
                    A0s2.append(" ");
                    throw new IndexOutOfBoundsException(C18180wK.A0i(A0s.toString(), A0s2));
                }
                r2 = C86154wM.A0Q(A0Q, A04);
            } else if (A0b instanceof String) {
                String str = (String) A0b;
                r2 = (C127397h3) r11.A02.A04.get(str);
                if (r2 == null) {
                    throw C18210wN.A0W(AnonymousClass00U.A0V("Unable to find template ID ", str, " in tree resources."));
                }
            }
            Map map2 = (Map) C86134wK.A0k(list2);
            int A00 = r11.A03.A00(r12, r2, A0p);
            LinkedList linkedList = new LinkedList(list);
            C18200wM.A1U(linkedList, A00);
            StringBuilder A0r = C18200wM.A0r();
            for (Object next : linkedList) {
                A0r.append('|');
                A0r.append(next);
            }
            String obj = A0r.toString();
            if (map2 != null) {
                Iterator A0z = AnonymousClass0wJ.A0z(map2);
                while (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    String A0V = AnonymousClass00U.A0V(C18200wM.A0p(A0o), "#", obj);
                    Object value = A0o.getValue();
                    r11.A0A.put(A0V, value);
                    Set set = r11.A0C;
                    if (set != null && !C100986Pl.A00(r11.A0B.get(A0V), value)) {
                        set.add(A0V);
                    }
                    map.put(A0V, A0o.getValue());
                }
            }
            C109246jh r0 = r11.A04;
            if (r13 == null || (sparseArray = (SparseArray) r0.A01.get(r13.A02)) == null || (r1 = (C127397h3) sparseArray.get(A00)) == null || r1.A05 != r2) {
                return C101106Px.A00(new C130747qh(r11, r12, A0p, linkedList), r2);
            }
            return r1;
        }
        return null;
    }
}
