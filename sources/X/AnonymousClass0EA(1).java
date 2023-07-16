package X;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0EA  reason: invalid class name */
public abstract class AnonymousClass0EA extends AnonymousClass0MV {
    public String A00;
    public String[] A01;
    public final Map A02 = new HashMap();
    public final Context A03;

    public abstract C14910qO A09(byte b);

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(java.io.File r3, byte r4) {
        /*
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ SyncFailedException -> 0x0026 }
            r2.<init>(r3, r0)     // Catch:{ SyncFailedException -> 0x0026 }
            r0 = 0
            r2.seek(r0)     // Catch:{ all -> 0x0021 }
            r2.write(r4)     // Catch:{ all -> 0x0021 }
            long r0 = r2.getFilePointer()     // Catch:{ all -> 0x0021 }
            r2.setLength(r0)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r0 = r2.getFD()     // Catch:{ all -> 0x0021 }
            r0.sync()     // Catch:{ all -> 0x0021 }
            r2.close()     // Catch:{ SyncFailedException -> 0x0026 }
            return
        L_0x0021:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ SyncFailedException -> 0x0026 }
        L_0x0026:
            r2 = move-exception
            java.lang.String r1 = "fb-UnpackingSoSource"
            java.lang.String r0 = "state file sync failed"
            android.util.Log.w(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EA.A00(java.io.File, byte):void");
    }

    public final int A05(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        Object obj;
        int A07;
        Map map = this.A02;
        synchronized (map) {
            obj = map.get(str);
            if (obj == null) {
                obj = new Object();
                map.put(str, obj);
            }
        }
        synchronized (obj) {
            A07 = A07(threadPolicy, this.A00, str, i);
        }
        return A07;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:179:0x030b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:207:0x0383 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:212:0x0388 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:220:0x0392 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00bc */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f0 A[SYNTHETIC, Splitter:B:60:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013e A[Catch:{ all -> 0x030b, Exception -> 0x0129, all -> 0x037f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(int r36) {
        /*
            r35 = this;
            r31 = r35
            r0 = r31
            java.io.File r11 = r0.A00
            boolean r0 = r11.mkdirs()
            if (r0 != 0) goto L_0x0026
            boolean r0 = r11.isDirectory()
            if (r0 != 0) goto L_0x0026
            java.lang.String r1 = "cannot mkdir: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0026:
            boolean r27 = r11.canWrite()
            java.lang.String r10 = "error removing "
            r9 = 0
            r8 = 1
            r26 = 0
            java.lang.String r7 = " write permission"
            java.lang.String r6 = "fb-UnpackingSoSource"
            if (r27 != 0) goto L_0x0049
            boolean r0 = r11.setWritable(r8)     // Catch:{ all -> 0x0393 }
            if (r0 != 0) goto L_0x0049
            java.lang.String r1 = "error adding "
            java.lang.String r0 = r11.getCanonicalPath()     // Catch:{ all -> 0x0393 }
            java.lang.String r0 = X.AnonymousClass00U.A0V(r1, r0, r7)     // Catch:{ all -> 0x0393 }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0393 }
        L_0x0049:
            java.lang.String r17 = "dso_lock"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0393 }
            r0 = r17
            r1.<init>(r11, r0)     // Catch:{ all -> 0x0393 }
            X.0qs r29 = X.C14990qW.A00(r11, r1)     // Catch:{ all -> 0x0393 }
            r5 = 2
            android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0395 }
            byte[] r25 = r31.A0A()     // Catch:{ all -> 0x0395 }
            java.lang.String r16 = "dso_state"
            java.io.File r24 = new java.io.File     // Catch:{ all -> 0x0395 }
            r1 = r16
            r0 = r24
            r0.<init>(r11, r1)     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = "rw"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0395 }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x0395 }
            byte r2 = r1.readByte()     // Catch:{ EOFException -> 0x0079, all -> 0x038e }
            if (r2 == r8) goto L_0x007a
            android.util.Log.isLoggable(r6, r5)     // Catch:{ EOFException -> 0x0079, all -> 0x038e }
        L_0x0079:
            r2 = 0
        L_0x007a:
            r1.close()     // Catch:{ all -> 0x0395 }
            java.lang.String r23 = "dso_deps"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0395 }
            r0 = r23
            r1.<init>(r11, r0)     // Catch:{ all -> 0x0395 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00bd }
            r3.<init>(r1, r4)     // Catch:{ IOException -> 0x00bd }
            long r0 = r3.length()     // Catch:{ all -> 0x00b8 }
            int r12 = (int) r0     // Catch:{ all -> 0x00b8 }
            byte[] r1 = new byte[r12]     // Catch:{ all -> 0x00b8 }
            int r0 = r3.read(r1)     // Catch:{ all -> 0x00b8 }
            if (r0 == r12) goto L_0x009f
            android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x00b8 }
            r3.close()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00c3
        L_0x009f:
            r0 = r25
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x00b8 }
            r0 = r0 ^ 1
            r3.close()     // Catch:{ IOException -> 0x00bd }
            if (r0 != 0) goto L_0x00c3
            if (r2 == 0) goto L_0x00c7
            r0 = r36 & 2
            if (r0 != 0) goto L_0x00c7
            r0 = 4
            android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x0395 }
            goto L_0x0349
        L_0x00b8:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            throw r0     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r1 = move-exception
            java.lang.String r0 = "failed to compare whether deps changed"
            android.util.Log.w(r6, r0, r1)     // Catch:{ all -> 0x0395 }
        L_0x00c3:
            android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0395 }
            r2 = 0
        L_0x00c7:
            android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0395 }
            r0 = r24
            A00(r0, r9)     // Catch:{ all -> 0x0395 }
            r0 = r31
            X.0qO r22 = r0.A09(r2)     // Catch:{ all -> 0x0395 }
            X.0qS r21 = r22.A00()     // Catch:{ all -> 0x0389 }
            X.0qP r20 = r22.A01()     // Catch:{ all -> 0x0389 }
            android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0384 }
            java.lang.String r15 = "dso_manifest"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0384 }
            r1.<init>(r11, r15)     // Catch:{ all -> 0x0384 }
            java.io.RandomAccessFile r19 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0384 }
            r0 = r19
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0384 }
            if (r2 != r8) goto L_0x012d
            byte r0 = r19.readByte()     // Catch:{ Exception -> 0x0129 }
            if (r0 != r8) goto L_0x0119
            int r13 = r19.readInt()     // Catch:{ Exception -> 0x0129 }
            if (r13 < 0) goto L_0x0121
            X.0qT[] r12 = new X.C14960qT[r13]     // Catch:{ Exception -> 0x0129 }
            r3 = 0
        L_0x00ff:
            if (r3 >= r13) goto L_0x0113
            java.lang.String r2 = r19.readUTF()     // Catch:{ Exception -> 0x0129 }
            java.lang.String r1 = r19.readUTF()     // Catch:{ Exception -> 0x0129 }
            X.0qT r0 = new X.0qT     // Catch:{ Exception -> 0x0129 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0129 }
            r12[r3] = r0     // Catch:{ Exception -> 0x0129 }
            int r3 = r3 + 1
            goto L_0x00ff
        L_0x0113:
            X.0qS r13 = new X.0qS     // Catch:{ Exception -> 0x0129 }
            r13.<init>(r12)     // Catch:{ Exception -> 0x0129 }
            goto L_0x0134
        L_0x0119:
            java.lang.String r0 = "wrong dso manifest version"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0129 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0129 }
            goto L_0x0128
        L_0x0121:
            java.lang.String r0 = "illegal number of shared libraries"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0129 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0129 }
        L_0x0128:
            throw r1     // Catch:{ Exception -> 0x0129 }
        L_0x0129:
            r0 = 4
            android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x037f }
        L_0x012d:
            X.0qT[] r0 = new X.C14960qT[r9]     // Catch:{ all -> 0x037f }
            X.0qS r13 = new X.0qS     // Catch:{ all -> 0x037f }
            r13.<init>(r0)     // Catch:{ all -> 0x037f }
        L_0x0134:
            r0 = r21
            X.0qT[] r12 = r0.A00     // Catch:{ all -> 0x037f }
            java.lang.String[] r3 = r11.list()     // Catch:{ all -> 0x037f }
            if (r3 == 0) goto L_0x036b
            r2 = 0
        L_0x013f:
            int r0 = r3.length     // Catch:{ all -> 0x037f }
            if (r2 >= r0) goto L_0x0181
            r1 = r3[r2]     // Catch:{ all -> 0x037f }
            r0 = r16
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x037f }
            if (r0 != 0) goto L_0x017e
            r0 = r17
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x037f }
            if (r0 != 0) goto L_0x017e
            r0 = r23
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x037f }
            if (r0 != 0) goto L_0x017e
            boolean r0 = r1.equals(r15)     // Catch:{ all -> 0x037f }
            if (r0 != 0) goto L_0x017e
            r0 = 0
        L_0x0163:
            int r14 = r12.length     // Catch:{ all -> 0x037f }
            if (r0 >= r14) goto L_0x0173
            r14 = r12[r0]     // Catch:{ all -> 0x037f }
            java.lang.String r14 = r14.A01     // Catch:{ all -> 0x037f }
            boolean r14 = r14.equals(r1)     // Catch:{ all -> 0x037f }
            if (r14 != 0) goto L_0x017e
            int r0 = r0 + 1
            goto L_0x0163
        L_0x0173:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x037f }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x037f }
            android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x037f }
            X.C14990qW.A02(r0)     // Catch:{ all -> 0x037f }
        L_0x017e:
            int r2 = r2 + 1
            goto L_0x013f
        L_0x0181:
            r18 = 32768(0x8000, float:4.5918E-41)
            r0 = r18
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x037f }
            r28 = r0
        L_0x018a:
            boolean r0 = r20.A01()     // Catch:{ all -> 0x037f }
            if (r0 == 0) goto L_0x030c
            X.0qR r17 = r20.A00()     // Catch:{ all -> 0x037f }
            r14 = 1
            r2 = 0
        L_0x0196:
            X.0qT[] r1 = r13.A00     // Catch:{ all -> 0x0305 }
            int r0 = r1.length     // Catch:{ all -> 0x0305 }
            if (r2 >= r0) goto L_0x01be
            r0 = r17
            X.0mT r0 = (X.C12780mT) r0     // Catch:{ all -> 0x0305 }
            X.0qT r3 = r0.A00     // Catch:{ all -> 0x0305 }
            java.lang.String r12 = r3.A01     // Catch:{ all -> 0x0305 }
            r0 = r1[r2]     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0305 }
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x01ba
            r0 = r1[r2]     // Catch:{ all -> 0x0305 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x0305 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x01ba
            goto L_0x01bd
        L_0x01ba:
            int r2 = r2 + 1
            goto L_0x0196
        L_0x01bd:
            r14 = 0
        L_0x01be:
            r1 = r17
            X.0mT r1 = (X.C12780mT) r1     // Catch:{ all -> 0x0305 }
            X.0qT r0 = r1.A00     // Catch:{ all -> 0x0305 }
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x0305 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0305 }
            r0.<init>(r11, r2)     // Catch:{ all -> 0x0305 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x01d3
            if (r14 == 0) goto L_0x0298
        L_0x01d3:
            r0 = 4
            android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x0305 }
            boolean r0 = r11.setWritable(r8)     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x02db
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x02f2 }
            r12.<init>(r11, r2)     // Catch:{ all -> 0x02f2 }
            r16 = 0
            boolean r0 = r12.exists()     // Catch:{ IOException -> 0x02b4 }
            if (r0 == 0) goto L_0x0204
            boolean r0 = r12.setWritable(r8)     // Catch:{ IOException -> 0x02b4 }
            if (r0 != 0) goto L_0x0204
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b4 }
            r2.<init>()     // Catch:{ IOException -> 0x02b4 }
            java.lang.String r0 = "error adding write permission to: "
            r2.append(r0)     // Catch:{ IOException -> 0x02b4 }
            r2.append(r12)     // Catch:{ IOException -> 0x02b4 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x02b4 }
            android.util.Log.w(r6, r0)     // Catch:{ IOException -> 0x02b4 }
        L_0x0204:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x020a }
            r3.<init>(r12, r4)     // Catch:{ IOException -> 0x020a }
            goto L_0x022c
        L_0x020a:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b4 }
            r3.<init>()     // Catch:{ IOException -> 0x02b4 }
            java.lang.String r0 = "error overwriting "
            r3.append(r0)     // Catch:{ IOException -> 0x02b4 }
            r3.append(r12)     // Catch:{ IOException -> 0x02b4 }
            java.lang.String r0 = " trying to delete and start over"
            r3.append(r0)     // Catch:{ IOException -> 0x02b4 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x02b4 }
            android.util.Log.w(r6, r0, r2)     // Catch:{ IOException -> 0x02b4 }
            X.C14990qW.A02(r12)     // Catch:{ IOException -> 0x02b4 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x02b4 }
            r3.<init>(r12, r4)     // Catch:{ IOException -> 0x02b4 }
        L_0x022c:
            r16 = r3
            java.io.InputStream r15 = r1.A01     // Catch:{ IOException -> 0x02b4 }
            int r0 = r15.available()     // Catch:{ IOException -> 0x02b4 }
            if (r0 <= r8) goto L_0x023e
            java.io.FileDescriptor r2 = r3.getFD()     // Catch:{ IOException -> 0x02b4 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x02b4 }
            com.facebook.soloader.SysUtil$LollipopSysdeps.fallocateIfSupported(r2, r0)     // Catch:{ IOException -> 0x02b4 }
        L_0x023e:
            r14 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
        L_0x0242:
            int r1 = r14 - r2
            r0 = r18
            int r1 = java.lang.Math.min(r0, r1)     // Catch:{ IOException -> 0x02b4 }
            r0 = r28
            int r1 = r15.read(r0, r9, r1)     // Catch:{ IOException -> 0x02b4 }
            r0 = -1
            if (r1 == r0) goto L_0x025c
            r0 = r28
            r3.write(r0, r9, r1)     // Catch:{ IOException -> 0x02b4 }
            int r2 = r2 + r1
            if (r2 >= r14) goto L_0x025c
            goto L_0x0242
        L_0x025c:
            long r0 = r3.getFilePointer()     // Catch:{ IOException -> 0x02b4 }
            r3.setLength(r0)     // Catch:{ IOException -> 0x02b4 }
            boolean r0 = r12.setExecutable(r8, r9)     // Catch:{ IOException -> 0x02b4 }
            if (r0 == 0) goto L_0x029d
            boolean r0 = r12.setWritable(r9)     // Catch:{ all -> 0x02f2 }
            if (r0 != 0) goto L_0x0284
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f2 }
            r0.<init>()     // Catch:{ all -> 0x02f2 }
            r0.append(r10)     // Catch:{ all -> 0x02f2 }
            r0.append(r12)     // Catch:{ all -> 0x02f2 }
            r0.append(r7)     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02f2 }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x02f2 }
        L_0x0284:
            r3.close()     // Catch:{ all -> 0x02f2 }
            boolean r0 = r11.setWritable(r9)     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x0298
            java.lang.String r0 = r11.getCanonicalPath()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = X.AnonymousClass00U.A0V(r10, r0, r7)     // Catch:{ all -> 0x0305 }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0305 }
        L_0x0298:
            r17.close()     // Catch:{ all -> 0x037f }
            goto L_0x018a
        L_0x029d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b4 }
            r1.<init>()     // Catch:{ IOException -> 0x02b4 }
            java.lang.String r0 = "cannot make file executable: "
            r1.append(r0)     // Catch:{ IOException -> 0x02b4 }
            r1.append(r12)     // Catch:{ IOException -> 0x02b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x02b4 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x02b4 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02b4 }
            throw r0     // Catch:{ IOException -> 0x02b4 }
        L_0x02b4:
            r0 = move-exception
            X.C14990qW.A02(r12)     // Catch:{ all -> 0x02b9 }
            throw r0     // Catch:{ all -> 0x02b9 }
        L_0x02b9:
            r1 = move-exception
            boolean r0 = r12.setWritable(r9)     // Catch:{ all -> 0x02f2 }
            if (r0 != 0) goto L_0x02d5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f2 }
            r0.<init>()     // Catch:{ all -> 0x02f2 }
            r0.append(r10)     // Catch:{ all -> 0x02f2 }
            r0.append(r12)     // Catch:{ all -> 0x02f2 }
            r0.append(r7)     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02f2 }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x02f2 }
        L_0x02d5:
            if (r16 == 0) goto L_0x02f1
            r16.close()     // Catch:{ all -> 0x02f2 }
            goto L_0x02f1
        L_0x02db:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f2 }
            r1.<init>()     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = "cannot make directory writable for us: "
            r1.append(r0)     // Catch:{ all -> 0x02f2 }
            r1.append(r11)     // Catch:{ all -> 0x02f2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02f2 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x02f2 }
            r1.<init>(r0)     // Catch:{ all -> 0x02f2 }
        L_0x02f1:
            throw r1     // Catch:{ all -> 0x02f2 }
        L_0x02f2:
            r1 = move-exception
            boolean r0 = r11.setWritable(r9)     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x0304
            java.lang.String r0 = r11.getCanonicalPath()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = X.AnonymousClass00U.A0V(r10, r0, r7)     // Catch:{ all -> 0x0305 }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0305 }
        L_0x0304:
            throw r1     // Catch:{ all -> 0x0305 }
        L_0x0305:
            r0 = move-exception
            if (r17 == 0) goto L_0x030b
            r17.close()     // Catch:{ all -> 0x030b }
        L_0x030b:
            throw r0     // Catch:{ all -> 0x037f }
        L_0x030c:
            r19.close()     // Catch:{ all -> 0x0384 }
            android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0384 }
            r20.close()     // Catch:{ all -> 0x0389 }
            r22.close()     // Catch:{ all -> 0x0395 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0395 }
            r0 = r23
            r1.<init>(r11, r0)     // Catch:{ all -> 0x0395 }
            X.0qU r2 = new X.0qU     // Catch:{ all -> 0x0395 }
            r28 = r2
            r30 = r21
            r32 = r1
            r33 = r24
            r34 = r25
            r28.<init>(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0395 }
            r0 = r36 & 1
            if (r0 == 0) goto L_0x0345
            java.lang.String r1 = "SoSync:"
            java.lang.String r0 = r11.getName()     // Catch:{ all -> 0x0395 }
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x0395 }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ all -> 0x0395 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0395 }
            r0.start()     // Catch:{ all -> 0x0395 }
            goto L_0x034b
        L_0x0345:
            r2.run()     // Catch:{ all -> 0x0395 }
            goto L_0x034b
        L_0x0349:
            r26 = r29
        L_0x034b:
            if (r27 != 0) goto L_0x035e
            boolean r0 = r11.setWritable(r9)
            if (r0 != 0) goto L_0x035e
            java.lang.String r0 = r11.getCanonicalPath()
            java.lang.String r0 = X.AnonymousClass00U.A0V(r10, r0, r7)
            android.util.Log.w(r6, r0)
        L_0x035e:
            if (r26 == 0) goto L_0x0367
            android.util.Log.isLoggable(r6, r5)
            r26.close()
            return
        L_0x0367:
            android.util.Log.isLoggable(r6, r5)
            return
        L_0x036b:
            java.lang.String r1 = "unable to list directory "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x037f }
            r0.<init>(r1)     // Catch:{ all -> 0x037f }
            r0.append(r11)     // Catch:{ all -> 0x037f }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x037f }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x037f }
            r0.<init>(r1)     // Catch:{ all -> 0x037f }
            throw r0     // Catch:{ all -> 0x037f }
        L_0x037f:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x0383 }
        L_0x0383:
            throw r0     // Catch:{ all -> 0x0384 }
        L_0x0384:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x0388 }
        L_0x0388:
            throw r0     // Catch:{ all -> 0x0389 }
        L_0x0389:
            r0 = move-exception
            r22.close()     // Catch:{ all -> 0x0392 }
            goto L_0x0392
        L_0x038e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0392 }
        L_0x0392:
            throw r0     // Catch:{ all -> 0x0395 }
        L_0x0393:
            r1 = move-exception
            goto L_0x0398
        L_0x0395:
            r1 = move-exception
            r26 = r29
        L_0x0398:
            if (r27 != 0) goto L_0x03ab
            boolean r0 = r11.setWritable(r9)
            if (r0 != 0) goto L_0x03ab
            java.lang.String r0 = r11.getCanonicalPath()
            java.lang.String r0 = X.AnonymousClass00U.A0V(r10, r0, r7)
            android.util.Log.w(r6, r0)
        L_0x03ab:
            r0 = 2
            if (r26 == 0) goto L_0x03b5
            android.util.Log.isLoggable(r6, r0)
            r26.close()
            throw r1
        L_0x03b5:
            android.util.Log.isLoggable(r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EA.A06(int):void");
    }

    public AnonymousClass0EA(Context context, String str) {
        super(new File(AnonymousClass00U.A0V(context.getApplicationInfo().dataDir, "/", str)), new String[0], 1);
        this.A03 = context;
    }

    public byte[] A0A() {
        Parcel obtain = Parcel.obtain();
        C14910qO A09 = A09((byte) 1);
        try {
            C14960qT[] r3 = A09.A00().A00;
            obtain.writeByte((byte) 1);
            int length = r3.length;
            obtain.writeInt(length);
            for (int i = 0; i < length; i++) {
                obtain.writeString(r3[i].A01);
                obtain.writeString(r3[i].A00);
            }
            A09.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public AnonymousClass0EA(Context context, File file) {
        super(file, new String[0], 1);
        this.A03 = context;
    }
}
