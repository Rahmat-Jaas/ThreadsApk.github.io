package X;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.03x  reason: invalid class name and case insensitive filesystem */
public final class C008803x implements C02940Dm {
    public boolean A00 = true;

    public final /* bridge */ /* synthetic */ void Cdb(AnonymousClass0DW r6, C02930Dl r7) {
        AnonymousClass076 r62 = (AnonymousClass076) r6;
        long j = r62.A01;
        if (j != 0) {
            r7.A5S("wakelock_held_time_ms", j);
        }
        long j2 = r62.A00;
        if (j2 != 0) {
            r7.A5S("wakelock_acquired_count", j2);
        }
        if (this.A00) {
            try {
                JSONObject A04 = r62.A04();
                if (A04 != null) {
                    r7.A5T("wakelock_tag_time_ms", A04.toString());
                }
            } catch (JSONException e) {
                Log.e("WakeLockMetricsReporter", "Failed to serialize wakelock attribution data", e);
            }
        }
    }
}
