package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.AccessToken;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3J8  reason: invalid class name */
public final class AnonymousClass3J8 {
    public static AccessToken A00(JSONObject jSONObject) {
        if (jSONObject.getInt(ClientCookie.VERSION_ATTR) > 1) {
            return null;
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        Integer A00 = AnonymousClass3J9.A00(jSONObject.getString("source"));
        String string2 = jSONObject.getString("application_id");
        String string3 = jSONObject.getString("user_id");
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (int i = 0; i < jSONArray.length(); i++) {
            A0v.add(jSONArray.getString(i));
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            A0v2.add(jSONArray2.getString(i2));
        }
        return new AccessToken(A00, string, string2, string3, A0v, A0v2, date, date2);
    }

    public static JSONObject A01(AccessToken accessToken) {
        JSONObject A0y = C18230wP.A0y();
        A0y.put(ClientCookie.VERSION_ATTR, 1);
        A0y.put("token", accessToken.A02);
        A0y.put("expires_at", accessToken.A04.getTime());
        A0y.put("permissions", new JSONArray(accessToken.A07));
        A0y.put("declined_permissions", new JSONArray(accessToken.A06));
        A0y.put("last_refresh", accessToken.A05.getTime());
        A0y.put("source", AnonymousClass3J9.A01(accessToken.A00));
        A0y.put("application_id", accessToken.A01);
        A0y.put("user_id", accessToken.A03);
        return A0y;
    }
}
