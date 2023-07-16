package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.0DD  reason: invalid class name */
public final class AnonymousClass0DD extends FilterInputStream {
    public long A00 = 0;

    public AnonymousClass0DD(InputStream inputStream) {
        super(inputStream);
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            long j = this.A00;
            if (j >= 0) {
                this.A00 = j + 1;
            }
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read > 0) {
            long j = this.A00;
            if (j >= 0) {
                this.A00 = j + ((long) read);
            }
        }
        return read;
    }
}
