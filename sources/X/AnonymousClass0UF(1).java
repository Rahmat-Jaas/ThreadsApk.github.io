package X;

import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;

/* renamed from: X.0UF  reason: invalid class name */
public final class AnonymousClass0UF {
    public static volatile boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r9 = X.C03550Jf.A01;
        r1 = (long) r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0UG A00(java.lang.String r12, java.lang.String[] r13, int r14) {
        /*
            boolean r0 = A00
            if (r0 != 0) goto L_0x0006
            r7 = 0
            return r7
        L_0x0006:
            X.0Uw r10 = X.C05680Uw.A0A
            r7 = 0
            if (r10 == 0) goto L_0x0059
            int r9 = X.C03550Jf.A01
            long r1 = (long) r14
            com.facebook.profilo.ipc.TraceContext r0 = X.C05680Uw.A01(r10, r7, r9, r1)
            if (r0 == 0) goto L_0x0059
            com.facebook.profilo.ipc.TraceContext r11 = new com.facebook.profilo.ipc.TraceContext
            r11.<init>((com.facebook.profilo.ipc.TraceContext) r0)
            X.0dr r4 = X.AnonymousClass0Vt.A00()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            if (r12 != 0) goto L_0x0064
            java.lang.String r3 = "null"
        L_0x0025:
            java.lang.String r5 = "DelayedTraceHandle"
            java.lang.String r0 = "stopTraceAndDelayUpload(markerId = %d, type = %s)"
            r4.A02(r6, r3, r5, r0)
            java.lang.String r8 = r11.A0D
            X.0UG r4 = new X.0UG
            r4.<init>(r8)
            A03(r11, r12, r13, r14)
            X.0cZ r0 = X.C08000cZ.A00()
            X.0ca r3 = r4.A04
            X.0JN r0 = r0.A06
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            r0.add(r3)
            boolean r0 = r10.A08(r9, r1)
            X.0dr r1 = X.AnonymousClass0Vt.A00()
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "UNABLE TO STOP: No trace is active. Marker ID: %d"
            r1.A03(r6, r5, r0)
            X.0cZ r0 = X.C08000cZ.A00()
            r0.A07(r3)
        L_0x0059:
            A02()
            return r7
        L_0x005d:
            java.lang.String r0 = "TRACE STOP. Marker ID: %d; Trace ID: %s"
            r1.A02(r6, r8, r5, r0)
            r7 = r4
            goto L_0x0059
        L_0x0064:
            r3 = r12
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UF.A00(java.lang.String, java.lang.String[], int):X.0UG");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02() {
        /*
            boolean r0 = A00
            r13 = 0
            if (r0 == 0) goto L_0x0026
            X.0Uw r0 = X.C05680Uw.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0018
            int r1 = X.C03550Jf.A01
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            X.0cN r0 = (X.C07890cN) r0
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r0 = r2
        L_0x0019:
            java.lang.String r9 = "BlackBoxApi"
            if (r0 != 0) goto L_0x0027
            X.0dr r1 = X.AnonymousClass0Vt.A00()
            java.lang.String r0 = "UNABLE TO START: No bb controller"
        L_0x0023:
            r1.A04(r9, r0)
        L_0x0026:
            return
        L_0x0027:
            X.0Uw r1 = X.C05680Uw.A0A
            if (r1 == 0) goto L_0x0026
            java.util.concurrent.atomic.AtomicReference r1 = r1.A05
            java.lang.Object r1 = r1.get()
            X.0UJ r1 = (X.AnonymousClass0UJ) r1
            java.lang.Object r2 = r0.A06(r1)
            X.0UV r2 = (X.AnonymousClass0UV) r2
            int r1 = r2.A02
            r0 = -1
            if (r1 == r0) goto L_0x0094
            int r14 = r2.A01
            if (r14 == 0) goto L_0x0094
            X.0Uw r8 = X.C05680Uw.A0A
            if (r8 != 0) goto L_0x004d
            X.0dr r1 = X.AnonymousClass0Vt.A00()
            java.lang.String r0 = "UNABLE TO START: No traceControl"
            goto L_0x0023
        L_0x004d:
            int r6 = X.C03550Jf.A01
            r2 = 2
            long r0 = (long) r14
            boolean r7 = r8.A09(r0, r6, r2)
            X.0dr r5 = X.AnonymousClass0Vt.A00()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            java.lang.String r2 = "TRACE START: success = %b; markerID: %d"
            r5.A02(r4, r3, r9, r2)
            if (r7 == 0) goto L_0x0026
            java.util.List r2 = r8.A06()
            java.util.Iterator r7 = r2.iterator()
        L_0x0070:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r5 = r7.next()
            com.facebook.profilo.ipc.TraceContext r5 = (com.facebook.profilo.ipc.TraceContext) r5
            int r2 = r5.A01
            if (r2 != r6) goto L_0x0070
            long r3 = r5.A05
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0070
            com.facebook.profilo.mmapbuf.core.Buffer r8 = r5.A09
            r9 = 6
            r10 = 43
            r11 = 0
            r15 = r13
            r16 = r11
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r8, r9, r10, r11, r13, r14, r15, r16)
            goto L_0x0070
        L_0x0094:
            X.0dr r1 = X.AnonymousClass0Vt.A00()
            java.lang.String r0 = "UNABLE TO START: No config"
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UF.A02():void");
    }

    public static void A03(TraceContext traceContext, String str, String[] strArr, int i) {
        int i2;
        Buffer buffer = traceContext.A09;
        int i3 = i;
        BufferLogger.writeStandardEntry(buffer, 6, 46, 0, 0, i3, 0, 562949953421312L);
        String str2 = str;
        if (str != null) {
            BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 59, 0, 0, i3, 0, 562949953421312L), "type"), str2);
        }
        int i4 = 0;
        while (true) {
            int length = strArr.length;
            if (i4 < length && (i2 = i4 + 1) < length) {
                String str3 = strArr[i4];
                BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 59, 0, 0, i3, 0, 562949953421312L), str3), strArr[i2]);
                i4 += 2;
            } else {
                return;
            }
        }
    }

    public static String A01() {
        C05680Uw r7;
        if (!A00) {
            return null;
        }
        String str = null;
        if (A00 && (r7 = C05680Uw.A0A) != null) {
            AnonymousClass0Vt.A00().A02(30539777, "bugreport", "BlackBoxApi", "stopBlackBoxTrace(markerId = %d, type = %s)");
            int i = C03550Jf.A01;
            TraceContext A01 = C05680Uw.A01(r7, (Object) null, i, (long) 30539777);
            if (A01 == null) {
                AnonymousClass0Vt.A00().A03(30539777, "BlackBoxApi", "UNABLE TO STOP: No trace is active. Marker ID: %d");
            } else {
                TraceContext traceContext = new TraceContext(A01);
                int i2 = (int) traceContext.A05;
                A03(traceContext, "bugreport", new String[0], i2);
                C08600dr A002 = AnonymousClass0Vt.A00();
                Integer valueOf = Integer.valueOf(i2);
                str = traceContext.A0D;
                A002.A02(valueOf, str, "BlackBoxApi", "TRACE STOP. Marker ID: %d; Trace ID: %s");
                r7.A08(i, (long) i2);
            }
        }
        A02();
        return str;
    }
}
