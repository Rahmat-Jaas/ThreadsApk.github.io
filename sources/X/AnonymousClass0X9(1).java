package X;

import org.json.JSONArray;

/* renamed from: X.0X9  reason: invalid class name */
public final class AnonymousClass0X9 {
    public static JSONArray A00(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String put : strArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static String[] A01(JSONArray jSONArray) {
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }
}
