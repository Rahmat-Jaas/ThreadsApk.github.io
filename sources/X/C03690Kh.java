package X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0Kh  reason: invalid class name and case insensitive filesystem */
public final class C03690Kh {
    public static C03690Kh A07;
    public static final long A08 = TimeUnit.MINUTES.toMillis(2);
    public long A00;
    public final Lock A01 = new ReentrantLock();
    public volatile StatFs A02 = null;
    public volatile StatFs A03 = null;
    public volatile File A04;
    public volatile File A05;
    public volatile boolean A06 = false;

    public static StatFs A00(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            if (statFs == null) {
                try {
                    return new StatFs(file.getAbsolutePath());
                } catch (IllegalArgumentException unused) {
                } catch (Throwable th) {
                    Class cls = Error.class;
                    if (!cls.isInstance(th)) {
                        cls = RuntimeException.class;
                        if (!cls.isInstance(th)) {
                            throw new RuntimeException(th);
                        }
                    }
                    throw ((Throwable) cls.cast(th));
                }
            } else {
                statFs.restat(file.getAbsolutePath());
                return statFs;
            }
        }
        return null;
    }

    public static synchronized C03690Kh A01() {
        C03690Kh r0;
        synchronized (C03690Kh.class) {
            r0 = A07;
            if (r0 == null) {
                r0 = new C03690Kh();
                A07 = r0;
            }
        }
        return r0;
    }

    private void A02() {
        this.A03 = A00(this.A03, this.A05);
        this.A02 = A00(this.A02, this.A04);
        this.A00 = SystemClock.uptimeMillis();
    }

    public static void A03(C03690Kh r2) {
        if (!r2.A06) {
            Lock lock = r2.A01;
            lock.lock();
            try {
                if (!r2.A06) {
                    r2.A05 = Environment.getDataDirectory();
                    r2.A04 = Environment.getExternalStorageDirectory();
                    r2.A02();
                    r2.A06 = true;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void A04(C03690Kh r6) {
        Lock lock = r6.A01;
        if (lock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - r6.A00 > A08) {
                    r6.A02();
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public final void A06() {
        Lock lock = this.A01;
        if (lock.tryLock()) {
            try {
                A03(this);
                A02();
            } finally {
                lock.unlock();
            }
        }
    }

    public final long A05() {
        A03(this);
        A04(this);
        StatFs statFs = this.A03;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0;
    }

    public final boolean A07() {
        if (A05() > 1048576000) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        if (A05() < OdexSchemeArtXdex.MIN_DISK_FREE_FOR_MIXED_MODE) {
            return true;
        }
        return false;
    }

    public final boolean A09() {
        if (A05() < 104857600) {
            return true;
        }
        return false;
    }
}
