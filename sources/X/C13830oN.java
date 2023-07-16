package X;

import android.telephony.TelephonyManager;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0oN  reason: invalid class name and case insensitive filesystem */
public final class C13830oN {
    static {
        C05260Sh.A02 = true;
    }

    public static List A00(TelephonyManager telephonyManager) {
        if (!C05260Sh.A01()) {
            return telephonyManager.getAllCellInfo();
        }
        try {
            ReadWriteLock readWriteLock = C05260Sh.A01;
            readWriteLock.readLock().lock();
            AnonymousClass0Sg r0 = C05260Sh.A00;
            if (r0 != null) {
                List C0e = r0.C0e(telephonyManager);
                readWriteLock.readLock().unlock();
                return C0e;
            }
            readWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th) {
            C05260Sh.A01.readLock().unlock();
            throw th;
        }
    }
}
