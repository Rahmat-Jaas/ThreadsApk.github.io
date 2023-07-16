package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0tG  reason: invalid class name and case insensitive filesystem */
public final class C16530tG {
    public static JSONObject A00(Map map) {
        if (map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }
}
