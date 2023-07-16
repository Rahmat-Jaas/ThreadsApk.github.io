package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2FP  reason: invalid class name */
public final class AnonymousClass2FP {
    public static final void A00(AnonymousClass4TI... r7) {
        Locale locale = Locale.US;
        C04220Ms.A06(String.format(locale, "Initialization %d initializers sequentially", Arrays.copyOf(new Object[]{Integer.valueOf(r5)}, 1)));
        for (AnonymousClass4TI r3 : r7) {
            if (!r3.A02) {
                AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
                r3.A01 = awakeTimeSinceBootClock.now();
                r3.A03();
                r3.A00 = awakeTimeSinceBootClock.now();
                r3.A02 = true;
            }
        }
    }
}
