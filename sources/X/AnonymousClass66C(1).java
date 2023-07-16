package X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: X.66C  reason: invalid class name */
public final class AnonymousClass66C extends InputStream {
    public BufferedOutputStream A00;
    public boolean A01 = true;
    public final File A02;
    public final File A03;
    public final InputStream A04;
    public final boolean A05;

    public final int available() {
        return this.A04.available();
    }

    public final void close() {
        try {
            BufferedOutputStream bufferedOutputStream = this.A00;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        } catch (Exception e) {
            this.A01 = false;
            if (this.A05) {
                AnonymousClass0LU.A0E("AtomicStreamWrapper", "swallowing error on close", e);
            } else {
                throw e;
            }
        }
        this.A04.close();
        if (this.A01) {
            File file = this.A03;
            if (file.exists() && file.length() >= 20) {
                file.renameTo(this.A02);
                return;
            }
        }
        this.A03.delete();
    }

    public final void mark(int i) {
        throw C18250wR.A0V("Operation not supported");
    }

    public final boolean markSupported() {
        throw C18250wR.A0V("Operation not supported");
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.A04.read(bArr, i, i2);
        if (read != -1) {
            try {
                BufferedOutputStream bufferedOutputStream = this.A00;
                if (bufferedOutputStream != null && this.A01) {
                    bufferedOutputStream.write(bArr, i, read);
                    return read;
                }
            } catch (Exception e) {
                this.A01 = false;
                if (this.A05) {
                    AnonymousClass0LU.A0E("AtomicStreamWrapper", "swallowing error on write", e);
                } else {
                    throw e;
                }
            }
        }
        return read;
    }

    public final void reset() {
        throw C18250wR.A0V("Operation not supported");
    }

    public final long skip(long j) {
        throw C18250wR.A0V("Operation not supported");
    }

    public AnonymousClass66C(File file, InputStream inputStream, boolean z) {
        this.A04 = inputStream;
        this.A02 = file;
        File A0Z = C86144wL.A0Z(AnonymousClass00U.A0L(file.getPath(), ".pending"));
        this.A03 = A0Z;
        this.A05 = z;
        try {
            this.A00 = new BufferedOutputStream(new FileOutputStream(A0Z));
        } catch (Exception e) {
            this.A01 = false;
            if (this.A05) {
                this.A00 = null;
                AnonymousClass0LU.A0E("AtomicStreamWrapper", "swallowing error on open", e);
                return;
            }
            throw e;
        }
    }

    public final int read(byte[] bArr) {
        int read = this.A04.read(bArr);
        if (read != -1) {
            try {
                BufferedOutputStream bufferedOutputStream = this.A00;
                if (bufferedOutputStream != null && this.A01) {
                    bufferedOutputStream.write(bArr, 0, read);
                    return read;
                }
            } catch (Exception e) {
                this.A01 = false;
                if (this.A05) {
                    AnonymousClass0LU.A0E("AtomicStreamWrapper", "swallowing error on write", e);
                } else {
                    throw e;
                }
            }
        }
        return read;
    }

    public final int read() {
        int read = this.A04.read();
        if (read != -1) {
            try {
                BufferedOutputStream bufferedOutputStream = this.A00;
                if (bufferedOutputStream != null && this.A01) {
                    bufferedOutputStream.write(read);
                    return read;
                }
            } catch (Exception e) {
                this.A01 = false;
                if (this.A05) {
                    AnonymousClass0LU.A0E("AtomicStreamWrapper", "swallowing error on write", e);
                } else {
                    throw e;
                }
            }
        }
        return read;
    }
}
