package X;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0m2  reason: invalid class name and case insensitive filesystem */
public final class C12510m2 implements Runnable {
    public final /* synthetic */ C12310lg A00;

    public C12510m2(C12310lg r1) {
        this.A00 = r1;
    }

    public final void run() {
        C12310lg r7 = this.A00;
        C12250la r6 = r7.A02;
        Map map = r6.A04;
        String str = "";
        if (!map.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            try {
                long j = r6.A01;
                r6.A01 = 1 + j;
                jSONObject.put("seq", j);
                jSONObject.put("time", C14740q4.A00(System.currentTimeMillis()));
                JSONArray jSONArray = new JSONArray();
                for (C14540pc A01 : map.values()) {
                    jSONArray.put(A01.A01());
                }
                jSONObject.put("data", jSONArray);
                jSONObject.put("log_type", "client_event");
                jSONObject.put("app_id", "567310203415052");
                jSONObject.put("app_ver", r6.A02);
                jSONObject.put("build_num", r6.A03);
                jSONObject.put(AnonymousClass00T.A00(9, 10, 118), r6.A05);
                str = jSONObject.toString();
            } catch (JSONException e) {
                AnonymousClass0LU.A0H("CounterSession", "Failed to serialize", e);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            int A002 = r7.A01.A00(str);
            if (A002 == 200) {
                map.clear();
                r6.A00 = 0;
                return;
            }
            AnonymousClass0LU.A0N("CounterAnalytics", "Unsuccessful upload. response code=%d", Integer.valueOf(A002));
        }
    }
}
