package X;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.2CX  reason: invalid class name */
public final class AnonymousClass2CX {
    public static void A00(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
