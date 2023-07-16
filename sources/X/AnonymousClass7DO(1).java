package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7DO  reason: invalid class name */
public final class AnonymousClass7DO {
    public Map A00 = AnonymousClass0wJ.A0y();
    public Map A01 = AnonymousClass0wJ.A0y();

    public static AnonymousClass7DO A00(AnonymousClass7DO r6) {
        AnonymousClass7DO r5 = new AnonymousClass7DO();
        Map map = r6.A00;
        if (!map.isEmpty()) {
            Iterator A0x = C18220wO.A0x(map);
            while (A0x.hasNext()) {
                Object next = A0x.next();
                r5.A00.put(next, C18200wM.A0s((Collection) map.get(next)));
            }
            Map map2 = r6.A01;
            Iterator A0x2 = C18220wO.A0x(map2);
            while (A0x2.hasNext()) {
                Object next2 = A0x2.next();
                r5.A01.put(next2, C18200wM.A0s((Collection) map2.get(next2)));
            }
        }
        return r5;
    }

    public static void A01(Map map, Map map2, String str) {
        Collection collection = (Collection) map2.get(str);
        List list = (List) map.remove(str);
        if (collection != null) {
            if (list != null) {
                list.removeAll(collection);
            } else {
                return;
            }
        } else if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            map.put(str, list);
        }
    }
}
