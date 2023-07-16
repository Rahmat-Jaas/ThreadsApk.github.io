package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape14S0201000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0240, code lost:
        r13.A00 = r6;
        r1 = r4.collect(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c0, code lost:
        r13.A00 = r2;
        r3 = null;
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03c4, code lost:
        r1 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r5, r13, new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2(r4, r3, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04cd, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x073a, code lost:
        r1 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2(r4, r3);
        r13.A00 = r5;
        r1 = r2.collect(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0874, code lost:
        if (r1 == r0) goto L_0x08e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0876, code lost:
        r1 = kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x087c, code lost:
        r1 = X.C86164wN.A0o(r3, r2, r1);
        r13.A00 = r5;
        r1 = X.C25599DoZ.A00(r13, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x08b5, code lost:
        X.AnonymousClass0OU.A00(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x08e5, code lost:
        if (r1 != r0) goto L_0x0920;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08e7, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023b, code lost:
        r1 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2(r3, (java.util.List) r5, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x054c  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:111:0x0272=Splitter:B:111:0x0272, B:127:0x02be=Splitter:B:127:0x02be} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r10 = r13
            int r0 = r13.A03
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0055;
                case 2: goto L_0x008d;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00fb;
                case 6: goto L_0x011c;
                case 7: goto L_0x013d;
                case 8: goto L_0x01cf;
                case 9: goto L_0x01f2;
                case 10: goto L_0x0219;
                case 11: goto L_0x0248;
                case 12: goto L_0x0294;
                case 13: goto L_0x02e2;
                case 14: goto L_0x0006;
                case 15: goto L_0x0313;
                case 16: goto L_0x0330;
                case 17: goto L_0x04c0;
                case 18: goto L_0x0371;
                case 19: goto L_0x0388;
                case 20: goto L_0x03a9;
                case 21: goto L_0x0006;
                case 22: goto L_0x0006;
                case 23: goto L_0x03cf;
                case 24: goto L_0x03ed;
                case 25: goto L_0x041a;
                case 26: goto L_0x0446;
                case 27: goto L_0x0460;
                case 28: goto L_0x04ec;
                case 29: goto L_0x051b;
                case 30: goto L_0x056f;
                case 31: goto L_0x05ac;
                case 32: goto L_0x05c7;
                case 33: goto L_0x05f5;
                case 34: goto L_0x0618;
                case 35: goto L_0x0648;
                case 36: goto L_0x0667;
                case 37: goto L_0x06a6;
                case 38: goto L_0x06d1;
                case 39: goto L_0x06ff;
                case 40: goto L_0x071f;
                case 41: goto L_0x0747;
                case 42: goto L_0x078c;
                case 43: goto L_0x07cd;
                case 44: goto L_0x07f2;
                case 45: goto L_0x081b;
                case 46: goto L_0x084d;
                case 47: goto L_0x0887;
                case 48: goto L_0x08e8;
                case 49: goto L_0x08a7;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r13.A00
            r1 = 1
            if (r2 == 0) goto L_0x0014
            if (r2 == r1) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0014:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r5 = r13.A02
            java.lang.Object r4 = r13.A01
            r13.A00 = r1
            r3 = 0
            r2 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r4, (X.C146958n9) r3, (int) r2)
            java.lang.Object r1 = X.AnonymousClass7Ja.A00(r0, r13, r1)
            goto L_0x08e5
        L_0x002a:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 == r5) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0038:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A01
            r4 = 0
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r1 = X.C86154wM.A12(r1, r4)
            X.4tk r3 = X.AnonymousClass7Aj.A02(r1)
            java.lang.Object r2 = r13.A02
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2
            r1.<init>(r2, r4)
            r13.A00 = r5
            java.lang.Object r1 = r3.collect(r1, r13)
            goto L_0x08e5
        L_0x0055:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r6 = 1
            if (r1 == 0) goto L_0x0080
            if (r1 != r6) goto L_0x0088
            java.lang.Object r1 = r13.A01
            X.4qz r1 = (X.C83224qz) r1
            X.AnonymousClass0OU.A00(r14)
        L_0x0065:
            X.Ew2 r2 = r1.Aa1()
            float r5 = androidx.compose.animation.core.SuspendAnimationKt.A00(r2)
            java.lang.Object r4 = r13.A02
            r3 = 0
            kotlin.jvm.internal.KtLambdaShape2S0100001_I2 r2 = new kotlin.jvm.internal.KtLambdaShape2S0100001_I2
            r2.<init>(r4, r5, r3)
            r13.A01 = r1
            r13.A00 = r6
            java.lang.Object r2 = X.AnonymousClass6EJ.A00(r13, r2)
            if (r2 != r0) goto L_0x0065
            return r0
        L_0x0080:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A01
            X.4qz r1 = (X.C83224qz) r1
            goto L_0x0065
        L_0x0088:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x008d:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x009b
            if (r1 == r5) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x009b:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A01
            X.8py r4 = (X.C147818py) r4
            java.lang.Object r3 = r13.A02
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r3
            r2 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0201000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0201000_I2
            r1.<init>((androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r3, (X.C146958n9) r2)
            r13.A00 = r5
            java.lang.Object r1 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r4, r13, r1)
            goto L_0x08e5
        L_0x00b4:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x00c2
            if (r1 == r3) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00c2:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A01
            X.8p3 r2 = (X.C147258p3) r2
            java.lang.Object r1 = r13.A02
            X.7Uv r1 = (X.C122987Uv) r1
            r13.A00 = r3
            java.lang.Object r1 = r2.AJQ(r1, r13)
            goto L_0x08e5
        L_0x00d5:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r4 = 1
            if (r1 == 0) goto L_0x00e3
            if (r1 == r4) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00e3:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r3 = r13.A01
            X.8p3 r3 = (X.C147258p3) r3
            java.lang.Object r2 = r13.A02
            X.7Uv r2 = (X.C122987Uv) r2
            X.7Uw r1 = new X.7Uw
            r1.<init>(r2)
            r13.A00 = r4
            java.lang.Object r1 = r3.AJQ(r1, r13)
            goto L_0x08e5
        L_0x00fb:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x0109
            if (r1 == r3) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0109:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A02
            X.8p3 r2 = (X.C147258p3) r2
            java.lang.Object r1 = r13.A01
            X.8pE r1 = (X.C147368pE) r1
            r13.A00 = r3
            java.lang.Object r1 = kotlin.jvm.internal.KtLambdaShape6S0110000_I2.A00(r2, r1, r13)
            goto L_0x08e5
        L_0x011c:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x012a
            if (r1 == r3) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x012a:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A01
            X.8pE r2 = (X.C147368pE) r2
            java.lang.Object r1 = r13.A02
            X.8p3 r1 = (X.C147258p3) r1
            r13.A00 = r3
            java.lang.Object r1 = kotlin.jvm.internal.KtLambdaShape6S0110000_I2.A01(r1, r2, r13)
            goto L_0x08e5
        L_0x013d:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r6 = 1
            r4 = 0
            if (r1 == 0) goto L_0x014d
            if (r1 != r6) goto L_0x0148
            goto L_0x0176
        L_0x0148:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x014d:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A01
            X.4qz r1 = (X.C83224qz) r1
            X.Ew2 r1 = r1.Aa1()
            X.8sG r5 = X.C148838sG.A00(r1)
            if (r5 == 0) goto L_0x01c0
            java.lang.Object r2 = r13.A02     // Catch:{ CancellationException -> 0x01ae }
            X.7Y0 r2 = (X.AnonymousClass7Y0) r2     // Catch:{ CancellationException -> 0x01ae }
            r2.A02 = r6     // Catch:{ CancellationException -> 0x01ae }
            X.8lv r3 = r2.A08     // Catch:{ CancellationException -> 0x01ae }
            r1 = 2
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r2 = X.C86164wN.A0p(r2, r5, r4, r1)     // Catch:{ CancellationException -> 0x01ae }
            r13.A00 = r6     // Catch:{ CancellationException -> 0x01ae }
            X.66k r1 = X.C967166k.Default     // Catch:{ CancellationException -> 0x01ae }
            java.lang.Object r1 = r3.CgB(r1, r13, r2)     // Catch:{ CancellationException -> 0x01ae }
            if (r1 != r0) goto L_0x0179
            return r0
        L_0x0176:
            X.AnonymousClass0OU.A00(r14)     // Catch:{ CancellationException -> 0x01ae }
        L_0x0179:
            java.lang.Object r8 = r13.A02     // Catch:{ CancellationException -> 0x01ae }
            X.7Y0 r8 = (X.AnonymousClass7Y0) r8     // Catch:{ CancellationException -> 0x01ae }
            X.6o5 r7 = r8.A06     // Catch:{ CancellationException -> 0x01ae }
            X.84X r6 = r7.A00     // Catch:{ CancellationException -> 0x01ae }
            int r0 = r6.A00     // Catch:{ CancellationException -> 0x01ae }
            int r0 = r0 + -1
            r5 = 0
            X.8bH r0 = X.AnonymousClass8bH.A02(r5, r0)     // Catch:{ CancellationException -> 0x01ae }
            int r3 = r0.A00     // Catch:{ CancellationException -> 0x01ae }
            int r2 = r0.A01     // Catch:{ CancellationException -> 0x01ae }
            if (r3 > r2) goto L_0x01a2
        L_0x0190:
            java.lang.Object[] r0 = r6.A01     // Catch:{ CancellationException -> 0x01ae }
            r0 = r0[r3]     // Catch:{ CancellationException -> 0x01ae }
            X.6oo r0 = (X.C112006oo) r0     // Catch:{ CancellationException -> 0x01ae }
            X.8s9 r1 = r0.A01     // Catch:{ CancellationException -> 0x01ae }
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ CancellationException -> 0x01ae }
            r1.resumeWith(r0)     // Catch:{ CancellationException -> 0x01ae }
            if (r3 == r2) goto L_0x01a2
            int r3 = r3 + 1
            goto L_0x0190
        L_0x01a2:
            r6.A05()     // Catch:{ CancellationException -> 0x01ae }
            r8.A02 = r5
            r7.A00(r4)
            r8.A03 = r5
            goto L_0x0920
        L_0x01ae:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x01b0 }
        L_0x01b0:
            r3 = move-exception
            java.lang.Object r2 = r13.A02
            X.7Y0 r2 = (X.AnonymousClass7Y0) r2
            r1 = 0
            r2.A02 = r1
            X.6o5 r0 = r2.A06
            r0.A00(r4)
            r2.A03 = r1
            throw r3
        L_0x01c0:
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r1)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x01cf:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r6 = 1
            if (r1 == 0) goto L_0x01dd
            if (r1 == r6) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01dd:
            X.AnonymousClass0OU.A00(r14)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r1 = r13.A02
            X.8fV r1 = (X.C142738fV) r1
            X.4tk r4 = r1.ApX()
            java.lang.Object r3 = r13.A01
            X.8pE r3 = (X.C147368pE) r3
            r2 = 0
            goto L_0x023b
        L_0x01f2:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r6 = 1
            if (r1 == 0) goto L_0x0200
            if (r1 == r6) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0200:
            X.AnonymousClass0OU.A00(r14)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r1 = r13.A02
            X.8fV r1 = (X.C142738fV) r1
            X.4tk r4 = r1.ApX()
            java.lang.Object r2 = r13.A01
            X.8pE r2 = (X.C147368pE) r2
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r1.<init>((X.C147368pE) r2, (java.util.List) r3, (int) r6)
            goto L_0x0240
        L_0x0219:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r6 = 1
            if (r1 == 0) goto L_0x0227
            if (r1 == r6) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0227:
            X.AnonymousClass0OU.A00(r14)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r1 = r13.A02
            X.8fV r1 = (X.C142738fV) r1
            X.4tk r4 = r1.ApX()
            java.lang.Object r3 = r13.A01
            X.8pE r3 = (X.C147368pE) r3
            r2 = 2
        L_0x023b:
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r1.<init>((X.C147368pE) r3, (java.util.List) r5, (int) r2)
        L_0x0240:
            r13.A00 = r6
            java.lang.Object r1 = r4.collect(r1, r13)
            goto L_0x08e5
        L_0x0248:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x0257
            if (r1 != r3) goto L_0x0252
            goto L_0x0286
        L_0x0252:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0257:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A02
            X.6kG r2 = (X.C109596kG) r2
            X.7JH r6 = r2.A02
            X.8pE r1 = r6.A09
            boolean r1 = X.C86104wH.A1X(r1)
            java.lang.Object r7 = r13.A01
            X.8fL r7 = (X.C142638fL) r7
            if (r1 == 0) goto L_0x0272
            boolean r1 = r7 instanceof X.C122777Tu
            if (r1 != 0) goto L_0x0272
            X.7Tu r7 = X.AnonymousClass6WR.A00
        L_0x0272:
            long r1 = r2.A01     // Catch:{ CancellationException -> 0x02df }
            X.7Eg r8 = new X.7Eg     // Catch:{ CancellationException -> 0x02df }
            r8.<init>(r1)     // Catch:{ CancellationException -> 0x02df }
            r9 = 0
            r12 = 12
            r13.A00 = r3     // Catch:{ CancellationException -> 0x02df }
            r11 = r9
            java.lang.Object r1 = X.AnonymousClass7JH.A02(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ CancellationException -> 0x02df }
            if (r1 != r0) goto L_0x0289
            return r0
        L_0x0286:
            X.AnonymousClass0OU.A00(r14)     // Catch:{ CancellationException -> 0x02df }
        L_0x0289:
            java.lang.Object r0 = r13.A02     // Catch:{ CancellationException -> 0x02df }
            X.6kG r0 = (X.C109596kG) r0     // Catch:{ CancellationException -> 0x02df }
            r1 = 0
            X.8pE r0 = r0.A03     // Catch:{ CancellationException -> 0x02df }
            X.C147368pE.A04(r0, r1)     // Catch:{ CancellationException -> 0x02df }
            goto L_0x02df
        L_0x0294:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x02a3
            if (r1 != r3) goto L_0x029e
            goto L_0x02d2
        L_0x029e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x02a3:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A02
            X.6kI r2 = (X.C109616kI) r2
            X.7JH r6 = r2.A02
            X.8pE r1 = r6.A09
            boolean r1 = X.C86104wH.A1X(r1)
            java.lang.Object r7 = r13.A01
            X.8fL r7 = (X.C142638fL) r7
            if (r1 == 0) goto L_0x02be
            boolean r1 = r7 instanceof X.C122777Tu
            if (r1 != 0) goto L_0x02be
            X.7Tu r7 = X.AnonymousClass6WS.A00
        L_0x02be:
            long r1 = r2.A01     // Catch:{ CancellationException -> 0x02df }
            X.7Eg r8 = new X.7Eg     // Catch:{ CancellationException -> 0x02df }
            r8.<init>(r1)     // Catch:{ CancellationException -> 0x02df }
            r9 = 0
            r12 = 12
            r13.A00 = r3     // Catch:{ CancellationException -> 0x02df }
            r11 = r9
            java.lang.Object r1 = X.AnonymousClass7JH.A02(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ CancellationException -> 0x02df }
            if (r1 != r0) goto L_0x02d5
            return r0
        L_0x02d2:
            X.AnonymousClass0OU.A00(r14)     // Catch:{ CancellationException -> 0x02df }
        L_0x02d5:
            java.lang.Object r0 = r13.A02     // Catch:{ CancellationException -> 0x02df }
            X.6kI r0 = (X.C109616kI) r0     // Catch:{ CancellationException -> 0x02df }
            r1 = 0
            X.8pE r0 = r0.A03     // Catch:{ CancellationException -> 0x02df }
            X.C147368pE.A04(r0, r1)     // Catch:{ CancellationException -> 0x02df }
        L_0x02df:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x02e2:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r4 = 1
            if (r1 == 0) goto L_0x02f0
            if (r1 == r4) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x02f0:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            X.7YC r1 = (X.AnonymousClass7YC) r1
            X.8fa r3 = r1.A00
            if (r3 != 0) goto L_0x02fd
            X.8fa r3 = r1.A02
        L_0x02fd:
            X.8mM r2 = r1.A01
            if (r2 == 0) goto L_0x0920
            boolean r1 = r2.BRS()
            if (r1 == 0) goto L_0x0920
            java.lang.Object r1 = r13.A01
            X.0ZU r1 = (X.AnonymousClass0ZU) r1
            r13.A00 = r4
            java.lang.Object r1 = r3.AAw(r2, r13, r1)
            goto L_0x08e5
        L_0x0313:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r13.A00
            r1 = 1
            if (r2 == 0) goto L_0x0321
            if (r2 == r1) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0321:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r5 = r13.A02
            X.8py r5 = (X.C147818py) r5
            java.lang.Object r4 = r13.A01
            r13.A00 = r1
            r3 = 0
            r2 = 2
            goto L_0x03c4
        L_0x0330:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r13.A00
            r1 = 1
            if (r2 == 0) goto L_0x033e
            if (r2 == r1) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x033e:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r3 = r13.A02
            X.8py r3 = (X.C147818py) r3
            java.lang.Object r2 = r13.A01
            r13.A00 = r1
            r1 = 18
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r8 = X.C86154wM.A0z(r2, r1)
            r1 = 37
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r7 = X.C86154wM.A12(r2, r1)
            r1 = 38
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r6 = X.C86154wM.A12(r2, r1)
            r1 = 9
            kotlin.jvm.internal.KtLambdaShape167S0100000_I2 r9 = X.C86164wN.A0u(r2, r1)
            r5 = 0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5 r4 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r1 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r3, r13, r4)
            if (r1 == r0) goto L_0x0874
            kotlin.Unit r1 = kotlin.Unit.A00
            goto L_0x0874
        L_0x0371:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r2 = 1
            if (r1 == 0) goto L_0x037f
            if (r1 == r2) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x037f:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r5 = r13.A02
            X.8py r5 = (X.C147818py) r5
            r4 = 0
            goto L_0x03c0
        L_0x0388:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x0396
            if (r1 == r3) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0396:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A02
            X.8py r2 = (X.C147818py) r2
            java.lang.Object r1 = r13.A01
            X.8mA r1 = (X.C146388mA) r1
            r13.A00 = r3
            java.lang.Object r1 = X.AnonymousClass6E6.A00(r1, r2, r13)
            goto L_0x08e5
        L_0x03a9:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r2 = 1
            if (r1 == 0) goto L_0x03b7
            if (r1 == r2) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x03b7:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r5 = r13.A02
            X.8py r5 = (X.C147818py) r5
            java.lang.Object r4 = r13.A01
        L_0x03c0:
            r13.A00 = r2
            r3 = 0
            r2 = 3
        L_0x03c4:
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2
            r1.<init>(r4, r3, r2)
            java.lang.Object r1 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r5, r13, r1)
            goto L_0x0874
        L_0x03cf:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x03dd
            if (r1 == r5) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x03dd:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A01
            X.8fV r1 = (X.C142738fV) r1
            X.4tk r2 = r1.ApX()
            java.lang.Object r4 = r13.A02
            r3 = 4
            goto L_0x073a
        L_0x03ed:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r9 = 1
            if (r1 == 0) goto L_0x03fb
            if (r1 == r9) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x03fb:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r3 = r13.A02
            r5 = 0
            java.lang.Object r2 = r13.A01
            r1 = 43
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r7 = X.C86154wM.A0z(r2, r1)
            r13.A00 = r9
            X.0YM r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2
            r6 = r5
            r8 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = X.AnonymousClass7Ja.A01(r13, r2)
            goto L_0x0874
        L_0x041a:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r2 = 1
            if (r1 == 0) goto L_0x0428
            if (r1 == r2) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0428:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            X.6lJ r1 = (X.C110216lJ) r1
            X.7JH r6 = r1.A01
            r1 = 0
            java.lang.Float r8 = X.C86154wM.A0W(r1)
            java.lang.Object r7 = r13.A01
            X.8fL r7 = (X.C142638fL) r7
            r9 = 0
            r12 = 12
            r13.A00 = r2
            r11 = r9
            java.lang.Object r1 = X.AnonymousClass7JH.A02(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x08e5
        L_0x0446:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x0454
            if (r1 == r5) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0454:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A02
            X.4tk r2 = (X.C84714tk) r2
            java.lang.Object r4 = r13.A01
            r3 = 6
            goto L_0x073a
        L_0x0460:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0473
            if (r1 != r2) goto L_0x046e
            X.AnonymousClass0OU.A00(r14)     // Catch:{ all -> 0x04a8 }
            goto L_0x0490
        L_0x046e:
            java.lang.IllegalStateException r4 = X.AnonymousClass0wJ.A0a()
            throw r4
        L_0x0473:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A01     // Catch:{ all -> 0x04a8 }
            androidx.compose.runtime.Recomposer r1 = (androidx.compose.runtime.Recomposer) r1     // Catch:{ all -> 0x04a8 }
            r13.A00 = r2     // Catch:{ all -> 0x04a8 }
            X.4wE r4 = r1.A0H     // Catch:{ all -> 0x04a8 }
            r2 = 9
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2     // Catch:{ all -> 0x04a8 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x04a8 }
            java.lang.Object r1 = X.C25752DrO.A00(r13, r1, r4)     // Catch:{ all -> 0x04a8 }
            if (r1 == r0) goto L_0x048d
            kotlin.Unit r1 = kotlin.Unit.A00     // Catch:{ all -> 0x04a8 }
        L_0x048d:
            if (r1 != r0) goto L_0x0490
            return r0
        L_0x0490:
            java.lang.Object r2 = r13.A02
            android.view.View r2 = (android.view.View) r2
            X.6vH r1 = X.C1188172j.A00(r2)
            java.lang.Object r0 = r13.A01
            if (r1 != r0) goto L_0x0920
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r0 = 2131296831(0x7f09023f, float:1.821159E38)
            r2.setTag(r0, r3)
            goto L_0x0920
        L_0x04a8:
            r4 = move-exception
            java.lang.Object r2 = r13.A02
            android.view.View r2 = (android.view.View) r2
            X.6vH r1 = X.C1188172j.A00(r2)
            java.lang.Object r0 = r13.A01
            if (r1 != r0) goto L_0x04cd
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r0 = 2131296831(0x7f09023f, float:1.821159E38)
            r2.setTag(r0, r3)
            throw r4
        L_0x04c0:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x04ce
            if (r1 == r3) goto L_0x08b5
            java.lang.IllegalStateException r4 = X.AnonymousClass0wJ.A0a()
        L_0x04cd:
            throw r4
        L_0x04ce:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A01
            X.8py r2 = (X.C147818py) r2
            java.lang.Object r1 = r13.A02
            X.7WM r1 = (X.AnonymousClass7WM) r1
            X.8mA r1 = r1.A00
            if (r1 == 0) goto L_0x04e5
            r13.A00 = r3
            java.lang.Object r1 = X.AnonymousClass6E6.A00(r1, r2, r13)
            goto L_0x08e5
        L_0x04e5:
            java.lang.String r0 = "longPressDragObserver"
            X.C04220Ms.A0E(r0)
            r4 = 0
            throw r4
        L_0x04ec:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x04fa
            if (r1 == r5) goto L_0x0512
            java.lang.IllegalStateException r4 = X.AnonymousClass0wJ.A0a()
            throw r4
        L_0x04fa:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A01
            X.Ezi r4 = (X.C28172Ezi) r4
            java.lang.Object r3 = r13.A02
            r2 = 7
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2
            r1.<init>(r3, r2)
            r13.A00 = r5
            java.lang.Object r1 = r4.collect(r1, r13)
            if (r1 != r0) goto L_0x0515
            return r0
        L_0x0512:
            X.AnonymousClass0OU.A00(r14)
        L_0x0515:
            X.4VV r4 = new X.4VV
            r4.<init>()
            throw r4
        L_0x051b:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r6 = 1
            if (r1 == 0) goto L_0x0562
            if (r1 != r6) goto L_0x056a
            java.lang.Object r1 = r13.A02
            X.4qz r1 = (X.C83224qz) r1
            X.AnonymousClass0OU.A00(r14)
        L_0x052b:
            java.lang.Object r8 = r13.A01
            X.54n r8 = (X.C877854n) r8
            int[] r7 = r8.A0G
            r5 = 0
            r4 = r7[r5]
            r3 = r7[r6]
            android.view.View r2 = r8.A08
            r2.getLocationOnScreen(r7)
            r2 = r7[r5]
            if (r4 != r2) goto L_0x0543
            r2 = r7[r6]
            if (r3 == r2) goto L_0x0546
        L_0x0543:
            r8.A07()
        L_0x0546:
            boolean r2 = X.AnonymousClass7Ja.A06(r1)
            if (r2 == 0) goto L_0x0920
            X.4hp r4 = X.C78064hp.A00
            r13.A02 = r1
            r13.A00 = r6
            X.Ew2 r3 = r13.getContext()
            X.865 r2 = X.C148788sB.A00
            r3.AOA(r2)
            java.lang.Object r2 = X.AnonymousClass6EJ.A00(r13, r4)
            if (r2 != r0) goto L_0x052b
            return r0
        L_0x0562:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            X.4qz r1 = (X.C83224qz) r1
            goto L_0x0546
        L_0x056a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x056f:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x0586
            if (r1 != r5) goto L_0x05a7
            X.AnonymousClass0OU.A00(r14)
        L_0x057b:
            java.lang.Object r0 = r13.A02
            X.6mM r0 = (X.C110836mM) r0
            X.0ZU r0 = r0.A04
            r0.invoke()
            goto L_0x0920
        L_0x0586:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A01
            X.4qz r1 = (X.C83224qz) r1
            java.lang.Object r4 = r13.A02
            X.6mM r4 = (X.C110836mM) r4
            androidx.lifecycle.CoroutineLiveData r3 = r4.A03
            X.Ew2 r1 = r1.Aa1()
            X.7Zy r2 = new X.7Zy
            r2.<init>(r3, r1)
            X.0YP r1 = r4.A05
            r13.A00 = r5
            java.lang.Object r1 = r1.invoke(r2, r13)
            if (r1 != r0) goto L_0x057b
            return r0
        L_0x05a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x05ac:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x05ba
            if (r1 == r5) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x05ba:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A02
            java.lang.Object r2 = r13.A01
            X.4tk r2 = (X.C84714tk) r2
            r3 = 8
            goto L_0x073a
        L_0x05c7:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r2 = 1
            if (r1 == 0) goto L_0x05d5
            if (r1 == r2) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x05d5:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) r1
            X.062 r4 = r1.A00
            java.lang.Object r5 = r13.A01
            r13.A00 = r2
            X.061 r3 = X.AnonymousClass061.RESUMED
            X.8bg r1 = X.C1370685y.A01()
            r6 = 0
            r7 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (X.C146958n9) r6, (int) r7)
            java.lang.Object r1 = X.C25599DoZ.A00(r13, r1, r2)
            goto L_0x08e5
        L_0x05f5:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x0603
            if (r1 == r3) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0603:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) r1
            X.062 r2 = r1.A00
            java.lang.Object r1 = r13.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r13.A00 = r3
            java.lang.Object r1 = X.C98346Fd.A00(r2, r13, r1)
            goto L_0x08e5
        L_0x0618:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r2 = 1
            if (r1 == 0) goto L_0x0631
            if (r1 != r2) goto L_0x0643
            X.AnonymousClass0OU.A00(r14)
        L_0x0624:
            java.lang.Object r0 = r13.A02
            X.7Zy r0 = (X.C123927Zy) r0
            androidx.lifecycle.CoroutineLiveData r1 = r0.A00
            java.lang.Object r0 = r13.A01
            r1.A0H(r0)
            goto L_0x0920
        L_0x0631:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            X.7Zy r1 = (X.C123927Zy) r1
            androidx.lifecycle.CoroutineLiveData r1 = r1.A00
            r13.A00 = r2
            java.lang.Object r1 = r1.A0L(r13)
            if (r1 != r0) goto L_0x0624
            return r0
        L_0x0643:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0648:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x0656
            if (r1 == r3) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0656:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A02
            java.lang.Object r1 = r13.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r13.A00 = r3
            java.lang.Object r1 = r1.invoke(r2, r13)
            goto L_0x08e5
        L_0x0667:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r7 = 1
            if (r1 == 0) goto L_0x0675
            if (r1 == r7) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0675:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r6 = r13.A01
            X.0MZ r5 = new X.0MZ
            r5.<init>()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.A00 = r1
            java.lang.Object r1 = r13.A02
            X.6lN r1 = (X.C110256lN) r1
            X.Ezi r4 = r1.A04
            r3 = 0
            r1 = 10
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r2.<init>(r1, r3)
            r1 = 50
            com.facebook.redex.IDxFlowShape96S0200000_4_I2 r3 = new com.facebook.redex.IDxFlowShape96S0200000_4_I2
            r3.<init>(r1, r4, r2)
            r2 = 0
            com.facebook.redex.IDxFCollectorShape83S0200000_1_I2 r1 = new com.facebook.redex.IDxFCollectorShape83S0200000_1_I2
            r1.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r5)
            r13.A00 = r7
            java.lang.Object r1 = r3.collect(r1, r13)
            goto L_0x08e5
        L_0x06a6:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x06b4
            if (r1 == r5) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x06b4:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A01
            r1 = 25
            com.facebook.redex.IDxFlowShape251S0100000_2_I2 r4 = new com.facebook.redex.IDxFlowShape251S0100000_2_I2
            r4.<init>(r2, r1)
            java.lang.Object r3 = r13.A02
            r2 = 9
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2
            r1.<init>(r3, r2)
            r13.A00 = r5
            java.lang.Object r1 = r4.collect(r1, r13)
            goto L_0x08e5
        L_0x06d1:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 0
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L_0x06f6
            if (r1 != r3) goto L_0x08b5
            java.lang.Object r2 = r13.A02
            X.4r0 r2 = (X.C83234r0) r2
            X.AnonymousClass0OU.A00(r14)
        L_0x06e3:
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r14 == r1) goto L_0x06e8
            r3 = 0
        L_0x06e8:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r13.A02 = r5
            r13.A00 = r4
            java.lang.Object r1 = r2.emit(r1, r13)
            goto L_0x08e5
        L_0x06f6:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A02
            X.4r0 r2 = (X.C83234r0) r2
            r14 = r5
            goto L_0x06e3
        L_0x06ff:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x070d
            if (r1 == r5) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x070d:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            androidx.paging.PageFetcherSnapshot r1 = (androidx.paging.PageFetcherSnapshot) r1
            X.4wD r1 = r1.A08
            X.4tk r2 = X.AnonymousClass7C4.A01(r1)
            java.lang.Object r4 = r13.A01
            r3 = 12
            goto L_0x073a
        L_0x071f:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x072d
            if (r1 == r5) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x072d:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            androidx.paging.PageFetcherSnapshot r1 = (androidx.paging.PageFetcherSnapshot) r1
            X.4tk r2 = r1.A0A
            java.lang.Object r4 = r13.A01
            r3 = 13
        L_0x073a:
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2
            r1.<init>(r4, r3)
            r13.A00 = r5
            java.lang.Object r1 = r2.collect(r1, r13)
            goto L_0x08e5
        L_0x0747:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x075a
            if (r1 != r3) goto L_0x0787
            X.AnonymousClass0OU.A00(r14)
        L_0x0753:
            X.6Fs r14 = (X.C98486Fs) r14
            boolean r0 = r14 instanceof X.C885659e
            if (r0 == 0) goto L_0x076e
            return r14
        L_0x075a:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A01
            androidx.paging.PagingSource r2 = (androidx.paging.PagingSource) r2
            java.lang.Object r1 = r13.A02
            X.6ou r1 = (X.C112056ou) r1
            r13.A00 = r3
            java.lang.Object r14 = r2.A01(r1, r13)
            if (r14 != r0) goto L_0x0753
            return r0
        L_0x076e:
            boolean r0 = r14 instanceof X.C885559d
            if (r0 != 0) goto L_0x0782
            boolean r0 = r14 instanceof X.C885459c
            if (r0 == 0) goto L_0x077d
            java.lang.String r0 = "Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x077d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0782:
            X.59d r14 = (X.C885559d) r14
            java.lang.Throwable r0 = r14.A00
            throw r0
        L_0x0787:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x078c:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r6 = 0
            r5 = 1
            if (r1 == 0) goto L_0x079c
            if (r1 != r5) goto L_0x0797
            goto L_0x07b7
        L_0x0797:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x079c:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A02     // Catch:{ all -> 0x07c3 }
            X.4wD r4 = (X.C86064wD) r4     // Catch:{ all -> 0x07c3 }
            java.lang.Object r3 = r13.A01     // Catch:{ all -> 0x07c3 }
            X.0YP r3 = (X.AnonymousClass0YP) r3     // Catch:{ all -> 0x07c3 }
            r2 = 38
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2     // Catch:{ all -> 0x07c3 }
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r4, (X.C146958n9) r6, (int) r2)     // Catch:{ all -> 0x07c3 }
            r13.A00 = r5     // Catch:{ all -> 0x07c3 }
            java.lang.Object r1 = X.AnonymousClass7Ja.A01(r13, r1)     // Catch:{ all -> 0x07c3 }
            if (r1 != r0) goto L_0x07ba
            return r0
        L_0x07b7:
            X.AnonymousClass0OU.A00(r14)     // Catch:{ all -> 0x07c3 }
        L_0x07ba:
            java.lang.Object r0 = r13.A02     // Catch:{ all -> 0x07c3 }
            X.4wD r0 = (X.C86064wD) r0     // Catch:{ all -> 0x07c3 }
            r0.ADR(r6)     // Catch:{ all -> 0x07c3 }
            goto L_0x0920
        L_0x07c3:
            r1 = move-exception
            java.lang.Object r0 = r13.A02
            X.8m8 r0 = (X.C146368m8) r0
            r0.ADR(r1)
            goto L_0x0920
        L_0x07cd:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r6 = 1
            if (r1 == 0) goto L_0x07db
            if (r1 == r6) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x07db:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r5 = r13.A02
            java.lang.Object r4 = r13.A01
            r3 = 0
            r2 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2
            r1.<init>(r4, r5, r3, r2)
            r13.A00 = r6
            java.lang.Object r1 = X.AnonymousClass7Ja.A01(r13, r1)
            goto L_0x08e5
        L_0x07f2:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r2 = 1
            if (r1 == 0) goto L_0x0800
            if (r1 == r2) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0800:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r6 = r13.A01
            java.lang.Object r1 = r13.A02
            X.76o r1 = (X.C1197176o) r1
            X.59Y r5 = r1.A02
            r13.A00 = r2
            androidx.paging.SingleRunner r4 = r5.A06
            r3 = 0
            r2 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2
            r1.<init>(r5, r6, r3, r2)
            java.lang.Object r1 = r4.A00(r13, r1)
            goto L_0x0874
        L_0x081b:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 2
            r2 = 1
            if (r1 != 0) goto L_0x08b5
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A01
            X.Ew2 r4 = (X.C27952Ew2) r4
            X.869 r1 = X.AnonymousClass869.A00
            boolean r1 = X.C04220Ms.A0I(r4, r1)
            if (r1 == 0) goto L_0x0847
            java.lang.Object r5 = r13.A02
            X.76o r5 = (X.C1197176o) r5
            r13.A00 = r2
            X.4tk r4 = r5.A03
            r3 = 0
            r2 = 44
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r1.<init>(r5, r3, r2)
            java.lang.Object r1 = X.C25817DsW.A00(r13, r1, r4)
            goto L_0x0874
        L_0x0847:
            java.lang.Object r3 = r13.A02
            r2 = 0
            r1 = 22
            goto L_0x087c
        L_0x084d:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 2
            r2 = 1
            if (r1 != 0) goto L_0x08b5
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A01
            X.Ew2 r4 = (X.C27952Ew2) r4
            X.869 r1 = X.AnonymousClass869.A00
            boolean r1 = X.C04220Ms.A0I(r4, r1)
            java.lang.Object r3 = r13.A02
            if (r1 == 0) goto L_0x0879
            X.76o r3 = (X.C1197176o) r3
            r13.A00 = r2
            X.59Y r1 = r3.A02
            X.4tk r2 = r1.A09
            r1 = 14
            java.lang.Object r1 = X.C86144wL.A0k(r3, r13, r2, r1)
        L_0x0874:
            if (r1 == r0) goto L_0x08e5
            kotlin.Unit r1 = kotlin.Unit.A00
            goto L_0x08e5
        L_0x0879:
            r2 = 0
            r1 = 23
        L_0x087c:
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r3, r2, r1)
            r13.A00 = r5
            java.lang.Object r1 = X.C25599DoZ.A00(r13, r4, r1)
            goto L_0x08e5
        L_0x0887:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r3 = 1
            if (r1 == 0) goto L_0x0895
            if (r1 == r3) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0895:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            X.GTJ r1 = (X.GTJ) r1
            X.4wE r2 = r1.A0B
            java.lang.Object r1 = r13.A01
            r13.A00 = r3
            java.lang.Object r1 = r2.emit(r1, r13)
            goto L_0x08e5
        L_0x08a7:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r7 = 1
            if (r1 == 0) goto L_0x08b9
            if (r1 == r7) goto L_0x08b5
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x08b5:
            X.AnonymousClass0OU.A00(r14)
            goto L_0x0920
        L_0x08b9:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r2 = r13.A02
            com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController r2 = (com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController) r2
            X.3Bz r1 = r2.A00
            X.39U r6 = r1.A03
            java.lang.String r2 = r2.A01
            r1 = 47
            java.lang.String r5 = X.AnonymousClass00U.A0A(r2, r1)
            java.lang.Object r4 = r13.A01
            X.4qz r4 = (X.C83224qz) r4
            boolean r1 = X.C86154wM.A1Y(r7, r5, r4)
            r3 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S1100000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape3S1100000_I2
            r2.<init>(r6, r5, r3, r1)
            r1 = 3
            X.4wB r1 = X.C25599DoZ.A01(r3, r2, r4, r1)
            r13.A00 = r7
            java.lang.Object r1 = r1.AA2(r13)
        L_0x08e5:
            if (r1 != r0) goto L_0x0920
            return r0
        L_0x08e8:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r8 = 0
            java.lang.String r3 = "_effectId"
            r2 = 1
            if (r1 == 0) goto L_0x094c
            if (r1 != r2) goto L_0x096f
            X.AnonymousClass0OU.A00(r14)
        L_0x08f7:
            X.3b6 r14 = (X.C62903b6) r14
            boolean r0 = r14 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0923
            X.1jA r14 = (X.AnonymousClass1jA) r14
            java.lang.Object r3 = r14.A00
            com.instagram.camera.effect.models.CameraAREffect r3 = (com.instagram.camera.effect.models.CameraAREffect) r3
            com.facebook.cameracore.ardelivery.model.ARRequestAsset r2 = X.C29144Fim.A00(r3)
            java.lang.Object r1 = r13.A01
            X.GQN r1 = (X.GQN) r1
            X.Gd9 r0 = r2.A02
            java.lang.String r0 = r0.A09
            X.GQN.A00(r2, r1, r0)
            java.lang.Object r0 = r13.A02
            X.7dR r0 = (X.C125537dR) r0
            X.6bk r1 = r0.A01
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.GTJ r0 = r1.A00
            r0.A05 = r3
        L_0x0920:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0923:
            boolean r0 = r14 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0920
            java.lang.String r1 = "Failed to fetch effect: "
            java.lang.Object r0 = r13.A02
            X.7dR r0 = (X.C125537dR) r0
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0935
            X.C04220Ms.A0E(r3)
            throw r8
        L_0x0935:
            java.lang.String r2 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.Object r0 = r13.A01
            X.GQN r0 = (X.GQN) r0
            X.88F r1 = new X.88F
            r1.<init>(r2)
            X.GW1 r0 = r0.A00
            X.Hsu r0 = r0.A03
            if (r0 == 0) goto L_0x0920
            r0.onFailure(r1)
            goto L_0x0920
        L_0x094c:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A02
            X.7dR r1 = (X.C125537dR) r1
            java.lang.String r7 = r1.A00
            if (r7 != 0) goto L_0x095b
            X.C04220Ms.A0E(r3)
            throw r8
        L_0x095b:
            r13.A00 = r2
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = r1.A02
            X.Dn3 r6 = X.C25515Dn3.A0G
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS
            long r11 = X.C86154wM.A08(r1)
            r9 = r8
            java.lang.Object r14 = com.instagram.ar.core.effectcollection.EffectCollectionService.A04(r5, r6, r7, r8, r9, r10, r11)
            if (r14 != r0) goto L_0x08f7
            return r0
        L_0x096f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape14S0201000_I2(Object obj, C146958n9 r3, int i) {
        super(2, r3);
        this.A03 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
        r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2(r2, r6, r1, 42);
        r3.A02 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0123, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2(r1, r2, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0141, code lost:
        r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2(r1, r6, r0);
        r3.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0148, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0153, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2(r2, r1, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C146958n9 create(java.lang.Object r5, X.C146958n9 r6) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x0149;
                case 1: goto L_0x013e;
                case 2: goto L_0x013a;
                case 3: goto L_0x0134;
                case 4: goto L_0x012e;
                case 5: goto L_0x0090;
                case 6: goto L_0x0128;
                case 7: goto L_0x0124;
                case 8: goto L_0x0088;
                case 9: goto L_0x0081;
                case 10: goto L_0x007a;
                case 11: goto L_0x0073;
                case 12: goto L_0x006c;
                case 13: goto L_0x0065;
                case 14: goto L_0x0116;
                case 15: goto L_0x005e;
                case 16: goto L_0x0057;
                case 17: goto L_0x0111;
                case 18: goto L_0x010d;
                case 19: goto L_0x0108;
                case 20: goto L_0x0103;
                case 21: goto L_0x00fe;
                case 22: goto L_0x00f9;
                case 23: goto L_0x00f2;
                case 24: goto L_0x00ed;
                case 25: goto L_0x0050;
                case 26: goto L_0x0049;
                case 27: goto L_0x00e6;
                case 28: goto L_0x00df;
                case 29: goto L_0x00da;
                case 30: goto L_0x00d5;
                case 31: goto L_0x00d0;
                case 32: goto L_0x0042;
                case 33: goto L_0x003b;
                case 34: goto L_0x0034;
                case 35: goto L_0x00cb;
                case 36: goto L_0x00c6;
                case 37: goto L_0x00be;
                case 38: goto L_0x00ba;
                case 39: goto L_0x002d;
                case 40: goto L_0x0026;
                case 41: goto L_0x00b2;
                case 42: goto L_0x001f;
                case 43: goto L_0x00ad;
                case 44: goto L_0x00a7;
                case 45: goto L_0x009f;
                case 46: goto L_0x0097;
                case 47: goto L_0x0018;
                case 48: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 49
        L_0x000b:
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r2, (X.C146958n9) r6, (int) r0)
            return r3
        L_0x0011:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 48
            goto L_0x000b
        L_0x0018:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 47
            goto L_0x000b
        L_0x001f:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 42
            goto L_0x000b
        L_0x0026:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 40
            goto L_0x000b
        L_0x002d:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 39
            goto L_0x000b
        L_0x0034:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 34
            goto L_0x000b
        L_0x003b:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 33
            goto L_0x000b
        L_0x0042:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 32
            goto L_0x000b
        L_0x0049:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 26
            goto L_0x000b
        L_0x0050:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 25
            goto L_0x000b
        L_0x0057:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 16
            goto L_0x000b
        L_0x005e:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 15
            goto L_0x000b
        L_0x0065:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 13
            goto L_0x000b
        L_0x006c:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 12
            goto L_0x000b
        L_0x0073:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 11
            goto L_0x000b
        L_0x007a:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 10
            goto L_0x000b
        L_0x0081:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 9
            goto L_0x000b
        L_0x0088:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 8
            goto L_0x000b
        L_0x0090:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 5
            goto L_0x000b
        L_0x0097:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 46
            goto L_0x014e
        L_0x009f:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 45
            goto L_0x014e
        L_0x00a7:
            java.lang.Object r1 = r4.A02
            r0 = 44
            goto L_0x0141
        L_0x00ad:
            java.lang.Object r2 = r4.A01
            r1 = 43
            goto L_0x011a
        L_0x00b2:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 41
            goto L_0x014e
        L_0x00ba:
            r2 = 0
            r1 = 38
            goto L_0x011a
        L_0x00be:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 37
            goto L_0x014e
        L_0x00c6:
            java.lang.Object r1 = r4.A02
            r0 = 36
            goto L_0x0141
        L_0x00cb:
            java.lang.Object r2 = r4.A01
            r1 = 35
            goto L_0x011a
        L_0x00d0:
            java.lang.Object r2 = r4.A01
            r1 = 31
            goto L_0x011a
        L_0x00d5:
            java.lang.Object r1 = r4.A02
            r0 = 30
            goto L_0x0141
        L_0x00da:
            java.lang.Object r2 = r4.A01
            r1 = 29
            goto L_0x011a
        L_0x00df:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 28
            goto L_0x014e
        L_0x00e6:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 27
            goto L_0x014e
        L_0x00ed:
            java.lang.Object r2 = r4.A01
            r1 = 24
            goto L_0x011a
        L_0x00f2:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 23
            goto L_0x014e
        L_0x00f9:
            java.lang.Object r2 = r4.A01
            r1 = 22
            goto L_0x011a
        L_0x00fe:
            java.lang.Object r2 = r4.A01
            r1 = 21
            goto L_0x011a
        L_0x0103:
            java.lang.Object r2 = r4.A01
            r1 = 20
            goto L_0x011a
        L_0x0108:
            java.lang.Object r2 = r4.A01
            r1 = 19
            goto L_0x011a
        L_0x010d:
            r2 = 0
            r1 = 18
            goto L_0x011a
        L_0x0111:
            java.lang.Object r1 = r4.A02
            r0 = 17
            goto L_0x0141
        L_0x0116:
            java.lang.Object r2 = r4.A01
            r1 = 14
        L_0x011a:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r3.<init>((java.lang.Object) r2, (X.C146958n9) r6, (int) r1, (int) r0)
            r3.A02 = r5
            return r3
        L_0x0124:
            java.lang.Object r1 = r4.A02
            r0 = 7
            goto L_0x0141
        L_0x0128:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 6
            goto L_0x014e
        L_0x012e:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 4
            goto L_0x014e
        L_0x0134:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 3
            goto L_0x014e
        L_0x013a:
            java.lang.Object r1 = r4.A02
            r0 = 2
            goto L_0x0141
        L_0x013e:
            java.lang.Object r1 = r4.A02
            r0 = 1
        L_0x0141:
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r3.<init>(r1, r6, r0)
            r3.A01 = r5
            return r3
        L_0x0149:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 0
        L_0x014e:
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r1, (X.C146958n9) r6, (int) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2.create(java.lang.Object, X.8n9):X.8n9");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape14S0201000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape14S0201000_I2(Object obj, C146958n9 r3, int i, int i2) {
        super(2, r3);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape14S0201000_I2(Object obj, Object obj2, C146958n9 r4, int i) {
        super(2, r4);
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
