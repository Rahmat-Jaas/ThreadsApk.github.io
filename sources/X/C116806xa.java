package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6xa  reason: invalid class name and case insensitive filesystem */
public final class C116806xa {
    public static final Object A00(String str, AnonymousClass0W7 r2, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        if (r2.equals(C18210wN.A0l(Long.TYPE))) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (!r2.equals(C18210wN.A0l(ArrayList.class))) {
            return jSONObject.get(str);
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int length = jSONArray.length();
        for (int i = 0; i < length; i = C86154wM.A07(A0v, jSONArray, i)) {
        }
        return A0v;
    }

    public static final ArrayList A01(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            C86144wL.A1U(A0v, jSONArray.getLong(i));
        }
        return A0v;
    }
}
