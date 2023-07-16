package X;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* renamed from: X.2CB  reason: invalid class name */
public final class AnonymousClass2CB {
    public static boolean A00(String str, String str2, Map map, Callable callable) {
        map.getClass();
        str.getClass();
        Iterator A0x = C18220wO.A0x(map);
        while (true) {
            if (!A0x.hasNext()) {
                break;
            }
            String A0k = C18180wK.A0k(A0x);
            if (A0k.equals(str)) {
                Object obj = map.get(A0k);
                if (obj instanceof TreeMap) {
                    AbstractMap abstractMap = (AbstractMap) obj;
                    Iterator A0u = C18190wL.A0u(abstractMap);
                    while (A0u.hasNext()) {
                        if (C18200wM.A0p(C18180wK.A0o(A0u)).equals(str2)) {
                        }
                    }
                    try {
                        String str3 = (String) callable.call();
                        if (str3 == null) {
                            return false;
                        }
                        abstractMap.put(str2, str3);
                        return true;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return false;
    }
}
