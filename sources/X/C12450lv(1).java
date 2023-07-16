package X;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0lv  reason: invalid class name and case insensitive filesystem */
public final class C12450lv implements AnonymousClass0vY {
    public JSONObject A00;
    public JSONObject A01;
    public final JSONObject A02;
    public final JSONArray A03;
    public final JSONObject A04;

    public final void DAl(int i) {
        this.A00 = null;
        JSONObject jSONObject = new JSONObject();
        this.A01 = jSONObject;
        try {
            this.A03.put(jSONObject);
            this.A01.put("marker_id", i);
        } catch (JSONException unused) {
        }
    }

    public static void A00(C12450lv r3, Object obj, String str) {
        if (r3.A01 != null) {
            try {
                if (r3.A00 == null) {
                    JSONObject jSONObject = new JSONObject();
                    r3.A00 = jSONObject;
                    r3.A01.put("annotations", jSONObject);
                }
                r3.A00.put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }

    public C12450lv() {
        JSONObject jSONObject = new JSONObject();
        this.A02 = jSONObject;
        JSONArray jSONArray = new JSONArray();
        this.A03 = jSONArray;
        JSONObject jSONObject2 = new JSONObject();
        this.A04 = jSONObject2;
        try {
            jSONObject.put("schema_version", "v2");
            jSONObject.put("inprogress_qpls", jSONArray);
            jSONObject.put("snapshot_attributes", jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public final void DAb(String str, Integer num) {
        A00(this, num, str);
    }

    public final void DAc(String str, String str2) {
        A00(this, str2, str);
    }
}
