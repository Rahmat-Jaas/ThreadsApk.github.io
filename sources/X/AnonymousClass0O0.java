package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.0O0  reason: invalid class name */
public final class AnonymousClass0O0 extends InputStream {
    public ByteBuffer A00;

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.A00;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    public AnonymousClass0O0(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public final int read() {
        ByteBuffer byteBuffer = this.A00;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        return byteBuffer.get() & 255;
    }
}
