package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2Ld  reason: invalid class name and case insensitive filesystem */
public final class C34852Ld {
    public static final Map A00(Map map, Set set, boolean z) {
        HashSet hashSet;
        if (map == null) {
            map = AnonymousClass0wJ.A0y();
        }
        for (Object next : set) {
            if (!map.containsKey(next)) {
                if (z) {
                    hashSet = C18200wM.A0u();
                    Iterator A0z = AnonymousClass0wJ.A0z(map);
                    while (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        Object key = A0o.getKey();
                        for (Object obj : (Set) A0o.getValue()) {
                            if (next == obj) {
                                hashSet.add(key);
                            }
                        }
                    }
                } else {
                    hashSet = new HashSet(set);
                }
                map.put(next, hashSet);
            }
        }
        return map;
    }
}
