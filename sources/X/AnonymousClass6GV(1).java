package X;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.6GV  reason: invalid class name */
public final class AnonymousClass6GV {
    public static void A00(JSONObject jSONObject, JSONObject jSONObject2) {
        Object obj;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String A0k = C18180wK.A0k(keys);
            JSONObject optJSONObject = jSONObject2.optJSONObject(A0k);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(A0k);
            if (optJSONObject == null || optJSONObject2 == null) {
                obj = jSONObject2.get(A0k);
            } else {
                A00(optJSONObject2, optJSONObject);
                obj = optJSONObject2;
            }
            jSONObject.put(A0k, obj);
        }
    }
}
