package X;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.7DT  reason: invalid class name */
public final class AnonymousClass7DT {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;

    public AnonymousClass7DT(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
    }

    public AnonymousClass7DT(Cipher cipher) {
        this.A01 = cipher;
        this.A00 = null;
        this.A02 = null;
    }

    public AnonymousClass7DT(Mac mac) {
        this.A02 = mac;
        this.A01 = null;
        this.A00 = null;
    }
}
