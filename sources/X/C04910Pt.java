package X;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Pt  reason: invalid class name and case insensitive filesystem */
public final class C04910Pt {
    public static int A0H;
    public static boolean A0I;
    public ScheduledExecutorService A00;
    public final Context A01;
    public final C04320Nd A02;
    public final AnonymousClass0Y6 A03;
    public final C04900Ps A04;
    public final C07430bV A05;
    public final Runnable A06;
    public final Set A07 = new HashSet();
    public final Executor A08;
    public final AtomicInteger A09 = new AtomicInteger();
    public final C04560Oe A0A;
    public final C04560Oe A0B;
    public final C04560Oe A0C;
    public final C04560Oe A0D;
    public final C04560Oe A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C04910Pt(Context context, C04320Nd r4, AnonymousClass0Y6 r5, C07430bV r6, Runnable runnable, Executor executor, C04560Oe r9, C04560Oe r10, C04560Oe r11, C04560Oe r12, C04560Oe r13, boolean z, boolean z2) {
        C04900Ps r1 = new C04900Ps();
        this.A01 = context;
        this.A0E = r9;
        this.A0B = r10;
        this.A0A = r11;
        this.A0C = r12;
        this.A05 = r6;
        this.A0D = r13;
        this.A02 = r4;
        this.A08 = executor;
        this.A06 = runnable;
        this.A03 = r5;
        this.A04 = r1;
        this.A0F = z;
        this.A0G = z2;
    }

