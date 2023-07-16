package X;

import com.facebook.papaya.store.encryptor.otp.Encryptor;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.748  reason: invalid class name */
public final class AnonymousClass748 {
    public static ImmutableMap A00;
    public static String A01;
    public static boolean A02;

    public static synchronized void A00() {
        synchronized (AnonymousClass748.class) {
            if (!A02) {
                A01 = "encryptor1";
                A00 = ImmutableMap.of("encryptor1", new Encryptor(C02720Cp.A00(), A01));
                A02 = true;
            }
        }
    }
}
