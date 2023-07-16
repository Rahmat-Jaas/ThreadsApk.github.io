package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: X.7K1  reason: invalid class name */
public final class AnonymousClass7K1 {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        if (r9 != null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C102976Xh.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C113606rn A00(android.content.Context r9, X.C113606rn r10, boolean r11) {
        /*
            java.lang.String r5 = "FirebaseInstanceId"
            r0 = 3
            android.util.Log.isLoggable(r5, r0)
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            java.security.KeyPair r4 = r10.A01
            java.security.PublicKey r0 = r4.getPublic()
            byte[] r0 = r0.getEncoded()
            r2 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)
            java.lang.String r0 = "pub"
            r3.setProperty(r0, r1)
            java.security.PrivateKey r0 = r4.getPrivate()
            byte[] r0 = r0.getEncoded()
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)
            java.lang.String r0 = "pri"
            r3.setProperty(r0, r1)
            long r0 = r10.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cre"
            r3.setProperty(r0, r1)
            java.io.File r1 = A04(r9)
            r4 = 0
            r1.createNewFile()     // Catch:{ IOException -> 0x009f }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x009f }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x009f }
            java.nio.channels.FileChannel r9 = r6.getChannel()     // Catch:{ all -> 0x0091 }
            r9.lock()     // Catch:{ all -> 0x0081 }
            r0 = 0
            if (r11 == 0) goto L_0x0070
            long r7 = r9.size()     // Catch:{ all -> 0x0081 }
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0070
            r9.position(r0)     // Catch:{ 6CU | IOException -> 0x006c }
            X.6rn r10 = A03(r9)     // Catch:{ 6CU | IOException -> 0x006c }
            r9.close()     // Catch:{ all -> 0x0091 }
            r6.close()     // Catch:{ IOException -> 0x009f }
            return r10
        L_0x006c:
            r2 = move-exception
            X.C86114wI.A1N(r5, r2)     // Catch:{ all -> 0x0081 }
        L_0x0070:
            r9.position(r0)     // Catch:{ all -> 0x0081 }
            java.io.OutputStream r0 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ all -> 0x0081 }
            r3.store(r0, r4)     // Catch:{ all -> 0x0081 }
            r9.close()     // Catch:{ all -> 0x0091 }
            r6.close()     // Catch:{ IOException -> 0x009f }
            return r10
        L_0x0081:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r2 = move-exception
            if (r9 == 0) goto L_0x0090
            r9.close()     // Catch:{ all -> 0x008a }
            goto L_0x0090
        L_0x008a:
            r1 = move-exception
            X.6no r0 = X.C102976Xh.A00     // Catch:{ all -> 0x0091 }
            r0.A00(r3, r1)     // Catch:{ all -> 0x0091 }
        L_0x0090:
            throw r2     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0098 }
            goto L_0x009e
        L_0x0098:
            r1 = move-exception
            X.6no r0 = X.C102976Xh.A00     // Catch:{ IOException -> 0x009f }
            r0.A00(r3, r1)     // Catch:{ IOException -> 0x009f }
        L_0x009e:
            throw r2     // Catch:{ IOException -> 0x009f }
        L_0x009f:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.C86104wH.A0A(r2)
            int r0 = r0 + 21
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Failed to write key: "
            r1.append(r0)
            java.lang.String r0 = X.C18180wK.A0i(r2, r1)
            android.util.Log.w(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K1.A00(android.content.Context, X.6rn, boolean):X.6rn");
    }

    public static C113606rn A01(SharedPreferences sharedPreferences) {
        long j;
        String string = sharedPreferences.getString(AnonymousClass7EE.A00("|P|"), (String) null);
        String string2 = sharedPreferences.getString(AnonymousClass7EE.A00("|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair A05 = A05(string, string2);
        String string3 = sharedPreferences.getString(AnonymousClass7EE.A00("cre"), (String) null);
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
            return new C113606rn(A05, j);
        }
        j = 0;
        return new C113606rn(A05, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r5 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C102976Xh.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        X.C102976Xh.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C113606rn A02(java.io.File r10) {
        /*
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r10)
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch:{ all -> 0x002f }
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 1
            r5.lock(r6, r8, r10)     // Catch:{ all -> 0x001f }
            X.6rn r0 = A03(r5)     // Catch:{ all -> 0x001f }
            r5.close()     // Catch:{ all -> 0x002f }
            r4.close()
            return r0
        L_0x001f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r2 = move-exception
            if (r5 == 0) goto L_0x002e
            r5.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002e
        L_0x0028:
            r1 = move-exception
            X.6no r0 = X.C102976Xh.A00     // Catch:{ all -> 0x002f }
            r0.A00(r3, r1)     // Catch:{ all -> 0x002f }
        L_0x002e:
            throw r2     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x0036 }
            throw r2
        L_0x0036:
            r1 = move-exception
            X.6no r0 = X.C102976Xh.A00
            r0.A00(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K1.A02(java.io.File):X.6rn");
    }

    public static C113606rn A03(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new AnonymousClass6CU();
        }
        try {
            return new C113606rn(A05(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new AnonymousClass6CU(e);
        }
    }

    public static File A04(Context context) {
        String A0i;
        if (TextUtils.isEmpty("")) {
            A0i = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString("".getBytes("UTF-8"), 11);
                StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(encodeToString) + 33);
                A0s.append("com.google.InstanceId_");
                A0s.append(encodeToString);
                A0i = C18180wK.A0i(".properties", A0s);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = context.getFilesDir();
        }
        return C86154wM.A0U(noBackupFilesDir, A0i);
    }

    public static KeyPair A05(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 19);
                A0s.append("Invalid key stored ");
                Log.w("FirebaseInstanceId", C18180wK.A0i(valueOf, A0s));
                throw new AnonymousClass6CU(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new AnonymousClass6CU(e2);
        }
    }

    public static final void A06(Context context, C113606rn r5) {
        SharedPreferences A0C = C86164wN.A0C(context, "com.google.android.gms.appid");
        try {
            if (r5.equals(A01(A0C))) {
                return;
            }
        } catch (AnonymousClass6CU unused) {
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        SharedPreferences.Editor edit = A0C.edit();
        String A00 = AnonymousClass7EE.A00("|P|");
        KeyPair keyPair = r5.A01;
        edit.putString(A00, Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        edit.putString(AnonymousClass7EE.A00("|K|"), Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        edit.putString(AnonymousClass7EE.A00("cre"), String.valueOf(r5.A00));
        edit.commit();
    }

    public final C113606rn A07(Context context) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            C113606rn r4 = new C113606rn(instance.generateKeyPair(), System.currentTimeMillis());
            C113606rn A00 = A00(context, r4, true);
            if (A00 == null || A00.equals(r4)) {
                Log.isLoggable("FirebaseInstanceId", 3);
                A06(context, r4);
                return r4;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            return A00;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
