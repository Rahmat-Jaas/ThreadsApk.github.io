package X;

import android.util.SparseArray;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Hr  reason: invalid class name and case insensitive filesystem */
public final class C58843Hr {
    public final SparseArray A00 = new SparseArray();

    public final Set A00(String str) {
        Collection collection;
        C04220Ms.A0B(str, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.length() != 0) {
            Map map = (Map) this.A00.get(str.charAt(0));
            if (!(map == null || !map.containsKey(str) || (collection = (Collection) map.get(str)) == null)) {
                linkedHashSet.addAll(collection);
            }
        }
        return linkedHashSet;
    }

    public final Set A01(String str) {
        C04220Ms.A0B(str, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.length() != 0) {
            Map map = (Map) this.A00.get(str.charAt(0));
            if (map != null) {
                Iterator A0z = AnonymousClass0wJ.A0z(map);
                while (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    String A0p = C18200wM.A0p(A0o);
                    Collection collection = (Collection) A0o.getValue();
                    C04220Ms.A0B(A0p, 0);
                    if (A0p.startsWith(str)) {
                        linkedHashSet.addAll(collection);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public final void A02(String str, Object obj) {
        char charAt = str.charAt(0);
        SparseArray sparseArray = this.A00;
        Map map = (Map) sparseArray.get(charAt);
        if (map == null) {
            map = C18220wO.A0y();
            sparseArray.put(charAt, map);
        }
        Set set = (Set) map.get(str);
        if (set == null) {
            set = new LinkedHashSet();
            map.put(str, set);
        }
        set.add(obj);
    }
}
