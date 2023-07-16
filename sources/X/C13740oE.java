package X;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0oE  reason: invalid class name and case insensitive filesystem */
public final class C13740oE {
    static {
        C05260Sh.A02 = true;
    }

    public static WifiInfo A00(WifiManager wifiManager) {
        WifiInfo wifiInfo;
        if (!C05260Sh.A01()) {
            return wifiManager.getConnectionInfo();
        }
        try {
            ReadWriteLock readWriteLock = C05260Sh.A01;
            readWriteLock.readLock().lock();
            AnonymousClass0Sg r0 = C05260Sh.A00;
            if (r0 != null) {
                wifiInfo = r0.C0f(wifiManager);
            } else {
                wifiInfo = null;
            }
            readWriteLock.readLock().unlock();
            return wifiInfo;
        } catch (Throwable th) {
            C05260Sh.A01.readLock().unlock();
            throw th;
        }
    }
}
