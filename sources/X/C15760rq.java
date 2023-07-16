package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0rq  reason: invalid class name and case insensitive filesystem */
public final class C15760rq {
    public static C15780rs A00() {
        Set<Object> set = C15470rN.A1I;
        Set set2 = C15610rb.A00;
        HashMap hashMap = new HashMap();
        for (Object put : set) {
            hashMap.put(put, Collections.unmodifiableSet(set2));
        }
        return new C15780rs(Collections.unmodifiableMap(hashMap));
    }

    public static C15780rs A01(Set set) {
        HashMap hashMap = new HashMap();
        for (Object put : set) {
            hashMap.put(put, Collections.unmodifiableSet(new HashSet(Collections.singletonList("*|all_packages|*"))));
        }
        return new C15780rs(Collections.unmodifiableMap(hashMap));
    }

    public static C15780rs A02(Set set, Set set2) {
        HashMap hashMap = new HashMap();
        for (Object put : set) {
            hashMap.put(put, Collections.unmodifiableSet(set2));
        }
        return new C15780rs(Collections.unmodifiableMap(hashMap));
    }
}
