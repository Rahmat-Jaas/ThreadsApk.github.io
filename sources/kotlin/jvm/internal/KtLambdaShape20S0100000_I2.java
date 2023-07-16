package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape20S0100000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape20S0100000_I2(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0311, code lost:
        return java.lang.Long.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0395, code lost:
        if (r0 <= 0) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03b2, code lost:
        if (X.C18240wQ.A00(r2.A03.getValue()) < X.C18240wQ.A00(r2.A02.getValue())) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03b4, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03b9, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03ba, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03db, code lost:
        r0.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03ef, code lost:
        r1.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03f4, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bf, code lost:
        if (((X.AnonymousClass7KC) X.C86104wH.A0f(r9.A00)).A00 != X.AnonymousClass7KC.A02) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0113, code lost:
        if (X.AnonymousClass0wJ.A04(r2.A03.getValue()) < X.AnonymousClass0wJ.A04(r2.A01.getValue())) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019b, code lost:
        if (r0.BUw() == false) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r2.A06.getValue() != r1) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0245, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x002a;
                case 2: goto L_0x003b;
                case 3: goto L_0x003b;
                case 4: goto L_0x0044;
                case 5: goto L_0x008c;
                case 6: goto L_0x008c;
                case 7: goto L_0x0096;
                case 8: goto L_0x0005;
                case 9: goto L_0x00b1;
                case 10: goto L_0x00c3;
                case 11: goto L_0x00d7;
                case 12: goto L_0x00eb;
                case 13: goto L_0x00fb;
                case 14: goto L_0x0117;
                case 15: goto L_0x0176;
                case 16: goto L_0x019f;
                case 17: goto L_0x01ac;
                case 18: goto L_0x01b9;
                case 19: goto L_0x01c0;
                case 20: goto L_0x01cd;
                case 21: goto L_0x01db;
                case 22: goto L_0x01e8;
                case 23: goto L_0x01fa;
                case 24: goto L_0x0232;
                case 25: goto L_0x0255;
                case 26: goto L_0x02fa;
                case 27: goto L_0x02fa;
                case 28: goto L_0x0312;
                case 29: goto L_0x0319;
                case 30: goto L_0x0324;
                case 31: goto L_0x032f;
                case 32: goto L_0x033b;
                case 33: goto L_0x0348;
                case 34: goto L_0x0354;
                case 35: goto L_0x0360;
                case 36: goto L_0x0369;
                case 37: goto L_0x0360;
                case 38: goto L_0x0369;
                case 39: goto L_0x0372;
                case 40: goto L_0x037b;
                case 41: goto L_0x0384;
                case 42: goto L_0x0398;
                case 43: goto L_0x0005;
                case 44: goto L_0x03bc;
                case 45: goto L_0x03c9;
                case 46: goto L_0x03cf;
                case 47: goto L_0x03d4;
                case 48: goto L_0x03df;
                case 49: goto L_0x03e8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r0 = r0.A00
            X.7KC r2 = X.C86124wJ.A0O(r0)
            return r2
        L_0x0014:
            java.lang.Object r2 = r9.A00
            X.6vT r2 = (X.C115556vT) r2
            java.lang.Object r0 = androidx.compose.animation.core.MutableTransitionState.A00(r2)
            X.677 r1 = X.AnonymousClass677.Visible
            if (r0 == r1) goto L_0x03b4
            X.8pE r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            if (r0 != r1) goto L_0x03ba
            goto L_0x03b4
        L_0x002a:
            java.lang.Object r0 = r9.A00
            X.4qz r0 = (X.C83224qz) r0
            X.Ew2 r0 = r0.Aa1()
            float r0 = androidx.compose.animation.core.SuspendAnimationKt.A00(r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x003b:
            java.lang.Object r1 = r9.A00
            X.7WW r1 = (X.AnonymousClass7WW) r1
            r0 = 0
            r1.A03 = r0
            goto L_0x03f2
        L_0x0044:
            java.lang.Object r5 = r9.A00
            X.6vT r5 = (X.C115556vT) r5
            X.84D r0 = r5.A09
            java.util.Iterator r4 = r0.iterator()
            r2 = 0
        L_0x0050:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r4.next()
            X.7WX r0 = (X.AnonymousClass7WX) r0
            X.8pE r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.7Tj r0 = (X.C122667Tj) r0
            long r0 = r0.A00
            long r2 = java.lang.Math.max(r2, r0)
            goto L_0x0050
        L_0x006b:
            X.84D r0 = r5.A0A
            java.util.Iterator r4 = r0.iterator()
        L_0x0071:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x030d
            java.lang.Object r0 = r4.next()
            X.6vT r0 = (X.C115556vT) r0
            X.4oM r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            long r0 = X.C18190wL.A08(r0)
            long r2 = java.lang.Math.max(r2, r0)
            goto L_0x0071
        L_0x008c:
            java.lang.Object r0 = r9.A00
            X.C18240wQ.A1G(r0)
            java.lang.Boolean r2 = X.C18180wK.A0Y()
            return r2
        L_0x0096:
            java.lang.Object r0 = r9.A00
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r1 = r0.getParent()
        L_0x009e:
            if (r1 == 0) goto L_0x03ba
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x03ba
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r0 = r1.shouldDelayChildPressedState()
            if (r0 != 0) goto L_0x03b4
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x009e
        L_0x00b1:
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r3 = r0.A00
            long r1 = X.AnonymousClass7KC.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03ba
            goto L_0x03b4
        L_0x00c3:
            java.lang.Object r0 = r9.A00
            X.7Ub r0 = (X.C122847Ub) r0
            X.8pE r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            float r0 = (float) r0
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x00d7:
            java.lang.Object r0 = r9.A00
            X.7Ub r0 = (X.C122847Ub) r0
            X.8pE r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            float r0 = (float) r0
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x00eb:
            java.lang.Object r0 = r9.A00
            X.7Ub r0 = (X.C122847Ub) r0
            X.8pE r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            goto L_0x0395
        L_0x00fb:
            java.lang.Object r2 = r9.A00
            X.7Ub r2 = (X.C122847Ub) r2
            X.8pE r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            X.8pE r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            if (r1 >= r0) goto L_0x03ba
            goto L_0x03b4
        L_0x0117:
            java.lang.Object r5 = r9.A00
            X.7Y0 r5 = (X.AnonymousClass7Y0) r5
            X.6o5 r6 = r5.A06
        L_0x011d:
            X.84X r7 = r6.A00
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0153
            r8 = 1
            int r1 = r0 + -1
            java.lang.Object[] r0 = r7.A01
            r0 = r0[r1]
            X.6oo r0 = (X.C112006oo) r0
            X.0ZU r0 = r0.A00
            java.lang.Object r2 = r0.invoke()
            X.7F6 r2 = (X.AnonymousClass7F6) r2
            if (r2 == 0) goto L_0x0142
            long r0 = r5.A00
            long r3 = X.AnonymousClass7Y0.A02(r5, r2, r0)
            long r1 = X.AnonymousClass7KC.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0153
        L_0x0142:
            int r0 = r7.A00
            int r0 = r0 - r8
            java.lang.Object r0 = r7.A03(r0)
            X.6oo r0 = (X.C112006oo) r0
            X.8s9 r1 = r0.A01
            kotlin.Unit r0 = kotlin.Unit.A00
            r1.resumeWith(r0)
            goto L_0x011d
        L_0x0153:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x016c
            X.7F6 r2 = X.AnonymousClass7Y0.A03(r5)
            if (r2 == 0) goto L_0x016c
            long r0 = r5.A00
            long r3 = X.AnonymousClass7Y0.A02(r5, r2, r0)
            long r1 = X.AnonymousClass7KC.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x016c
            r0 = 0
            r5.A03 = r0
        L_0x016c:
            androidx.compose.foundation.gestures.UpdatableAnimationState r1 = r5.A09
            float r0 = X.AnonymousClass7Y0.A01(r5)
            r1.A00 = r0
            goto L_0x03f2
        L_0x0176:
            java.lang.Object r0 = r9.A00
            java.lang.Object r2 = X.C86104wH.A0f(r0)
            androidx.compose.foundation.gestures.ScrollingLogic r2 = (androidx.compose.foundation.gestures.ScrollingLogic) r2
            X.8lv r0 = r2.A03
            boolean r0 = r0.BY9()
            r1 = 0
            if (r0 != 0) goto L_0x03b4
            X.8pE r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 != 0) goto L_0x03b4
            X.8lZ r0 = r2.A00
            if (r0 == 0) goto L_0x03b5
            boolean r0 = r0.BUw()
            if (r0 == 0) goto L_0x03b5
            goto L_0x03b4
        L_0x019f:
            java.lang.Object r0 = r9.A00
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            int r0 = r0.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x01ac:
            java.lang.Object r0 = r9.A00
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = (androidx.compose.foundation.lazy.grid.LazyGridState) r0
            int r0 = r0.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x01b9:
            java.lang.Object r0 = r9.A00
            java.lang.Object r2 = X.C86104wH.A0f(r0)
            return r2
        L_0x01c0:
            java.lang.Object r0 = r9.A00
            X.8lw r0 = (X.C146268lw) r0
            float r0 = r0.AbV()
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x01cd:
            java.lang.Object r1 = r9.A00
            X.8lb r1 = (X.C146078lb) r1
            java.util.Map r0 = X.AnonymousClass4WJ.A0A()
            X.7Wb r2 = new X.7Wb
            r2.<init>(r1, r0)
            return r2
        L_0x01db:
            java.lang.Object r0 = r9.A00
            androidx.compose.foundation.pager.PagerState r0 = (androidx.compose.foundation.pager.PagerState) r0
            boolean r0 = r0.BY9()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x01e8:
            java.lang.Object r1 = r9.A00
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            X.8cc r0 = androidx.compose.foundation.pager.PagerState.A01(r1)
            if (r0 == 0) goto L_0x01f7
            X.7VH r0 = (X.AnonymousClass7VH) r0
            int r0 = r0.A00
            goto L_0x0241
        L_0x01f7:
            int r0 = r1.A01
            goto L_0x0241
        L_0x01fa:
            java.lang.Object r3 = r9.A00
            androidx.compose.foundation.pager.PagerState r3 = (androidx.compose.foundation.pager.PagerState) r3
            X.8cc r0 = androidx.compose.foundation.pager.PagerState.A01(r3)
            if (r0 == 0) goto L_0x0230
            X.7VH r0 = (X.AnonymousClass7VH) r0
            int r2 = r0.A01
        L_0x0208:
            int r1 = r3.A06()
            X.8pE r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r1 = r1 + r0
            float r1 = (float) r1
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0224
            float r0 = r3.A00
        L_0x021f:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x0224:
            int r0 = -r2
            float r2 = (float) r0
            float r2 = r2 / r1
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = X.AnonymousClass8bI.A01(r2, r1, r0)
            goto L_0x021f
        L_0x0230:
            r2 = 0
            goto L_0x0208
        L_0x0232:
            java.lang.Object r1 = r9.A00
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            X.8nU r0 = r1.A07()
            int r0 = r0.BHd()
            if (r0 != 0) goto L_0x0246
            r0 = 0
        L_0x0241:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0246:
            X.8pE r0 = r1.A06
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r0 = androidx.compose.foundation.pager.PagerState.A00(r1, r0)
            goto L_0x0241
        L_0x0255:
            java.lang.Object r3 = r9.A00
            androidx.compose.foundation.pager.PagerState r3 = (androidx.compose.foundation.pager.PagerState) r3
            boolean r0 = r3.BY9()
            if (r0 == 0) goto L_0x02f4
            X.8pE r2 = r3.A03
            java.lang.Object r0 = r2.getValue()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            r0 = -1
            if (r1 == r0) goto L_0x027d
            java.lang.Object r0 = r2.getValue()
            int r1 = X.AnonymousClass0wJ.A04(r0)
        L_0x0274:
            int r0 = androidx.compose.foundation.pager.PagerState.A00(r3, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x027d:
            X.8pE r2 = r3.A07
            java.lang.Object r0 = r2.getValue()
            float r1 = X.C18240wQ.A00(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x02d1
            X.4oM r4 = r3.A08
            java.lang.Object r0 = r4.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r2 = java.lang.Math.abs(r0)
            X.8nV r1 = androidx.compose.foundation.pager.PagerState.A03(r3)
            float r0 = X.AnonymousClass74J.A00
            float r1 = r1.CxL(r0)
            int r0 = r3.A06()
            float r0 = X.C86134wK.A01(r0)
            float r1 = java.lang.Math.min(r1, r0)
            int r0 = r3.A06()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02f4
            int r1 = r3.A05()
            java.lang.Object r0 = r4.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = java.lang.Math.signum(r0)
            int r0 = (int) r0
            int r1 = r1 + r0
            goto L_0x0274
        L_0x02d1:
            java.lang.Object r0 = r2.getValue()
            float r2 = X.C18240wQ.A00(r0)
            int r1 = r3.A06()
            X.8pE r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r1 = r1 + r0
            float r0 = (float) r1
            float r2 = r2 / r0
            int r0 = r3.A05()
            int r1 = X.AnonymousClass8bA.A02(r2)
            int r1 = r1 + r0
            goto L_0x0274
        L_0x02f4:
            int r1 = r3.A05()
            goto L_0x0274
        L_0x02fa:
            java.lang.Object r1 = r9.A00
            X.8my r1 = (X.C146858my) r1
            X.7Vw r1 = (X.C123207Vw) r1
        L_0x0300:
            java.util.concurrent.atomic.AtomicLong r0 = r1.A00
            long r2 = r0.getAndIncrement()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x030d
            goto L_0x0300
        L_0x030d:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
        L_0x0312:
            java.lang.Object r0 = r9.A00
            java.lang.Object r2 = X.C86144wL.A0j(r0)
            return r2
        L_0x0319:
            java.lang.Object r0 = r9.A00
            X.6qu r0 = (X.C113196qu) r0
            X.8pE r0 = r0.A0A
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x0324:
            java.lang.Object r1 = r9.A00
            X.66l r1 = (X.C967266l) r1
            r0 = 0
            X.7EJ r2 = new X.7EJ
            r2.<init>(r1, r0)
            return r2
        L_0x032f:
            java.lang.Object r0 = r9.A00
            X.7Ii r0 = (X.C121827Ii) r0
            r0.A05()
            java.lang.Boolean r2 = X.C18180wK.A0Y()
            return r2
        L_0x033b:
            java.lang.Object r1 = r9.A00
            X.7Ii r1 = (X.C121827Ii) r1
            r0 = 1
            r1.A0A(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0348:
            java.lang.Object r0 = r9.A00
            X.7Ii r0 = (X.C121827Ii) r0
            r0.A04()
            java.lang.Boolean r2 = X.C18180wK.A0Y()
            return r2
        L_0x0354:
            java.lang.Object r0 = r9.A00
            X.7Ii r0 = (X.C121827Ii) r0
            r0.A07()
            java.lang.Boolean r2 = X.C18180wK.A0Y()
            return r2
        L_0x0360:
            java.lang.Object r0 = r9.A00
            X.8mA r0 = (X.C146388mA) r0
            r0.onStop()
            goto L_0x03f2
        L_0x0369:
            java.lang.Object r0 = r9.A00
            X.8mA r0 = (X.C146388mA) r0
            r0.onCancel()
            goto L_0x03f2
        L_0x0372:
            java.lang.Object r0 = r9.A00
            X.7WM r0 = (X.AnonymousClass7WM) r0
            X.6ms r0 = r0.A04
            X.8mM r2 = r0.A04
            return r2
        L_0x037b:
            java.lang.Object r0 = r9.A00
            X.7WM r0 = (X.AnonymousClass7WM) r0
            X.6ms r0 = r0.A04
            X.7AW r2 = r0.A05
            return r2
        L_0x0384:
            java.lang.Object r0 = r9.A00
            X.7EJ r0 = (X.AnonymousClass7EJ) r0
            X.8pE r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
        L_0x0395:
            if (r0 <= 0) goto L_0x03ba
            goto L_0x03b4
        L_0x0398:
            java.lang.Object r2 = r9.A00
            X.7EJ r2 = (X.AnonymousClass7EJ) r2
            X.8pE r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
            X.8pE r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x03ba
        L_0x03b4:
            r1 = 1
        L_0x03b5:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L_0x03ba:
            r1 = 0
            goto L_0x03b5
        L_0x03bc:
            java.lang.Object r0 = r9.A00
            X.4oM r0 = (X.C81784oM) r0
            long r0 = X.C86164wN.A08(r0)
            X.7KC r2 = X.C86124wJ.A0O(r0)
            return r2
        L_0x03c9:
            java.lang.Object r0 = r9.A00
            X.C147368pE.A06(r0)
            goto L_0x03f2
        L_0x03cf:
            java.lang.Object r0 = r9.A00
            X.7F8 r0 = (X.AnonymousClass7F8) r0
            goto L_0x03db
        L_0x03d4:
            java.lang.Object r0 = r9.A00
            X.7F8 r0 = (X.AnonymousClass7F8) r0
            r0.A04()
        L_0x03db:
            r0.A06()
            goto L_0x03f2
        L_0x03df:
            java.lang.Object r1 = r9.A00
            X.7Ii r1 = (X.C121827Ii) r1
            r0 = 1
            r1.A0A(r0)
            goto L_0x03ef
        L_0x03e8:
            java.lang.Object r1 = r9.A00
            X.7Ii r1 = (X.C121827Ii) r1
            r1.A04()
        L_0x03ef:
            r1.A06()
        L_0x03f2:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape20S0100000_I2.invoke():java.lang.Object");
    }
}
