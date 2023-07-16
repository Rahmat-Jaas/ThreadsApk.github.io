package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.3Xc  reason: invalid class name and case insensitive filesystem */
public final class C62093Xc {
    public static final C62093Xc A04 = new C62093Xc();
    public String A00 = null;
    public final C03710Kk A01 = AwakeTimeSinceBootClock.INSTANCE;
    public final AtomicLong A02 = new AtomicLong(-1);
    public final AtomicLong A03 = new AtomicLong(-1);

    public static long A00(C62093Xc r11, long j) {
        long j2 = r11.A03.get();
        long j3 = r11.A02.get();
        if (j2 > 0) {
            long j4 = j - j2;
            if (j4 >= 0 && j4 <= 2000) {
                return j2;
            }
        }
        if (j3 <= 0) {
            return -1;
        }
        long j5 = j - j3;
        if (j5 < 0 || j5 > 2000) {
            return -1;
        }
        return j3;
    }
}
