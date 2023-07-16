package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Bc  reason: invalid class name and case insensitive filesystem */
public final class C32282Bc {
    public static Map A00(Map map) {
        KZ2 A00;
        if (map.containsKey("server_params")) {
            Map map2 = (Map) map.get("server_params");
            if (map2 != null) {
                map2.put("INTERNAL_INFRA_THEME", AnonymousClass3QU.A00());
            }
        } else if (map.containsKey("client_input_params")) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("INTERNAL_INFRA_THEME", AnonymousClass3QU.A00());
            map.put("server_params", A0y);
        } else {
            map.put("INTERNAL_INFRA_THEME", AnonymousClass3QU.A00());
        }
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        String str = "{}";
        if (!map.isEmpty() && (A00 = C37067Jjv.A00(map)) != null) {
            str = A00.toString();
        }
        A0y2.put("params", str);
        return A0y2;
    }
}
