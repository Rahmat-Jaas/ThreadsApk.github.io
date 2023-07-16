package X;

import android.os.PowerManager;
import android.util.Log;

/* renamed from: X.0oF  reason: invalid class name and case insensitive filesystem */
public final class C13750oF {
    public static void A03(PowerManager.WakeLock wakeLock) {
        wakeLock.setReferenceCounted(false);
        C014306p r3 = AnonymousClass0DB.A00;
        synchronized (r3) {
            C02920Dk r0 = (C02920Dk) r3.A06.get(wakeLock);
            if (r0 == null) {
                Log.e("WakeLockMetricsCollector", "Unknown wakelock modified", (Throwable) null);
            } else {
                r0.A06 = false;
            }
        }
    }

    public static PowerManager.WakeLock A00(PowerManager powerManager, String str, int i) {
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
        C014306p r2 = AnonymousClass0DB.A00;
        synchronized (r2) {
            C02920Dk r1 = new C02920Dk(newWakeLock, str);
            r2.A06.put(newWakeLock, r1);
            r2.A05.add(r1);
        }
        return newWakeLock;
    }

    public static void A01(PowerManager.WakeLock wakeLock) {
        wakeLock.acquire();
        AnonymousClass0DB.A01(wakeLock, -1);
    }

    public static void A02(PowerManager.WakeLock wakeLock) {
        wakeLock.release();
        AnonymousClass0DB.A00(wakeLock);
    }
}
