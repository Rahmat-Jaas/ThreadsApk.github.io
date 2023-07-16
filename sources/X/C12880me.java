package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0me  reason: invalid class name and case insensitive filesystem */
public abstract class C12880me implements AnonymousClass0LD {
    public final String A00;
    public final HashMap A01 = new HashMap();

    public final synchronized Object A00(AnonymousClass0LJ r5) {
        HashMap hashMap;
        try {
            hashMap = this.A01;
            if (!hashMap.containsKey(r5)) {
                hashMap.put(r5, r5.BKP().newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(String.format("Incorrect usage for %s type %s", new Object[]{r5.Aqm(), r5.BKP()}), e);
        }
        return hashMap.get(r5);
    }

    public synchronized JSONObject A01(boolean z, boolean z2) {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.A01.entrySet()) {
            jSONObject.putOpt(((AnonymousClass0LJ) entry.getKey()).Aqm(), entry.getValue());
        }
        return jSONObject;
    }

    public final synchronized void A02(AnonymousClass0LJ r2, Object obj) {
        this.A01.put(r2, obj);
    }

    public final String toString() {
        try {
            return A01(false, false).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public C12880me(String str) {
        this.A00 = str;
    }
}
