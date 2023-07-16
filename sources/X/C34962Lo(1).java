package X;

import android.os.Environment;
import android.os.StatFs;
import android.util.LruCache;

/* renamed from: X.2Lo  reason: invalid class name and case insensitive filesystem */
public final class C34962Lo {
    public static final LruCache A00() {
        long j = (long) 10;
        if (new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() / j <= 10000000) {
            return null;
        }
        long availableBytes = new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() / j;
        if (availableBytes > 100000000) {
            availableBytes = 100000000;
        }
        return new C18740xo((int) availableBytes);
    }
}
