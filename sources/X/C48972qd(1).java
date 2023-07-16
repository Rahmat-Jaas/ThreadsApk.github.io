package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2qd  reason: invalid class name and case insensitive filesystem */
public final class C48972qd {
    public static final String A00(String str, Map map) {
        Object obj;
        List list;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String A0p = C18200wM.A0p((Map.Entry) obj);
            if (A0p == null) {
                if (str == null) {
                    break;
                }
            } else if (A0p.equalsIgnoreCase(str)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (list = (List) entry.getValue()) == null) {
            return null;
        }
        return (String) AnonymousClass00J.A0D(list);
    }
}
