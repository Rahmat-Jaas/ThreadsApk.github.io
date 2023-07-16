package X;

import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.io.OutputStream;

/* renamed from: X.0oT  reason: invalid class name and case insensitive filesystem */
public final class C13890oT extends OutputStream {
    public int A00;
    public OutputStream A01;

    public final void close() {
        this.A01.close();
    }

    public final void flush() {
        this.A01.flush();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutpuStreamWrapper for ");
        sb.append(this.A01);
        return sb.toString();
    }

    public final void write(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A08 = externalProvider.A08();
        int i2 = this.A00;
        int A002 = A08.A00(6, 11, i2, 0, 0);
        try {
            this.A01.write(i);
        } finally {
            externalProvider.A08().A00(6, 8, i2, A002, 0);
        }
    }

    public C13890oT(OutputStream outputStream, int i) {
        this.A01 = outputStream;
        this.A00 = i;
    }

    public final void write(byte[] bArr, int i, int i2) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A08 = externalProvider.A08();
        int i3 = this.A00;
        int A002 = A08.A00(6, 11, i3, 0, 0);
        try {
            this.A01.write(bArr, i, i2);
        } finally {
            externalProvider.A08().A00(6, 8, i3, A002, 0);
        }
    }

    public final void write(byte[] bArr) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        ExternalProvider.MultiBufferLoggerLike A08 = externalProvider.A08();
        int i = this.A00;
        int A002 = A08.A00(6, 11, i, 0, 0);
        try {
            this.A01.write(bArr);
        } finally {
            externalProvider.A08().A00(6, 8, i, A002, 0);
        }
    }
}
