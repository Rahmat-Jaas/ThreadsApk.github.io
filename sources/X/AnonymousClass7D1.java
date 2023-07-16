package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.7D1  reason: invalid class name */
public final class AnonymousClass7D1 {
    public static int A00 = 270;
    public static String A01 = "/sdcard/e2e/media/fineYoungGentleman.jpg";
    public static Boolean A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00() {
        /*
            java.lang.Class<X.7D1> r3 = X.AnonymousClass7D1.class
            monitor-enter(r3)
            java.lang.Boolean r0 = A02     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0038
            r2 = 0
            java.lang.String r0 = "com.facebook.endtoend.EndToEnd"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            java.lang.String r0 = "isRunningEndToEndTest"
            java.lang.Object r0 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.booleanValue()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = A01     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            java.io.File r0 = X.C86144wL.A0Z(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            boolean r0 = r0.exists()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            goto L_0x0036
        L_0x002d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x003e }
        L_0x0036:
            A02 = r0     // Catch:{ all -> 0x003e }
        L_0x0038:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003e }
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7D1.A00():boolean");
    }

    public static byte[] A01() {
        try {
            File A0Z = C86144wL.A0Z(A01);
            FileInputStream fileInputStream = new FileInputStream(A0Z);
            byte[] bArr = new byte[((int) A0Z.length())];
            fileInputStream.read(bArr);
            return bArr;
        } catch (IOException e) {
            throw C86114wI.A0k(e);
        }
    }
}
