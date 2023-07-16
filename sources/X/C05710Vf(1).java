package X;

import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0Vf  reason: invalid class name and case insensitive filesystem */
public final class C05710Vf {
    public final ThreadLocal A00 = new ThreadLocal();
    public final int A01;
    public final MultiBufferLogger A02;
    public final String A03;
    public final int[] A04;

    public static boolean A02(C05710Vf r4, int i) {
        int[] iArr = r4.A04;
        if ((iArr.length < 1 || iArr[0] != -1) && Arrays.binarySearch(iArr, i) < 0) {
            return false;
        }
        return true;
    }

    public C05710Vf(MultiBufferLogger multiBufferLogger, String str, int[] iArr, int i) {
        this.A03 = str;
        this.A01 = i;
        this.A04 = iArr;
        this.A02 = multiBufferLogger;
    }

    public static long A00(C05800Wc r3) {
        return (((long) r3.BJK()) << 16) & 281474976645120L;
    }

    public static void A01(C05710Vf r11, C05800Wc r12, long j) {
        String str;
        List BFU = r12.BFU();
        if (BFU != null) {
            ThreadLocal threadLocal = r11.A00;
            StringBuilder sb = (StringBuilder) threadLocal.get();
            if (sb == null) {
                sb = new StringBuilder();
                threadLocal.set(sb);
            }
            int i = 0;
            sb.setLength(0);
            while (i < BFU.size() && (str = (String) BFU.get(i)) != null && sb.length() + str.length() <= 1024) {
                if (str.length() > 0) {
                    if (i != 0) {
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                    sb.append(str);
                }
                i++;
            }
            if (sb.length() > 0) {
                MultiBufferLogger multiBufferLogger = r11.A02;
                multiBufferLogger.writeBytesEntry(1, 57, multiBufferLogger.writeBytesEntry(1, 56, multiBufferLogger.writeStandardEntry(3, 58, 0, r12.BGK(), r12.getMarkerId(), 0, j), "tags"), sb.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r4.A05(r3) != null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C05800Wc r11) {
        /*
            r10 = this;
            int r0 = r11.getMarkerId()
            boolean r0 = A02(r10, r0)
            if (r0 == 0) goto L_0x0060
            X.0Uw r4 = X.C05680Uw.A0A
            if (r4 == 0) goto L_0x0060
            int r3 = r11.getMarkerId()
            java.lang.String r1 = r4.A05(r3)
            if (r1 == 0) goto L_0x001d
            java.lang.String r0 = "loom_id"
            r11.A8X(r0, r1)
        L_0x001d:
            long r8 = A00(r11)
            boolean r0 = r11.BZa()
            if (r0 != 0) goto L_0x002a
            r0 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r8 = r8 | r0
        L_0x002a:
            boolean r0 = r11.B5X()
            if (r0 != 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A04
            int r0 = r0.get()
            r2 = 0
            r1 = 0
            if (r0 != 0) goto L_0x0061
        L_0x003a:
            int r0 = X.C03540Je.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = r4.A05(r3)
            if (r0 == 0) goto L_0x0048
        L_0x0045:
            r0 = 562949953421312(0x2000000000000, double:2.781342323134002E-309)
            long r8 = r8 | r0
        L_0x0048:
            long r3 = r11.AwR()
            int r5 = r11.BGK()
            com.facebook.profilo.logger.MultiBufferLogger r0 = r10.A02
            r1 = 0
            r2 = 46
            int r6 = r11.getMarkerId()
            r7 = r1
            r0.writeStandardEntry(r1, r2, r3, r5, r6, r7, r8)
            A01(r10, r11, r8)
        L_0x0060:
            return
        L_0x0061:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.A06
            java.lang.Object r0 = r0.get(r2)
            com.facebook.profilo.ipc.TraceContext r0 = (com.facebook.profilo.ipc.TraceContext) r0
            if (r0 == 0) goto L_0x006e
            int r0 = r0.A01
            r1 = r1 | r0
        L_0x006e:
            int r2 = r2 + 1
            r0 = 2
            if (r2 >= r0) goto L_0x003a
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05710Vf.A03(X.0Wc):void");
    }
}
