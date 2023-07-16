package X;

import java.util.Map;

/* renamed from: X.6G4  reason: invalid class name */
public final class AnonymousClass6G4 {
    public static Object A00(String str, Map map) {
        if (map.get("metadata") == null) {
            return null;
        }
        Map map2 = (Map) map.get("metadata");
        String A00 = C28174Ezk.A00(199);
        if (!map2.containsKey(A00)) {
            return null;
        }
        Map map3 = (Map) map2.get(A00);
        if (map3.containsKey(str)) {
            return map3.get(str);
        }
        return null;
    }
}
