package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0UD  reason: invalid class name */
public final class AnonymousClass0UD {
    public static int A00;
    public static AnonymousClass0UA A01;
    public static AnonymousClass0UB[] A02 = new AnonymousClass0UB[8];
    public static final List A03 = Arrays.asList(new String[]{"com.android.", "com.google.android."});
    public static final List A04 = Arrays.asList(new String[]{"media", "mms", "mms-sms", "sms"});

    public static void A00(String str, int i, Integer num) {
        AnonymousClass0UA r3;
        AnonymousClass0UB[] r2;
        int i2;
        synchronized (AnonymousClass0UD.class) {
            r3 = A01;
            r2 = A02;
            i2 = A00;
            if (r2 != null) {
                A00 = i2 + 1;
            }
        }
        if (r3 != null) {
            r3.A00(str, i, num);
        } else if (r2 != null && i2 < r2.length) {
            r2[i2] = new AnonymousClass0UB(str, i, num);
        }
    }
}
