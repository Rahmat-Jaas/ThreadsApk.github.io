package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: X.6wZ  reason: invalid class name and case insensitive filesystem */
public final class C116186wZ {
    public static byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        inputStream.getClass();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static byte[] A01(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        AnonymousClass65z r3 = new AnonymousClass65z();
        r3.write(read2);
        byte[] bArr2 = new byte[4096];
        while (true) {
            int read3 = inputStream.read(bArr2);
            if (read3 == -1) {
                byte[] bArr3 = new byte[(r3.size() + i)];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                r3.A00(bArr3, i);
                return bArr3;
            }
            r3.write(bArr2, 0, read3);
        }
    }
}
