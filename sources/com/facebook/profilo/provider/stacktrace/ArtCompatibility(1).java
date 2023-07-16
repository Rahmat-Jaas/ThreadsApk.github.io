package com.facebook.profilo.provider.stacktrace;

import X.C15020qa;
import java.util.concurrent.atomic.AtomicReference;

public class ArtCompatibility {
    public static final AtomicReference sIsCompatible = new AtomicReference((Object) null);

    public static native boolean nativeCheck(int i);

    static {
        C15020qa.A0A("profilo_stacktrace");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (r1.equals("5.0.2") != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        r4 = nativeCheck(1024);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b5, code lost:
        if (r1.equals("5.1.1") != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b7, code lost:
        r4 = nativeCheck(2048);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        if (r1.equals("6.0.1") != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c6, code lost:
        r4 = nativeCheck(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d1, code lost:
        if (r1.equals("7.0.0") != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d3, code lost:
        r4 = nativeCheck(32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e0, code lost:
        if (r1.equals("7.1.0") != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e2, code lost:
        r4 = nativeCheck(64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012b, code lost:
        if (r1.equals("9.0.0") != false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012d, code lost:
        r4 = nativeCheck(com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0133, code lost:
        r1 = new java.io.FileOutputStream(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0139, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013b, code lost:
        r0 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013d, code lost:
        if (r4 == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013f, code lost:
        r0 = 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r1.write(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0162, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x0166 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:94:0x0166=Splitter:B:94:0x0166, B:13:0x003c=Splitter:B:13:0x003c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCompatible(android.content.Context r7) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 0
            r0 = 28
            if (r1 > r0) goto L_0x0167
            java.util.concurrent.atomic.AtomicReference r2 = sIsCompatible
            java.lang.Object r0 = r2.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0016
            boolean r4 = r0.booleanValue()
        L_0x0015:
            return r4
        L_0x0016:
            java.io.File r4 = r7.getFilesDir()     // Catch:{ IOException -> 0x0167 }
            java.lang.String r0 = "ProfiloArtUnwindcCompat_"
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException -> 0x0167 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ IOException -> 0x0167 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0167 }
            r3.<init>(r4, r0)     // Catch:{ IOException -> 0x0167 }
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0041
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0167 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0167 }
            int r1 = r5.read()     // Catch:{ all -> 0x015d }
            r0 = 49
            r4 = 0
            if (r1 != r0) goto L_0x003c
            r4 = 1
        L_0x003c:
            r5.close()     // Catch:{ IOException -> 0x0167 }
            goto L_0x0147
        L_0x0041:
            int r0 = r1.hashCode()     // Catch:{ IOException -> 0x0167 }
            r4 = 16
            switch(r0) {
                case 57: goto L_0x004c;
                case 52407: goto L_0x0056;
                case 52408: goto L_0x005f;
                case 53368: goto L_0x0068;
                case 54329: goto L_0x0071;
                case 54330: goto L_0x007a;
                case 56251: goto L_0x0083;
                case 50364602: goto L_0x008d;
                case 50364603: goto L_0x0096;
                case 50365562: goto L_0x00a6;
                case 50365563: goto L_0x00af;
                case 51288123: goto L_0x00be;
                case 52211643: goto L_0x00cb;
                case 52212604: goto L_0x00da;
                case 52212605: goto L_0x00e9;
                case 52212606: goto L_0x00f8;
                case 53135164: goto L_0x0107;
                case 53136125: goto L_0x0116;
                case 54058685: goto L_0x0125;
                default: goto L_0x004a;
            }     // Catch:{ IOException -> 0x0167 }
        L_0x004a:
            goto L_0x0139
        L_0x004c:
            java.lang.String r0 = "9"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            goto L_0x012d
        L_0x0056:
            java.lang.String r0 = "5.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            goto L_0x009e
        L_0x005f:
            java.lang.String r0 = "5.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            goto L_0x00b7
        L_0x0068:
            java.lang.String r0 = "6.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            goto L_0x00c6
        L_0x0071:
            java.lang.String r0 = "7.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            goto L_0x00d3
        L_0x007a:
            java.lang.String r0 = "7.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            goto L_0x00e2
        L_0x0083:
            java.lang.String r0 = "9.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            goto L_0x012d
        L_0x008d:
            java.lang.String r0 = "5.0.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            goto L_0x009e
        L_0x0096:
            java.lang.String r0 = "5.0.2"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
        L_0x009e:
            r0 = 1024(0x400, float:1.435E-42)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0133
        L_0x00a6:
            java.lang.String r0 = "5.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            goto L_0x00b7
        L_0x00af:
            java.lang.String r0 = "5.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
        L_0x00b7:
            r0 = 2048(0x800, float:2.87E-42)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0133
        L_0x00be:
            java.lang.String r0 = "6.0.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
        L_0x00c6:
            boolean r4 = nativeCheck(r4)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0133
        L_0x00cb:
            java.lang.String r0 = "7.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
        L_0x00d3:
            r0 = 32
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0133
        L_0x00da:
            java.lang.String r0 = "7.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
        L_0x00e2:
            r0 = 64
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0133
        L_0x00e9:
            java.lang.String r0 = "7.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            r0 = 128(0x80, float:1.794E-43)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0133
        L_0x00f8:
            java.lang.String r0 = "7.1.2"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            r0 = 256(0x100, float:3.59E-43)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0133
        L_0x0107:
            java.lang.String r0 = "8.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0133
        L_0x0116:
            java.lang.String r0 = "8.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0133
        L_0x0125:
            java.lang.String r0 = "9.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0139
        L_0x012d:
            r0 = 16384(0x4000, float:2.2959E-41)
            boolean r4 = nativeCheck(r0)     // Catch:{ IOException -> 0x0167 }
        L_0x0133:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0167 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0167 }
            goto L_0x013b
        L_0x0139:
            r4 = 0
            goto L_0x0133
        L_0x013b:
            r0 = 48
            if (r4 == 0) goto L_0x0141
            r0 = 49
        L_0x0141:
            r1.write(r0)     // Catch:{ all -> 0x0162 }
            r1.close()     // Catch:{ IOException -> 0x0167 }
        L_0x0147:
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ IOException -> 0x0167 }
            boolean r0 = r2.compareAndSet(r1, r0)     // Catch:{ IOException -> 0x0167 }
            if (r0 != 0) goto L_0x0015
            java.lang.Object r0 = r2.get()     // Catch:{ IOException -> 0x0167 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IOException -> 0x0167 }
            boolean r4 = r0.booleanValue()     // Catch:{ IOException -> 0x0167 }
            return r4
        L_0x015d:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0166 }
            goto L_0x0166
        L_0x0162:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0166 }
        L_0x0166:
            throw r0     // Catch:{ IOException -> 0x0167 }
        L_0x0167:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }
}
