package X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Pi  reason: invalid class name and case insensitive filesystem */
public final class C04840Pi {
    public static String A04;
    public static final Object A05 = new Object();
    public static final File[] A06 = new File[0];
    public final AnonymousClass0Q4 A00;
    public final File A01;
    public final List A02 = new ArrayList();
    public final AnonymousClass0Y5 A03;

    public static void A00(AnonymousClass0ND r3, C04840Pi r4, File file, File file2) {
        C13810oL.A01("maybeAssembleReport", 287959939);
        try {
            synchronized (A05) {
                List<C07410bT> list = r4.A02;
                list.size();
                for (C07410bT r0 : list) {
                    file.getName();
                    if (file2 != null) {
                        file2.getName();
                    }
                    r0.A03(r3, file, file2);
                }
                A01(file, "mixers");
            }
            C13810oL.A00(1950764700);
        } catch (Throwable th) {
            C13810oL.A00(246084004);
            throw th;
        }
    }

    public static final void A01(File file, String str) {
        synchronized (A05) {
            try {
                new File(file, AnonymousClass00U.A0L(str, "_done")).createNewFile();
            } catch (IOException unused) {
                AnonymousClass0LU.A0B("lacrima", "Marking session dir failed");
                C04790Pd.A00();
            }
        }
    }

    public static final boolean A02(File file, String str) {
        boolean exists;
        synchronized (A05) {
            exists = new File(file, AnonymousClass00U.A0L(str, "_done")).exists();
        }
        return exists;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        X.C13810oL.A00(-1639448444);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00dd, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C04170Mn r14, java.io.File r15, java.lang.String r16, java.util.List r17) {
        /*
            r13 = this;
            java.lang.String r1 = "combineIntoReport"
            r0 = 1339210852(0x4fd2bc64, float:7.0711235E9)
            X.C13810oL.A01(r1, r0)
            java.lang.Object r6 = A05     // Catch:{ all -> 0x00e1 }
            monitor-enter(r6)     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "combineIntoProperties"
            r0 = 503076004(0x1dfc54a4, float:6.679136E-21)
            X.C13810oL.A01(r1, r0)     // Catch:{ all -> 0x00de }
            java.lang.String r3 = "lacrima"
            r15.getName()     // Catch:{ all -> 0x00d4 }
            X.0Pg r0 = X.C04820Pg.A00     // Catch:{ all -> 0x00d4 }
            r1 = r17
            java.util.Collections.sort(r1, r0)     // Catch:{ all -> 0x00d4 }
            java.util.Properties r11 = new java.util.Properties     // Catch:{ all -> 0x00d4 }
            r11.<init>()     // Catch:{ all -> 0x00d4 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x0028:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x0080
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x00d4 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = "include property file: "
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x00d4 }
            r0 = 1787531086(0x6a8b8f4e, float:8.435871E25)
            X.C13810oL.A01(r1, r0)     // Catch:{ all -> 0x00d4 }
            java.util.Properties r0 = new java.util.Properties     // Catch:{ all -> 0x00d4 }
            r0.<init>()     // Catch:{ all -> 0x00d4 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException | IllegalArgumentException -> 0x0060 }
            r1.<init>(r4)     // Catch:{ IOException | IllegalArgumentException -> 0x0060 }
            r0.load(r1)     // Catch:{ all -> 0x005b }
            r11.putAll(r0)     // Catch:{ all -> 0x005b }
            r1.close()     // Catch:{ IOException | IllegalArgumentException -> 0x0060 }
            r0 = -1724052707(0xffffffff993d0b1d, float:-9.773315E-24)
            goto L_0x0074
        L_0x005b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x0060 }
        L_0x0060:
            r2 = move-exception
            java.lang.String r1 = "Could not read property file %s"
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0078 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch:{ all -> 0x0078 }
            X.AnonymousClass0LU.A0N(r3, r1, r0)     // Catch:{ all -> 0x0078 }
            X.C04790Pd.A00()     // Catch:{ all -> 0x0078 }
            r0 = 849070141(0x329bc83d, float:1.8135433E-8)
        L_0x0074:
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x0028
        L_0x0078:
            r1 = move-exception
            r0 = 122672681(0x74fd629, float:1.5635885E-34)
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x00d4 }
            throw r1     // Catch:{ all -> 0x00d4 }
        L_0x0080:
            r0 = 30630565(0x1d362a5, float:7.7650707E-38)
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x00de }
            if (r14 == 0) goto L_0x0096
            X.0ON r0 = X.AnonymousClass0MU.A8B     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x00de }
            java.lang.String r0 = r15.getName()     // Catch:{ all -> 0x00de }
            r11.put(r1, r0)     // Catch:{ all -> 0x00de }
            r14.A05(r11)     // Catch:{ all -> 0x00de }
        L_0x0096:
            r10 = 0
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x00de }
            r4 = r16
            r8.<init>(r15, r4)     // Catch:{ all -> 0x00de }
            X.0Y5 r7 = r13.A03     // Catch:{ IOException -> 0x00bb }
            X.0ND r0 = X.AnonymousClass0ND.CRITICAL_REPORT     // Catch:{ IOException -> 0x00bb }
            java.lang.String r0 = r0.A00     // Catch:{ IOException -> 0x00bb }
            boolean r0 = r4.startsWith(r0)     // Catch:{ IOException -> 0x00bb }
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "java"
            boolean r0 = r4.contains(r0)     // Catch:{ IOException -> 0x00bb }
            if (r0 != 0) goto L_0x00b4
            r9 = 0
            goto L_0x00b6
        L_0x00b4:
            java.lang.String r9 = "reports"
        L_0x00b6:
            r12 = 0
            r7.A02(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x00bb }
            goto L_0x00cc
        L_0x00bb:
            r2 = move-exception
            java.lang.String r1 = "Assembling report failed: %s %s"
            java.lang.String r0 = r15.getName()     // Catch:{ all -> 0x00de }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4, r2}     // Catch:{ all -> 0x00de }
            X.AnonymousClass0LU.A0N(r3, r1, r0)     // Catch:{ all -> 0x00de }
            X.C04790Pd.A00()     // Catch:{ all -> 0x00de }
        L_0x00cc:
            monitor-exit(r6)     // Catch:{ all -> 0x00de }
            r0 = -1785116348(0xffffffff95994944, float:-6.19118E-26)
            X.C13810oL.A00(r0)
            return
        L_0x00d4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r1 = move-exception
            r0 = -1639448444(0xffffffff9e480084, float:-1.05880185E-20)
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x00de }
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r1 = move-exception
            r0 = -1353692350(0xffffffffaf504b42, float:-1.8944227E-10)
            X.C13810oL.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04840Pi.A03(X.0Mn, java.io.File, java.lang.String, java.util.List):void");
    }

    public C04840Pi(AnonymousClass0Y5 r4, AnonymousClass0Q4 r5) {
        this.A00 = r5;
        this.A03 = r4;
        File file = new File(r5.A05, "reports");
        this.A01 = file;
        file.mkdirs();
    }
}
