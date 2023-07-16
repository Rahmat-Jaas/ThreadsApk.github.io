package X;

import android.os.StatFs;
import java.io.File;
import java.util.Map;

/* renamed from: X.6Hq  reason: invalid class name and case insensitive filesystem */
public final class C98976Hq {
    public static final void A00(File file, String str, Map map) {
        if (file != null && file.exists()) {
            StatFs statFs = new StatFs(file.getPath());
            map.put(str, new AnonymousClass7i2(statFs.getAvailableBytes(), statFs.getFreeBytes(), statFs.getTotalBytes()));
        }
    }
}
