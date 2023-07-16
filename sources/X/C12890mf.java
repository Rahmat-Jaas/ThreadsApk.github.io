package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0mf  reason: invalid class name and case insensitive filesystem */
public abstract class C12890mf implements AnonymousClass0LD {
    public int A00 = ((int) (System.currentTimeMillis() / 86400000));
    public long A01 = SystemClock.elapsedRealtime();
    public SharedPreferences A02;
    public final String A03;
    public final Context A04;
    public final RealtimeSinceBootClock A05;
    public final C12830mZ A06;
    public final String A07;
    public final HashMap A08 = new HashMap();
    public final boolean A09;

    private synchronized void A01() {
        if (this.A02 == null) {
            this.A02 = this.A04.getSharedPreferences(AnonymousClass00U.A0d("rti.mqtt.counter.", this.A07, ".", this.A03), 0);
        }
    }

    private void A00() {
        HashMap hashMap;
        if (this.A09) {
            HashMap hashMap2 = this.A08;
            synchronized (hashMap2) {
                hashMap = new HashMap(hashMap2);
                hashMap2.clear();
            }
            if (!hashMap.isEmpty()) {
                A01();
                SharedPreferences.Editor edit = this.A02.edit();
                for (Map.Entry entry : hashMap.entrySet()) {
                    edit.putLong((String) entry.getKey(), this.A02.getLong((String) entry.getKey(), 0) + ((Number) entry.getValue()).longValue());
                }
                edit.apply();
                this.A01 = SystemClock.elapsedRealtime();
            }
        }
    }

    public C12890mf(Context context, RealtimeSinceBootClock realtimeSinceBootClock, C12830mZ r7, String str, String str2, boolean z) {
        this.A04 = context;
        this.A07 = str;
        this.A06 = r7;
        this.A05 = realtimeSinceBootClock;
        this.A03 = str2;
        this.A09 = z;
    }

    public final JSONObject A02(boolean z) {
        int indexOf;
        A01();
        JSONObject jSONObject = new JSONObject();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
        Map<String, ?> all = this.A02.getAll();
        SharedPreferences.Editor edit = this.A02.edit();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            int i = 0;
            if (str != null && (indexOf = str.indexOf(".")) > 0) {
                try {
                    i = Integer.parseInt(str.substring(0, indexOf));
                } catch (NumberFormatException unused) {
                }
            }
            if (i <= currentTimeMillis && i + 3 >= currentTimeMillis) {
                if (z) {
                    jSONObject.putOpt((String) next.getKey(), next.getValue());
                } else if (i != currentTimeMillis) {
                    jSONObject.putOpt((String) next.getKey(), next.getValue());
                }
            }
            edit.remove((String) next.getKey());
        }
        edit.apply();
        if (jSONObject.length() == 0) {
            return null;
        }
        if (!z) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("period_ms", System.currentTimeMillis() % 86400000);
        jSONObject2.put("data", jSONObject);
        return jSONObject2;
    }

    public final void A03(long j, String... strArr) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
        if (this.A00 != currentTimeMillis) {
            this.A00 = currentTimeMillis;
            A00();
        }
        String valueOf = String.valueOf(currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf);
        for (String append : strArr) {
            sb.append(".");
            sb.append(append);
        }
        String obj = sb.toString();
        HashMap hashMap = this.A08;
        synchronized (hashMap) {
            Long l = (Long) hashMap.get(obj);
            if (l == null) {
                l = 0L;
            }
            hashMap.put(obj, Long.valueOf(l.longValue() + j));
        }
        if (SystemClock.elapsedRealtime() - this.A01 > 3600000) {
            A00();
        }
    }
}
