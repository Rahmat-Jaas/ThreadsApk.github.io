package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Hh  reason: invalid class name and case insensitive filesystem */
public final class C58793Hh {
    public static Map A00(Map map, Map map2) {
        C013306f r4 = new C013306f();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object obj = map2.get(A0o.getKey());
            Object key = A0o.getKey();
            if (obj == null) {
                obj = A0o.getValue();
            }
            r4.put(key, obj);
        }
        return r4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw new NullPointerException("equals");
    }

    public final int hashCode() {
        throw new NullPointerException("hashCode");
    }

    public final String toString() {
        throw new NullPointerException("containsValue");
    }
}
