package X;

import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.io.InputStream;

/* renamed from: X.0oV  reason: invalid class name and case insensitive filesystem */
public final class C13910oV extends InputStream {
    public int A00;
    public InputStream A01;

    public final synchronized void mark(int i) {
        this.A01.mark(i);
    }

    public final synchronized void reset() {
        this.A01.reset();
    }

    public final int available() {
        return this.A01.available();
    }

    public final void close() {
        this.A01.close();
    }

    public final boolean markSupported() {
        return this.A01.markSupported();
    }

    public final int read(byte[] bArr) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A08 = externalProvider.A08();
        int i = this.A00;
        int A002 = A08.A00(6, 11, i, 0, 0);
        try {
            return this.A01.read(bArr);
        } finally {
            externalProvider.A08().A00(6, 8, i, A002, 0);
        }
    }

    public final long skip(long j) {
        return this.A01.skip(j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputStreamWrapper for ");
        sb.append(this.A01);
        return sb.toString();
    }

    public C13910oV(InputStream inputStream, int i) {
        this.A01 = inputStream;
        this.A00 = i;
    }

    public final int read(byte[] bArr, int i, int i2) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A08 = externalProvider.A08();
        int i3 = this.A00;
        int A002 = A08.A00(6, 11, i3, 0, 0);
        try {
            return this.A01.read(bArr, i, i2);
        } finally {
            externalProvider.A08().A00(6, 8, i3, A002, 0);
        }
    }

    public final int read() {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A08 = externalProvider.A08();
        int i = this.A00;
        int A002 = A08.A00(6, 11, i, 0, 0);
        try {
            return this.A01.read();
        } finally {
            externalProvider.A08().A00(6, 8, i, A002, 0);
        }
    }
}