    public static void A00(C04910Pt r8, String str, Throwable th) {
        if (r8.A0G) {
            AnonymousClass0NW.A00((String) r8.A0E.get(), (String) r8.A0B.get(), (String) r8.A0A.get(), (String) r8.A0C.get(), "sending_error", AnonymousClass00U.A0L("Error sending reports from ", str), th, (Map) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0217, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0218, code lost:
        X.C04790Pd.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021d, code lost:
        if (r6.A0G == false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x021f, code lost:
        X.AnonymousClass0LU.A0E("lacrima", "Error while sending report", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0222, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0223, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e5, code lost:
        r1 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:44:0x00d6, B:51:0x00e4] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0202 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00e4 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0217 A[ExcHandler: Exception (r1v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:51:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0104 A[Catch:{ IOException -> 0x0224, Exception -> 0x0217 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0119 A[Catch:{ IOException -> 0x0224, Exception -> 0x0217 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.AnonymousClass0O7 r20, X.C04910Pt r21, X.C04920Pv r22, java.io.File r23) {
        /*
            java.lang.String r5 = "Error while sending report"
            java.lang.String r4 = "lacrima"
            java.lang.String r7 = "_sent"
            java.io.File r0 = new java.io.File
            r8 = r23
            r0.<init>(r8, r7)
            boolean r0 = r0.exists()
            r3 = 0
            if (r0 != 0) goto L_0x022b
            r6 = r21
            java.lang.String r1 = "_report.txt"
            com.facebook.redex.IDxFFilterShape2S1000000_I2 r0 = new com.facebook.redex.IDxFFilterShape2S1000000_I2     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            java.io.File[] r2 = r8.listFiles(r0)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            if (r2 == 0) goto L_0x0209
            int r1 = r2.length     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r0 = 1
            if (r1 != r0) goto L_0x0209
            r21 = r2[r3]     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r13 = 1
            if (r21 == 0) goto L_0x0209
            X.0L6 r12 = new X.0L6     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r0 = r20
            r12.<init>(r0, r6)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r2.<init>()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            java.lang.String r1 = "_attach.txt"
            com.facebook.redex.IDxFFilterShape2S1000000_I2 r0 = new com.facebook.redex.IDxFFilterShape2S1000000_I2     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            java.io.File[] r1 = r8.listFiles(r0)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            if (r1 == 0) goto L_0x00ed
            int r0 = r1.length     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            if (r0 != r13) goto L_0x00ed
            r0 = r1[r3]     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            if (r0 == 0) goto L_0x00ed
            java.util.Properties r10 = new java.util.Properties     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r10.<init>()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            java.io.FileReader r9 = new java.io.FileReader     // Catch:{ IOException -> 0x00e7, Exception -> 0x0217 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x00e7, Exception -> 0x0217 }
            r10.load(r9)     // Catch:{ all -> 0x00dc }
            java.util.Set r0 = r10.stringPropertyNames()     // Catch:{ all -> 0x00dc }
            java.util.Iterator r20 = r0.iterator()     // Catch:{ all -> 0x00dc }
            r19 = 0
            r18 = 0
        L_0x0065:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r14 = r20.next()     // Catch:{ all -> 0x00da }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00da }
            java.lang.String r15 = r10.getProperty(r14)     // Catch:{ all -> 0x00da }
            if (r15 == 0) goto L_0x0065
            java.lang.String r0 = "__"
            boolean r17 = r14.startsWith(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r11 = "_r_"
            boolean r16 = r14.startsWith(r11)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = ""
            java.lang.String r0 = r14.replaceFirst(r0, r1)     // Catch:{ all -> 0x00da }
            java.lang.String r11 = r0.replaceFirst(r11, r1)     // Catch:{ all -> 0x00da }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x00da }
            r14.<init>(r15)     // Catch:{ all -> 0x00da }
            if (r16 == 0) goto L_0x009d
            boolean r0 = r14.exists()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x009d
            r18 = 1
            goto L_0x0065
        L_0x009d:
            if (r17 == 0) goto L_0x00b5
            boolean r0 = r14.exists()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00b5
            java.lang.String r1 = "Attachment missing, cannot send: %s %s"
            java.lang.String r0 = r14.getPath()     // Catch:{ all -> 0x00d2 }
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}     // Catch:{ all -> 0x00d2 }
            X.AnonymousClass0LU.A0O(r4, r1, r0)     // Catch:{ all -> 0x00d2 }
            r19 = 1
            goto L_0x0065
        L_0x00b5:
            boolean r0 = r14.exists()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00c9
            java.lang.String r1 = "Attachment missing: %s %s"
            java.lang.String r0 = r14.getPath()     // Catch:{ all -> 0x00da }
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}     // Catch:{ all -> 0x00da }
            X.AnonymousClass0LU.A0O(r4, r1, r0)     // Catch:{ all -> 0x00da }
            goto L_0x0065
        L_0x00c9:
            java.util.Set r0 = X.AnonymousClass0MY.A0G     // Catch:{ all -> 0x00da }
            r0.contains(r11)     // Catch:{ all -> 0x00da }
            r2.put(r11, r14)     // Catch:{ all -> 0x00da }
            goto L_0x0065
        L_0x00d2:
            r0 = move-exception
            r19 = 1
            goto L_0x00e1
        L_0x00d6:
            r9.close()     // Catch:{ IOException -> 0x00e5, Exception -> 0x0217 }
            goto L_0x00fa
        L_0x00da:
            r0 = move-exception
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            r19 = 0
            r18 = 0
        L_0x00e1:
            r9.close()     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            throw r0     // Catch:{ IOException -> 0x00e5, Exception -> 0x0217 }
        L_0x00e5:
            r1 = move-exception
            goto L_0x00f2
        L_0x00e7:
            r1 = move-exception
            r19 = 0
            r18 = 0
            goto L_0x00f2
        L_0x00ed:
            r19 = 0
            r18 = 0
            goto L_0x00fa
        L_0x00f2:
            java.lang.String r0 = "Could not read attachment file"
            X.AnonymousClass0LU.A0G(r4, r0, r1)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            X.C04790Pd.A00()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
        L_0x00fa:
            X.0bV r11 = r6.A05     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            android.content.Context r0 = r6.A01     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            boolean r0 = r11.A00(r0)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            if (r0 != 0) goto L_0x0119
            java.lang.String r1 = "Cannot send report: %s, %s"
            java.lang.String r0 = r21.getPath()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r16 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            X.AnonymousClass0LU.A0O(r4, r1, r0)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            java.lang.String r0 = "    -> No connection, will try again later"
            X.AnonymousClass0LU.A0C(r4, r0)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            return r16
        L_0x0119:
            if (r19 == 0) goto L_0x012e
            java.lang.String r1 = "Cannot send report, required attachment missing: %s, %s"
            java.lang.String r0 = r21.getPath()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r16 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            X.AnonymousClass0LU.A0O(r4, r1, r0)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r6.A02(r8)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            return r16
        L_0x012e:
            if (r18 == 0) goto L_0x0154
            int r1 = r6.A02(r8)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r0 = 3
            if (r1 >= r0) goto L_0x0151
            r21.getPath()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            java.util.concurrent.ScheduledExecutorService r0 = r6.A00     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            if (r0 != 0) goto L_0x022b
            java.util.concurrent.ScheduledExecutorService r9 = X.C04350Ng.A04     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r6.A00 = r9     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            X.0Po r7 = new X.0Po     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r0 = r22
            r7.<init>(r12, r6, r0, r8)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r0 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r9.schedule(r7, r0, r2)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            return r3
        L_0x0151:
            r21.getPath()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
        L_0x0154:
            r21.getPath()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            int r10 = r6.A02(r8)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r21.getName()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            r21.getParentFile()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            r16 = 1
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            r9.<init>()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x01e6 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x01e6 }
        L_0x0170:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x01e6 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r14.getValue()     // Catch:{ all -> 0x01e6 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x01e6 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x01e6 }
            if (r1 != 0) goto L_0x019a
            java.lang.String r2 = "Attachment missing: %s %s"
            java.lang.Object r1 = r14.getKey()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x01e6 }
            X.AnonymousClass0LU.A0O(r4, r2, r0)     // Catch:{ all -> 0x01e6 }
            goto L_0x0170
        L_0x019a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x01e6 }
            r2.<init>(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.Object r1 = r14.getKey()     // Catch:{ all -> 0x01e6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01e6 }
            long r19 = r0.length()     // Catch:{ all -> 0x01e6 }
            X.09E r0 = new X.09E     // Catch:{ all -> 0x01e6 }
            r18 = r2
            r21 = r13
            r22 = r13
            r17 = r0
            r17.<init>(r18, r19, r21, r22)     // Catch:{ all -> 0x01e6 }
            r9.put(r1, r0)     // Catch:{ all -> 0x01e6 }
            goto L_0x0170
        L_0x01ba:
            boolean r2 = r11.A01(r12, r9, r10)     // Catch:{ all -> 0x01e6 }
            java.util.Collection r0 = r9.values()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
        L_0x01c6:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            X.09E r0 = (X.AnonymousClass09E) r0     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            java.io.InputStream r0 = r0.A01     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            r0.close()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            goto L_0x01c6
        L_0x01d8:
            if (r2 == 0) goto L_0x0205
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r0.<init>(r8, r7)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r0.createNewFile()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            r6.A04(r3)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            return r16
        L_0x01e6:
            r2 = move-exception
            java.util.Collection r0 = r9.values()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
        L_0x01ef:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            if (r0 == 0) goto L_0x0201
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            X.09E r0 = (X.AnonymousClass09E) r0     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            java.io.InputStream r0 = r0.A01     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            r0.close()     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
            goto L_0x01ef
        L_0x0201:
            throw r2     // Catch:{ IOException -> 0x0202, Exception -> 0x0217 }
        L_0x0202:
            X.C04790Pd.A00()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
        L_0x0205:
            r6.A04(r3)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            return r3
        L_0x0209:
            java.lang.String r1 = "Cannot find report in %s"
            java.lang.String r0 = r8.getName()     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            X.AnonymousClass0LU.A0O(r4, r1, r0)     // Catch:{ IOException -> 0x0224, Exception -> 0x0217 }
            return r3
        L_0x0217:
            r1 = move-exception
            X.C04790Pd.A00()
            boolean r0 = r6.A0G
            if (r0 != 0) goto L_0x0223
            X.AnonymousClass0LU.A0E(r4, r5, r1)
            return r3
        L_0x0223:
            throw r1
        L_0x0224:
            r0 = move-exception
            X.AnonymousClass0LU.A0E(r4, r5, r0)
            X.C04790Pd.A00()
        L_0x022b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04910Pt.A01(X.0O7, X.0Pt, X.0Pv, java.io.File):boolean");
    }

    public final int A02(File file) {
        int length;
        File[] listFiles = file.listFiles(C04870Pm.A00);
        if (listFiles == null) {
            length = 0;
        } else {
            length = listFiles.length;
        }
        int i = length + 1;
        new File(file, AnonymousClass00U.A0J("_attempt", i)).createNewFile();
        return i;
    }

    public final void A03(AnonymousClass0ND r6, boolean z) {
        if (z) {
            AnonymousClass0LU.A0O("lacrima", "Send pending reports blocking %s", r6.A00);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C04350Ng.A03.execute(new C04880Pn(r6, this, countDownLatch));
        if (z) {
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
                AnonymousClass0LU.A0C("lacrima", "Send pending reports done");
            } catch (InterruptedException unused) {
                C04790Pd.A00();
            }
        }
    }

    public final void A04(boolean z) {
        if (z) {
            AnonymousClass0LU.A0C("lacrima", "Cleanup sent reports blocking");
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C04350Ng.A01.execute(new AnonymousClass0Pq(this, countDownLatch));
        if (z) {
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
                AnonymousClass0LU.A0C("lacrima", "Cleanup sent reports done");
            } catch (InterruptedException unused) {
                C04790Pd.A00();
            }
        }
    }
}
