package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.66B  reason: invalid class name */
public final class AnonymousClass66B extends InputStream {
    public boolean A00;
    public final C130597qL A01;
    public final ByteArrayOutputStream A02 = new ByteArrayOutputStream();
    public final InputStream A03;

    public final int available() {
        try {
            return this.A03.available();
        } catch (IOException e) {
            AnonymousClass0LU.A0B("AtomicStreamDeferWrapper", "Exception on available input stream");
            throw e;
        }
    }

    public final void close() {
        try {
            this.A03.close();
            if (!this.A00) {
                C130597qL r5 = this.A01;
                ByteArrayOutputStream byteArrayOutputStream = this.A02;
                C04220Ms.A0B(byteArrayOutputStream, 0);
                if (C63803iN.A0E(AnonymousClass0TJ.A05, r5.A02, 36327396030556162L)) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = r5.A00;
                        if (byteArrayOutputStream2 != null) {
                            byteArrayOutputStream2.close();
                        }
                    } catch (IOException e) {
                        AnonymousClass0LU.A0E("FirstPageOnlyDeferStrategy", "Exception on close ByteArrayOutputStream", e);
                    }
                    r5.A00 = byteArrayOutputStream;
                } else {
                    C130597qL.A00(r5, byteArrayOutputStream);
                }
                this.A00 = true;
            }
        } catch (IOException e2) {
            AnonymousClass0LU.A0B("AtomicStreamDeferWrapper", "Exception on close input stream");
            throw e2;
        }
    }

    public final void mark(int i) {
        throw C18250wR.A0V("Operation not supported");
    }

    public final boolean markSupported() {
        throw C18250wR.A0V("Operation not supported");
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.A03.read(bArr, i, i2);
            if (!(read == -1 || bArr == null)) {
                this.A02.write(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            AnonymousClass0LU.A0B("AtomicStreamDeferWrapper", "Exception on read response input stream");
            throw e;
        }
    }

    public final void reset() {
        throw C18250wR.A0V("Operation not supported");
    }

    public final long skip(long j) {
        throw C18250wR.A0V("Operation not supported");
    }

    public AnonymousClass66B(C130597qL r2, InputStream inputStream) {
        this.A03 = inputStream;
        this.A01 = r2;
    }

    public final int read(byte[] bArr) {
        try {
            int read = this.A03.read(bArr);
            if (!(read == -1 || bArr == null)) {
                this.A02.write(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            AnonymousClass0LU.A0B("AtomicStreamDeferWrapper", "Exception on read response input stream");
            throw e;
        }
    }

    public final int read() {
        try {
            int read = this.A03.read();
            if (read != -1) {
                this.A02.write(read);
            }
            return read;
        } catch (IOException e) {
            AnonymousClass0LU.A0B("AtomicStreamDeferWrapper", "Exception on read response input stream");
            throw e;
        }
    }
}
