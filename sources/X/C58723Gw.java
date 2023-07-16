package X;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Gw  reason: invalid class name and case insensitive filesystem */
public class C58723Gw {
    public int A00 = -1;
    public List A01;

    public final AnonymousClass3IX A00() {
        int i = this.A00 + 1;
        this.A00 = i;
        List list = this.A01;
        if (i < list.size()) {
            return (AnonymousClass3IX) list.get(this.A00);
        }
        return null;
    }

    public C58723Gw(Collection collection) {
        this.A01 = new LinkedList(collection);
    }

    public final String A01() {
        JSONArray A0i = C18250wR.A0i();
        for (AnonymousClass3IX r0 : this.A01) {
            A0i.put(((Enum) r0.A00).name());
        }
        JSONObject A0y = C18230wP.A0y();
        try {
            A0y.put(C18210wN.A0e(this), A0i);
            return A0y.toString();
        } catch (JSONException unused) {
            return AnonymousClass00U.A0V("{\"", C18210wN.A0e(this), "\" : [\"ERROR\"]}");
        }
    }
}
