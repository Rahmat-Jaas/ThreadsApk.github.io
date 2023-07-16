package org.tukaani.xz;

import X.AnonymousClass0TQ;
import X.AnonymousClass0TR;
import X.AnonymousClass0TS;
import X.AnonymousClass0TT;
import X.AnonymousClass0TU;
import X.AnonymousClass0TZ;
import X.AnonymousClass0V8;
import X.AnonymousClass0VI;
import X.C02620Cd;
import java.io.InputStream;

public final class BCJDecoder implements C02620Cd, AnonymousClass0VI {
    public final int A00;
    public final long A01;

    public BCJDecoder() {
    }

    public final boolean ACb() {
        return false;
    }

    public final InputStream Ap9(InputStream inputStream) {
        long j = this.A01;
        return new SimpleInputStream(inputStream, j == 4 ? new AnonymousClass0TQ(this.A00) : j == 5 ? new AnonymousClass0TS(this.A00) : j == 6 ? new AnonymousClass0TT(this.A00) : j == 7 ? new AnonymousClass0TZ(this.A00) : j == 8 ? new AnonymousClass0TU(this.A00) : j == 9 ? new AnonymousClass0TR(this.A00) : null);
    }

    public final boolean BaJ() {
        return false;
    }

    public final boolean Bhw() {
        return true;
    }

    static {
        try {
            Class.forName("org.tukaani.xz.BCJDecoder");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public BCJDecoder(long j, byte[] bArr) {
        this.A01 = j;
        int length = bArr.length;
        int i = 0;
        if (length == 0) {
            return;
        }
        if (length == 4) {
            int i2 = 0;
            do {
                i2 |= (bArr[i] & 255) << (i << 3);
                i++;
            } while (i < 4);
            this.A00 = i2;
            return;
        }
        throw new AnonymousClass0V8("Unsupported BCJ filter properties");
    }

    public final int AvE() {
        return 5;
    }
}
