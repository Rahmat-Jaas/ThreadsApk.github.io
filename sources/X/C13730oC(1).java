package X;

import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: X.0oC  reason: invalid class name and case insensitive filesystem */
public final class C13730oC {
    public static String A00;

    public static synchronized String A00() {
        String str;
        synchronized (C13730oC.class) {
            str = A00;
            if (str == null) {
                SecureRandom secureRandom = new SecureRandom();
                str = new UUID(secureRandom.nextLong() ^ System.currentTimeMillis(), secureRandom.nextLong()).toString();
                A00 = str;
            }
        }
        return str;
    }
}
