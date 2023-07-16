package X;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0L5  reason: invalid class name */
public abstract class AnonymousClass0L5 {
    public final List A00 = new LinkedList();

    public abstract AnonymousClass0K0 A00();

    public abstract void A01();

    public abstract void A02();

    public final synchronized void A03(JSONObject jSONObject) {
        for (C03650Kd r2 : this.A00) {
            try {
                String AwU = r2.AwU();
                if (!TextUtils.isEmpty(AwU)) {
                    jSONObject.put("host_name_v6", AwU);
                }
                String AQd = r2.AQd();
                if (!TextUtils.isEmpty(AQd)) {
                    jSONObject.put("analytics_endpoint", AQd);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
