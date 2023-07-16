package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* renamed from: X.5rj  reason: invalid class name and case insensitive filesystem */
public final class C93815rj extends C111536nq {
    public boolean A00;
    public final int A01;
    public final ByteBuffer A02;
    public final MessageDigest A03;

    public C93815rj(MessageDigest messageDigest, int i) {
        this();
        this.A03 = messageDigest;
        this.A01 = i;
    }

    public C93815rj() {
        this.A02 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }
}
