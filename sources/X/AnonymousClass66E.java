package X;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.66E  reason: invalid class name */
public final class AnonymousClass66E extends OutputStream {
    public final int A00;
    public final OutputStream A01;
    public final AtomicLong A02 = new AtomicLong(0);
    public volatile double A03;

    public AnonymousClass66E(OutputStream outputStream) {
        this.A01 = outputStream;
        this.A00 = 16000;
    }

    public final void close() {
        this.A01.close();
    }

    public final void write(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < ((i2 >> 1) << 1); i3 += 2) {
        }
        this.A02.addAndGet((long) (((i2 * 1000) >> 1) / this.A00));
        this.A01.write(bArr, i, i2);
    }

    public final void write(int i) {
        throw C18240wQ.A0j();
    }
}
