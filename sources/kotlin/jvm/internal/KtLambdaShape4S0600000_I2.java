package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape4S0600000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S0600000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(1);
        this.A06 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A00 = obj4;
        this.A03 = obj5;
        this.A01 = obj6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f3, code lost:
        if (r0 == false) goto L_0x01f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023a A[Catch:{ all -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x025d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r2 = r23
            int r0 = r2.A06
            r6 = r24
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x00ae;
                case 2: goto L_0x0388;
                case 3: goto L_0x03ba;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r7 = r2.A05
            if (r7 == 0) goto L_0x0044
            java.lang.Object r3 = r2.A04
            X.8pE r3 = (X.C147368pE) r3
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L_0x0041
            java.lang.Object r0 = r2.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3400000_I2) r0
            java.lang.String r0 = r0.A05
            r3.CrC(r0)
            java.lang.Object r1 = r2.A00
            X.4qz r1 = (X.C83224qz) r1
            r8 = 0
            java.lang.Object r5 = r2.A02
            r9 = 39
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0301000_I2_5 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0301000_I2_5
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = 3
            X.8sG r2 = X.C25237DiI.A00(r8, r8, r4, r1, r0)
            r1 = 10
            kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21 r0 = new kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21
            r0.<init>(r3, r1)
            r2.BQv(r0)
        L_0x0041:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0044:
            java.lang.Object r1 = r2.A03
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r2.A01
            r1.invoke(r0)
            goto L_0x0041
        L_0x004e:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r9 = r2.A04
            X.7Xy[] r9 = (X.C123657Xy[]) r9
            java.lang.Object r8 = r2.A03
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r2.A05
            X.8q0 r7 = (X.C147838q0) r7
            java.lang.Object r6 = r2.A02
            X.0MZ r6 = (X.AnonymousClass0MZ) r6
            java.lang.Object r5 = r2.A01
            X.0MZ r5 = (X.AnonymousClass0MZ) r5
            java.lang.Object r4 = r2.A00
            androidx.compose.ui.Alignment r4 = (androidx.compose.ui.Alignment) r4
            int r10 = r9.length
            r1 = 0
            r3 = 0
        L_0x006d:
            if (r3 >= r10) goto L_0x0041
            r2 = r9[r3]
            int r13 = r1 + 1
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"
            X.C04220Ms.A0C(r2, r0)
            java.lang.Object r0 = r8.get(r1)
            X.8nT r0 = (X.C147148nT) r0
            X.69J r15 = r7.getLayoutDirection()
            int r11 = r6.A00
            int r1 = r5.A00
            java.lang.Object r12 = r0.B01()
            boolean r0 = r12 instanceof X.AnonymousClass55I
            if (r0 == 0) goto L_0x00ac
            X.55I r12 = (X.AnonymousClass55I) r12
            if (r12 == 0) goto L_0x00ac
            androidx.compose.ui.Alignment r14 = r12.A00
        L_0x0094:
            int r12 = r2.A01
            int r0 = r2.A00
            long r16 = X.AnonymousClass7FV.A00(r12, r0)
            long r18 = X.AnonymousClass7FV.A00(r11, r1)
            long r0 = r14.A88(r15, r16, r18)
            r11 = 0
            X.C122067Jz.A01(r2, r11, r0)
            int r3 = r3 + 1
            r1 = r13
            goto L_0x006d
        L_0x00ac:
            r14 = r4
            goto L_0x0094
        L_0x00ae:
            long r10 = X.C18190wL.A08(r6)
            java.lang.Object r9 = r2.A05
            androidx.compose.runtime.Recomposer r9 = (androidx.compose.runtime.Recomposer) r9
            X.7WG r3 = r9.A07
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x0104
            java.lang.String r1 = "Recomposer:animation"
            r0 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.C13790oJ.A01(r1, r0)
            java.lang.Object r7 = r3.A03     // Catch:{ all -> 0x047a }
            monitor-enter(r7)     // Catch:{ all -> 0x047a }
            java.util.List r6 = r3.A01     // Catch:{ all -> 0x045c }
            java.util.List r0 = r3.A02     // Catch:{ all -> 0x045c }
            r3.A01 = r0     // Catch:{ all -> 0x045c }
            r3.A02 = r6     // Catch:{ all -> 0x045c }
            r5 = 0
            int r4 = r6.size()     // Catch:{ all -> 0x045c }
        L_0x00d6:
            if (r5 >= r4) goto L_0x00f7
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x045c }
            X.6fc r0 = (X.C106786fc) r0     // Catch:{ all -> 0x045c }
            X.8n9 r3 = r0.A00     // Catch:{ all -> 0x045c }
            X.0YY r1 = r0.A01     // Catch:{ all -> 0x00eb }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00eb }
            java.lang.Object r0 = r1.invoke(r0)     // Catch:{ all -> 0x00eb }
            goto L_0x00f1
        L_0x00eb:
            r1 = move-exception
            X.0OW r0 = new X.0OW     // Catch:{ all -> 0x045c }
            r0.<init>(r1)     // Catch:{ all -> 0x045c }
        L_0x00f1:
            r3.resumeWith(r0)     // Catch:{ all -> 0x045c }
            int r5 = r5 + 1
            goto L_0x00d6
        L_0x00f7:
            r6.clear()     // Catch:{ all -> 0x045c }
            monitor-exit(r7)     // Catch:{ all -> 0x047a }
            X.C121637Hc.A04()     // Catch:{ all -> 0x047a }
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.C13790oJ.A00(r0)
        L_0x0104:
            java.lang.String r1 = "Recomposer:recompose"
            java.lang.Object r8 = r2.A04
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r2.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r2.A03
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r2.A00
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r2.A01
            java.util.Set r4 = (java.util.Set) r4
            r0 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.C13790oJ.A01(r1, r0)
            r3 = 0
            java.lang.Object r2 = r9.A09     // Catch:{ all -> 0x047a }
            monitor-enter(r2)     // Catch:{ all -> 0x047a }
            androidx.compose.runtime.Recomposer.A03(r9)     // Catch:{ all -> 0x0473 }
            java.util.List r11 = r9.A0A     // Catch:{ all -> 0x0473 }
            int r10 = r11.size()     // Catch:{ all -> 0x0473 }
            r1 = 0
        L_0x012e:
            if (r1 >= r10) goto L_0x013c
            java.lang.Object r0 = r11.get(r1)     // Catch:{ all -> 0x0473 }
            X.8p9 r0 = (X.C147318p9) r0     // Catch:{ all -> 0x0473 }
            r8.add(r0)     // Catch:{ all -> 0x0473 }
            int r1 = r1 + 1
            goto L_0x012e
        L_0x013c:
            r11.clear()     // Catch:{ all -> 0x0473 }
            monitor-exit(r2)     // Catch:{ all -> 0x047a }
            X.84Z r22 = new X.84Z     // Catch:{ all -> 0x047a }
            r22.<init>()     // Catch:{ all -> 0x047a }
            X.84Z r21 = new X.84Z     // Catch:{ all -> 0x047a }
            r21.<init>()     // Catch:{ all -> 0x047a }
        L_0x014a:
            boolean r0 = X.C18190wL.A1a(r8)     // Catch:{ all -> 0x047a }
            if (r0 != 0) goto L_0x0165
            boolean r0 = X.C18190wL.A1a(r7)     // Catch:{ all -> 0x047a }
            if (r0 != 0) goto L_0x0165
            boolean r0 = X.C18190wL.A1a(r5)     // Catch:{ all -> 0x047a }
            if (r0 == 0) goto L_0x02ba
            long r0 = r9.A00     // Catch:{ all -> 0x047a }
            r10 = 1
            long r0 = r0 + r10
            r9.A00 = r0     // Catch:{ all -> 0x047a }
            goto L_0x0295
        L_0x0165:
            int r20 = r8.size()     // Catch:{ Exception -> 0x0376 }
            r12 = 0
        L_0x016a:
            r0 = r20
            if (r12 >= r0) goto L_0x0208
            java.lang.Object r11 = r8.get(r12)     // Catch:{ Exception -> 0x0376 }
            X.8p9 r11 = (X.C147318p9) r11     // Catch:{ Exception -> 0x0376 }
            r0 = r21
            r0.add(r11)     // Catch:{ Exception -> 0x0376 }
            r10 = r11
            X.7W5 r10 = (X.AnonymousClass7W5) r10     // Catch:{ Exception -> 0x0376 }
            X.7W3 r1 = r10.A07     // Catch:{ Exception -> 0x0376 }
            boolean r0 = r1.A0Q     // Catch:{ Exception -> 0x0376 }
            if (r0 != 0) goto L_0x0204
            boolean r0 = r11.BSt()     // Catch:{ Exception -> 0x0376 }
            if (r0 != 0) goto L_0x0204
            r0 = 5
            kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2 r14 = X.C86154wM.A10(r11, r0)     // Catch:{ Exception -> 0x0376 }
            r19 = 1
            r13 = r22
            r0 = r19
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r0 = X.C86164wN.A11(r13, r11, r0)     // Catch:{ Exception -> 0x0376 }
            X.53I r18 = X.C121637Hc.A00(r14, r0)     // Catch:{ Exception -> 0x0376 }
            androidx.compose.runtime.snapshots.Snapshot r17 = r18.A05()     // Catch:{ all -> 0x035a }
            int r0 = r22.size()     // Catch:{ all -> 0x0355 }
            if (r0 <= 0) goto L_0x01bd
            r13 = 16
            r0 = r22
            kotlin.jvm.internal.KtLambdaShape16S0200000_I2 r14 = X.C86164wN.A0v(r11, r0, r13)     // Catch:{ all -> 0x0355 }
            r13 = 0
            boolean r0 = r1.A0Q     // Catch:{ all -> 0x0355 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0334
            r0 = r19
            r1.A0Q = r0     // Catch:{ all -> 0x0355 }
            r14.invoke()     // Catch:{ all -> 0x0351 }
            r1.A0Q = r13     // Catch:{ all -> 0x0355 }
        L_0x01bd:
            java.lang.Object r0 = r10.A0D     // Catch:{ all -> 0x0355 }
            r16 = r0
            monitor-enter(r16)     // Catch:{ all -> 0x0355 }
            X.AnonymousClass7W5.A04(r10)     // Catch:{ all -> 0x034e }
            X.7EA r13 = r10.A02     // Catch:{ all -> 0x0344 }
            r14 = 0
            X.7EA r15 = new X.7EA     // Catch:{ all -> 0x0344 }
            r0 = r19
            r15.<init>(r3, r14, r0)     // Catch:{ all -> 0x0344 }
            r10.A02 = r15     // Catch:{ all -> 0x0344 }
            X.C04220Ms.A0B(r13, r14)     // Catch:{ Exception -> 0x0340 }
            java.util.List r0 = r1.A0K     // Catch:{ Exception -> 0x0340 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0340 }
            if (r0 == 0) goto L_0x033a
            int r0 = r13.A00     // Catch:{ Exception -> 0x0340 }
            if (r0 > 0) goto L_0x01ea
            java.util.List r0 = r1.A0m     // Catch:{ Exception -> 0x0340 }
            boolean r0 = X.C18190wL.A1a(r0)     // Catch:{ Exception -> 0x0340 }
            if (r0 != 0) goto L_0x01ea
            r0 = 0
            goto L_0x01f5
        L_0x01ea:
            X.AnonymousClass7W3.A0q(r1, r13, r3)     // Catch:{ Exception -> 0x0340 }
            java.util.List r0 = r1.A0K     // Catch:{ Exception -> 0x0340 }
            boolean r0 = X.C18190wL.A1a(r0)     // Catch:{ Exception -> 0x0340 }
            if (r0 != 0) goto L_0x01f8
        L_0x01f5:
            X.AnonymousClass7W5.A05(r10)     // Catch:{ Exception -> 0x0340 }
        L_0x01f8:
            monitor-exit(r16)     // Catch:{ all -> 0x0355 }
            X.C86144wL.A1N(r17)     // Catch:{ all -> 0x035a }
            androidx.compose.runtime.Recomposer.A04(r18)     // Catch:{ Exception -> 0x0376 }
            if (r0 == 0) goto L_0x0204
            r5.add(r11)     // Catch:{ Exception -> 0x0376 }
        L_0x0204:
            int r12 = r12 + 1
            goto L_0x016a
        L_0x0208:
            r8.clear()     // Catch:{ all -> 0x047a }
            int r0 = r22.size()     // Catch:{ all -> 0x047a }
            if (r0 <= 0) goto L_0x0261
            monitor-enter(r2)     // Catch:{ all -> 0x047a }
            java.util.List r0 = r9.A0D     // Catch:{ all -> 0x0473 }
            r16 = r0
            int r10 = r16.size()     // Catch:{ all -> 0x0473 }
            r1 = 0
        L_0x021b:
            if (r1 >= r10) goto L_0x0260
            r0 = r16
            java.lang.Object r11 = r0.get(r1)     // Catch:{ all -> 0x0473 }
            X.8p9 r11 = (X.C147318p9) r11     // Catch:{ all -> 0x0473 }
            r0 = r21
            boolean r0 = r0.contains(r11)     // Catch:{ all -> 0x0473 }
            if (r0 != 0) goto L_0x025d
            r12 = r11
            X.7W5 r12 = (X.AnonymousClass7W5) r12     // Catch:{ all -> 0x0473 }
            java.util.Iterator r15 = r22.iterator()     // Catch:{ all -> 0x0473 }
        L_0x0234:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0473 }
            if (r0 == 0) goto L_0x025d
            java.lang.Object r13 = r15.next()     // Catch:{ all -> 0x0473 }
            X.7Ew r14 = r12.A0B     // Catch:{ all -> 0x0473 }
            r0 = 0
            X.C04220Ms.A0B(r13, r0)     // Catch:{ all -> 0x0473 }
            int r0 = X.C121227Ew.A00(r14, r13)     // Catch:{ all -> 0x0473 }
            boolean r0 = X.C86114wI.A1S(r0)     // Catch:{ all -> 0x0473 }
            if (r0 != 0) goto L_0x025a
            X.7Ew r0 = r12.A0A     // Catch:{ all -> 0x0473 }
            int r0 = X.C121227Ew.A00(r0, r13)     // Catch:{ all -> 0x0473 }
            boolean r0 = X.C86114wI.A1S(r0)     // Catch:{ all -> 0x0473 }
            if (r0 == 0) goto L_0x0234
        L_0x025a:
            r8.add(r11)     // Catch:{ all -> 0x0473 }
        L_0x025d:
            int r1 = r1 + 1
            goto L_0x021b
        L_0x0260:
            monitor-exit(r2)     // Catch:{ all -> 0x047a }
        L_0x0261:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x047a }
            if (r0 == 0) goto L_0x014a
            goto L_0x026b
        L_0x0268:
            X.C000300e.A0r(r0, r6)     // Catch:{ Exception -> 0x0362 }
        L_0x026b:
            r7.clear()     // Catch:{ Exception -> 0x0362 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0362 }
            java.util.List r11 = r9.A0B     // Catch:{ all -> 0x035f }
            r10 = 0
            int r1 = r11.size()     // Catch:{ all -> 0x035f }
        L_0x0276:
            if (r10 >= r1) goto L_0x0284
            java.lang.Object r0 = r11.get(r10)     // Catch:{ all -> 0x035f }
            X.6Cm r0 = (X.C97716Cm) r0     // Catch:{ all -> 0x035f }
            r7.add(r0)     // Catch:{ all -> 0x035f }
            int r10 = r10 + 1
            goto L_0x0276
        L_0x0284:
            r11.clear()     // Catch:{ all -> 0x035f }
            monitor-exit(r2)     // Catch:{ Exception -> 0x0362 }
            boolean r0 = X.C18190wL.A1a(r7)     // Catch:{ Exception -> 0x0362 }
            if (r0 == 0) goto L_0x014a
            r0 = r22
            java.util.List r0 = androidx.compose.runtime.Recomposer.A00(r9, r0, r7)     // Catch:{ Exception -> 0x0362 }
            goto L_0x0268
        L_0x0295:
            X.C000300e.A0r(r5, r4)     // Catch:{ Exception -> 0x02ab }
            int r10 = r5.size()     // Catch:{ Exception -> 0x02ab }
            r1 = 0
        L_0x029d:
            if (r1 >= r10) goto L_0x02b7
            java.lang.Object r0 = r5.get(r1)     // Catch:{ Exception -> 0x02ab }
            X.8p9 r0 = (X.C147318p9) r0     // Catch:{ Exception -> 0x02ab }
            r0.A8s()     // Catch:{ Exception -> 0x02ab }
            int r1 = r1 + 1
            goto L_0x029d
        L_0x02ab:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A02(r3, r9, r0)     // Catch:{ all -> 0x045f }
            X.C86134wK.A1W(r8, r7, r5, r6, r4)     // Catch:{ all -> 0x045f }
            r5.clear()     // Catch:{ all -> 0x047a }
            goto L_0x0380
        L_0x02b7:
            r5.clear()     // Catch:{ all -> 0x047a }
        L_0x02ba:
            boolean r0 = X.C18190wL.A1a(r6)     // Catch:{ all -> 0x047a }
            if (r0 == 0) goto L_0x02e6
            X.C000300e.A0r(r6, r4)     // Catch:{ Exception -> 0x02d7 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ Exception -> 0x02d7 }
        L_0x02c7:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x02d7 }
            if (r0 == 0) goto L_0x02e3
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x02d7 }
            X.8p9 r0 = (X.C147318p9) r0     // Catch:{ Exception -> 0x02d7 }
            r0.A8w()     // Catch:{ Exception -> 0x02d7 }
            goto L_0x02c7
        L_0x02d7:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A02(r3, r9, r0)     // Catch:{ all -> 0x0461 }
            X.C86134wK.A1W(r8, r7, r5, r6, r4)     // Catch:{ all -> 0x0461 }
            r6.clear()     // Catch:{ all -> 0x047a }
            goto L_0x0380
        L_0x02e3:
            r6.clear()     // Catch:{ all -> 0x047a }
        L_0x02e6:
            boolean r0 = X.C18190wL.A1a(r4)     // Catch:{ all -> 0x047a }
            if (r0 == 0) goto L_0x0327
            java.util.Iterator r11 = r4.iterator()     // Catch:{ Exception -> 0x031c }
        L_0x02f0:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x031c }
            if (r0 == 0) goto L_0x0324
            java.lang.Object r10 = r11.next()     // Catch:{ Exception -> 0x031c }
            X.8p9 r10 = (X.C147318p9) r10     // Catch:{ Exception -> 0x031c }
            X.7W5 r10 = (X.AnonymousClass7W5) r10     // Catch:{ Exception -> 0x031c }
            java.lang.Object r1 = r10.A0D     // Catch:{ Exception -> 0x031c }
            monitor-enter(r1)     // Catch:{ Exception -> 0x031c }
            X.7W3 r0 = r10.A07     // Catch:{ all -> 0x030f }
            X.6bD r0 = r0.A0k     // Catch:{ all -> 0x030f }
            android.util.SparseArray r0 = r0.A00     // Catch:{ all -> 0x030f }
            r0.clear()     // Catch:{ all -> 0x030f }
            X.AnonymousClass7W5.A02(r10)     // Catch:{ all -> 0x030f }
            monitor-exit(r1)     // Catch:{ Exception -> 0x031c }
            goto L_0x02f0
        L_0x030f:
            r0 = move-exception
            X.AnonymousClass7W5.A02(r10)     // Catch:{ Exception -> 0x0314 }
            throw r0     // Catch:{ Exception -> 0x0314 }
        L_0x0314:
            r0 = move-exception
            X.AnonymousClass7W5.A03(r10)     // Catch:{ all -> 0x0319 }
            throw r0     // Catch:{ all -> 0x0319 }
        L_0x0319:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x031c }
            throw r0     // Catch:{ Exception -> 0x031c }
        L_0x031c:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A02(r3, r9, r0)     // Catch:{ all -> 0x0466 }
            X.C86134wK.A1W(r8, r7, r5, r6, r4)     // Catch:{ all -> 0x0466 }
            goto L_0x0372
        L_0x0324:
            r4.clear()     // Catch:{ all -> 0x047a }
        L_0x0327:
            monitor-enter(r2)     // Catch:{ all -> 0x047a }
            androidx.compose.runtime.Recomposer.A01(r9)     // Catch:{ all -> 0x046b }
            monitor-exit(r2)     // Catch:{ all -> 0x047a }
            androidx.compose.runtime.snapshots.Snapshot r0 = X.C122127Kl.A00()     // Catch:{ all -> 0x047a }
            r0.A0D()     // Catch:{ all -> 0x047a }
            goto L_0x0380
        L_0x0334:
            java.lang.String r0 = "Preparing a composition while composing is not supported"
            X.AnonymousClass7J4.A02(r0)     // Catch:{ all -> 0x0355 }
            throw r3     // Catch:{ all -> 0x0355 }
        L_0x033a:
            java.lang.String r0 = "Expected applyChanges() to have been called"
            X.AnonymousClass7J4.A02(r0)     // Catch:{ Exception -> 0x0340 }
            throw r3     // Catch:{ Exception -> 0x0340 }
        L_0x0340:
            r0 = move-exception
            r10.A02 = r13     // Catch:{ all -> 0x0344 }
            throw r0     // Catch:{ all -> 0x0344 }
        L_0x0344:
            r0 = move-exception
            X.AnonymousClass7W5.A02(r10)     // Catch:{ Exception -> 0x0349 }
            throw r0     // Catch:{ Exception -> 0x0349 }
        L_0x0349:
            r0 = move-exception
            X.AnonymousClass7W5.A03(r10)     // Catch:{ all -> 0x034e }
            throw r0     // Catch:{ all -> 0x034e }
        L_0x034e:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0355 }
            goto L_0x0354
        L_0x0351:
            r0 = move-exception
            r1.A0Q = r13     // Catch:{ all -> 0x0355 }
        L_0x0354:
            throw r0     // Catch:{ all -> 0x0355 }
        L_0x0355:
            r0 = move-exception
            X.C86144wL.A1N(r17)     // Catch:{ all -> 0x035a }
            throw r0     // Catch:{ all -> 0x035a }
        L_0x035a:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A04(r18)     // Catch:{ Exception -> 0x0376 }
            throw r0     // Catch:{ Exception -> 0x0376 }
        L_0x035f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x0362 }
            throw r0     // Catch:{ Exception -> 0x0362 }
        L_0x0362:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A02(r3, r9, r0)     // Catch:{ all -> 0x047a }
            r8.clear()     // Catch:{ all -> 0x047a }
            r7.clear()     // Catch:{ all -> 0x047a }
            r5.clear()     // Catch:{ all -> 0x047a }
            r6.clear()     // Catch:{ all -> 0x047a }
        L_0x0372:
            r4.clear()     // Catch:{ all -> 0x047a }
            goto L_0x0380
        L_0x0376:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A02(r3, r9, r0)     // Catch:{ all -> 0x046e }
            X.C86134wK.A1W(r8, r7, r5, r6, r4)     // Catch:{ all -> 0x046e }
            r8.clear()     // Catch:{ all -> 0x047a }
        L_0x0380:
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.C13790oJ.A00(r0)
            goto L_0x0041
        L_0x0388:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r4 = r2.A04
            X.8pE r4 = (X.C147368pE) r4
            r4.CrC(r6)
            java.lang.Object r0 = r2.A05
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.5IX r0 = (X.AnonymousClass5IX) r0
            java.lang.String r1 = r0.A08
            java.lang.Object r0 = r2.A02
            X.5J1 r0 = (X.AnonymousClass5J1) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0041
            java.lang.Object r3 = r2.A00
            X.8pE r3 = (X.C147368pE) r3
            java.lang.Object r1 = r2.A03
            X.8pE r1 = (X.C147368pE) r1
            java.lang.Object r0 = r2.A01
            X.8pE r0 = (X.C147368pE) r0
            X.C140828Xz.A00(r4, r3, r1, r0)
            goto L_0x0041
        L_0x03ba:
            java.lang.Object r0 = r2.A04
            X.C2X r0 = (X.C2X) r0
            X.MNZ r1 = r0.AZh()
            r0 = 2131305663(0x7f0924bf, float:1.8229503E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.view.View r10 = r1.A01(r0)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r2.A03
            X.Lu1 r5 = (X.Lu1) r5
            java.lang.Object r4 = r2.A02
            X.BKU r4 = (X.BKU) r4
            java.lang.Object r3 = r2.A05
            X.9Ek r3 = (X.C154939Ek) r3
            java.lang.Object r1 = r2.A00
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r7 = r2.A01
            X.Lu1 r7 = (X.Lu1) r7
            java.lang.Object r0 = r5.A02
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0041
            X.BKN r0 = r4.A0f
            X.9AD r0 = r0.A0l
            r9 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0041
            java.lang.Boolean r0 = r0.A0M
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 == 0) goto L_0x0041
            X.B48 r0 = r3.A03
            java.lang.String r11 = r1.BK7()
            X.C04220Ms.A0B(r11, r9)
            X.B8i r8 = r0.A0Q
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0450
            int r0 = r10.getHeight()
            int r0 = -r0
            int r0 = r0 >> 1
            int r3 = r0 + -10
            android.app.Activity r2 = r8.A04     // Catch:{ NotFoundException -> 0x0449 }
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ NotFoundException -> 0x0449 }
            r0 = 2131834340(0x7f1135e4, float:1.9301788E38)
            java.lang.String r1 = X.C18190wL.A0h(r1, r11, r0)     // Catch:{ NotFoundException -> 0x0449 }
            X.C04220Ms.A06(r1)     // Catch:{ NotFoundException -> 0x0449 }
            X.1qd r0 = new X.1qd     // Catch:{ NotFoundException -> 0x0449 }
            r0.<init>((java.lang.CharSequence) r1)     // Catch:{ NotFoundException -> 0x0449 }
            X.Dnn r1 = new X.Dnn     // Catch:{ NotFoundException -> 0x0449 }
            r1.<init>(r2, r0)     // Catch:{ NotFoundException -> 0x0449 }
            r1.A02(r10, r6, r3, r9)     // Catch:{ NotFoundException -> 0x0449 }
            X.D0f r0 = X.D0f.ABOVE_ANCHOR     // Catch:{ NotFoundException -> 0x0449 }
            r1.A03(r0)     // Catch:{ NotFoundException -> 0x0449 }
            r0 = 5000(0x1388, float:7.006E-42)
            r1.A00 = r0     // Catch:{ NotFoundException -> 0x0449 }
            r1.A0A = r9     // Catch:{ NotFoundException -> 0x0449 }
            X.DvM r0 = r1.A00()     // Catch:{ NotFoundException -> 0x0449 }
            r8.A02 = r9     // Catch:{ NotFoundException -> 0x0449 }
            r0.A05()     // Catch:{ NotFoundException -> 0x0449 }
            goto L_0x0450
        L_0x0449:
            java.lang.String r1 = "ClipsViewerInfoToolTipController"
            java.lang.String r0 = "Missing string resource"
            X.C10450iM.A03(r1, r0)
        L_0x0450:
            r7.A00(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r5.A00(r0)
            goto L_0x0041
        L_0x045c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x047a }
            goto L_0x0479
        L_0x045f:
            r0 = move-exception
            goto L_0x0476
        L_0x0461:
            r0 = move-exception
            r6.clear()     // Catch:{ all -> 0x047a }
            goto L_0x0479
        L_0x0466:
            r0 = move-exception
            r4.clear()     // Catch:{ all -> 0x047a }
            goto L_0x0479
        L_0x046b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x047a }
            goto L_0x0479
        L_0x046e:
            r0 = move-exception
            r8.clear()     // Catch:{ all -> 0x047a }
            goto L_0x0479
        L_0x0473:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x047a }
            goto L_0x0479
        L_0x0476:
            r5.clear()     // Catch:{ all -> 0x047a }
        L_0x0479:
            throw r0     // Catch:{ all -> 0x047a }
        L_0x047a:
            r1 = move-exception
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.C13790oJ.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape4S0600000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
