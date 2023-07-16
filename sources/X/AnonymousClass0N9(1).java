package X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.0N9  reason: invalid class name */
public final class AnonymousClass0N9 {
    public static long A00 = 1;

    public static synchronized long A01() {
        long j;
        synchronized (AnonymousClass0N9.class) {
            j = A00;
            if (j == 1) {
                j = new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes();
                A00 = j;
            }
        }
        return j;
    }

    public static long A00() {
        return Math.max(0, new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes());
    }
}
