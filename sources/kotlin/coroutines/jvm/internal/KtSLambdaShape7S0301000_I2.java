package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import kotlin.Unit;

public class KtSLambdaShape7S0301000_I2 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape7S0301000_I2(Object obj, C146958n9 r3, int i) {
        super(2, r3);
        this.A04 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2(r1, r6, r0);
        r3.A02 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2(r2, r1, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r3.A03 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C146958n9 create(java.lang.Object r5, X.C146958n9 r6) {
        /*
            r4 = this;
            int r0 = r4.A04
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0012;
                case 2: goto L_0x0027;
                case 3: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 4
        L_0x000a:
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2
            r3.<init>(r2, r1, r6, r0)
        L_0x000f:
            r3.A03 = r5
            return r3
        L_0x0012:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 1
            goto L_0x000a
        L_0x0018:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2
            r3.<init>(r1, r2, r6, r0)
            goto L_0x000f
        L_0x0023:
            java.lang.Object r1 = r4.A01
            r0 = 3
            goto L_0x002a
        L_0x0027:
            java.lang.Object r1 = r4.A01
            r0 = 2
        L_0x002a:
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2
            r3.<init>(r1, r6, r0)
            r3.A02 = r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2.create(java.lang.Object, X.8n9):X.8n9");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0164 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080 A[SYNTHETIC, Splitter:B:28:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01de A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r7 = r23
            r1 = r24
            int r0 = r7.A04
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x013c;
                case 2: goto L_0x00c6;
                case 3: goto L_0x01e4;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r0 = r7.A00
            r8 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r2) goto L_0x003d
            if (r0 != r8) goto L_0x0137
            java.lang.Object r2 = r7.A03
            X.AnonymousClass0OU.A00(r1)
        L_0x001a:
            X.7Es r1 = (X.C121197Es) r1
            if (r1 == 0) goto L_0x0026
            r1.A01()
            java.lang.Object r0 = r7.A02
            X.C86134wK.A1L(r0, r2)
        L_0x0026:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x0029:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r5 = r7.A03
            X.8pz r5 = (X.C147828pz) r5
            r7.A03 = r5
            r7.A00 = r2
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r5, r0, r7, r2)
            if (r1 != r6) goto L_0x0043
            return r6
        L_0x003d:
            java.lang.Object r0 = r7.A03
            X.8pz r5 = X.C86164wN.A0H(r0, r1)
        L_0x0043:
            X.7Es r1 = (X.C121197Es) r1
            java.lang.Object r4 = r7.A01
            X.0YY r4 = (X.AnonymousClass0YY) r4
            long r2 = r1.A05
            X.7KC r0 = X.C86124wJ.A0O(r2)
            java.lang.Object r2 = r4.invoke(r0)
            if (r2 == 0) goto L_0x0026
            r1.A01()
            r7.A03 = r2
            r7.A00 = r8
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r5, r0, r7)
            if (r1 != r6) goto L_0x001a
            return r6
        L_0x0065:
            int r0 = r7.A00
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x00be
            if (r0 == r3) goto L_0x0098
            if (r0 == r4) goto L_0x0090
            java.lang.Object r0 = r7.A03
            X.8pz r2 = X.C86164wN.A0H(r0, r1)
        L_0x0076:
            java.lang.Object r0 = r7.A02
            X.Ew2 r0 = (X.C27952Ew2) r0
            boolean r0 = X.AnonymousClass7C2.A02(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r7.A01     // Catch:{ CancellationException -> 0x00a8 }
            X.0YP r0 = (X.AnonymousClass0YP) r0     // Catch:{ CancellationException -> 0x00a8 }
            r7.A03 = r2     // Catch:{ CancellationException -> 0x00a8 }
            r7.A00 = r3     // Catch:{ CancellationException -> 0x00a8 }
            java.lang.Object r0 = r0.invoke(r2, r7)     // Catch:{ CancellationException -> 0x00a8 }
            if (r0 != r6) goto L_0x009f
            goto L_0x02de
        L_0x0090:
            java.lang.Object r2 = r7.A03
            X.8pz r2 = (X.C147828pz) r2
            X.AnonymousClass0OU.A00(r1)     // Catch:{ CancellationException -> 0x00a8 }
            goto L_0x0076
        L_0x0098:
            java.lang.Object r2 = r7.A03
            X.8pz r2 = (X.C147828pz) r2
            X.AnonymousClass0OU.A00(r1)     // Catch:{ CancellationException -> 0x00a8 }
        L_0x009f:
            r7.A03 = r2     // Catch:{ CancellationException -> 0x00a8 }
            r7.A00 = r4     // Catch:{ CancellationException -> 0x00a8 }
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A00(r2, r7)     // Catch:{ CancellationException -> 0x00a8 }
            goto L_0x00bb
        L_0x00a8:
            r1 = move-exception
            java.lang.Object r0 = r7.A02
            X.Ew2 r0 = (X.C27952Ew2) r0
            boolean r0 = X.AnonymousClass7C2.A02(r0)
            if (r0 == 0) goto L_0x02df
            r7.A03 = r2
            r7.A00 = r5
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A00(r2, r7)
        L_0x00bb:
            if (r0 != r6) goto L_0x0076
            return r6
        L_0x00be:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r2 = r7.A03
            X.8pz r2 = (X.C147828pz) r2
            goto L_0x0076
        L_0x00c6:
            int r0 = r7.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0107
            if (r0 == r2) goto L_0x011b
            if (r0 != r5) goto L_0x02e0
            java.lang.Object r12 = r7.A03
            X.7Es r12 = (X.C121197Es) r12
            java.lang.Object r0 = r7.A02
            X.8pz r4 = X.C86164wN.A0H(r0, r1)
        L_0x00da:
            X.6kM r1 = (X.C109656kM) r1
            java.util.List r13 = r1.A03
            int r11 = r13.size()
            r10 = 0
        L_0x00e3:
            if (r10 >= r11) goto L_0x012e
            X.7Es r9 = X.C86124wJ.A0P(r13, r10)
            long r2 = r9.A04
            long r0 = r12.A04
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0104
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x0104
        L_0x00f5:
            r7.A02 = r4
            r7.A03 = r12
            r7.A00 = r5
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r1 = r4.AA5(r0, r7)
            if (r1 != r6) goto L_0x00da
            return r6
        L_0x0104:
            int r10 = r10 + 1
            goto L_0x00e3
        L_0x0107:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r4 = r7.A02
            X.8pz r4 = (X.C147828pz) r4
            r7.A02 = r4
            r7.A00 = r2
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r7, r2)
            if (r1 != r6) goto L_0x0121
            return r6
        L_0x011b:
            java.lang.Object r0 = r7.A02
            X.8pz r4 = X.C86164wN.A0H(r0, r1)
        L_0x0121:
            X.7Es r1 = (X.C121197Es) r1
            java.lang.Object r0 = r7.A01
            X.8mA r0 = (X.C146388mA) r0
            long r2 = r1.A05
            r0.Buh(r2)
            r12 = r1
            goto L_0x00f5
        L_0x012e:
            java.lang.Object r0 = r7.A01
            X.8mA r0 = (X.C146388mA) r0
            r0.CRQ()
            goto L_0x0026
        L_0x0137:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x013c:
            int r0 = r7.A00
            r8 = 1
            if (r0 == 0) goto L_0x01cd
            if (r0 != r8) goto L_0x01df
            java.lang.Object r0 = r7.A03
            X.8pz r0 = X.C86164wN.A0H(r0, r1)
        L_0x0149:
            X.6kM r1 = (X.C109656kM) r1
            java.util.List r9 = r1.A03
            int r3 = r9.size()
            r5 = 0
            r2 = 0
        L_0x0153:
            if (r2 >= r3) goto L_0x0164
            X.7Es r1 = X.C86124wJ.A0P(r9, r2)
            boolean r1 = r1.A02()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x01d4
            int r2 = r2 + 1
            goto L_0x0153
        L_0x0164:
            java.lang.Object r12 = r7.A02
            X.4oM r12 = (X.C81784oM) r12
            long r1 = X.AnonymousClass7KC.A03
            X.7KC r2 = X.C86124wJ.A0O(r1)
            int r11 = r9.size()
            r10 = 0
        L_0x0173:
            if (r10 >= r11) goto L_0x0188
            X.7Es r1 = X.C86124wJ.A0P(r9, r10)
            long r3 = r2.A00
            long r1 = r1.A08
            long r1 = X.AnonymousClass7KC.A05(r3, r1)
            X.7KC r2 = X.C86124wJ.A0O(r1)
            int r10 = r10 + 1
            goto L_0x0173
        L_0x0188:
            long r1 = r2.A00
            r3 = 64
            float r3 = (float) r3
            float r3 = r0.CxL(r3)
            float r3 = -r3
            long r10 = X.AnonymousClass7KC.A03(r3, r1)
            java.lang.Object r3 = r12.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
            X.66l r2 = r3.A02
            X.66l r1 = X.C967266l.Horizontal
            if (r2 != r1) goto L_0x01c8
            float r2 = X.AnonymousClass7KC.A01(r10)
        L_0x01a6:
            boolean r1 = r3.A06
            if (r1 == 0) goto L_0x01ad
            r1 = -1
            float r1 = (float) r1
            float r2 = r2 * r1
        L_0x01ad:
            X.8lv r1 = r3.A03
            float r2 = r1.AII(r2)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01d4
            int r2 = r9.size()
        L_0x01bc:
            if (r5 >= r2) goto L_0x01d4
            X.7Es r1 = X.C86124wJ.A0P(r9, r5)
            r1.A01()
            int r5 = r5 + 1
            goto L_0x01bc
        L_0x01c8:
            float r2 = X.AnonymousClass7KC.A02(r10)
            goto L_0x01a6
        L_0x01cd:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r0 = r7.A03
            X.8pz r0 = (X.C147828pz) r0
        L_0x01d4:
            r7.A03 = r0
            r7.A00 = r8
            java.lang.Object r1 = androidx.compose.foundation.gestures.ScrollableKt.A01(r0, r7)
            if (r1 != r6) goto L_0x0149
            return r6
        L_0x01df:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01e4:
            int r2 = r7.A00
            r15 = 3
            r14 = 2
            r10 = 1
            if (r2 == 0) goto L_0x02c9
            java.lang.Object r5 = r7.A03
            X.6iV r5 = (X.C108526iV) r5
            java.lang.Object r0 = r7.A02
            X.8pz r4 = X.C86164wN.A0H(r0, r1)
            if (r2 == r10) goto L_0x0204
        L_0x01f7:
            r7.A02 = r4
            r7.A03 = r5
            r7.A00 = r10
            java.lang.Object r1 = androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.A00(r4, r7)
            if (r1 != r6) goto L_0x0204
            return r6
        L_0x0204:
            X.6kM r1 = (X.C109656kM) r1
            r13 = 0
            X.C04220Ms.A0B(r1, r13)
            X.7Es r11 = r5.A01
            java.util.List r9 = r1.A03
            X.7Es r8 = X.C86124wJ.A0P(r9, r13)
            if (r11 == 0) goto L_0x02c5
            X.C04220Ms.A0B(r8, r10)
            long r2 = r8.A09
            long r0 = r11.A09
            long r2 = r2 - r0
            X.8lf r0 = r5.A02
            long r16 = r0.Ads()
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c5
            long r2 = r8.A05
            long r0 = r11.A05
            long r0 = X.AnonymousClass7KC.A04(r2, r0)
            float r0 = X.AnonymousClass7KC.A00(r0)
            double r0 = (double) r0
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x02c5
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
        L_0x023f:
            r5.A01 = r8
            X.7Es r12 = X.C86124wJ.A0P(r9, r13)
            int r0 = r5.A00
            if (r0 == r10) goto L_0x02c2
            if (r0 == r14) goto L_0x02bf
            X.8mx r11 = X.AnonymousClass74R.A03
        L_0x024d:
            java.lang.Object r8 = r7.A01
            X.8co r8 = (X.C141698co) r8
            long r0 = r12.A05
            r2 = r8
            X.7Vt r2 = (X.C123187Vt) r2
            r16 = 1
            X.7Ii r2 = r2.A00
            X.77X r9 = r2.A03
            if (r9 == 0) goto L_0x0263
            X.8LW r3 = X.AnonymousClass8LW.A00
            r9.A00(r3)
        L_0x0263:
            r2.A00 = r0
            X.6qu r3 = r2.A02
            if (r3 == 0) goto L_0x02bc
            X.7Gf r3 = X.C147368pE.A00(r3)
            if (r3 == 0) goto L_0x02bc
            long r0 = X.C121457Gf.A01(r3, r0)
            long r0 = X.C121457Gf.A02(r3, r0)
            X.7AW r9 = r3.A02
            int r0 = r9.A07(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            long r0 = r2.A00
            long r0 = X.C121457Gf.A01(r3, r0)
            long r0 = X.C121457Gf.A02(r3, r0)
            int r20 = r9.A07(r0)
            X.8pE r0 = r2.A0H
            X.7HD r19 = X.C86154wM.A0I(r0)
            r21 = r20
            r22 = r13
            r18 = r2
            r17 = r11
            X.C121827Ii.A01(r17, r18, r19, r20, r21, r22)
        L_0x02a2:
            if (r16 == 0) goto L_0x01f7
            r12.A01()
            long r0 = r12.A04
            r2 = 46
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r2 = X.C86164wN.A10(r8, r11, r2)
            r7.A02 = r4
            r7.A03 = r5
            r7.A00 = r15
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r4, r7, r2, r0)
            if (r0 != r6) goto L_0x01f7
            return r6
        L_0x02bc:
            r16 = 0
            goto L_0x02a2
        L_0x02bf:
            X.8mx r11 = X.AnonymousClass74R.A04
            goto L_0x024d
        L_0x02c2:
            X.8mx r11 = X.AnonymousClass74R.A02
            goto L_0x024d
        L_0x02c5:
            r5.A00 = r10
            goto L_0x023f
        L_0x02c9:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r4 = r7.A02
            X.8pz r4 = (X.C147828pz) r4
            r0 = r4
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r0
            X.54D r0 = r0.A04
            X.8lf r0 = r0.A05
            X.6iV r5 = new X.6iV
            r5.<init>(r0)
            goto L_0x01f7
        L_0x02de:
            return r6
        L_0x02df:
            throw r1
        L_0x02e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape7S0301000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape7S0301000_I2(Object obj, Object obj2, C146958n9 r4, int i) {
        super(2, r4);
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
