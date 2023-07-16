package X;

import android.content.Context;

/* renamed from: X.0JE  reason: invalid class name */
public final class AnonymousClass0JE extends C07970cW {
    public int A00;
    public String A01;
    public String A02;
    public final Context A03;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = r2.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void logOnTraceEnd(com.facebook.profilo.ipc.TraceContext r23, X.C08000cZ r24) {
        /*
            r22 = this;
            r2 = r22
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x002e
            android.content.Context r4 = r2.A03
            android.content.pm.PackageManager r3 = r4.getPackageManager()
            if (r3 == 0) goto L_0x002e
            java.lang.String r1 = r4.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x002e }
            r0 = 0
            android.content.pm.PackageInfo r1 = r3.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException | RuntimeException -> 0x002e }
            java.lang.String r0 = r1.versionName     // Catch:{ NameNotFoundException | RuntimeException -> 0x002e }
            r2.A02 = r0     // Catch:{ NameNotFoundException | RuntimeException -> 0x002e }
            int r0 = r1.versionCode     // Catch:{ NameNotFoundException | RuntimeException -> 0x002e }
            r2.A00 = r0     // Catch:{ NameNotFoundException | RuntimeException -> 0x002e }
            java.lang.String r0 = r4.getPackageName()     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r0 = r3.getInstallerPackageName(r0)     // Catch:{ RuntimeException -> 0x002a }
            r2.A01 = r0     // Catch:{ RuntimeException -> 0x002a }
            goto L_0x002e
        L_0x002a:
            java.lang.String r0 = "<exception>"
            r2.A01 = r0
        L_0x002e:
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x007f
            r0 = r23
            com.facebook.profilo.mmapbuf.core.Buffer r5 = r0.A09
            r6 = 6
            r7 = 52
            r8 = 0
            r10 = 0
            r11 = 8126519(0x7c0037, float:1.1387679E-38)
            r15 = 0
            r12 = r10
            r13 = r8
            int r1 = com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r5, r6, r7, r8, r10, r11, r12, r13)
            r4 = 56
            java.lang.String r0 = "App version"
            int r1 = com.facebook.profilo.logger.BufferLogger.writeBytesEntry(r5, r10, r4, r1, r0)
            java.lang.String r0 = r2.A02
            r3 = 57
            com.facebook.profilo.logger.BufferLogger.writeBytesEntry(r5, r10, r3, r1, r0)
            r13 = 6
            r14 = 52
            r18 = 8126518(0x7c0036, float:1.1387677E-38)
            int r0 = r2.A00
            long r0 = (long) r0
            r12 = r5
            r17 = r10
            r19 = r10
            r20 = r0
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r12, r13, r14, r15, r17, r18, r19, r20)
            r11 = r10
            r12 = r10
            r13 = r8
            int r1 = com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r5, r6, r7, r8, r10, r11, r12, r13)
            java.lang.String r0 = "Installer"
            int r1 = com.facebook.profilo.logger.BufferLogger.writeBytesEntry(r5, r10, r4, r1, r0)
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "null"
        L_0x007c:
            com.facebook.profilo.logger.BufferLogger.writeBytesEntry(r5, r10, r3, r1, r0)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JE.logOnTraceEnd(com.facebook.profilo.ipc.TraceContext, X.0cZ):void");
    }

    public AnonymousClass0JE(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext != null ? applicationContext : context;
    }
}
