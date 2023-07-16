package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.75d  reason: invalid class name and case insensitive filesystem */
public final class C1193975d {
    public final Map A00;
    public final C02910Dj A01;

    public C1193975d(Map map, C02910Dj r3) {
        this.A00 = Collections.unmodifiableMap(map);
        this.A01 = r3;
    }

    public static C134857yU A00(C134857yU r2) {
        try {
            return C134857yU.A00(MessageDigest.getInstance("SHA-1").digest(r2.A01()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
