package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3XT  reason: invalid class name */
public final class AnonymousClass3XT {
    public static final List A01 = Collections.unmodifiableList(Arrays.asList(new String[]{"scheme", "authority", ClientCookie.PATH_ATTR, "query"}));
    public final Map A00;

    public static AnonymousClass3XT A00(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                HashMap A0y = AnonymousClass0wJ.A0y();
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    String A0k = C18180wK.A0k(it);
                    if (jSONObject.has(A0k)) {
                        A0y.put(A0k, C62553aH.A00(jSONObject.get(A0k)));
                    }
                }
                if (!A0y.isEmpty()) {
                    return new AnonymousClass3XT(A0y);
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public AnonymousClass3XT(Map map) {
        this.A00 = map;
    }
}
