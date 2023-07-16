package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0oU  reason: invalid class name and case insensitive filesystem */
public final class C13900oU {
    static {
        C05260Sh.A02 = true;
    }

    public static Location A00(LocationManager locationManager, String str) {
        if (!C05260Sh.A01()) {
            return locationManager.getLastKnownLocation(str);
        }
        try {
            ReadWriteLock readWriteLock = C05260Sh.A01;
            readWriteLock.readLock().lock();
            Location C0i = C05260Sh.A00.C0i(locationManager, str);
            readWriteLock.readLock().unlock();
            C05260Sh.A00();
            return C0i;
        } catch (Throwable th) {
            C05260Sh.A01.readLock().unlock();
            C05260Sh.A00();
            throw th;
        }
    }

    public static void A01(LocationListener locationListener, LocationManager locationManager) {
        if (C05260Sh.A01()) {
            try {
                ReadWriteLock readWriteLock = C05260Sh.A01;
                readWriteLock.readLock().lock();
                AnonymousClass0Sg r0 = C05260Sh.A00;
                if (r0 != null) {
                    r0.CFm(locationListener, locationManager);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                C05260Sh.A01.readLock().unlock();
                throw th;
            }
        } else {
            locationManager.removeUpdates(locationListener);
        }
    }

    public static void A02(LocationListener locationListener, LocationManager locationManager, String str, float f, int i, long j) {
        LocationListener locationListener2 = locationListener;
        LocationManager locationManager2 = locationManager;
        String str2 = str;
        float f2 = f;
        long j2 = j;
        if (C05260Sh.A01()) {
            try {
                ReadWriteLock readWriteLock = C05260Sh.A01;
                readWriteLock.readLock().lock();
                AnonymousClass0Sg r2 = C05260Sh.A00;
                if (r2 != null) {
                    r2.CGT(locationListener2, locationManager2, str2, f2, i, j2);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                C05260Sh.A01.readLock().unlock();
                throw th;
            }
        } else {
            locationManager.requestLocationUpdates(str, j, f2, locationListener2);
        }
    }
}
