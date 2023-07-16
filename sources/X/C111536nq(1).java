package X;

import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.6nq  reason: invalid class name and case insensitive filesystem */
public abstract class C111536nq {
    public final AnonymousClass796 A00() {
        C93815rj r3 = (C93815rj) this;
        AnonymousClass7Ko.A0E(!r3.A00, "Cannot re-use a Hasher after calling hash() on it");
        r3.A00 = true;
        int i = r3.A01;
        MessageDigest messageDigest = r3.A03;
        int digestLength = messageDigest.getDigestLength();
        byte[] digest = messageDigest.digest();
        if (i != digestLength) {
            digest = Arrays.copyOf(digest, i);
        }
        return new C93825rk(digest);
    }
}
