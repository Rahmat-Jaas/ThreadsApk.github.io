package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape148S0100000_I2_3 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape148S0100000_I2_3(Object obj, int i) {
        super(1);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x037d, code lost:
        if (r12.get() == r11.A00) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x037f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0384, code lost:
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0156, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0209, code lost:
        r1.invoke(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x026b;
                case 2: goto L_0x003a;
                case 3: goto L_0x0055;
                case 4: goto L_0x006a;
                case 5: goto L_0x007e;
                case 6: goto L_0x008a;
                case 7: goto L_0x00aa;
                case 8: goto L_0x00b2;
                case 9: goto L_0x027a;
                case 10: goto L_0x027a;
                case 11: goto L_0x0293;
                case 12: goto L_0x00bb;
                case 13: goto L_0x00c7;
                case 14: goto L_0x036a;
                case 15: goto L_0x036a;
                case 16: goto L_0x00d1;
                case 17: goto L_0x034e;
                case 18: goto L_0x0385;
                case 19: goto L_0x038f;
                case 20: goto L_0x0398;
                case 21: goto L_0x00e0;
                case 22: goto L_0x0115;
                case 23: goto L_0x011f;
                case 24: goto L_0x0131;
                case 25: goto L_0x0152;
                case 26: goto L_0x0005;
                case 27: goto L_0x015b;
                case 28: goto L_0x0168;
                case 29: goto L_0x0005;
                case 30: goto L_0x015b;
                case 31: goto L_0x0005;
                case 32: goto L_0x0168;
                case 33: goto L_0x03a1;
                case 34: goto L_0x0175;
                case 35: goto L_0x0184;
                case 36: goto L_0x03cc;
                case 37: goto L_0x03cc;
                case 38: goto L_0x03d2;
                case 39: goto L_0x01fc;
                case 40: goto L_0x03e7;
                case 41: goto L_0x020e;
                case 42: goto L_0x022a;
                case 43: goto L_0x03ea;
                case 44: goto L_0x03f7;
                case 45: goto L_0x0404;
                case 46: goto L_0x0237;
                case 47: goto L_0x0244;
                case 48: goto L_0x0251;
                case 49: goto L_0x025e;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.animation.Animator$AnimatorListener r12 = (android.animation.Animator.AnimatorListener) r12
            java.lang.Object r0 = X.C86154wM.A0d(r12, r11)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r12.onAnimationEnd(r0)
        L_0x0010:
            kotlin.Unit r5 = kotlin.Unit.A00
        L_0x0012:
            return r5
        L_0x0013:
            X.0ZU r12 = (X.AnonymousClass0ZU) r12
            java.lang.Object r2 = X.C86154wM.A0d(r12, r11)
            android.view.View r2 = (android.view.View) r2
            android.os.Handler r0 = r2.getHandler()
            android.os.Looper r1 = r0.getLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 != r0) goto L_0x002d
            r12.invoke()
            goto L_0x0010
        L_0x002d:
            android.os.Handler r1 = r2.getHandler()
            X.7yt r0 = new X.7yt
            r0.<init>(r12)
            r1.post(r0)
            goto L_0x0010
        L_0x003a:
            r4 = 0
            X.C04220Ms.A0B(r12, r4)
            java.lang.Object r3 = r11.A00
            java.util.List r3 = (java.util.List) r3
            int r2 = r3.size()
            r1 = 0
        L_0x0047:
            if (r1 >= r2) goto L_0x0010
            java.lang.Object r0 = r3.get(r1)
            X.7Xy r0 = (X.C123657Xy) r0
            X.C122067Jz.A02(r0, r4, r4)
            int r1 = r1 + 1
            goto L_0x0047
        L_0x0055:
            X.8mM r12 = (X.C146508mM) r12
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            X.8mM r1 = r12.B03()
            X.C04220Ms.A0A(r1)
            java.lang.Object r0 = r11.A00
            X.54n r0 = (X.C877854n) r0
            r0.A09(r1)
            goto L_0x0010
        L_0x006a:
            X.6t4 r12 = (X.C114336t4) r12
            long r2 = r12.A00
            java.lang.Object r1 = r11.A00
            X.54n r1 = (X.C877854n) r1
            X.6t4 r0 = new X.6t4
            r0.<init>(r2)
            r1.m19setPopupContentSizefhxjrPA(r0)
            r1.A08()
            goto L_0x0010
        L_0x007e:
            r1 = 0
            X.C04220Ms.A0B(r12, r1)
            java.lang.Object r0 = r11.A00
            X.7Xy r0 = (X.C123657Xy) r0
            X.C122067Jz.A02(r0, r1, r1)
            goto L_0x0010
        L_0x008a:
            r4 = 0
            X.C04220Ms.A0B(r12, r4)
            java.lang.Object r3 = r11.A00
            java.util.List r3 = (java.util.List) r3
            X.C04220Ms.A0B(r3, r4)
            int r2 = X.C86104wH.A0B(r3)
            if (r2 < 0) goto L_0x0010
            r1 = 0
        L_0x009c:
            java.lang.Object r0 = r3.get(r1)
            X.7Xy r0 = (X.C123657Xy) r0
            X.C122067Jz.A02(r0, r4, r4)
            if (r1 == r2) goto L_0x0010
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00aa:
            java.lang.Object r0 = r11.A00
            X.52E r0 = (X.AnonymousClass52E) r0
            X.0ZU r0 = r0.A01
            goto L_0x0156
        L_0x00b2:
            java.lang.Object r0 = r11.A00
            X.M5J r0 = (X.M5J) r0
            r0.A0H(r12)
            goto L_0x0010
        L_0x00bb:
            java.lang.Object r0 = r11.A00
            X.6lN r0 = (X.C110256lN) r0
            X.4wF r1 = r0.A03
            r0 = 0
            r1.D7t(r0)
            goto L_0x0010
        L_0x00c7:
            java.lang.Object r1 = r11.A00
            X.8m8 r1 = (X.C146368m8) r1
            r0 = 0
            r1.ADR(r0)
            goto L_0x0010
        L_0x00d1:
            X.6ui r12 = (X.C115226ui) r12
            java.lang.Object r1 = X.C86154wM.A0d(r12, r11)
            X.CDI r1 = (X.CDI) r1
            X.6bS r0 = r12.A00
            r1.A01(r0)
            goto L_0x0010
        L_0x00e0:
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            if (r12 != 0) goto L_0x00f7
            java.lang.Object r0 = r11.A00
            X.7o3 r0 = (X.AnonymousClass7o3) r0
            X.LCx r0 = r0.A00
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            throw r1
        L_0x00f7:
            boolean r1 = r12 instanceof java.util.concurrent.CancellationException
            java.lang.Object r0 = r11.A00
            X.7o3 r0 = (X.AnonymousClass7o3) r0
            if (r1 == 0) goto L_0x0107
            X.LCx r1 = r0.A00
            r0 = 1
            r1.cancel(r0)
            goto L_0x0010
        L_0x0107:
            X.LCx r1 = r0.A00
            java.lang.Throwable r0 = r12.getCause()
            if (r0 == 0) goto L_0x0110
            r12 = r0
        L_0x0110:
            r1.A07(r12)
            goto L_0x0010
        L_0x0115:
            java.lang.Object r1 = r11.A00
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0 = 0
            r1.cancel(r0)
            goto L_0x0010
        L_0x011f:
            X.3iY r12 = (X.C63893iY) r12
            java.lang.Object r1 = r11.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            if (r12 == 0) goto L_0x012e
            r0 = 0
            java.lang.Object r0 = X.C63893iY.A0B(r12, r0)
            goto L_0x0209
        L_0x012e:
            r0 = 0
            goto L_0x0209
        L_0x0131:
            X.3iY r12 = (X.C63893iY) r12
            java.lang.Object r3 = r11.A00
            X.0YP r3 = (X.AnonymousClass0YP) r3
            r0 = 0
            if (r12 == 0) goto L_0x0150
            r1 = 0
            java.lang.Object r2 = X.C63893iY.A0B(r12, r1)
        L_0x013f:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C04220Ms.A0C(r2, r1)
            if (r12 == 0) goto L_0x014b
            r0 = 1
            java.lang.Object r0 = X.C63893iY.A0B(r12, r0)
        L_0x014b:
            r3.invoke(r2, r0)
            goto L_0x0010
        L_0x0150:
            r2 = r0
            goto L_0x013f
        L_0x0152:
            java.lang.Object r0 = r11.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
        L_0x0156:
            r0.invoke()
            goto L_0x0010
        L_0x015b:
            android.animation.Animator$AnimatorListener r12 = (android.animation.Animator.AnimatorListener) r12
            java.lang.Object r0 = X.C86154wM.A0d(r12, r11)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r12.onAnimationCancel(r0)
            goto L_0x0010
        L_0x0168:
            android.animation.Animator$AnimatorListener r12 = (android.animation.Animator.AnimatorListener) r12
            java.lang.Object r0 = X.C86154wM.A0d(r12, r11)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r12.onAnimationStart(r0)
            goto L_0x0010
        L_0x0175:
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r0 = X.C86154wM.A0d(r12, r11)
            X.3zW r0 = (X.C67423zW) r0
            X.7AB r0 = r0.A00
            r0.A04(r12)
            goto L_0x0010
        L_0x0184:
            java.util.List r12 = (java.util.List) r12
            r2 = 0
            X.C04220Ms.A0B(r12, r2)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r0)
            java.util.List r5 = X.C18180wK.A0n(r8)
            boolean r0 = r12.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0012
            int r0 = r12.size()
            if (r0 != r1) goto L_0x0012
            java.lang.Object r0 = r12.get(r2)
            com.facebook.dcp.model.Example r0 = (com.facebook.dcp.model.Example) r0
            java.util.HashMap r1 = r0.A02
            java.lang.String r0 = "3659"
            java.lang.Object r7 = r1.get(r0)
            com.facebook.dcp.model.FeatureData r7 = (com.facebook.dcp.model.FeatureData) r7
            java.lang.Object r0 = r12.get(r2)
            com.facebook.dcp.model.Example r0 = (com.facebook.dcp.model.Example) r0
            java.util.HashMap r1 = r0.A02
            java.lang.String r0 = "3660"
            java.lang.Object r6 = r1.get(r0)
            com.facebook.dcp.model.FeatureData r6 = (com.facebook.dcp.model.FeatureData) r6
            if (r7 == 0) goto L_0x0012
            if (r6 == 0) goto L_0x0012
            java.lang.Object r0 = r11.A00
            X.7u2 r0 = (X.C132517u2) r0
            X.6c2 r0 = r0.A04
            X.0cE r2 = r0.A00
            if (r2 == 0) goto L_0x01f7
            r0 = 36607728546288375(0x820e89000912f7, double:3.21421316793932E-306)
            long r3 = r2.At2(r0)
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01ee
            double r0 = r7.A00
        L_0x01e2:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.util.List r5 = java.util.Collections.singletonList(r0)
        L_0x01ea:
            X.C04220Ms.A06(r5)
            return r5
        L_0x01ee:
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01f7
            double r0 = r6.A00
            goto L_0x01e2
        L_0x01f7:
            java.util.List r5 = java.util.Collections.singletonList(r8)
            goto L_0x01ea
        L_0x01fc:
            X.Lm1 r12 = (X.Lm1) r12
            java.lang.Object r1 = X.C86154wM.A0d(r12, r11)
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Exception r0 = r12.A01
            X.C04220Ms.A05(r0)
        L_0x0209:
            r1.invoke(r0)
            goto L_0x0010
        L_0x020e:
            X.AP7 r12 = (X.AP7) r12
            java.lang.Object r4 = r12.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0620000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0620000_I2) r4
            java.lang.Object r3 = r4.A00
            X.MHA r3 = (X.MHA) r3
            if (r3 != 0) goto L_0x0411
            java.lang.Object r0 = r4.A01
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            r5 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.Object r3 = r0.invoke()
            X.MHA r3 = (X.MHA) r3
            if (r3 != 0) goto L_0x0411
            return r5
        L_0x022a:
            android.graphics.Matrix r12 = (android.graphics.Matrix) r12
            java.lang.Object r0 = X.C86154wM.A0d(r12, r11)
            android.graphics.Path r0 = (android.graphics.Path) r0
            r0.transform(r12)
            goto L_0x0010
        L_0x0237:
            X.8mi r1 = X.C86104wH.A0N(r12)
            java.lang.Object r0 = r11.A00
            java.util.List r0 = (java.util.List) r0
            r1.BQA(r0)
            goto L_0x0010
        L_0x0244:
            X.8mi r1 = X.C86104wH.A0N(r12)
            java.lang.Object r0 = r11.A00
            java.util.Map r0 = (java.util.Map) r0
            r1.BgT(r0)
            goto L_0x0010
        L_0x0251:
            X.8mi r1 = X.C86104wH.A0N(r12)
            java.lang.Object r0 = r11.A00
            java.util.Map r0 = (java.util.Map) r0
            r1.BgU(r0)
            goto L_0x0010
        L_0x025e:
            X.8mi r1 = X.C86104wH.A0N(r12)
            java.lang.Object r0 = r11.A00
            X.LyC r0 = (X.C41173LyC) r0
            r1.CYe(r0)
            goto L_0x0010
        L_0x026b:
            java.lang.Object r1 = r11.A00
            android.app.Dialog r1 = (android.app.Dialog) r1
            X.C13950oZ.A00(r1)
            r0 = 13
            com.facebook.redex.IDxEResultShape438S0100000_2_I2 r5 = new com.facebook.redex.IDxEResultShape438S0100000_2_I2
            r5.<init>(r1, r0)
            return r5
        L_0x027a:
            X.7AO r12 = (X.AnonymousClass7AO) r12
            java.lang.Object r0 = X.C86154wM.A0d(r12, r11)
            X.7KG r0 = (X.AnonymousClass7KG) r0
            java.util.Map r1 = r0.A0H
            int r0 = r12.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.containsKey(r0)
            java.lang.Boolean r5 = X.C18240wQ.A0X(r0)
            return r5
        L_0x0293:
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.Object r0 = X.C86154wM.A0d(r12, r11)
            android.content.Context r0 = (android.content.Context) r0
            X.58x r5 = new X.58x
            r5.<init>(r0)
            X.78h r1 = r5.A07
            X.59A r0 = new X.59A
            r0.<init>()
            r1.A01(r0)
            X.59B r0 = new X.59B
            r0.<init>()
            r1.A01(r0)
            android.content.Context r0 = r5.A0E
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r12.setClassLoader(r0)
            java.lang.String r0 = "android-support-nav:controller:navigatorState"
            android.os.Bundle r0 = r12.getBundle(r0)
            r5.A01 = r0
            java.lang.String r0 = "android-support-nav:controller:backStack"
            android.os.Parcelable[] r0 = r12.getParcelableArray(r0)
            r5.A0C = r0
            java.util.Map r7 = r5.A0I
            r7.clear()
            java.lang.String r0 = "android-support-nav:controller:backStackDestIds"
            int[] r10 = r12.getIntArray(r0)
            java.lang.String r0 = "android-support-nav:controller:backStackIds"
            java.util.ArrayList r9 = r12.getStringArrayList(r0)
            if (r10 == 0) goto L_0x02fa
            if (r9 == 0) goto L_0x02fa
            int r8 = r10.length
            r6 = 0
            r4 = 0
        L_0x02e3:
            if (r6 >= r8) goto L_0x02fa
            r0 = r10[r6]
            int r3 = r4 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.util.Map r1 = r5.A0H
            java.lang.Object r0 = r9.get(r4)
            r1.put(r2, r0)
            int r6 = r6 + 1
            r4 = r3
            goto L_0x02e3
        L_0x02fa:
            java.lang.String r0 = "android-support-nav:controller:backStackStates"
            java.util.ArrayList r0 = r12.getStringArrayList(r0)
            if (r0 == 0) goto L_0x0345
            java.util.Iterator r6 = r0.iterator()
        L_0x0306:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0345
            java.lang.String r4 = X.C18180wK.A0k(r6)
            java.lang.String r0 = "android-support-nav:controller:backStackStates:"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)
            android.os.Parcelable[] r3 = r12.getParcelableArray(r0)
            if (r3 == 0) goto L_0x0306
            X.C04220Ms.A04(r4)
            int r0 = r3.length
            X.8AL r2 = new X.8AL
            r2.<init>(r0)
            X.0XN r1 = new X.0XN
            r1.<init>(r3)
        L_0x032a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x033a
            java.lang.Object r0 = r1.next()
            if (r0 == 0) goto L_0x033e
            r2.add(r0)
            goto L_0x032a
        L_0x033a:
            r7.put(r4, r2)
            goto L_0x0306
        L_0x033e:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState"
            java.lang.NullPointerException r1 = X.C18210wN.A0W(r0)
            throw r1
        L_0x0345:
            java.lang.String r0 = "android-support-nav:controller:deepLinkHandled"
            boolean r0 = r12.getBoolean(r0)
            r5.A0A = r0
            return r5
        L_0x034e:
            X.79m r12 = (X.C1202779m) r12
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            int[] r5 = r12.A03
            java.lang.Object r4 = r11.A00
            X.8bH r4 = (X.AnonymousClass8bH) r4
            int r3 = r5.length
            r2 = 0
            r1 = 0
        L_0x035d:
            if (r1 >= r3) goto L_0x0380
            r0 = r5[r1]
            boolean r0 = r4.A06(r0)
            if (r0 != 0) goto L_0x037f
            int r1 = r1 + 1
            goto L_0x035d
        L_0x036a:
            java.lang.ref.Reference r12 = (java.lang.ref.Reference) r12
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            java.lang.Object r0 = r12.get()
            if (r0 == 0) goto L_0x037f
            java.lang.Object r1 = r12.get()
            java.lang.Object r0 = r11.A00
            r2 = 0
            if (r1 != r0) goto L_0x0380
        L_0x037f:
            r2 = 1
        L_0x0380:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L_0x0385:
            java.lang.Object r0 = r11.A00
            X.8n9 r0 = (X.C146958n9) r0
            kotlin.Unit r5 = kotlin.Unit.A00
            r0.resumeWith(r5)
            return r5
        L_0x038f:
            java.lang.Object r0 = r11.A00
            X.M6w r0 = (X.C41259M6w) r0
            r0.internalBeginTransaction()
            r5 = 0
            return r5
        L_0x0398:
            java.lang.Object r0 = r11.A00
            X.M6w r0 = (X.C41259M6w) r0
            r0.internalEndTransaction()
            r5 = 0
            return r5
        L_0x03a1:
            java.lang.String r12 = (java.lang.String) r12
            r5 = 0
            X.C04220Ms.A0B(r12, r5)
            r4 = 1
            char[] r0 = new char[r4]
            r3 = 58
            r0[r5] = r3
            java.util.List r2 = X.AnonymousClass8bP.A0e(r12, r0, r5)
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
            java.lang.String r0 = X.C18190wL.A0p(r2, r5)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C18190wL.A0p(r2, r4)
            r1.append(r0)
            java.lang.String r5 = X.C86114wI.A0q(r1, r3)
            return r5
        L_0x03cc:
            r1 = 0
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            throw r1
        L_0x03d2:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            X.78V r1 = X.AnonymousClass78V.A02
            java.lang.Object r0 = r11.A00
            X.I2F r0 = (X.I2F) r0
            r1.A00(r0)
            r12.close()     // Catch:{ IOException -> 0x03e4 }
        L_0x03e4:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x03e7:
            java.lang.Object r5 = r11.A00
            return r5
        L_0x03ea:
            X.8mi r1 = X.C86104wH.A0N(r12)
            java.lang.Object r0 = r11.A00
            X.LyC r0 = (X.C41173LyC) r0
            java.util.Map r5 = r1.ATI(r0)
            return r5
        L_0x03f7:
            X.8mi r1 = X.C86104wH.A0N(r12)
            java.lang.Object r0 = r11.A00
            X.LyC r0 = (X.C41173LyC) r0
            java.util.Map r5 = r1.B5I(r0)
            return r5
        L_0x0404:
            X.8mi r1 = X.C86104wH.A0N(r12)
            java.lang.Object r0 = r11.A00
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.util.Map r5 = r1.BKb(r0)
            return r5
        L_0x0411:
            X.5NC r2 = new X.5NC
            r2.<init>()
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0427
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 966(0x3c6, float:1.354E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A01(r0, r1)
        L_0x0427:
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x042e
            r2.A00(r0)
        L_0x042e:
            java.lang.Object r1 = r4.A05
            if (r1 == 0) goto L_0x043b
            r0 = 1127(0x467, float:1.579E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A01(r0, r1)
        L_0x043b:
            java.lang.Object r1 = r4.A03
            java.lang.String r0 = "id"
            r2.A01(r0, r1)
            r2.A00 = r3
            X.9Gt r5 = new X.9Gt
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3.invoke(java.lang.Object):java.lang.Object");
    }
}
