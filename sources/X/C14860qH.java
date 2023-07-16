package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0qH  reason: invalid class name and case insensitive filesystem */
public final class C14860qH extends InputStream {
    public int A00;
    public final /* synthetic */ C11020jL A01;

    public C14860qH(C11020jL r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void close() {
        while (true) {
            int i = this.A00;
            if (i > 0) {
                skip((long) i);
            } else {
                return;
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 > 0 && this.A00 == 0) {
            return -1;
        }
        int read = this.A01.A01.read(bArr, i, Math.min(this.A00, i2));
        if (read <= 0) {
            return read;
        }
        this.A00 -= read;
        return read;
    }

    public final int available() {
        return this.A00;
    }

    public final int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A01.A01.read();
        if (read != -1) {
            this.A00--;
            return read;
        }
        throw new IOException("compressed stream terminated prematurely");
    }
}
