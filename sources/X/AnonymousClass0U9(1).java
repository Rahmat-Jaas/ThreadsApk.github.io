package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.EOFException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* renamed from: X.0U9  reason: invalid class name */
public final class AnonymousClass0U9 {
    public static long A00(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            long j = (long) (read & StringTreeSet.MAX_SYMBOL_COUNT);
            int i = 0;
            while ((read & 128) != 0) {
                i++;
                if (i < 9) {
                    read = inputStream.read();
                    if (read == -1) {
                        throw new EOFException();
                    } else if (read != 0) {
                        j |= ((long) (read & StringTreeSet.MAX_SYMBOL_COUNT)) << (i * 7);
                    } else {
                        throw new AnonymousClass0VZ();
                    }
                } else {
                    throw new AnonymousClass0VZ();
                }
            }
            return j;
        }
        throw new EOFException();
    }

    public static boolean A01(byte[] bArr, int i, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        int i4 = 0;
        while (((byte) ((int) (value >>> (i4 << 3)))) == bArr[i3 + i4]) {
            i4++;
            if (i4 >= 4) {
                return true;
            }
        }
        return false;
    }
}
