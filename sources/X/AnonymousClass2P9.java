package X;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2P9  reason: invalid class name */
public final class AnonymousClass2P9 {
    public static void A00(H1T h1t, List list, List list2) {
        String obj;
        String str;
        if (list.size() != list2.size()) {
            obj = "";
        } else {
            JSONObject A0y = C18230wP.A0y();
            for (int i = 0; i < list.size(); i++) {
                AnonymousClass3HL r1 = (AnonymousClass3HL) list.get(i);
                AnonymousClass23D r0 = (AnonymousClass23D) list2.get(i);
                if (!(r1 == null || (str = r1.A00) == null)) {
                    try {
                        A0y.put(str, Integer.toString(r0.A00));
                    } catch (JSONException e) {
                        C10450iM.A03("Failed to append consent update param", C18180wK.A0j("{ 'error' : '%s' }", new Object[]{e.getMessage()}));
                    }
                }
            }
            obj = A0y.toString();
        }
        h1t.A0O("updates", obj);
    }
}
