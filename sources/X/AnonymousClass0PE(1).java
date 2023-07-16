package X;

import java.util.Map;
import java.util.Random;

/* renamed from: X.0PE  reason: invalid class name */
public final class AnonymousClass0PE {
    public static long A00 = -2;
    public static long A01 = -2;
    public static long A02 = -2;
    public static long A03 = -2;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static final AnonymousClass0K9 A07 = new AnonymousClass0K9("ActivityThreadDataCollector");

    public static void A00(Throwable th, String str, Object... objArr) {
        Random random = AnonymousClass0KE.A00;
        if (random == null) {
            random = new Random(System.currentTimeMillis() ^ ((long) new Object().hashCode()));
            AnonymousClass0KE.A00 = random;
        }
        Throwable th2 = th;
        String str2 = str;
        Object[] objArr2 = objArr;
        if (random.nextInt(1000) == 1) {
            String format = String.format(str, objArr);
            A07.A09(th2, "Sending Direct SoftErrorReport for errmsg: %s", format);
            AnonymousClass0NW.A00((String) null, (String) null, (String) null, (String) null, "android_reliability_on_pause_hooking", format, th2, (Map) null);
            return;
        }
        A07.A05(str2, th2, objArr2, 6, 2);
    }
}
