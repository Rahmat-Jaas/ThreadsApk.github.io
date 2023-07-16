package X;

import java.security.KeyPair;
import java.security.PublicKey;

/* renamed from: X.6rn  reason: invalid class name and case insensitive filesystem */
public final class C113606rn {
    public final long A00;
    public final KeyPair A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C113606rn)) {
            return false;
        }
        C113606rn r7 = (C113606rn) obj;
        if (this.A00 != r7.A00) {
            return false;
        }
        KeyPair keyPair = this.A01;
        PublicKey publicKey = keyPair.getPublic();
        KeyPair keyPair2 = r7.A01;
        if (!publicKey.equals(keyPair2.getPublic()) || !keyPair.getPrivate().equals(keyPair2.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        KeyPair keyPair = this.A01;
        return C86124wJ.A0I(keyPair.getPublic(), keyPair.getPrivate(), Long.valueOf(this.A00));
    }

    public C113606rn(KeyPair keyPair, long j) {
        this.A01 = keyPair;
        this.A00 = j;
    }
}
