package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.5ri  reason: invalid class name and case insensitive filesystem */
public final class C93805ri extends AnonymousClass6r6 implements Serializable {
    public final int A00;
    public final MessageDigest A01;
    public final boolean A02;
    public final String A03;

    public C93805ri() {
        boolean z;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            this.A01 = instance;
            this.A00 = instance.getDigestLength();
            this.A03 = "Hashing.sha256()";
            try {
                instance.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.A02 = z;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.A03;
    }
}
