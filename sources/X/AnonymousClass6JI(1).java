package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6JI  reason: invalid class name */
public final class AnonymousClass6JI {
    public static void A00(List list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass78C r7 = (AnonymousClass78C) it.next();
            C109006jJ r6 = new C109006jJ(r7);
            Iterator it2 = r7.A04.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    C58673Gr r2 = new C58673Gr(cls, !C18180wK.A1W(r7.A01));
                    if (!hashMap.containsKey(r2)) {
                        hashMap.put(r2, C18200wM.A0u());
                    }
                    Set set = (Set) hashMap.get(r2);
                    if (set.isEmpty() || r2.A00) {
                        set.add(r6);
                    } else {
                        throw C18190wL.A0a(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C109006jJ> it3 : hashMap.values()) {
            for (C109006jJ r5 : it3) {
                for (AnonymousClass79T r0 : r5.A00.A03) {
                    Set<C109006jJ> set2 = (Set) hashMap.get(new C58673Gr(r0.A01, AnonymousClass0wJ.A1T(r0.A00, 2)));
                    if (set2 != null) {
                        for (C109006jJ r1 : set2) {
                            r5.A01.add(r1);
                            r1.A02.add(r5);
                        }
                    }
                }
            }
        }
        HashSet<C109006jJ> A0u = C18200wM.A0u();
        for (Collection addAll : hashMap.values()) {
            A0u.addAll(addAll);
        }
        HashSet A0u2 = C18200wM.A0u();
        for (C109006jJ r12 : A0u) {
            if (r12.A02.isEmpty()) {
                A0u2.add(r12);
            }
        }
        int i = 0;
        while (!A0u2.isEmpty()) {
            C109006jJ r3 = (C109006jJ) A0u2.iterator().next();
            A0u2.remove(r3);
            i++;
            for (C109006jJ r13 : r3.A01) {
                Set set3 = r13.A02;
                set3.remove(r3);
                if (set3.isEmpty()) {
                    A0u2.add(r13);
                }
            }
        }
        if (i != list.size()) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (C109006jJ r14 : A0u) {
                if (!r14.A02.isEmpty() && !r14.A01.isEmpty()) {
                    A0v.add(r14.A00);
                }
            }
            throw new C93865ru(A0v);
        }
    }
}
