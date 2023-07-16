package X;

import java.util.Random;
import java.util.Set;

/* renamed from: X.0bH  reason: invalid class name and case insensitive filesystem */
public final class C07290bH implements AnonymousClass0PC {
    public static C07290bH A08;
    public Set A00;
    public int A01 = 1;
    public final int A02;
    public final Random A03 = new Random();
    public final C04100Mg A04;
    public final AnonymousClass0O9 A05;
    public final AnonymousClass0Q4 A06;
    public final Object A07 = new Object();

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C04790Pd.A00();
        r8.A00 = new java.util.HashSet();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r9, java.lang.String r10, java.lang.Throwable r11, long r12, boolean r14) {
        /*
            r8 = this;
            java.lang.Object r4 = r8.A07
            monitor-enter(r4)
            java.util.Set r0 = r8.A00     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x0052
            X.0II r6 = new X.0II     // Catch:{ Exception -> 0x0048 }
            r6.<init>()     // Catch:{ Exception -> 0x0048 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ Exception -> 0x0048 }
            r5.<init>()     // Catch:{ Exception -> 0x0048 }
            java.lang.Class<X.0II> r0 = X.AnonymousClass0II.class
            java.lang.reflect.Field[] r3 = r0.getDeclaredFields()     // Catch:{ Exception -> 0x0048 }
            int r2 = r3.length     // Catch:{ Exception -> 0x0048 }
            r1 = 0
        L_0x0019:
            if (r1 >= r2) goto L_0x0045
            r7 = r3[r1]     // Catch:{ Exception -> 0x0048 }
            int r0 = r7.getModifiers()     // Catch:{ Exception -> 0x0048 }
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)     // Catch:{ Exception -> 0x0048 }
            if (r0 == 0) goto L_0x0042
            int r0 = r7.getModifiers()     // Catch:{ Exception -> 0x0048 }
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch:{ Exception -> 0x0048 }
            if (r0 == 0) goto L_0x0042
            int r0 = r7.getModifiers()     // Catch:{ Exception -> 0x0048 }
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)     // Catch:{ Exception -> 0x0048 }
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r7.get(r6)     // Catch:{ Exception -> 0x0048 }
            r5.add(r0)     // Catch:{ Exception -> 0x0048 }
        L_0x0042:
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0045:
            r8.A00 = r5     // Catch:{ Exception -> 0x0048 }
            goto L_0x0052
        L_0x0048:
            X.C04790Pd.A00()     // Catch:{ all -> 0x0101 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0101 }
            r0.<init>()     // Catch:{ all -> 0x0101 }
            r8.A00 = r0     // Catch:{ all -> 0x0101 }
        L_0x0052:
            X.0O9 r2 = r8.A05     // Catch:{ all -> 0x0101 }
            if (r14 == 0) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = r12
        L_0x005a:
            boolean r0 = r2.Css(r9, r0)     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0084
            int r1 = r8.A02     // Catch:{ all -> 0x0101 }
            r0 = 1
            if (r1 <= r0) goto L_0x0086
            java.lang.String r0 = "[Native] "
            boolean r0 = r9.startsWith(r0)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x0086
            java.util.Set r0 = r8.A00     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.contains(r9)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x0086
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 > r0) goto L_0x0084
            java.util.Random r0 = r8.A03     // Catch:{ all -> 0x0101 }
            int r0 = r0.nextInt(r1)     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0086
        L_0x0084:
            monitor-exit(r4)     // Catch:{ all -> 0x0101 }
            goto L_0x0100
        L_0x0086:
            X.0Mn r5 = new X.0Mn     // Catch:{ all -> 0x0101 }
            r5.<init>(r11)     // Catch:{ all -> 0x0101 }
            X.0ON r0 = X.AnonymousClass0MU.A8V     // Catch:{ all -> 0x0101 }
            r5.A03(r0, r9)     // Catch:{ all -> 0x0101 }
            X.0ON r0 = X.AnonymousClass0MU.A8W     // Catch:{ all -> 0x0101 }
            r5.A03(r0, r10)     // Catch:{ all -> 0x0101 }
            X.0OO r1 = X.AnonymousClass0MU.A2f     // Catch:{ all -> 0x0101 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0101 }
            r5.A02(r1, r0)     // Catch:{ all -> 0x0101 }
            X.0OO r3 = X.AnonymousClass0MU.A2i     // Catch:{ all -> 0x0101 }
            long r0 = r2.Ar8(r9)     // Catch:{ all -> 0x0101 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0101 }
            r5.A02(r3, r0)     // Catch:{ all -> 0x0101 }
            X.0OO r6 = X.AnonymousClass0MU.A1K     // Catch:{ all -> 0x0101 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0101 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0101 }
            r5.A02(r6, r0)     // Catch:{ all -> 0x0101 }
            X.0OO r6 = X.AnonymousClass0MU.A2O     // Catch:{ all -> 0x0101 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0101 }
            X.0Q4 r0 = r8.A06     // Catch:{ all -> 0x0101 }
            long r0 = r0.A01     // Catch:{ all -> 0x0101 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0101 }
            r5.A02(r6, r0)     // Catch:{ all -> 0x0101 }
            if (r11 != 0) goto L_0x00db
            java.lang.String r0 = " | "
            java.lang.String r1 = X.AnonymousClass00U.A0V(r9, r0, r10)     // Catch:{ all -> 0x0101 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0101 }
            r0.<init>(r1, r11)     // Catch:{ all -> 0x0101 }
            r11 = r0
        L_0x00db:
            X.0ON r1 = X.AnonymousClass0MU.A4c     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = X.AnonymousClass0MN.A01(r11)     // Catch:{ all -> 0x0101 }
            r5.A03(r1, r0)     // Catch:{ all -> 0x0101 }
            X.0ON r1 = X.AnonymousClass0MU.A4b     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "soft_error"
            r5.A03(r1, r0)     // Catch:{ all -> 0x0101 }
            X.0Mg r3 = r8.A04     // Catch:{ all -> 0x0101 }
            int r2 = r8.A01     // Catch:{ all -> 0x0101 }
            java.util.concurrent.ExecutorService r1 = X.C04350Ng.A00     // Catch:{ all -> 0x0101 }
            X.0Mc r0 = new X.0Mc     // Catch:{ all -> 0x0101 }
            r0.<init>(r5, r3, r8, r2)     // Catch:{ all -> 0x0101 }
            r1.execute(r0)     // Catch:{ all -> 0x0101 }
            int r0 = r8.A01     // Catch:{ all -> 0x0101 }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ all -> 0x0101 }
            goto L_0x0084
        L_0x0100:
            return
        L_0x0101:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0101 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07290bH.A00(java.lang.String, java.lang.String, java.lang.Throwable, long, boolean):void");
    }

    public C07290bH(C04100Mg r2, AnonymousClass0O9 r3, AnonymousClass0Q4 r4, int i) {
        this.A06 = r4;
        this.A04 = r2;
        this.A05 = r3;
        this.A02 = i;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.SOFT_ERROR;
    }

    public final void start() {
        A08 = this;
    }
}
