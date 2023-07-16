package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape21S0100000_I2_1 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape21S0100000_I2_1(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0259 A[LOOP:6: B:107:0x0259->B:341:0x0259, LOOP_END, SYNTHETIC] */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x00e1;
                case 1: goto L_0x00ed;
                case 2: goto L_0x0128;
                case 3: goto L_0x06a9;
                case 4: goto L_0x0132;
                case 5: goto L_0x0170;
                case 6: goto L_0x01b3;
                case 7: goto L_0x0069;
                case 8: goto L_0x0208;
                case 9: goto L_0x0029;
                case 10: goto L_0x0216;
                case 11: goto L_0x009d;
                case 12: goto L_0x024f;
                case 13: goto L_0x037e;
                case 14: goto L_0x0387;
                case 15: goto L_0x0392;
                case 16: goto L_0x0398;
                case 17: goto L_0x03a4;
                case 18: goto L_0x03ab;
                case 19: goto L_0x03b4;
                case 20: goto L_0x03bf;
                case 21: goto L_0x03f6;
                case 22: goto L_0x046c;
                case 23: goto L_0x0475;
                case 24: goto L_0x0487;
                case 25: goto L_0x0494;
                case 26: goto L_0x04a1;
                case 27: goto L_0x04ac;
                case 28: goto L_0x04ce;
                case 29: goto L_0x04d7;
                case 30: goto L_0x04e4;
                case 31: goto L_0x0504;
                case 32: goto L_0x054a;
                case 33: goto L_0x0596;
                case 34: goto L_0x05a2;
                case 35: goto L_0x05bc;
                case 36: goto L_0x05f8;
                case 37: goto L_0x0605;
                case 38: goto L_0x0612;
                case 39: goto L_0x0615;
                case 40: goto L_0x0627;
                case 41: goto L_0x062e;
                case 42: goto L_0x063c;
                case 43: goto L_0x064b;
                case 44: goto L_0x0654;
                case 45: goto L_0x0660;
                case 46: goto L_0x0678;
                case 47: goto L_0x0682;
                case 48: goto L_0x068b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r15.A00
            X.7Zx r2 = (X.C123917Zx) r2
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0096
            X.0pE r0 = r2.A02
            X.061 r1 = r0.A00
            X.061 r0 = X.AnonymousClass061.DESTROYED
            if (r1 == r0) goto L_0x008f
            X.56O r0 = new X.56O
            r0.<init>(r2)
            X.7IU r1 = X.AnonymousClass7IU.A00(r0, r2)
            java.lang.Class<X.56v> r0 = X.C881256v.class
            X.3ak r0 = r1.A01(r0)
            X.56v r0 = (X.C881256v) r0
            X.7En r7 = r0.A00
        L_0x0028:
            return r7
        L_0x0029:
            java.util.HashMap r7 = X.AnonymousClass0wJ.A0y()
            java.lang.Object r0 = r15.A00
            X.6qM r0 = (X.C112886qM) r0
            java.util.List r6 = r0.A03
            int r5 = r6.size()
            r4 = 0
        L_0x0038:
            if (r4 >= r5) goto L_0x0028
            java.lang.Object r3 = r6.get(r4)
            X.6kJ r3 = (X.C109626kJ) r3
            java.lang.Object r2 = r3.A03
            int r0 = r3.A00
            if (r2 == 0) goto L_0x0064
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.6tR r1 = new X.6tR
            r1.<init>(r0, r2)
        L_0x004f:
            java.lang.Object r0 = r7.get(r1)
            if (r0 != 0) goto L_0x005c
            java.util.LinkedHashSet r0 = X.C86134wK.A0u()
            r7.put(r1, r0)
        L_0x005c:
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r3)
            int r4 = r4 + 1
            goto L_0x0038
        L_0x0064:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x004f
        L_0x0069:
            java.lang.Object r3 = r15.A00
            androidx.compose.material.SwipeableV2State r3 = (androidx.compose.material.SwipeableV2State) r3
            X.8pE r0 = r3.A05
            java.lang.Object r7 = r0.getValue()
            if (r7 != 0) goto L_0x0028
            X.8pE r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x06b0
            float r2 = r0.floatValue()
            X.8pE r0 = r3.A06
            java.lang.Object r1 = r0.getValue()
            r0 = 0
            java.lang.Object r7 = androidx.compose.material.SwipeableV2State.A00(r3, r1, r2, r0)
            return r7
        L_0x008f:
            java.lang.String r0 = "You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0096:
            java.lang.String r0 = "You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x009d:
            java.lang.Object r9 = r15.A00
            X.78y r9 = (X.AnonymousClass78y) r9
            X.84X r7 = r9.A04
            monitor-enter(r7)
            boolean r0 = r9.A03     // Catch:{ all -> 0x024c }
            if (r0 != 0) goto L_0x00d5
            r0 = 1
            r9.A03 = r0     // Catch:{ all -> 0x024c }
            int r8 = r7.A00     // Catch:{ all -> 0x00de }
            if (r8 <= 0) goto L_0x00d2
            java.lang.Object[] r6 = r7.A01     // Catch:{ all -> 0x00de }
            r5 = 0
        L_0x00b2:
            r0 = r6[r5]     // Catch:{ all -> 0x00de }
            X.6mz r0 = (X.C111226mz) r0     // Catch:{ all -> 0x00de }
            X.84Z r4 = r0.A05     // Catch:{ all -> 0x00de }
            X.0YY r3 = r0.A0B     // Catch:{ all -> 0x00de }
            int r2 = r4.size()     // Catch:{ all -> 0x00de }
            r1 = 0
        L_0x00bf:
            if (r1 >= r2) goto L_0x00cb
            java.lang.Object r0 = r4.A01(r1)     // Catch:{ all -> 0x00de }
            r3.invoke(r0)     // Catch:{ all -> 0x00de }
            int r1 = r1 + 1
            goto L_0x00bf
        L_0x00cb:
            r4.clear()     // Catch:{ all -> 0x00de }
            int r5 = r5 + 1
            if (r5 < r8) goto L_0x00b2
        L_0x00d2:
            r0 = 0
            r9.A03 = r0     // Catch:{ all -> 0x024c }
        L_0x00d5:
            monitor-exit(r7)
            boolean r0 = X.AnonymousClass78y.A00(r9)
            if (r0 != 0) goto L_0x009d
            goto L_0x067f
        L_0x00de:
            r2 = move-exception
            goto L_0x0248
        L_0x00e1:
            java.lang.Object r0 = r15.A00
            X.7Ii r0 = (X.C121827Ii) r0
            r0.A07()
            r0.A06()
            goto L_0x067f
        L_0x00ed:
            java.lang.Object r6 = r15.A00
            X.7Ii r6 = (X.C121827Ii) r6
            X.8pE r1 = r6.A0H
            X.7HD r0 = X.C86154wM.A0I(r1)
            X.7yH r4 = r0.A01
            int r0 = X.C134747yH.A01(r1)
            r5 = 0
            long r2 = X.AnonymousClass6FM.A00(r5, r0)
            r0 = 0
            X.7HD r1 = new X.7HD
            r1.<init>((X.C134747yH) r4, (X.C121767Ia) r0, (long) r2)
            X.0YY r0 = r6.A0B
            r0.invoke(r1)
            X.7HD r0 = r6.A08
            long r3 = r1.A00
            X.7yH r2 = r0.A01
            X.7Ia r1 = r0.A02
            X.C04220Ms.A0B(r2, r5)
            X.7HD r0 = new X.7HD
            r0.<init>((X.C134747yH) r2, (X.C121767Ia) r1, (long) r3)
            r6.A08 = r0
            X.6qu r1 = r6.A02
            if (r1 == 0) goto L_0x067f
            r0 = 1
            r1.A06 = r0
            goto L_0x067f
        L_0x0128:
            java.lang.Object r0 = r15.A00
            X.C18240wQ.A1G(r0)
            java.lang.Boolean r7 = X.C18180wK.A0Y()
            return r7
        L_0x0132:
            java.lang.Object r0 = r15.A00
            androidx.compose.material.SwipeableV2State r0 = (androidx.compose.material.SwipeableV2State) r0
            X.8pE r0 = r0.A04
            java.util.Iterator r2 = X.C86114wI.A0u(r0)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x016c
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
        L_0x014e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0165
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r1 = java.lang.Math.max(r1, r0)
            goto L_0x014e
        L_0x0165:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L_0x016c
            goto L_0x01a9
        L_0x016c:
            r6 = 2139095040(0x7f800000, float:Infinity)
            goto L_0x0561
        L_0x0170:
            java.lang.Object r0 = r15.A00
            androidx.compose.material.SwipeableV2State r0 = (androidx.compose.material.SwipeableV2State) r0
            X.8pE r0 = r0.A04
            java.util.Iterator r2 = X.C86114wI.A0u(r0)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01af
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
        L_0x018c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a3
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r1 = java.lang.Math.min(r1, r0)
            goto L_0x018c
        L_0x01a3:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L_0x01af
        L_0x01a9:
            float r6 = r0.floatValue()
            goto L_0x0561
        L_0x01af:
            r6 = -8388608(0xffffffffff800000, float:-Infinity)
            goto L_0x0561
        L_0x01b3:
            java.lang.Object r5 = r15.A00
            androidx.compose.material.SwipeableV2State r5 = (androidx.compose.material.SwipeableV2State) r5
            X.8pE r2 = r5.A04
            java.util.Map r1 = X.C86154wM.A0t(r2)
            X.8pE r0 = r5.A06
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = X.C86124wJ.A0j(r0, r1)
            r6 = 0
            if (r0 == 0) goto L_0x0206
            float r4 = r0.floatValue()
        L_0x01ce:
            java.util.Map r1 = X.C86154wM.A0t(r2)
            X.4oM r0 = r5.A0C
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = X.C86124wJ.A0j(r0, r1)
            if (r0 == 0) goto L_0x0204
            float r3 = r0.floatValue()
        L_0x01e2:
            float r3 = r3 - r4
            float r0 = java.lang.Math.abs(r3)
            r2 = 897988541(0x358637bd, float:1.0E-6)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0200
            float r1 = r5.A01()
            float r1 = r1 - r4
            float r1 = r1 / r3
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0561
            r0 = 1065353199(0x3f7fffef, float:0.999999)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r6 = r1
            if (r0 <= 0) goto L_0x0561
        L_0x0200:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0561
        L_0x0204:
            r3 = 0
            goto L_0x01e2
        L_0x0206:
            r4 = 0
            goto L_0x01ce
        L_0x0208:
            java.lang.Object r0 = r15.A00
            X.52x r0 = (X.AnonymousClass52x) r0
            X.8pE r1 = r0.A03
            boolean r0 = X.C86104wH.A1X(r1)
            r0 = r0 ^ 1
            goto L_0x039f
        L_0x0216:
            java.lang.Object r3 = r15.A00
            androidx.compose.runtime.Recomposer r3 = (androidx.compose.runtime.Recomposer) r3
            java.lang.Object r7 = r3.A09
            monitor-enter(r7)
            X.8s9 r2 = androidx.compose.runtime.Recomposer.A01(r3)     // Catch:{ all -> 0x024c }
            X.4wE r0 = r3.A0H     // Catch:{ all -> 0x024c }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x024c }
            X.68B r1 = (X.AnonymousClass68B) r1     // Catch:{ all -> 0x024c }
            X.68B r0 = X.AnonymousClass68B.ShuttingDown     // Catch:{ all -> 0x024c }
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x024c }
            if (r0 <= 0) goto L_0x023b
            monitor-exit(r7)
            if (r2 == 0) goto L_0x067f
            kotlin.Unit r0 = kotlin.Unit.A00
            r2.resumeWith(r0)
            goto L_0x067f
        L_0x023b:
            java.lang.String r1 = "Recomposer shutdown; frame clock awaiter will never resume"
            java.lang.Throwable r0 = r3.A01     // Catch:{ all -> 0x024c }
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x024c }
            r2.<init>(r1)     // Catch:{ all -> 0x024c }
            r2.initCause(r0)     // Catch:{ all -> 0x024c }
            goto L_0x024b
        L_0x0248:
            r0 = 0
            r9.A03 = r0     // Catch:{ all -> 0x024c }
        L_0x024b:
            throw r2     // Catch:{ all -> 0x024c }
        L_0x024c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x024f:
            java.lang.Object r8 = r15.A00
            X.76Z r8 = (X.AnonymousClass76Z) r8
            java.util.Set r7 = r8.A01
            java.util.Iterator r3 = r7.iterator()
        L_0x0259:
            boolean r0 = r3.hasNext()
            r4 = 16
            r14 = 1024(0x400, float:1.435E-42)
            java.lang.String r13 = "Check failed."
            if (r0 == 0) goto L_0x02aa
            java.lang.Object r0 = r3.next()
            X.8pm r0 = (X.C147708pm) r0
            X.7YG r0 = (X.AnonymousClass7YG) r0
            X.7YG r2 = r0.A03
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x02a5
            X.7YG[] r0 = new X.AnonymousClass7YG[r4]
            X.84X r1 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r2.A02
            if (r0 == 0) goto L_0x028d
            r1.A0C(r0)
        L_0x0280:
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0259
            X.7YG r2 = X.AnonymousClass84X.A02(r1, r0)
            int r0 = r2.A00
            r0 = r0 & r14
            if (r0 != 0) goto L_0x0291
        L_0x028d:
            X.C121847Ik.A05(r1, r2)
            goto L_0x0280
        L_0x0291:
            int r0 = r2.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x02a0
            boolean r0 = r2 instanceof X.C875353d
            if (r0 == 0) goto L_0x0280
            java.util.Set r0 = r8.A02
            r0.add(r2)
            goto L_0x0280
        L_0x02a0:
            X.7YG r2 = r2.A02
            if (r2 == 0) goto L_0x0280
            goto L_0x0291
        L_0x02a5:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x02aa:
            r7.clear()
            java.util.LinkedHashSet r6 = X.C86134wK.A0u()
            java.util.Set r5 = r8.A00
            java.util.Iterator r12 = r5.iterator()
        L_0x02b7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0327
            java.lang.Object r3 = r12.next()
            X.8pl r3 = (X.C147698pl) r3
            r0 = r3
            X.7YG r0 = (X.AnonymousClass7YG) r0
            X.7YG r1 = r0.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0318
            r11 = 0
            X.7YG[] r0 = new X.AnonymousClass7YG[r4]
            X.84X r9 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r1.A02
            if (r0 != 0) goto L_0x030e
            X.C121847Ik.A05(r9, r1)
        L_0x02da:
            r10 = 1
            r2 = 0
        L_0x02dc:
            int r0 = r9.A00
            if (r0 == 0) goto L_0x031b
            X.7YG r1 = X.AnonymousClass84X.A02(r9, r0)
            int r0 = r1.A00
            r0 = r0 & r14
            if (r0 != 0) goto L_0x02ed
            X.C121847Ik.A05(r9, r1)
            goto L_0x02dc
        L_0x02ed:
            int r0 = r1.A01
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0309
            boolean r0 = r1 instanceof X.C875353d
            if (r0 == 0) goto L_0x02dc
            X.53d r1 = (X.C875353d) r1
            if (r11 == 0) goto L_0x02fb
            r2 = 1
        L_0x02fb:
            java.util.Set r0 = r8.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0307
            r6.add(r1)
            r10 = 0
        L_0x0307:
            r11 = r1
            goto L_0x02dc
        L_0x0309:
            X.7YG r1 = r1.A02
            if (r1 == 0) goto L_0x02dc
            goto L_0x02ed
        L_0x030e:
            r9.A0C(r0)
            goto L_0x02da
        L_0x0312:
            if (r11 == 0) goto L_0x0318
            X.6Av r0 = r11.A00
            if (r0 != 0) goto L_0x0323
        L_0x0318:
            X.6Av r0 = X.AnonymousClass6Av.Inactive
            goto L_0x0323
        L_0x031b:
            if (r10 == 0) goto L_0x02b7
            if (r2 == 0) goto L_0x0312
            X.8fm r0 = X.C115846w0.A00(r3)
        L_0x0323:
            r3.Bzc(r0)
            goto L_0x02b7
        L_0x0327:
            r5.clear()
            java.util.Set r4 = r8.A02
            java.util.Iterator r3 = r4.iterator()
        L_0x0330:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0357
            java.lang.Object r2 = r3.next()
            X.53d r2 = (X.C875353d) r2
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0330
            X.6Av r1 = r2.A00
            r2.A07()
            X.6Av r0 = r2.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0353
            boolean r0 = r6.contains(r2)
            if (r0 == 0) goto L_0x0330
        L_0x0353:
            X.C115846w0.A01(r2)
            goto L_0x0330
        L_0x0357:
            r4.clear()
            r6.clear()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0379
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0374
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x067f
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x0374:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x0379:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x037e:
            java.lang.Object r0 = r15.A00
            X.53d r0 = (X.C875353d) r0
            r0.A06()
            goto L_0x067f
        L_0x0387:
            java.lang.Object r1 = r15.A00
            X.547 r1 = (X.AnonymousClass547) r1
            r0 = 1
            r1.A03 = r0
            X.0ZU r0 = r1.A02
            goto L_0x04df
        L_0x0392:
            X.546 r7 = new X.546
            r7.<init>()
            return r7
        L_0x0398:
            java.lang.Object r1 = r15.A00
            X.540 r1 = (X.AnonymousClass540) r1
            r0 = 1
            X.8pE r1 = r1.A04
        L_0x039f:
            X.C147368pE.A04(r1, r0)
            goto L_0x067f
        L_0x03a4:
            java.lang.Object r0 = r15.A00
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r0
            X.4qz r7 = r0.A02
            return r7
        L_0x03ab:
            java.lang.Object r0 = r15.A00
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal) r0
            X.4qz r7 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.A00(r0)
            return r7
        L_0x03b4:
            java.lang.Object r0 = r15.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            X.8Fd r0 = (X.AnonymousClass8Fd) r0
            java.lang.Object r7 = r0.invoke()
            return r7
        L_0x03bf:
            java.lang.Object r0 = r15.A00
            X.76a r0 = (X.C1195976a) r0
            X.7H8 r3 = r0.A00
            if (r3 == 0) goto L_0x03ef
            java.util.Map r0 = r3.A07
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r0)
        L_0x03cd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03e1
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r1 = r0.getValue()
            X.6lL r1 = (X.C110236lL) r1
            r0 = 1
            r1.A03 = r0
            goto L_0x03cd
        L_0x03e1:
            X.7Y3 r1 = r3.A06
            X.6sU r0 = r1.A0Y
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x067f
            r0 = 0
            r1.A0P(r0)
            goto L_0x067f
        L_0x03ef:
            java.lang.String r0 = "SubcomposeLayoutState is not attached to SubcomposeLayout"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x03f6:
            java.lang.Object r8 = r15.A00
            X.76n r8 = (X.C1197076n) r8
            r7 = 0
            r8.A00 = r7
            java.util.HashSet r6 = X.C18200wM.A0u()
            X.84X r5 = r8.A03
            int r4 = r5.A00
            if (r4 <= 0) goto L_0x0429
            java.lang.Object[] r3 = r5.A01
            r2 = 0
        L_0x040a:
            r9 = r3[r2]
            X.7Y3 r9 = (X.AnonymousClass7Y3) r9
            X.84X r0 = r8.A04
            java.lang.Object[] r0 = r0.A01
            r1 = r0[r2]
            X.6bM r1 = (X.C104176bM) r1
            X.7IW r0 = r9.A0a
            X.7YG r0 = r0.A02
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0425
            X.7IW r0 = r9.A0a
            X.7YG r0 = r0.A02
            X.C1197076n.A00(r0, r1, r6)
        L_0x0425:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x040a
        L_0x0429:
            r5.A05()
            X.84X r0 = r8.A04
            r0.A05()
            X.84X r5 = r8.A01
            int r4 = r5.A00
            if (r4 <= 0) goto L_0x0450
            java.lang.Object[] r3 = r5.A01
        L_0x0439:
            r2 = r3[r7]
            X.7YG r2 = (X.AnonymousClass7YG) r2
            X.84X r0 = r8.A02
            java.lang.Object[] r0 = r0.A01
            r1 = r0[r7]
            X.6bM r1 = (X.C104176bM) r1
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x044c
            X.C1197076n.A00(r2, r1, r6)
        L_0x044c:
            int r7 = r7 + 1
            if (r7 < r4) goto L_0x0439
        L_0x0450:
            r5.A05()
            X.84X r0 = r8.A02
            r0.A05()
            java.util.Iterator r1 = r6.iterator()
        L_0x045c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x067f
            java.lang.Object r0 = r1.next()
            X.53X r0 = (X.AnonymousClass53X) r0
            r0.A06()
            goto L_0x045c
        L_0x046c:
            java.lang.Object r0 = r15.A00
            X.53X r0 = (X.AnonymousClass53X) r0
            r0.A06()
            goto L_0x067f
        L_0x0475:
            java.lang.Object r2 = r15.A00
            X.53X r2 = (X.AnonymousClass53X) r2
            X.8pV r1 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer"
            X.C04220Ms.A0C(r1, r0)
            X.8pQ r1 = (X.C147488pQ) r1
            r1.C7Y(r2)
            goto L_0x067f
        L_0x0487:
            java.lang.Object r0 = r15.A00
            X.7Y3 r0 = (X.AnonymousClass7Y3) r0
            X.6sU r0 = r0.A0Y
            X.54J r1 = r0.A08
            r0 = 1
            r1.A04 = r0
            goto L_0x067f
        L_0x0494:
            java.lang.Object r0 = r15.A00
            X.54T r0 = (X.AnonymousClass54T) r0
            X.54T r0 = r0.A07
            if (r0 == 0) goto L_0x067f
            r0.A0O()
            goto L_0x067f
        L_0x04a1:
            java.lang.Object r1 = r15.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.7Wz r0 = X.AnonymousClass54T.A0J
            r1.invoke(r0)
            goto L_0x067f
        L_0x04ac:
            java.lang.Object r2 = r15.A00
            androidx.compose.ui.platform.AndroidComposeView r2 = (androidx.compose.ui.platform.AndroidComposeView) r2
            android.view.MotionEvent r0 = r2.A03
            if (r0 == 0) goto L_0x067f
            int r1 = r0.getActionMasked()
            r0 = 7
            if (r1 == r0) goto L_0x04c1
            r0 = 9
            if (r1 == r0) goto L_0x04c1
            goto L_0x067f
        L_0x04c1:
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A01 = r0
            X.7yo r0 = r2.A0b
            r2.post(r0)
            goto L_0x067f
        L_0x04ce:
            java.lang.Object r1 = r15.A00
            X.7YX r1 = (X.AnonymousClass7YX) r1
            r0 = 0
            r1.A00 = r0
            goto L_0x067f
        L_0x04d7:
            java.lang.Object r0 = r15.A00
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
        L_0x04df:
            r0.invoke()
            goto L_0x067f
        L_0x04e4:
            java.lang.Object r2 = r15.A00
            X.7Ye r2 = (X.C123707Ye) r2
            X.7Yg r0 = r2.A02
            X.4zW r0 = r0.A05
            java.util.Locale r1 = r0.getTextLocale()
            X.C04220Ms.A06(r1)
            X.6vM r0 = r2.A01
            android.text.Layout r0 = r0.A08
            java.lang.CharSequence r0 = r0.getText()
            X.C04220Ms.A06(r0)
            X.6bP r7 = new X.6bP
            r7.<init>(r0, r1)
            return r7
        L_0x0504:
            java.lang.Object r0 = r15.A00
            X.7Yf r0 = (X.C123717Yf) r0
            java.util.List r7 = r0.A01
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x051c
            r6 = 0
        L_0x0511:
            X.6u4 r6 = (X.C114896u4) r6
            if (r6 == 0) goto L_0x0566
            X.8l2 r0 = r6.A02
            float r6 = r0.Atb()
            goto L_0x0561
        L_0x051c:
            java.lang.Object r6 = X.C18240wQ.A0b(r7)
            r0 = r6
            X.6u4 r0 = (X.C114896u4) r0
            X.8l2 r0 = r0.A02
            float r5 = r0.Atb()
            int r4 = X.C86104wH.A0B(r7)
            r3 = 1
            if (r3 > r4) goto L_0x0511
        L_0x0530:
            java.lang.Object r2 = r7.get(r3)
            r0 = r2
            X.6u4 r0 = (X.C114896u4) r0
            X.8l2 r0 = r0.A02
            float r1 = r0.Atb()
            int r0 = java.lang.Float.compare(r5, r1)
            if (r0 >= 0) goto L_0x0545
            r6 = r2
            r5 = r1
        L_0x0545:
            if (r3 == r4) goto L_0x0511
            int r3 = r3 + 1
            goto L_0x0530
        L_0x054a:
            java.lang.Object r0 = r15.A00
            X.7Yf r0 = (X.C123717Yf) r0
            java.util.List r7 = r0.A01
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0568
            r6 = 0
        L_0x0557:
            X.6u4 r6 = (X.C114896u4) r6
            if (r6 == 0) goto L_0x0566
            X.8l2 r0 = r6.A02
            float r6 = r0.Avj()
        L_0x0561:
            java.lang.Float r7 = java.lang.Float.valueOf(r6)
            return r7
        L_0x0566:
            r6 = 0
            goto L_0x0561
        L_0x0568:
            java.lang.Object r6 = X.C18240wQ.A0b(r7)
            r0 = r6
            X.6u4 r0 = (X.C114896u4) r0
            X.8l2 r0 = r0.A02
            float r5 = r0.Avj()
            int r4 = X.C86104wH.A0B(r7)
            r3 = 1
            if (r3 > r4) goto L_0x0557
        L_0x057c:
            java.lang.Object r2 = r7.get(r3)
            r0 = r2
            X.6u4 r0 = (X.C114896u4) r0
            X.8l2 r0 = r0.A02
            float r1 = r0.Avj()
            int r0 = java.lang.Float.compare(r5, r1)
            if (r0 >= 0) goto L_0x0591
            r6 = r2
            r5 = r1
        L_0x0591:
            if (r3 == r4) goto L_0x0557
            int r3 = r3 + 1
            goto L_0x057c
        L_0x0596:
            java.lang.Object r0 = r15.A00
            X.6vM r0 = (X.C115526vM) r0
            android.text.Layout r0 = r0.A08
            X.789 r7 = new X.789
            r7.<init>(r0)
            return r7
        L_0x05a2:
            java.lang.Object r0 = r15.A00
            X.7Yy r0 = (X.C123887Yy) r0
            android.view.View r0 = r0.A00
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "input_method"
            java.lang.Object r7 = r1.getSystemService(r0)
            r0 = 437(0x1b5, float:6.12E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r7, r0)
            return r7
        L_0x05bc:
            java.lang.Object r0 = r15.A00
            X.6ib r0 = (X.C108586ib) r0
            X.8pE r2 = r0.A00
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r0 = r0 + -1
            X.C147368pE.A03(r2, r0)
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            if (r0 < 0) goto L_0x05e5
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            if (r0 != 0) goto L_0x0676
            goto L_0x0670
        L_0x05e5:
            java.lang.String r1 = "AdapterWithRefCount.decrementRefCount called too many times (refCount="
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            java.lang.String r0 = X.C86134wK.A0r(r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x05f8:
            java.lang.Object r0 = r15.A00
            X.7Z5 r0 = (X.AnonymousClass7Z5) r0
            android.view.View r1 = r0.A07
            r0 = 0
            android.view.inputmethod.BaseInputConnection r7 = new android.view.inputmethod.BaseInputConnection
            r7.<init>(r1, r0)
            return r7
        L_0x0605:
            java.lang.Object r0 = r15.A00
            X.8nH r0 = (X.C147038nH) r0
            float r0 = r0.AQV()
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            return r7
        L_0x0612:
            java.lang.Object r7 = r15.A00
            return r7
        L_0x0615:
            java.lang.Object r3 = r15.A00
            X.50o r3 = (X.C872050o) r3
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x067f
            X.78y r2 = r3.A0E
            X.0YY r1 = r3.A0I
            X.0ZU r0 = r3.A03
            r2.A02(r3, r0, r1)
            goto L_0x067f
        L_0x0627:
            java.lang.Object r0 = r15.A00
            java.lang.Object r7 = X.C86144wL.A0j(r0)
            return r7
        L_0x062e:
            android.util.SparseArray r7 = X.C86154wM.A0D()
            java.lang.Object r0 = r15.A00
            X.55P r0 = (X.AnonymousClass55P) r0
            android.view.View r0 = r0.A04
            r0.saveHierarchyState(r7)
            return r7
        L_0x063c:
            java.lang.Object r2 = r15.A00
            X.55P r2 = (X.AnonymousClass55P) r2
            android.view.View r1 = r2.A04
            X.0YY r0 = r2.A00
            r0.invoke(r1)
            X.AnonymousClass55P.A01(r2)
            goto L_0x067f
        L_0x064b:
            java.lang.Object r0 = r15.A00
            X.55P r0 = (X.AnonymousClass55P) r0
            android.view.View r1 = r0.A04
            X.0YY r0 = r0.A01
            goto L_0x065c
        L_0x0654:
            java.lang.Object r0 = r15.A00
            X.55P r0 = (X.AnonymousClass55P) r0
            android.view.View r1 = r0.A04
            X.0YY r0 = r0.A02
        L_0x065c:
            r0.invoke(r1)
            goto L_0x067f
        L_0x0660:
            java.lang.Object r1 = r15.A00
            X.54n r1 = (X.C877854n) r1
            X.8mM r0 = r1.getParentLayoutCoordinates()
            if (r0 == 0) goto L_0x0676
            X.6t4 r0 = r1.m18getPopupContentSizebOM6tXw()
            if (r0 == 0) goto L_0x0676
        L_0x0670:
            r0 = 1
        L_0x0671:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        L_0x0676:
            r0 = 0
            goto L_0x0671
        L_0x0678:
            java.lang.Object r1 = r15.A00
            androidx.lifecycle.CoroutineLiveData r1 = (androidx.lifecycle.CoroutineLiveData) r1
            r0 = 0
            r1.A00 = r0
        L_0x067f:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x0682:
            java.lang.Object r0 = r15.A00
            X.06C r0 = (X.AnonymousClass06C) r0
            X.56u r7 = X.AnonymousClass7GW.A01(r0)
            return r7
        L_0x068b:
            java.lang.Object r3 = r15.A00
            X.7Zx r3 = (X.C123917Zx) r3
            android.content.Context r0 = r3.A05
            r2 = 0
            if (r0 == 0) goto L_0x06a7
            android.content.Context r1 = r0.getApplicationContext()
        L_0x0698:
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto L_0x069f
            r2 = r1
            android.app.Application r2 = (android.app.Application) r2
        L_0x069f:
            android.os.Bundle r0 = r3.A06
            X.58d r7 = new X.58d
            r7.<init>(r2, r0, r3)
            return r7
        L_0x06a7:
            r1 = r2
            goto L_0x0698
        L_0x06a9:
            java.lang.String r0 = "dismiss"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x06b0:
            X.8pE r0 = r3.A06
            java.lang.Object r7 = r0.getValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape21S0100000_I2_1.invoke():java.lang.Object");
    }
}
