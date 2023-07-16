package X;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.7FW  reason: invalid class name */
public final class AnonymousClass7FW {
    public static String A00(byte[] bArr) {
        StringBuilder A0s = C86114wI.A0s(r4 << 1);
        for (byte valueOf : bArr) {
            A0s.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return A0s.toString();
    }

    public static void A01(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A02(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void A03(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = Math.min(i, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw C86154wM.A0V("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }
}
