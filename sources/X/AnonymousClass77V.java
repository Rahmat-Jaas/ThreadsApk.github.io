package X;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.HashMap;

/* renamed from: X.77V  reason: invalid class name */
public final class AnonymousClass77V {
    public static AnonymousClass77V A01;
    public final HashMap A00 = AnonymousClass0wJ.A0y();

    public final String A01(int i) {
        String A0f = C18240wQ.A0f(Integer.valueOf(i), this.A00);
        if (A0f == null) {
            return null;
        }
        return A0f;
    }

    public AnonymousClass77V(Context context) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(C86144wL.A0Z(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.publicSourceDir)), 1024);
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                MessageDigest instance2 = MessageDigest.getInstance("SHA-1");
                MessageDigest instance3 = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                        instance2.update(bArr, 0, read);
                        instance3.update(bArr, 0, read);
                    } else if (read == -1) {
                        HashMap hashMap = this.A00;
                        hashMap.put(10003, A00(instance.digest()));
                        hashMap.put(10004, A00(instance2.digest()));
                        hashMap.put(10005, A00(instance3.digest()));
                        bufferedInputStream.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                J5T.A00(th);
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public static String A00(byte[] bArr) {
        StringBuilder A0r = C18200wM.A0r();
        for (byte valueOf : bArr) {
            A0r.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return A0r.toString();
    }
}
