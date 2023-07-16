package X;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.77l  reason: invalid class name and case insensitive filesystem */
public final class C1198877l {
    public static final Map A02 = AnonymousClass0wJ.A0y();
    public final Object A00 = C86144wL.A0d();
    public final C04560Oe A01;

    public final String A00() {
        String str;
        FileInputStream fileInputStream;
        Base64OutputStream base64OutputStream;
        try {
            File file = (File) this.A01.get();
            fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
            base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    base64OutputStream.close();
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    fileInputStream.close();
                    base64OutputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (IOException e) {
            if (e.getMessage() != null) {
                str = e.getMessage();
            } else {
                str = "description N/A";
            }
            return AnonymousClass00U.A0V("[I/O error: ", str, "]");
        } catch (Throwable th) {
            fileInputStream.close();
            base64OutputStream.close();
            throw th;
        }
    }

    public C1198877l(C04560Oe r2) {
        this.A01 = r2;
    }
}
