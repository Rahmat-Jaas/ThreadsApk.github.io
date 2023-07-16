package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape147S0100000_I2_2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape147S0100000_I2_2(Object obj, int i) {
        super(1);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0304, code lost:
        r1.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x040f, code lost:
        return new com.facebook.redex.IDxEResultShape438S0100000_2_I2(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04cd, code lost:
        return java.lang.Boolean.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04ce, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015b, code lost:
        r0.A01.A01(r2, r10.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x027e, code lost:
        r1.A01 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0308;
                case 1: goto L_0x02fc;
                case 2: goto L_0x02f3;
                case 3: goto L_0x02e8;
                case 4: goto L_0x02af;
                case 5: goto L_0x02a4;
                case 6: goto L_0x0299;
                case 7: goto L_0x050c;
                case 8: goto L_0x050c;
                case 9: goto L_0x04d0;
                case 10: goto L_0x04bb;
                case 11: goto L_0x0282;
                case 12: goto L_0x049e;
                case 13: goto L_0x0481;
                case 14: goto L_0x0470;
                case 15: goto L_0x0276;
                case 16: goto L_0x026d;
                case 17: goto L_0x01ec;
                case 18: goto L_0x01df;
                case 19: goto L_0x01d2;
                case 20: goto L_0x044a;
                case 21: goto L_0x0192;
                case 22: goto L_0x042d;
                case 23: goto L_0x0410;
                case 24: goto L_0x0185;
                case 25: goto L_0x0176;
                case 26: goto L_0x0406;
                case 27: goto L_0x0005;
                case 28: goto L_0x0005;
                case 29: goto L_0x03e9;
                case 30: goto L_0x0164;
                case 31: goto L_0x0155;
                case 32: goto L_0x014e;
                case 33: goto L_0x013e;
                case 34: goto L_0x0120;
                case 35: goto L_0x03e4;
                case 36: goto L_0x00a4;
                case 37: goto L_0x03d6;
                case 38: goto L_0x03b9;
                case 39: goto L_0x0097;
                case 40: goto L_0x0348;
                case 41: goto L_0x0069;
                case 42: goto L_0x0049;
                case 43: goto L_0x003f;
                case 44: goto L_0x0342;
                case 45: goto L_0x0338;
                case 46: goto L_0x0031;
                case 47: goto L_0x0319;
                case 48: goto L_0x0025;
                case 49: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            X.7XO r0 = (X.AnonymousClass7XO) r0
            X.0YY r0 = r0.A01
            if (r0 == 0) goto L_0x0312
            r0.invoke(r11)
        L_0x0012:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x0015:
            java.lang.Object r0 = r10.A00
            X.50o r0 = (X.C872050o) r0
            android.os.Handler r2 = r0.getHandler()
            X.0ZU r0 = r0.A0H
            X.7ys r1 = new X.7ys
            r1.<init>(r0)
            goto L_0x0092
        L_0x0025:
            X.8nV r11 = (X.C147168nV) r11
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            X.7Y3 r0 = (X.AnonymousClass7Y3) r0
            r0.CkD(r11)
            goto L_0x0012
        L_0x0031:
            X.8mv r1 = X.C86124wJ.A0Q(r11)
            java.lang.Object r0 = r10.A00
            X.799 r0 = (X.AnonymousClass799) r0
            int r0 = r0.A00
            X.AnonymousClass7Aq.A01(r1, r0)
            goto L_0x0012
        L_0x003f:
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            X.8pE r0 = (X.C147368pE) r0
            r0.CrC(r11)
            goto L_0x0012
        L_0x0049:
            X.7YM r11 = (X.AnonymousClass7YM) r11
            java.lang.Object r3 = X.C86124wJ.A0r(r11, r10)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r3
            java.util.List r0 = r11.A05
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x0012
            androidx.compose.ui.platform.AndroidComposeView r0 = r3.A0M
            X.6qT r2 = r0.A0Y
            X.0YY r1 = r3.A0P
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape16S0200000_I2 r0 = X.C86164wN.A0v(r11, r3, r0)
            r2.A00(r11, r0, r1)
            goto L_0x0012
        L_0x0069:
            X.0ZU r11 = (X.AnonymousClass0ZU) r11
            java.lang.Object r2 = X.C86124wJ.A0r(r11, r10)
            android.view.View r2 = (android.view.View) r2
            android.os.Handler r0 = r2.getHandler()
            if (r0 == 0) goto L_0x0085
            android.os.Looper r1 = r0.getLooper()
        L_0x007b:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 != r0) goto L_0x0087
            r11.invoke()
            goto L_0x0012
        L_0x0085:
            r1 = 0
            goto L_0x007b
        L_0x0087:
            android.os.Handler r2 = r2.getHandler()
            if (r2 == 0) goto L_0x0012
            X.7yp r1 = new X.7yp
            r1.<init>(r11)
        L_0x0092:
            r2.post(r1)
            goto L_0x0012
        L_0x0097:
            X.0ZU r11 = (X.AnonymousClass0ZU) r11
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            r0.CaB(r11)
            goto L_0x0012
        L_0x00a4:
            X.8pY r11 = (X.C147568pY) r11
            r5 = 0
            X.C04220Ms.A0B(r11, r5)
            boolean r0 = r11.BX8()
            if (r0 == 0) goto L_0x0012
            X.78z r1 = r11.AQ8()
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00bb
            r11.BaV()
        L_0x00bb:
            java.util.Map r0 = r1.A08
            java.lang.Object r4 = r10.A00
            X.78z r4 = (X.AnonymousClass78z) r4
            java.util.Iterator r3 = X.AnonymousClass0wJ.A0z(r0)
        L_0x00c5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.util.Map$Entry r0 = X.C18180wK.A0o(r3)
            java.lang.Object r2 = r0.getKey()
            X.6bL r2 = (X.C104166bL) r2
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            X.54T r0 = r11.Aoy()
            X.AnonymousClass78z.A00(r2, r4, r0, r1)
            goto L_0x00c5
        L_0x00e5:
            X.54T r3 = r11.Aoy()
        L_0x00e9:
            X.54T r3 = r3.A07
            X.C04220Ms.A0A(r3)
            X.8pY r0 = r4.A07
            X.54T r0 = r0.Aoy()
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 != 0) goto L_0x0012
            X.C04220Ms.A0B(r3, r5)
            X.8ld r0 = r3.A0G()
            java.util.Map r0 = r0.AQ9()
            java.util.Iterator r2 = X.C86154wM.A0s(r0)
        L_0x0109:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r1 = r2.next()
            X.6bL r1 = (X.C104166bL) r1
            X.C18200wM.A1S(r3, r1)
            int r0 = r3.ANp(r1)
            X.AnonymousClass78z.A00(r1, r4, r3, r0)
            goto L_0x0109
        L_0x0120:
            r6 = 0
            X.C04220Ms.A0B(r11, r6)
            java.lang.Object r5 = r10.A00
            java.util.List r5 = (java.util.List) r5
            int r4 = r5.size()
            r3 = 0
        L_0x012d:
            if (r3 >= r4) goto L_0x0012
            java.lang.Object r2 = r5.get(r3)
            X.7Xy r2 = (X.C123657Xy) r2
            r1 = 0
            r0 = 12
            X.C122067Jz.A04(r2, r1, r6, r6, r0)
            int r3 = r3 + 1
            goto L_0x012d
        L_0x013e:
            r3 = 0
            X.C04220Ms.A0B(r11, r3)
            java.lang.Object r2 = r10.A00
            X.7Xy r2 = (X.C123657Xy) r2
            r1 = 0
            r0 = 12
            X.C122067Jz.A04(r2, r1, r3, r3, r0)
            goto L_0x0012
        L_0x014e:
            X.75O r0 = X.C86144wL.A0K(r11)
            java.lang.String r2 = "onSizeChanged"
            goto L_0x015b
        L_0x0155:
            X.75O r0 = X.C86144wL.A0K(r11)
            java.lang.String r2 = "onGloballyPositioned"
        L_0x015b:
            X.86i r1 = r0.A01
            java.lang.Object r0 = r10.A00
            r1.A01(r2, r0)
            goto L_0x0012
        L_0x0164:
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.Object r1 = r10.A00
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r1 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r1
            X.8s9 r0 = r1.A01
            if (r0 == 0) goto L_0x0171
            r0.AC9(r11)
        L_0x0171:
            r0 = 0
            r1.A01 = r0
            goto L_0x0012
        L_0x0176:
            X.8q1 r11 = (X.C147848q1) r11
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            X.547 r0 = (X.AnonymousClass547) r0
            X.548 r0 = r0.A06
            r0.A03(r11)
            goto L_0x0012
        L_0x0185:
            X.8q1 r11 = (X.C147848q1) r11
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            X.6uo r0 = (X.C115286uo) r0
            r0.A03(r11)
            goto L_0x0012
        L_0x0192:
            X.8pw r11 = (X.C147798pw) r11
            r3 = 0
            X.C04220Ms.A0B(r11, r3)
            java.lang.Object r2 = r10.A00
            X.53i r2 = (X.C875853i) r2
            float r0 = r2.A03
            X.7Wz r11 = (X.C123457Wz) r11
            r11.A03 = r0
            float r0 = r2.A04
            r11.A04 = r0
            float r0 = r2.A00
            r11.A00 = r0
            r0 = 0
            r11.A06 = r0
            r11.A07 = r0
            r11.A05 = r0
            float r0 = r2.A02
            r11.A02 = r0
            float r0 = r2.A01
            r11.A01 = r0
            long r0 = r2.A07
            r11.A0B = r0
            X.8fo r0 = r2.A08
            X.C04220Ms.A0B(r0, r3)
            r11.A0C = r0
            boolean r0 = r2.A0A
            r11.A0E = r0
            long r0 = r2.A05
            r11.A08 = r0
            long r0 = r2.A06
            r11.A0A = r0
            goto L_0x0012
        L_0x01d2:
            r1 = 0
            X.C04220Ms.A0B(r11, r1)
            java.lang.Object r0 = r10.A00
            X.7Xy r0 = (X.C123657Xy) r0
            X.C122067Jz.A02(r0, r1, r1)
            goto L_0x0012
        L_0x01df:
            X.86i r2 = X.AnonymousClass75O.A00(r11)
            java.lang.Object r1 = r10.A00
            java.lang.String r0 = "onBuildDrawCache"
            r2.A01(r0, r1)
            goto L_0x0012
        L_0x01ec:
            r4 = 0
            X.C04220Ms.A0B(r11, r4)
            java.lang.Object r1 = r10.A00
            X.78y r1 = (X.AnonymousClass78y) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0012
            X.84X r6 = r1.A04
            monitor-enter(r6)
            X.6mz r8 = r1.A01     // Catch:{ all -> 0x0519 }
            X.C04220Ms.A0A(r8)     // Catch:{ all -> 0x0519 }
            int r0 = r8.A01     // Catch:{ all -> 0x0519 }
            if (r0 > 0) goto L_0x026a
            java.lang.Object r7 = r8.A03     // Catch:{ all -> 0x0519 }
            X.C04220Ms.A0A(r7)     // Catch:{ all -> 0x0519 }
            X.6pM r1 = r8.A02     // Catch:{ all -> 0x0519 }
            if (r1 != 0) goto L_0x0219
            X.6pM r1 = new X.6pM     // Catch:{ all -> 0x0519 }
            r1.<init>()     // Catch:{ all -> 0x0519 }
            r8.A02 = r1     // Catch:{ all -> 0x0519 }
            X.7EA r0 = r8.A04     // Catch:{ all -> 0x0519 }
            r0.A01(r7, r1)     // Catch:{ all -> 0x0519 }
        L_0x0219:
            int r0 = r8.A00     // Catch:{ all -> 0x0519 }
            int r5 = r1.A00(r11, r0)     // Catch:{ all -> 0x0519 }
            boolean r0 = r11 instanceof X.C147358pD     // Catch:{ all -> 0x0519 }
            if (r0 == 0) goto L_0x0262
            int r0 = r8.A00     // Catch:{ all -> 0x0519 }
            if (r5 == r0) goto L_0x0262
            r9 = r11
            X.8pD r9 = (X.C147358pD) r9     // Catch:{ all -> 0x0519 }
            r3 = r9
            X.7Wf r3 = (X.C123267Wf) r3     // Catch:{ all -> 0x0519 }
            X.53U r0 = r3.A00     // Catch:{ all -> 0x0519 }
            X.6rY r2 = X.C122127Kl.A06(r0)     // Catch:{ all -> 0x0519 }
            X.53U r2 = (X.AnonymousClass53U) r2     // Catch:{ all -> 0x0519 }
            androidx.compose.runtime.snapshots.Snapshot r1 = X.C122127Kl.A00()     // Catch:{ all -> 0x0519 }
            X.0ZU r0 = r3.A01     // Catch:{ all -> 0x0519 }
            X.53U r0 = X.C123267Wf.A00(r2, r3, r1, r0, r4)     // Catch:{ all -> 0x0519 }
            X.7EA r0 = r0.A01     // Catch:{ all -> 0x0519 }
            if (r0 == 0) goto L_0x0248
            java.lang.Object[] r4 = r0.A01     // Catch:{ all -> 0x0519 }
        L_0x0245:
            r3 = 0
            int r2 = r4.length     // Catch:{ all -> 0x0519 }
            goto L_0x024b
        L_0x0248:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0519 }
            goto L_0x0245
        L_0x024b:
            if (r3 >= r2) goto L_0x0259
            r1 = r4[r3]     // Catch:{ all -> 0x0519 }
            if (r1 == 0) goto L_0x0259
            X.7Ew r0 = r8.A06     // Catch:{ all -> 0x0519 }
            r0.A04(r1, r11)     // Catch:{ all -> 0x0519 }
            int r3 = r3 + 1
            goto L_0x024b
        L_0x0259:
            java.util.HashMap r1 = r8.A08     // Catch:{ all -> 0x0519 }
            java.lang.Object r0 = r9.Abn()     // Catch:{ all -> 0x0519 }
            r1.put(r11, r0)     // Catch:{ all -> 0x0519 }
        L_0x0262:
            r0 = -1
            if (r5 != r0) goto L_0x026a
            X.7Ew r0 = r8.A07     // Catch:{ all -> 0x0519 }
            r0.A04(r11, r7)     // Catch:{ all -> 0x0519 }
        L_0x026a:
            monitor-exit(r6)
            goto L_0x0012
        L_0x026d:
            java.lang.Object r1 = r10.A00
            X.6mz r1 = (X.C111226mz) r1
            int r0 = r1.A01
            int r0 = r0 + -1
            goto L_0x027e
        L_0x0276:
            java.lang.Object r1 = r10.A00
            X.6mz r1 = (X.C111226mz) r1
            int r0 = r1.A01
            int r0 = r0 + 1
        L_0x027e:
            r1.A01 = r0
            goto L_0x0012
        L_0x0282:
            java.lang.Object r3 = X.C86124wJ.A0r(r11, r10)
            java.util.List r3 = (java.util.List) r3
            int r2 = r3.size()
            r1 = 0
        L_0x028d:
            if (r1 >= r2) goto L_0x0012
            java.lang.Object r0 = r3.get(r1)
            X.C86134wK.A1L(r0, r11)
            int r1 = r1 + 1
            goto L_0x028d
        L_0x0299:
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r11)
            goto L_0x0012
        L_0x02a4:
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            X.8p9 r0 = (X.C147318p9) r0
            r0.CZU(r11)
            goto L_0x0012
        L_0x02af:
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.String r0 = "Recomposer effect job completed"
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            r6.<init>(r0)
            r6.initCause(r11)
            java.lang.Object r5 = r10.A00
            androidx.compose.runtime.Recomposer r5 = (androidx.compose.runtime.Recomposer) r5
            java.lang.Object r4 = r5.A09
            monitor-enter(r4)
            X.8sG r3 = r5.A04     // Catch:{ all -> 0x051c }
            r2 = 0
            if (r3 == 0) goto L_0x02dc
            X.4wE r1 = r5.A0H     // Catch:{ all -> 0x051c }
            X.68B r0 = X.AnonymousClass68B.ShuttingDown     // Catch:{ all -> 0x051c }
            r1.CrC(r0)     // Catch:{ all -> 0x051c }
            r3.AC7(r6)     // Catch:{ all -> 0x051c }
            r5.A03 = r2     // Catch:{ all -> 0x051c }
            r0 = 0
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r0 = X.C86164wN.A11(r5, r11, r0)     // Catch:{ all -> 0x051c }
            r3.BQv(r0)     // Catch:{ all -> 0x051c }
            goto L_0x02e5
        L_0x02dc:
            r5.A01 = r6     // Catch:{ all -> 0x051c }
            X.4wE r1 = r5.A0H     // Catch:{ all -> 0x051c }
            X.68B r0 = X.AnonymousClass68B.ShutDown     // Catch:{ all -> 0x051c }
            r1.CrC(r0)     // Catch:{ all -> 0x051c }
        L_0x02e5:
            monitor-exit(r4)
            goto L_0x0012
        L_0x02e8:
            android.view.Choreographer r1 = X.AnonymousClass7WF.A00
            java.lang.Object r0 = r10.A00
            android.view.Choreographer$FrameCallback r0 = (android.view.Choreographer.FrameCallback) r0
            r1.removeFrameCallback(r0)
            goto L_0x0012
        L_0x02f3:
            java.lang.Object r1 = r10.A00
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            int r0 = r1.A00
            int r0 = r0 + -1
            goto L_0x0304
        L_0x02fc:
            java.lang.Object r1 = r10.A00
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            int r0 = r1.A00
            int r0 = r0 + 1
        L_0x0304:
            r1.A00 = r0
            goto L_0x0012
        L_0x0308:
            X.75O r11 = (X.AnonymousClass75O) r11
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            r11.A00 = r0
            goto L_0x0012
        L_0x0312:
            java.lang.String r0 = "onTouchEvent"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0319:
            X.6ug r11 = (X.C115206ug) r11
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            androidx.compose.ui.text.font.FontFamilyResolverImpl r0 = (androidx.compose.ui.text.font.FontFamilyResolverImpl) r0
            r2 = 0
            X.7yQ r3 = r11.A03
            int r5 = r11.A00
            int r6 = r11.A01
            java.lang.Object r4 = r11.A04
            X.6ug r1 = new X.6ug
            r1.<init>(r2, r3, r4, r5, r6)
            X.4oM r0 = androidx.compose.ui.text.font.FontFamilyResolverImpl.A00(r0, r1)
            java.lang.Object r3 = r0.getValue()
            return r3
        L_0x0338:
            java.lang.Object r0 = r10.A00
            X.8m8 r0 = (X.C146368m8) r0
            kotlin.Unit r3 = kotlin.Unit.A00
            r0.D7w(r3)
            return r3
        L_0x0342:
            java.lang.Object r1 = r10.A00
            r0 = 12
            goto L_0x040a
        L_0x0348:
            X.6sq r11 = (X.C114196sq) r11
            android.view.KeyEvent r5 = r11.A00
            r4 = 0
            java.lang.Object r3 = r10.A00
            androidx.compose.ui.platform.AndroidComposeView r3 = (androidx.compose.ui.platform.AndroidComposeView) r3
            int r0 = r5.getKeyCode()
            long r6 = X.C98176Em.A00(r0)
            long r1 = X.AnonymousClass79K.A0B
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0376
            boolean r0 = r5.isShiftPressed()
            r2 = 1
            if (r0 == 0) goto L_0x0367
            r2 = 2
        L_0x0367:
            int r1 = X.C98166El.A00(r5)
            r0 = 2
            if (r1 != r0) goto L_0x04c9
            X.8pW r0 = r3.A0Q
            boolean r4 = r0.Bgd(r2)
            goto L_0x04c9
        L_0x0376:
            long r1 = X.AnonymousClass79K.A06
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x037e
            r2 = 4
            goto L_0x0367
        L_0x037e:
            long r1 = X.AnonymousClass79K.A05
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0386
            r2 = 3
            goto L_0x0367
        L_0x0386:
            long r1 = X.AnonymousClass79K.A07
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x038e
            r2 = 5
            goto L_0x0367
        L_0x038e:
            long r1 = X.AnonymousClass79K.A04
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0396
            r2 = 6
            goto L_0x0367
        L_0x0396:
            long r1 = X.AnonymousClass79K.A03
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03b7
            long r1 = X.AnonymousClass79K.A08
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03b7
            long r1 = X.AnonymousClass79K.A0A
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03b7
            long r1 = X.AnonymousClass79K.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03b4
            long r1 = X.AnonymousClass79K.A09
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04c9
        L_0x03b4:
            r2 = 8
            goto L_0x0367
        L_0x03b7:
            r2 = 7
            goto L_0x0367
        L_0x03b9:
            X.6sp r11 = (X.C114186sp) r11
            int r2 = r11.A00
            r0 = 1
            java.lang.Object r1 = r10.A00
            android.view.View r1 = (android.view.View) r1
            if (r2 != r0) goto L_0x03ca
            boolean r4 = r1.isInTouchMode()
            goto L_0x04c9
        L_0x03ca:
            boolean r0 = r1.isInTouchMode()
            if (r0 == 0) goto L_0x04ce
            boolean r4 = r1.requestFocusFromTouch()
            goto L_0x04c9
        L_0x03d6:
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            X.84X r0 = (X.AnonymousClass84X) r0
            r0.A0C(r11)
            java.lang.Boolean r3 = X.C18180wK.A0Y()
            return r3
        L_0x03e4:
            java.lang.Object r1 = r10.A00
            r0 = 11
            goto L_0x040a
        L_0x03e9:
            android.view.MotionEvent r11 = (android.view.MotionEvent) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            int r1 = r11.getActionMasked()
            java.lang.Object r0 = r10.A00
            android.view.View r0 = (android.view.View) r0
            switch(r1) {
                case 0: goto L_0x0400;
                case 1: goto L_0x0400;
                case 2: goto L_0x0400;
                case 3: goto L_0x0400;
                case 4: goto L_0x0400;
                case 5: goto L_0x0400;
                case 6: goto L_0x0400;
                default: goto L_0x03fa;
            }
        L_0x03fa:
            boolean r4 = r0.dispatchGenericMotionEvent(r11)
            goto L_0x04c9
        L_0x0400:
            boolean r4 = r0.dispatchTouchEvent(r11)
            goto L_0x04c9
        L_0x0406:
            java.lang.Object r1 = r10.A00
            r0 = 10
        L_0x040a:
            com.facebook.redex.IDxEResultShape438S0100000_2_I2 r3 = new com.facebook.redex.IDxEResultShape438S0100000_2_I2
            r3.<init>(r1, r0)
            return r3
        L_0x0410:
            double r2 = X.C86124wJ.A00(r11)
            java.lang.Object r1 = r10.A00
            X.L8m r1 = (X.C39928L8m) r1
            X.8fp r0 = r1.A05
            double r2 = r0.BQo(r2)
            float r0 = r1.A01
            double r4 = (double) r0
            float r0 = r1.A00
            double r6 = (double) r0
            double r0 = X.AnonymousClass8bI.A00(r2, r4, r6)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L_0x042d:
            double r3 = X.C86124wJ.A00(r11)
            java.lang.Object r1 = r10.A00
            X.L8m r1 = (X.C39928L8m) r1
            X.8fp r2 = r1.A03
            float r0 = r1.A01
            double r5 = (double) r0
            float r0 = r1.A00
            double r7 = (double) r0
            double r0 = X.AnonymousClass8bI.A00(r3, r5, r7)
            double r0 = r2.BQo(r0)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L_0x044a:
            X.53d r11 = (X.C875353d) r11
            r4 = 0
            X.C04220Ms.A0B(r11, r4)
            java.lang.Object r0 = r10.A00
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04c9
            r0 = 1024(0x400, float:1.435E-42)
            X.7YG r1 = X.C121847Ik.A00(r11, r0)
            boolean r0 = r1 instanceof X.C875353d
            if (r0 == 0) goto L_0x0469
            if (r1 == 0) goto L_0x0469
            boolean r4 = X.AnonymousClass7FL.A00(r11)
            goto L_0x04c9
        L_0x0469:
            java.lang.String r0 = "Focus search landed at the root."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0470:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r11.retainAll(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0481:
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            X.0YY r0 = (X.AnonymousClass0YY) r0
            java.lang.Object r3 = r0.invoke(r11)
            androidx.compose.runtime.snapshots.Snapshot r3 = (androidx.compose.runtime.snapshots.Snapshot) r3
            java.lang.Object r2 = X.C122127Kl.A04
            monitor-enter(r2)
            X.7yd r1 = X.C122127Kl.A01     // Catch:{ all -> 0x04b8 }
            int r0 = r3.A04()     // Catch:{ all -> 0x04b8 }
            X.7yd r0 = r1.A01(r0)     // Catch:{ all -> 0x04b8 }
            X.C122127Kl.A01 = r0     // Catch:{ all -> 0x04b8 }
            monitor-exit(r2)
            return r3
        L_0x049e:
            X.7yd r11 = (X.C134947yd) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            java.lang.Object r2 = X.C122127Kl.A04
            monitor-enter(r2)
            int r1 = X.C122127Kl.A00     // Catch:{ all -> 0x04b8 }
            int r0 = r1 + 1
            X.C122127Kl.A00 = r0     // Catch:{ all -> 0x04b8 }
            monitor-exit(r2)
            java.lang.Object r0 = r10.A00
            X.0YY r0 = (X.AnonymousClass0YY) r0
            X.53G r3 = new X.53G
            r3.<init>(r11, r0, r1)
            return r3
        L_0x04b8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x04bb:
            java.lang.Object r0 = X.C86124wJ.A0r(r11, r10)
            X.7WZ r0 = (X.AnonymousClass7WZ) r0
            X.8lb r0 = r0.A00
            if (r0 == 0) goto L_0x04ce
            boolean r4 = r0.ABk(r11)
        L_0x04c9:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            return r3
        L_0x04ce:
            r4 = 1
            goto L_0x04c9
        L_0x04d0:
            java.util.List r11 = (java.util.List) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            java.util.LinkedHashMap r3 = X.C18220wO.A0y()
            int r0 = r11.size()
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L_0x04ea
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x04ea:
            int r0 = r11.size()
            if (r2 >= r0) goto L_0x0503
            java.lang.Object r1 = r11.get(r2)
            X.C18240wQ.A1I(r1)
            int r0 = r2 + 1
            java.lang.Object r0 = r11.get(r0)
            r3.put(r1, r0)
            int r2 = r2 + 2
            goto L_0x04ea
        L_0x0503:
            java.lang.Object r0 = r10.A00
            X.0YY r0 = (X.AnonymousClass0YY) r0
            java.lang.Object r3 = r0.invoke(r3)
            return r3
        L_0x050c:
            java.lang.Object r0 = r10.A00
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.contains(r11)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0519:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x051c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2.invoke(java.lang.Object):java.lang.Object");
    }
}
