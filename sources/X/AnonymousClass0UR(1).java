package X;

import java.security.MessageDigest;

/* renamed from: X.0UR  reason: invalid class name */
public final class AnonymousClass0UR extends AnonymousClass0AN {
    public final MessageDigest A00 = MessageDigest.getInstance("SHA-256");

    public AnonymousClass0UR() {
        this.A00 = 32;
        this.A01 = "SHA-256";
    }

    public final void A00(byte[] bArr, int i, int i2) {
        this.A00.update(bArr, i, i2);
    }

    public final byte[] A01() {
        MessageDigest messageDigest = this.A00;
        byte[] digest = messageDigest.digest();
        messageDigest.reset();
        return digest;
    }
}
