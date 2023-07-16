package X;

import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0o7  reason: invalid class name and case insensitive filesystem */
public final class C13680o7 {
    public long A00;
    public final long A01;
    public final Intent A02;
    public final C09740gb A03;
    public final C09740gb A04;
    public final C09740gb A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public static C13680o7 A00(Object obj) {
        C09740gb r7;
        C09740gb r8;
        C09740gb r9;
        try {
            String str = (String) obj;
            if (str.length() > 50000) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            Intent parseUri = Intent.parseUri(jSONObject.getString("key_intent"), 0);
            String string = jSONObject.getString("key_notifid");
            long j = jSONObject.getLong("key_timestamp_received");
            long j2 = jSONObject.getLong("key_timestamp_last_retried");
            if (jSONObject.has("key_log_event")) {
                Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("key_log_event"));
                valueOf.getClass();
                r7 = new C12760mR(valueOf);
            } else {
                r7 = C12730mO.A00;
            }
            if (jSONObject.has("key_queue_time_ms")) {
                Long valueOf2 = Long.valueOf(jSONObject.getLong("key_queue_time_ms"));
                valueOf2.getClass();
                r8 = new C12760mR(valueOf2);
            } else {
                r8 = C12730mO.A00;
            }
            String optString = jSONObject.optString("key_job_id");
            String optString2 = jSONObject.optString("key_source");
            if (jSONObject.has("key_mqtt_process_time_ms")) {
                Long valueOf3 = Long.valueOf(jSONObject.getLong("key_mqtt_process_time_ms"));
                valueOf3.getClass();
                r9 = new C12760mR(valueOf3);
            } else {
                r9 = C12730mO.A00;
            }
            return new C13680o7(parseUri, r7, r8, r9, string, optString, optString2, j, j2);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String A01() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_intent", this.A02.toUri(0));
            jSONObject.putOpt("key_notifid", this.A07);
            jSONObject.putOpt("key_timestamp_received", Long.valueOf(this.A01));
            jSONObject.putOpt("key_timestamp_last_retried", Long.valueOf(this.A00));
            C09740gb r2 = this.A03;
            if (r2.A01()) {
                jSONObject.putOpt("key_log_event", r2.A00());
            }
            jSONObject.putOpt("key_job_id", this.A06);
            jSONObject.putOpt("key_source", this.A08);
            C09740gb r22 = this.A05;
            if (r22.A01()) {
                jSONObject.putOpt("key_queue_time_ms", r22.A00());
            }
            C09740gb r23 = this.A04;
            if (r23.A01()) {
                jSONObject.putOpt("key_mqtt_process_time_ms", r23.A00());
            }
            String obj = jSONObject.toString();
            int length = obj.length();
            if (length <= 50000) {
                return obj;
            }
            throw new IllegalStateException(AnonymousClass00U.A0J("Payload size limit exceeded with ", length));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public C13680o7(Intent intent, C09740gb r2, C09740gb r3, C09740gb r4, String str, String str2, String str3, long j, long j2) {
        this.A02 = intent;
        this.A07 = str;
        this.A03 = r2;
        this.A05 = r3;
        this.A06 = str2;
        this.A08 = str3;
        this.A04 = r4;
        this.A01 = j;
        this.A00 = j2;
    }
}
