package X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: X.66A  reason: invalid class name */
public final class AnonymousClass66A extends InputStream {
    public BufferedOutputStream A00;
    public final File A01;
    public final InputStream A02;

    public final int available() {
        return this.A02.available();
    }

    public final void close() {
        this.A00.close();
        this.A02.close();
    }

    public final void mark(int i) {
        throw C18250wR.A0V("Operation not supported");
    }

    public final boolean markSupported() {
        throw C18250wR.A0V("Operation not supported");
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.A02.read(bArr, i, i2);
        if (read != -1) {
            this.A00.write(bArr, i, read);
        }
        return read;
    }

    public final void reset() {
        throw C18250wR.A0V("Operation not supported");
    }

    public final long skip(long j) {
        throw C18250wR.A0V("Operation not supported");
    }

    public AnonymousClass66A(File file, InputStream inputStream) {
        this.A02 = inputStream;
        this.A01 = file;
        this.A00 = new BufferedOutputStream(new FileOutputStream(file));
    }

    public final int read(byte[] bArr) {
        int read = this.A02.read(bArr);
        if (read != -1) {
            this.A00.write(bArr, 0, read);
        }
        return read;
    }

    public final int read() {
        int read = this.A02.read();
        if (read != -1) {
            this.A00.write(read);
        }
        return read;
    }
}
