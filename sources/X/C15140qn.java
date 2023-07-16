package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0qn  reason: invalid class name and case insensitive filesystem */
public final class C15140qn {
    public static List A00;
    public static Map A01;
    public static byte[] A02;
    public static final ReentrantReadWriteLock A03 = new ReentrantReadWriteLock();
    public static volatile boolean A04;

    public static String A00(int i) {
        byte[] bArr;
        if (i >= A00.size()) {
            return null;
        }
        int intValue = ((Number) A00.get(i)).intValue();
        int i2 = intValue;
        while (true) {
            bArr = A02;
            if (i2 >= bArr.length || bArr[i2] <= 32) {
                int i3 = (i2 - intValue) + 6;
                char[] cArr = new char[i3];
                cArr[0] = 'l';
                cArr[1] = 'i';
                cArr[2] = 'b';
            } else {
                i2++;
            }
        }
        int i32 = (i2 - intValue) + 6;
        char[] cArr2 = new char[i32];
        cArr2[0] = 'l';
        cArr2[1] = 'i';
        cArr2[2] = 'b';
        for (int i4 = 0; i4 < i32 - 6; i4++) {
            cArr2[i4 + 3] = (char) bArr[intValue + i4];
        }
        cArr2[i32 - 3] = '.';
        cArr2[i32 - 2] = 's';
        cArr2[i32 - 1] = 'o';
        return new String(cArr2);
    }

