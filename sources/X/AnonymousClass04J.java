package X;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.04J  reason: invalid class name */
public final class AnonymousClass04J implements C02940Dm {
    public final /* bridge */ /* synthetic */ void Cdb(AnonymousClass0DW r11, C02930Dl r12) {
        AnonymousClass09D r112 = (AnonymousClass09D) r11;
        long j = r112.A00;
        if (j != 0) {
            r12.A5S("coarse_time_ms", j);
        }
        long j2 = r112.A02;
        if (j2 != 0) {
            r12.A5S("medium_time_ms", j2);
        }
        long j3 = r112.A01;
        if (j3 != 0) {
            r12.A5S("fine_time_ms", j3);
        }
        long j4 = r112.A03;
        if (j4 != 0) {
            r12.A5S("wifi_scan_count", j4);
        }
        if (r112.A04) {
            C002000x r8 = r112.A05;
            if (!r8.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    int size = r8.size();
                    for (int i = 0; i < size; i++) {
                        Object[] objArr = r8.A02;
                        C02850Dd r9 = (C02850Dd) objArr[(i << 1) + 1];
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("coarse_time_ms", r9.A00);
                        jSONObject2.put("medium_time_ms", r9.A02);
                        jSONObject2.put("fine_time_ms", r9.A01);
                        jSONObject.put((String) objArr[i << 1], jSONObject2);
                    }
                    r12.A5T("location_tag_time_ms", jSONObject.toString());
                } catch (JSONException e) {
                    Log.e("LocationMetrics", "Failed to serialize attribution data", e);
                }
            }
        }
    }
}
