package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Qz  reason: invalid class name and case insensitive filesystem */
public final class C101386Qz {
    public static final JSONObject A00(List list) {
        JSONArray A0i = C18250wR.A0i();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CN3 cn3 = (CN3) it.next();
                if (cn3 != null) {
                    StringWriter A0d = C18230wP.A0d();
                    MMp A04 = C18987Aon.A00.A04(A0d);
                    C25099Dfj.A00(A04, cn3);
                    A04.close();
                    A0i.put(C18250wR.A0j(A0d.toString()));
                }
            }
        }
        JSONObject A0y = C18230wP.A0y();
        try {
            A0y.put("textCaptionData", A0i);
            return A0y;
        } catch (JSONException unused) {
            return C18230wP.A0y();
        }
    }
}
