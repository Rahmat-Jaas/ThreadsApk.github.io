package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0D4  reason: invalid class name */
public final class AnonymousClass0D4 extends InputStream {
    public IOException A00 = null;
    public InputStream A01;
    public final AnonymousClass0U0 A02;

    public AnonymousClass0D4(InputStream inputStream, int i) {
        this.A01 = inputStream;
        this.A02 = new AnonymousClass0U0(i);
    }

    public final int available() {
        Throwable th;
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            th = this.A00;
            if (th == null) {
                return inputStream.available();
            }
        } else {
            th = new C02330As("Stream closed");
        }
        throw th;
    }

    public final void close() {
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.A01 = null;
            }
        }
    }

    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        Throwable th;
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            th = this.A00;
            if (th == null) {
                try {
                    int read = inputStream.read(bArr, i, i2);
                    if (read == -1) {
                        return -1;
                    }
                    AnonymousClass0U0 r5 = this.A02;
                    int i3 = read + i;
                    while (i < i3) {
                        byte b = bArr[i];
                        byte[] bArr2 = r5.A02;
                        int i4 = r5.A01;
                        int i5 = r5.A00;
                        byte b2 = (byte) (b + bArr2[(i4 + i5) & 255]);
                        bArr[i] = b2;
                        r5.A00 = i5 - 1;
                        bArr2[i5 & 255] = b2;
                        i++;
                    }
                    return read;
                } catch (IOException e) {
                    this.A00 = e;
                    throw e;
                }
            }
        } else {
            th = new C02330As("Stream closed");
        }
        throw th;
    }
}