    public static void A01(int i, int i2) {
        List list = A00;
        Integer valueOf = Integer.valueOf(i2);
        list.add(valueOf);
        Map map = A01;
        Integer valueOf2 = Integer.valueOf(i);
        List list2 = (List) map.get(valueOf2);
        if (list2 == null) {
            list2 = new ArrayList();
            A01.put(valueOf2, list2);
        }
        list2.add(valueOf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.content.Context r9) {
        /*
            boolean r0 = A04
            if (r0 == 0) goto L_0x0018
            java.lang.Class<X.0qn> r2 = X.C15140qn.class
            monitor-enter(r2)
            boolean r0 = A04     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x000d:
            java.lang.String r1 = "Trying to initialize NativeDeps but it was already initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0015 }
            r0.<init>(r1)     // Catch:{ all -> 0x0015 }
            throw r0     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r0
        L_0x0018:
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()
            java.lang.String r1 = r0.sourceDir
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            byte[] r6 = X.C14990qW.A04(r9, r0)
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()
            java.lang.String r1 = r0.dataDir
            java.lang.String r0 = "native_deps"
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
            java.lang.String r1 = "deps"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r0)
            long r1 = r0.length()     // Catch:{ all -> 0x00e7 }
            int r0 = (int) r1     // Catch:{ all -> 0x00e7 }
            byte[] r5 = X.C15120ql.A01(r3, r0)     // Catch:{ all -> 0x00e7 }
            r3.close()
            if (r6 == 0) goto L_0x004f
            goto L_0x00c3
        L_0x004f:
            r3 = 0
        L_0x0050:
            r8 = r3
        L_0x0051:
            int r7 = r5.length
            if (r8 >= r7) goto L_0x005d
            byte r1 = r5[r8]
            r0 = 10
            if (r1 == r0) goto L_0x005d
            int r8 = r8 + 1
            goto L_0x0051
        L_0x005d:
            if (r8 >= r7) goto L_0x0061
            int r8 = r8 + 1
        L_0x0061:
            if (r8 >= r7) goto L_0x00e5
            int r1 = r8 - r3
            r9 = 1
            int r1 = r1 - r9
            java.lang.String r0 = new java.lang.String     // Catch:{ NumberFormatException -> 0x00e5 }
            r0.<init>(r5, r3, r1)     // Catch:{ NumberFormatException -> 0x00e5 }
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00e5 }
            if (r6 <= 0) goto L_0x00e5
            float r0 = (float) r6
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r2
            int r0 = (int) r0
            int r1 = r0 + 1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1, r2)
            A01 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            A00 = r0
        L_0x0087:
            r4 = 5381(0x1505, float:7.54E-42)
            r3 = r8
        L_0x008a:
            byte r2 = r5[r3]     // Catch:{ IndexOutOfBoundsException -> 0x00b0 }
            r1 = 32
            if (r2 <= r1) goto L_0x0098
            int r0 = r4 << 5
            int r0 = r0 + r4
            int r4 = r0 + r2
            int r3 = r3 + 1
            goto L_0x008a
        L_0x0098:
            A01(r4, r8)     // Catch:{ IndexOutOfBoundsException -> 0x00b0 }
            r0 = 0
            if (r2 == r1) goto L_0x009f
            r0 = 1
        L_0x009f:
            int r8 = r3 + 1
            if (r0 == 0) goto L_0x00a4
            goto L_0x0087
        L_0x00a4:
            byte r1 = r5[r8]     // Catch:{ IndexOutOfBoundsException -> 0x00b5 }
            r0 = 10
            if (r1 == r0) goto L_0x00ad
            int r8 = r8 + 1
            goto L_0x00a4
        L_0x00ad:
            r0 = 1
            r3 = r8
            goto L_0x009f
        L_0x00b0:
            if (r8 == r7) goto L_0x00b5
            A01(r4, r8)
        L_0x00b5:
            java.util.List r0 = A00
            int r0 = r0.size()
            if (r0 != r6) goto L_0x00e5
            A02 = r5
            A04 = r9
            r0 = 1
            return r0
        L_0x00c3:
            int r4 = r6.length
            if (r4 == 0) goto L_0x00e5
            int r1 = r5.length
            r0 = 4
            int r3 = r4 + 4
            if (r1 < r3) goto L_0x00e5
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r5, r4, r0)
            int r0 = r0.getInt()
            int r0 = r0 + r3
            if (r1 != r0) goto L_0x00e5
            r2 = 0
        L_0x00d8:
            byte r1 = r6[r2]
            byte r0 = r5[r2]
            if (r1 != r0) goto L_0x00e5
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x00d8
            r0 = -1
            if (r3 != r0) goto L_0x0050
        L_0x00e5:
            r0 = 0
            return r0
        L_0x00e7:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15140qn.A02(android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4 A[Catch:{ ClosedByInterruptException -> 0x00cf, all -> 0x00f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] A03(X.C15210qv r10, java.lang.String r11) {
        /*
            java.lang.String r1 = "soloader.NativeDeps.getDependencies["
            java.lang.String r0 = "]"
            X.C15360rB.A00(r1, r11, r0)
            boolean r0 = A04     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00c0
            boolean r0 = A04     // Catch:{ all -> 0x00f8 }
            r8 = 0
            if (r0 == 0) goto L_0x00c1
            int r7 = r11.length()     // Catch:{ all -> 0x00f8 }
            r6 = 6
            if (r7 <= r6) goto L_0x00c1
            r2 = 3
            r0 = 5381(0x1505, float:7.54E-42)
        L_0x001a:
            r1 = 3
            int r5 = r7 - r1
            if (r2 >= r5) goto L_0x002a
            int r1 = r0 << 5
            int r1 = r1 + r0
            int r0 = r11.codePointAt(r2)     // Catch:{ all -> 0x00f8 }
            int r0 = r0 + r1
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002a:
            java.util.Map r1 = A01     // Catch:{ all -> 0x00f8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00f8 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00c1
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x00f8 }
        L_0x003c:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x00f8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00f8 }
            int r4 = r0.intValue()     // Catch:{ all -> 0x00f8 }
            r3 = r4
            r2 = 3
        L_0x004e:
            if (r2 >= r5) goto L_0x0066
            byte[] r0 = A02     // Catch:{ all -> 0x00f8 }
            int r0 = r0.length     // Catch:{ all -> 0x00f8 }
            if (r3 >= r0) goto L_0x0066
            int r0 = r11.codePointAt(r2)     // Catch:{ all -> 0x00f8 }
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = A02     // Catch:{ all -> 0x00f8 }
            byte r0 = r0[r3]     // Catch:{ all -> 0x00f8 }
            if (r1 != r0) goto L_0x0066
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0066:
            if (r2 != r5) goto L_0x003c
            r0 = -1
            if (r4 == r0) goto L_0x00c1
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00f8 }
            r2.<init>()     // Catch:{ all -> 0x00f8 }
            int r4 = r4 + r7
            int r4 = r4 - r6
            r1 = 0
            r5 = 0
        L_0x0074:
            byte[] r3 = A02     // Catch:{ all -> 0x00f8 }
            int r0 = r3.length     // Catch:{ all -> 0x00f8 }
            if (r4 >= r0) goto L_0x00a2
            byte r3 = r3[r4]     // Catch:{ all -> 0x00f8 }
            r0 = 10
            if (r3 == r0) goto L_0x00a2
            r0 = 32
            if (r3 != r0) goto L_0x0091
            if (r5 == 0) goto L_0x009f
            java.lang.String r0 = A00(r1)     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00c1
            r2.add(r0)     // Catch:{ all -> 0x00f8 }
            r1 = 0
            r5 = 0
            goto L_0x009f
        L_0x0091:
            r0 = 48
            if (r3 < r0) goto L_0x00c1
            r0 = 57
            if (r3 > r0) goto L_0x00c1
            int r1 = r1 * 10
            int r0 = r3 + -48
            int r1 = r1 + r0
            r5 = 1
        L_0x009f:
            int r4 = r4 + 1
            goto L_0x0074
        L_0x00a2:
            if (r5 == 0) goto L_0x00ad
            java.lang.String r0 = A00(r1)     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00c1
            r2.add(r0)     // Catch:{ all -> 0x00f8 }
        L_0x00ad:
            int r0 = r2.size()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00c1
            int r0 = r2.size()     // Catch:{ all -> 0x00f8 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00f8 }
            java.lang.Object[] r8 = r2.toArray(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ all -> 0x00f8 }
            goto L_0x00c1
        L_0x00c0:
            r8 = 0
        L_0x00c1:
            if (r8 != 0) goto L_0x00f4
            boolean r0 = r10 instanceof X.AnonymousClass0N0     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00f0
            X.0N0 r10 = (X.AnonymousClass0N0) r10     // Catch:{ all -> 0x00f8 }
            r3 = 0
        L_0x00ca:
            java.lang.String[] r8 = X.C15150qo.A02(r10)     // Catch:{ ClosedByInterruptException -> 0x00cf }
            goto L_0x00f4
        L_0x00cf:
            r2 = move-exception
            int r3 = r3 + 1
            r0 = 4
            if (r3 > r0) goto L_0x00ef
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = "MinElf"
            java.lang.String r0 = "retrying extract_DT_NEEDED due to ClosedByInterruptException"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x00f8 }
            java.io.File r1 = r10.A00     // Catch:{ all -> 0x00f8 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x00f8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f8 }
            r10.A01 = r0     // Catch:{ all -> 0x00f8 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ all -> 0x00f8 }
            r10.A02 = r0     // Catch:{ all -> 0x00f8 }
            goto L_0x00ca
        L_0x00ef:
            throw r2     // Catch:{ all -> 0x00f8 }
        L_0x00f0:
            java.lang.String[] r8 = X.C15150qo.A02(r10)     // Catch:{ all -> 0x00f8 }
        L_0x00f4:
            android.os.Trace.endSection()
            return r8
        L_0x00f8:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15140qn.A03(X.0qv, java.lang.String):java.lang.String[]");
    }
}
