package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.0pK  reason: invalid class name and case insensitive filesystem */
public final class C14390pK {
    public static volatile boolean A00;

    public static long A00(long j) {
        if ((1 & C14220p1.A02) != 0 && !A00) {
            A00 = true;
            Systrace.A08(1, "fburl.com/fbsystrace", 1000);
            Systrace.A08(1, "USE fbsystrace", 1000);
            Systrace.A08(1, "DO NOT USE systrace", 1000);
        } else if (A00 && (1 & C14220p1.A02) == 0) {
            A00 = false;
        }
        return j - System.nanoTime();
    }
}
