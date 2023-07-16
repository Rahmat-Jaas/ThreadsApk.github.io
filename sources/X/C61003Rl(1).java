package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Rl  reason: invalid class name and case insensitive filesystem */
public final class C61003Rl {
    public final Map A00;

    public static Map A00(String str) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        try {
            JSONObject A0j = C18250wR.A0j(str);
            Iterator<String> keys = A0j.keys();
            while (keys.hasNext()) {
                String A0k = C18180wK.A0k(keys);
                JSONObject jSONObject = A0j.getJSONObject(A0k);
                if (jSONObject.has("enforce_scheme")) {
                    jSONObject.getBoolean("enforce_scheme");
                }
                if (jSONObject.has("enforce_scheme_and_authority")) {
                    jSONObject.getBoolean("enforce_scheme_and_authority");
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("whitelist");
                Iterator<String> keys2 = jSONObject2.keys();
                HashMap A0y2 = AnonymousClass0wJ.A0y();
                while (keys2.hasNext()) {
                    String A0k2 = C18180wK.A0k(keys2);
                    A0y2.put(A0k2, Pattern.compile(jSONObject2.getString(A0k2)));
                }
                A0y.put(A0k, new C61003Rl(A0y2));
            }
        } catch (JSONException unused) {
        }
        return A0y;
    }

    public C61003Rl(Map map) {
        this.A00 = map;
    }
}
