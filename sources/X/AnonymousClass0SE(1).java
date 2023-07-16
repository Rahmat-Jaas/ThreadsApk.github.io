package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.dextricks.StringTreeSet;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0SE  reason: invalid class name */
public final class AnonymousClass0SE {
    public static final byte[] A05;
    public Short A00 = null;
    public List A01 = new ArrayList(15);
    public short A02 = 0;
    public final OutputStream A03;
    public final byte[] A04 = new byte[10];

    public static void A00(AnonymousClass0SE r5, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i & -128;
            byte[] bArr = r5.A04;
            int i4 = i2 + 1;
            if (i3 == 0) {
                bArr[i2] = (byte) i;
                r5.A03.write(bArr, 0, i4);
                return;
            }
            bArr[i2] = (byte) ((i & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
            i >>>= 7;
            i2 = i4;
        }
    }

    public final void A03(long j) {
        long j2 = (j >> 63) ^ (j << 1);
        int i = 0;
        while (true) {
            int i2 = ((-128 & j2) > 0 ? 1 : ((-128 & j2) == 0 ? 0 : -1));
            byte[] bArr = this.A04;
            int i3 = i + 1;
            if (i2 == 0) {
                bArr[i] = (byte) ((int) j2);
                this.A03.write(bArr, 0, i3);
                return;
            }
            bArr[i] = (byte) ((int) ((127 & j2) | 128));
            j2 >>>= 7;
            i = i3;
        }
    }

    static {
        byte[] bArr = new byte[20];
        A05 = bArr;
        bArr[0] = 0;
        bArr[2] = 1;
        bArr[3] = 3;
        bArr[6] = 4;
        bArr[8] = 5;
        bArr[10] = 6;
        bArr[4] = 7;
        bArr[11] = 8;
        bArr[15] = 9;
        bArr[14] = 10;
        bArr[13] = 11;
        bArr[12] = 12;
        bArr[19] = DalvikInternals.IOPRIO_CLASS_SHIFT;
    }

    public final void A01() {
        this.A01.add(Short.valueOf(this.A02));
        this.A02 = 0;
    }

    public final void A02(byte b, int i) {
        if (i <= 14) {
            this.A03.write((byte) (A05[b] | (i << 4)));
            return;
        }
        this.A03.write((byte) (A05[b] | 240));
        A00(this, i);
    }

    public final void A04(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            A00(this, length);
            this.A03.write(bytes, 0, length);
        } catch (UnsupportedEncodingException unused) {
            throw new IOException("UTF-8 not supported!");
        }
    }

    public final void A05(boolean z) {
        int i;
        Short sh = this.A00;
        int i2 = 1;
        if (sh != null) {
            short shortValue = sh.shortValue();
            if (!z) {
                i2 = 2;
            }
            short s = this.A02;
            if (shortValue <= s || (i = shortValue - s) > 15) {
                this.A03.write(i2);
                A00(this, (shortValue >> 31) ^ (shortValue << 1));
            } else {
                this.A03.write((byte) ((i << 4) | i2));
            }
            this.A02 = shortValue;
            this.A00 = null;
            return;
        }
        if (!z) {
            i2 = 2;
        }
        this.A03.write(i2);
    }

    public AnonymousClass0SE(OutputStream outputStream) {
        this.A03 = outputStream;
    }
}
