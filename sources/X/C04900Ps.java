package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Ps  reason: invalid class name and case insensitive filesystem */
public final class C04900Ps {
    public final Object A00 = new Object();
    public final Map A01 = new HashMap();

    public final boolean A00(String str) {
        Map map;
        Long l;
        Object obj = this.A00;
        synchronized (obj) {
            map = this.A01;
            l = (Long) map.get(str);
        }
        if (l == null) {
            l = 0L;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long longValue = l.longValue();
        if (longValue == 0) {
            synchronized (obj) {
                map.put(str, Long.valueOf(uptimeMillis));
            }
        }
        if (longValue > uptimeMillis) {
            return true;
        }
        if (uptimeMillis - longValue >= 3000) {
            return false;
        }
        long j = (longValue + 3000) - uptimeMillis;
        synchronized (obj) {
            map.put(str, Long.valueOf(uptimeMillis + j));
        }
        try {
            Thread.sleep(j);
            return false;
        } catch (InterruptedException unused) {
            C04790Pd.A00();
            return false;
        }
    }
}
