package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.3Q2  reason: invalid class name */
public final class AnonymousClass3Q2 {
    public static String A00(AnonymousClass3HZ r6) {
        JSONObject A0y = C18230wP.A0y();
        A0y.put("user_id", r6.A02);
        A0y.put("auth_token", r6.A01);
        A0y.put("account_type", r6.A00);
        A0y.put("app_source", r6.A04);
        A0y.put("credential_source", r6.A05);
        JSONObject A0y2 = C18230wP.A0y();
        Map map = r6.A03;
        Iterator A0x = C18220wO.A0x(map);
        while (A0x.hasNext()) {
            String A0k = C18180wK.A0k(A0x);
            A0y2.put(A0k, map.get(A0k));
        }
        A0y.put("generic_data", A0y2);
        return A0y.toString();
    }

    public static AnonymousClass3HZ A01(String str) {
        JSONObject A0j = C18250wR.A0j(str);
        JSONObject A0y = C18230wP.A0y();
        if (A0j.has("generic_data")) {
            A0y = A0j.getJSONObject("generic_data");
        }
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        Iterator<String> keys = A0y.keys();
        while (keys.hasNext()) {
            String A0k = C18180wK.A0k(keys);
            A0y2.put(A0k, A0y.getString(A0k));
        }
        return new AnonymousClass3HZ(A0j.getString("user_id"), A0j.getString("auth_token"), A0j.getString("account_type"), A0y2, C311624m.valueOf(A0j.getString("app_source")), AnonymousClass24G.valueOf(A0j.getString("credential_source")));
    }
}
