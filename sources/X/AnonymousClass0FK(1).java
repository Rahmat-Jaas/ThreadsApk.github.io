package X;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.0FK  reason: invalid class name */
public final class AnonymousClass0FK {
    public static final C03350Fm A06 = new C03350Fm();
    public static final Executor A07 = new AnonymousClass0FF();
    public AnonymousClass0JA A00 = null;
    public final Context A01;
    public final File A02;
    public final String A03;
    public final Executor A04;
    public final AnonymousClass0FJ[] A05;

    public AnonymousClass0FK(Context context, File file, String str, ArrayList arrayList, Executor executor) {
        AnonymousClass0SJ.A00(context);
        this.A01 = context;
        AnonymousClass0SJ.A00(file);
        this.A02 = file;
        this.A05 = (AnonymousClass0FJ[]) arrayList.toArray(new AnonymousClass0FJ[arrayList.size()]);
        this.A04 = executor;
        AnonymousClass0SJ.A00(str);
        this.A03 = str;
    }

    public static void A00(AnonymousClass0FK r2) {
        AnonymousClass0JA r0 = r2.A00;
        AnonymousClass0SJ.A00(r0);
        r0.close();
        r2.A00 = null;
        A06.A01(r2.A03);
    }

    public static byte[] A02(InputStream inputStream, byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(i - i2, bArr.length));
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            i2 += read;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void A01(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A012 : listFiles) {
                    A01(A012);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sb = new StringBuilder("could not delete: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        if (r3.exists() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        A01(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if (r16.mkdirs() == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00be, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        if (r9 >= r14) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        r0 = r15[r9];
        r8 = r0.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0 = r0.A00;
        X.AnonymousClass0SJ.A00(r0);
        r7 = new java.io.FileOutputStream(r0);
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r3 = r8.read(r11, 0, java.lang.Math.min(Integer.MAX_VALUE - r5, com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e1, code lost:
        if (r3 == -1) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        r7.write(r11, 0, r3);
        r5 = r5 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e7, code lost:
        if (r5 >= Integer.MAX_VALUE) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r8.close();
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f3, code lost:
        r4.A04.execute(new X.AnonymousClass0FG(r4));
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0112, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0117, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0118, code lost:
        if (r8 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0125, code lost:
        throw new java.io.IOException("Could not create the destination directory");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0126, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        A01(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x012a, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0116 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x011d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r17 = this;
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            java.lang.String r3 = "AppUnpacker.lock"
            r0 = -1244634176(0xffffffffb5d063c0, float:-1.5526239E-6)
            X.C13850oP.A01(r1, r3, r0)     // Catch:{ IOException | InterruptedException -> 0x014c }
            X.0Fm r7 = A06     // Catch:{ all -> 0x0144 }
            r4 = r17
            java.lang.String r6 = r4.A03     // Catch:{ all -> 0x0144 }
            monitor-enter(r7)     // Catch:{ all -> 0x0144 }
            java.util.Map r5 = r7.A00     // Catch:{ all -> 0x013d }
            java.lang.Object r3 = r5.get(r6)     // Catch:{ all -> 0x013d }
            X.0Fl r3 = (X.C03340Fl) r3     // Catch:{ all -> 0x013d }
            if (r3 != 0) goto L_0x002d
            X.0Fl r3 = new X.0Fl     // Catch:{ all -> 0x013d }
            r3.<init>()     // Catch:{ all -> 0x013d }
            java.util.concurrent.Semaphore r0 = r3.A01     // Catch:{ all -> 0x013d }
            r0.acquire()     // Catch:{ all -> 0x013d }
            r5.put(r6, r3)     // Catch:{ all -> 0x013d }
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            goto L_0x0039
        L_0x002d:
            int r0 = r3.A00     // Catch:{ all -> 0x013d }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x013d }
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            java.util.concurrent.Semaphore r0 = r3.A01     // Catch:{ InterruptedException | RuntimeException -> 0x0138 }
            r0.acquire()     // Catch:{ InterruptedException | RuntimeException -> 0x0138 }
        L_0x0039:
            X.0JA r3 = r4.A00     // Catch:{ all -> 0x0136 }
            r0 = 0
            if (r3 != 0) goto L_0x003f
            r0 = 1
        L_0x003f:
            X.AnonymousClass0SJ.A02(r0)     // Catch:{ all -> 0x0136 }
            android.content.Context r13 = r4.A01     // Catch:{ all -> 0x0136 }
            java.io.File r5 = r13.getFilesDir()     // Catch:{ all -> 0x0136 }
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.exists()     // Catch:{ all -> 0x0136 }
            if (r0 != 0) goto L_0x0057
        L_0x0050:
            java.lang.String r0 = "/data/local/tmp"
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0136 }
            r5.<init>(r0)     // Catch:{ all -> 0x0136 }
        L_0x0057:
            java.lang.String r0 = ".lock"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r6, r0)     // Catch:{ all -> 0x0136 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0136 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0136 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0136 }
            if (r0 != 0) goto L_0x006b
            r3.createNewFile()     // Catch:{ all -> 0x0136 }
        L_0x006b:
            X.0JA r0 = new X.0JA     // Catch:{ all -> 0x0136 }
            r0.<init>(r3)     // Catch:{ all -> 0x0136 }
            r4.A00 = r0     // Catch:{ all -> 0x0136 }
            r0 = -1211033660(0xffffffffb7d117c4, float:-2.4925808E-5)
            X.C13850oP.A00(r1, r0)     // Catch:{ IOException | InterruptedException -> 0x014c }
            java.lang.String r3 = "AppUnpacker.unpack()"
            r0 = 1834813825(0x6d5d0981, float:4.2754798E27)
            X.C13850oP.A01(r1, r3, r0)     // Catch:{ IOException | InterruptedException -> 0x014c }
            r12 = 16384(0x4000, float:2.2959E-41)
            byte[] r11 = new byte[r12]     // Catch:{ all -> 0x012b }
            java.io.File r0 = r4.A02     // Catch:{ all -> 0x012b }
            r16 = r0
            java.lang.String r5 = ".unpacked"
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x012b }
            r3.<init>(r0, r5)     // Catch:{ all -> 0x012b }
            boolean r0 = r16.exists()     // Catch:{ all -> 0x012b }
            r5 = 0
            if (r0 == 0) goto L_0x009d
            boolean r3 = r3.exists()     // Catch:{ all -> 0x012b }
            r0 = 0
            if (r3 != 0) goto L_0x009e
        L_0x009d:
            r0 = 1
        L_0x009e:
            X.0FJ[] r15 = r4.A05     // Catch:{ all -> 0x012b }
            int r14 = r15.length     // Catch:{ all -> 0x012b }
            if (r5 >= r14) goto L_0x00ae
            if (r0 != 0) goto L_0x00b5
            r0 = r15[r5]     // Catch:{ all -> 0x012b }
            boolean r0 = r0.A02(r13, r11)     // Catch:{ all -> 0x012b }
            int r5 = r5 + 1
            goto L_0x009e
        L_0x00ae:
            if (r0 != 0) goto L_0x00b5
            r3 = 4
        L_0x00b1:
            r0 = 1137680634(0x43cfa0fa, float:415.25763)
            goto L_0x00ff
        L_0x00b5:
            A01(r16)     // Catch:{ all -> 0x0126 }
            boolean r0 = r16.mkdirs()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x011e
            r10 = 0
            r9 = 0
        L_0x00c0:
            if (r9 >= r14) goto L_0x00f3
            r0 = r15[r9]     // Catch:{ all -> 0x0126 }
            java.io.InputStream r8 = r0.A00(r13)     // Catch:{ all -> 0x0126 }
            java.io.File r0 = r0.A00     // Catch:{ all -> 0x0117 }
            X.AnonymousClass0SJ.A00(r0)     // Catch:{ all -> 0x0117 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0117 }
            r7.<init>(r0)     // Catch:{ all -> 0x0117 }
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
        L_0x00d6:
            int r0 = r6 - r5
            int r0 = java.lang.Math.min(r0, r12)     // Catch:{ all -> 0x0112 }
            int r3 = r8.read(r11, r10, r0)     // Catch:{ all -> 0x0112 }
            r0 = -1
            if (r3 == r0) goto L_0x00ea
            r7.write(r11, r10, r3)     // Catch:{ all -> 0x0112 }
            int r5 = r5 + r3
            if (r5 >= r6) goto L_0x00ea
            goto L_0x00d6
        L_0x00ea:
            r7.close()     // Catch:{ all -> 0x0117 }
            r8.close()     // Catch:{ all -> 0x0126 }
            int r9 = r9 + 1
            goto L_0x00c0
        L_0x00f3:
            java.util.concurrent.Executor r3 = r4.A04     // Catch:{ all -> 0x0126 }
            X.0FG r0 = new X.0FG     // Catch:{ all -> 0x0126 }
            r0.<init>(r4)     // Catch:{ all -> 0x0126 }
            r3.execute(r0)     // Catch:{ all -> 0x0126 }
            r3 = 1
            goto L_0x00b1
        L_0x00ff:
            X.C13850oP.A00(r1, r0)     // Catch:{ IOException | InterruptedException -> 0x014c }
            r1 = r3 & 1
            if (r1 == 0) goto L_0x010a
            r0 = r3 & 2
            if (r0 == 0) goto L_0x010d
        L_0x010a:
            A00(r4)     // Catch:{ IOException | InterruptedException -> 0x014c }
        L_0x010d:
            r0 = 1
            if (r1 != 0) goto L_0x0111
            r0 = 0
        L_0x0111:
            return r0
        L_0x0112:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0116 }
        L_0x0116:
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            if (r8 == 0) goto L_0x011d
            r8.close()     // Catch:{ all -> 0x011d }
        L_0x011d:
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x011e:
            java.lang.String r3 = "Could not create the destination directory"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0126 }
            r0.<init>(r3)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            A01(r16)     // Catch:{ all -> 0x012b }
            throw r0     // Catch:{ all -> 0x012b }
        L_0x012b:
            r3 = move-exception
            r0 = 506857262(0x1e36072e, float:9.6364845E-21)
            X.C13850oP.A00(r1, r0)     // Catch:{ IOException | InterruptedException -> 0x014c }
            A00(r4)     // Catch:{ IOException | InterruptedException -> 0x014c }
            goto L_0x014b
        L_0x0136:
            r0 = move-exception
            goto L_0x0140
        L_0x0138:
            r0 = move-exception
            X.C03350Fm.A00(r7, r6)     // Catch:{ all -> 0x0144 }
            goto L_0x0143
        L_0x013d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            goto L_0x0143
        L_0x0140:
            r7.A01(r6)     // Catch:{ all -> 0x0144 }
        L_0x0143:
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r3 = move-exception
            r0 = -702398667(0xffffffffd6223f35, float:-4.4598089E13)
            X.C13850oP.A00(r1, r0)     // Catch:{ IOException | InterruptedException -> 0x014c }
        L_0x014b:
            throw r3     // Catch:{ IOException | InterruptedException -> 0x014c }
        L_0x014c:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FK.A03():boolean");
    }
}
