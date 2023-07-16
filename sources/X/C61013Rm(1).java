package X;

import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactHashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Rm  reason: invalid class name and case insensitive filesystem */
public final class C61013Rm {
    public Map A00 = new CompactHashMap();

    public static void A00(Iterable iterable, Object obj, Map map) {
        if (obj != null) {
            Collection collection = (Collection) map.get(obj);
            Iterator it = iterable.iterator();
            if (collection != null) {
                while (it.hasNext()) {
                    Object next = it.next();
                    C30590GMc.A01(obj, next);
                    collection.add(next);
                }
            } else if (it.hasNext()) {
                CompactHashSet compactHashSet = new CompactHashSet();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    C30590GMc.A01(obj, next2);
                    compactHashSet.add(next2);
                }
                map.put(obj, compactHashSet);
            }
        } else {
            throw C18210wN.A0W(AnonymousClass00U.A0L("null key in entry: null=", AnonymousClass3W7.A01(iterable)));
        }
    }
}
