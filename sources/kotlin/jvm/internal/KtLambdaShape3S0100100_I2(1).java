package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape3S0100100_I2 extends C02220Ah implements AnonymousClass0ZU {
    public long A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0100100_I2(long j, Object obj, int i) {
        super(0);
        this.A02 = i;
        this.A00 = j;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        r1 = new X.C25425DlP(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r2 = X.C25666Dpn.A00(r4.A00);
        r1 = X.C26288E7s.A03(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        r2.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A02
            switch(r0) {
                case 2: goto L_0x0120;
                case 3: goto L_0x0109;
                case 4: goto L_0x00fe;
                case 5: goto L_0x00f3;
                case 6: goto L_0x00df;
                case 7: goto L_0x008e;
                case 8: goto L_0x0131;
                case 9: goto L_0x0055;
                case 10: goto L_0x002e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r15.A01
            X.E7s r4 = (X.C26288E7s) r4
            com.instagram.service.session.UserSession r3 = r4.A03
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36325703813178557(0x810e09000024bd, double:3.0358595910982226E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x007c
            long r0 = r15.A00
            X.DYW r1 = r4.A08(r0)
        L_0x001e:
            android.content.Context r0 = r4.A00
            X.Dpn r2 = X.C25666Dpn.A00(r0)
            X.DlP r1 = X.C26288E7s.A03(r1, r4)
        L_0x0028:
            r2.A02(r1)
        L_0x002b:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x002e:
            java.lang.Object r4 = r15.A01
            X.E7s r4 = (X.C26288E7s) r4
            com.instagram.service.session.UserSession r3 = r4.A03
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36325703813178557(0x810e09000024bd, double:3.0358595910982226E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0048
            long r0 = r15.A00
            X.DYW r1 = X.C26288E7s.A02(r4, r0)
            goto L_0x001e
        L_0x0048:
            android.content.Context r0 = r4.A00
            X.Dpn r2 = X.C25666Dpn.A00(r0)
            long r0 = r15.A00
            X.DYW r0 = X.C26288E7s.A02(r4, r0)
            goto L_0x0088
        L_0x0055:
            java.lang.Object r4 = r15.A01
            X.E7s r4 = (X.C26288E7s) r4
            com.instagram.service.session.UserSession r3 = r4.A03
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36325703813178557(0x810e09000024bd, double:3.0358595910982226E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x006f
            long r0 = r15.A00
            X.DYW r1 = X.C26288E7s.A01(r4, r0)
            goto L_0x001e
        L_0x006f:
            android.content.Context r0 = r4.A00
            X.Dpn r2 = X.C25666Dpn.A00(r0)
            long r0 = r15.A00
            X.DYW r0 = X.C26288E7s.A01(r4, r0)
            goto L_0x0088
        L_0x007c:
            android.content.Context r0 = r4.A00
            X.Dpn r2 = X.C25666Dpn.A00(r0)
            long r0 = r15.A00
            X.DYW r0 = r4.A08(r0)
        L_0x0088:
            X.DlP r1 = new X.DlP
            r1.<init>(r0)
            goto L_0x0028
        L_0x008e:
            java.lang.Object r8 = r15.A01
            X.76i r8 = (X.C1196676i) r8
            X.5Hv r10 = X.AnonymousClass73Z.A00()
            X.5Hv r9 = r8.A00
            java.lang.Long r7 = r8.A01
            if (r9 == 0) goto L_0x002b
            if (r10 == 0) goto L_0x002b
            if (r7 == 0) goto L_0x002b
            long r4 = r10.A00
            long r0 = r9.A00
            long r4 = r4 - r0
            long r2 = r10.A01
            long r0 = r9.A01
            long r2 = r2 - r0
            long r0 = r10.A02
            long r9 = r9.A02
            long r0 = r0 - r9
            X.01V r9 = r8.A02
            long r12 = r15.A00
            long r6 = r7.longValue()
            r10 = 725683882(0x2b410eaa, float:6.8587724E-13)
            r9.A0b(r10, r6)
            java.lang.String r6 = "cpu_time"
            r9.markerAnnotate((int) r10, (java.lang.String) r6, (long) r4)
            java.lang.String r4 = "timeslices_count"
            r9.markerAnnotate((int) r10, (java.lang.String) r4, (long) r0)
            r0 = 1173(0x495, float:1.644E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.markerAnnotate((int) r10, (java.lang.String) r0, (long) r2)
            java.lang.String r1 = r8.A03
            java.lang.String r0 = "context"
            r9.markerAnnotate((int) r10, (java.lang.String) r0, (java.lang.String) r1)
            r11 = 2
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.markerEnd(r10, r11, r12, r14)
            goto L_0x002b
        L_0x00df:
            java.lang.Object r2 = r15.A01
            X.76i r2 = (X.C1196676i) r2
            X.5Hv r0 = X.AnonymousClass73Z.A00()
            r2.A00 = r0
            long r0 = r15.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            goto L_0x002b
        L_0x00f3:
            java.lang.Object r2 = r15.A01
            X.5uO r2 = (X.AnonymousClass5uO) r2
            long r0 = r15.A00
            kotlin.jvm.internal.KtLambdaShape3S0100100_I2.super.onFirstByteFlushed(r0)
            goto L_0x002b
        L_0x00fe:
            java.lang.Object r2 = r15.A01
            X.5uO r2 = (X.AnonymousClass5uO) r2
            long r0 = r15.A00
            kotlin.jvm.internal.KtLambdaShape3S0100100_I2.super.onBodyBytesGenerated(r0)
            goto L_0x002b
        L_0x0109:
            java.lang.Object r1 = r15.A01
            X.K8N r1 = (X.K8N) r1
            long r3 = r15.A00
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0 = 836(0x344, float:1.171E-42)
            java.lang.String r2 = X.I17.A00(r0)
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r0 = r1.A04
            X.GXK r1 = r1.A06
            r0.markerPoint(r1, r2, r3, r5)
            goto L_0x002b
        L_0x0120:
            java.lang.Object r0 = r15.A01
            X.6sU r0 = (X.C113976sU) r0
            X.7Y3 r0 = r0.A07
            X.7IW r0 = r0.A0a
            X.54T r2 = r0.A04
            long r0 = r15.A00
            r2.Bg4(r0)
            goto L_0x002b
        L_0x0131:
            long r3 = r15.A00
            r1 = 500(0x1f4, double:2.47E-321)
            long r1 = r1 + r3
            java.lang.Object r0 = r15.A01
            X.Crp r0 = (X.C23420Crp) r0
            X.DUX r3 = new X.DUX
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape3S0100100_I2.invoke():java.lang.Object");
    }
}
