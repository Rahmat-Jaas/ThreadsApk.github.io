package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2C4  reason: invalid class name */
public final class AnonymousClass2C4 {
    public static HashMap A00(Map map) {
        String valueOf;
        String valueOf2;
        String valueOf3;
        if (map == null) {
            return null;
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object value = A0o.getValue();
            Object key = A0o.getKey();
            boolean z = key instanceof Number;
            if (value == null) {
                if (z) {
                    valueOf3 = key.toString();
                } else {
                    valueOf3 = String.valueOf(key);
                }
                A0y.put(valueOf3, (Object) null);
            } else {
                if (z) {
                    valueOf = key.toString();
                } else {
                    valueOf = String.valueOf(key);
                }
                Object value2 = A0o.getValue();
                if (value2 instanceof Number) {
                    valueOf2 = value2.toString();
                } else {
                    valueOf2 = String.valueOf(value2);
                }
                A0y.put(valueOf, valueOf2);
            }
        }
        return A0y;
    }
}
