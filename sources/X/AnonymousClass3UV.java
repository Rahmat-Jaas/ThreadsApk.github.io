package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3UV  reason: invalid class name */
public final class AnonymousClass3UV {
    public QuickPromotionSurface A00 = null;
    public final Map A01 = C18220wO.A0y();

    public AnonymousClass3UV(String str) {
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    QuickPromotionSurface valueOf = QuickPromotionSurface.valueOf(jSONObject.getString("s"));
                    this.A01.put(valueOf, Long.valueOf(jSONObject.getLong("t")));
                    this.A00 = valueOf;
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final String toString() {
        JSONArray A0i = C18250wR.A0i();
        Iterator A0z = AnonymousClass0wJ.A0z(this.A01);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            try {
                JSONObject A0y = C18230wP.A0y();
                A0y.put("s", ((QuickPromotionSurface) A0o.getKey()).name());
                A0y.put("t", A0o.getValue());
                A0i.put(A0y);
            } catch (JSONException unused) {
            }
        }
        return A0i.toString();
    }

    public AnonymousClass3UV() {
    }
}
