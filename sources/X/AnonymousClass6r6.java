package X;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.6r6  reason: invalid class name */
public abstract class AnonymousClass6r6 {
    public final C111536nq A00() {
        C93805ri r3 = (C93805ri) this;
        if (r3.A02) {
            try {
                return new C93815rj((MessageDigest) r3.A01.clone(), r3.A00);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new C93815rj(MessageDigest.getInstance(r3.A01.getAlgorithm()), r3.A00);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final AnonymousClass796 A01(CharSequence charSequence, Charset charset) {
        C111536nq A00 = A00();
        byte[] bytes = charSequence.toString().getBytes(charset);
        bytes.getClass();
        AnonymousClass7Ko.A06((C93815rj) A00, bytes, 0, bytes.length);
        return A00.A00();
    }
}
