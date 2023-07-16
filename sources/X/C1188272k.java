package X;

import android.view.ViewGroup;

/* renamed from: X.72k  reason: invalid class name and case insensitive filesystem */
public final class C1188272k {
    public static final ViewGroup.LayoutParams A00 = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r4 != null) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C146068la A00(X.C115506vH r7, X.C871950n r8, X.AnonymousClass0YP r9) {
        /*
            r4 = 0
            r2 = 1
            X.C04220Ms.A0B(r7, r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C102826Wr.A00
            boolean r0 = r0.compareAndSet(r4, r2)
            if (r0 == 0) goto L_0x0042
            r6 = 0
            X.EnZ r5 = new X.EnZ
            r5.<init>()
            X.0Oa r0 = X.AnonymousClass8bZ.A0B
            java.lang.Object r0 = r0.getValue()
            X.Ew2 r0 = (X.C27952Ew2) r0
            X.4qz r3 = X.AnonymousClass7Ja.A03(r0)
            r0 = 26
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r1.<init>(r5, r6, r0)
            r0 = 3
            X.C25237DiI.A00(r6, r6, r1, r3, r0)
            r0 = 45
            kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2 r3 = X.C86154wM.A10(r5, r0)
            java.lang.Object r1 = X.C122127Kl.A04
            monitor-enter(r1)
            java.util.List r0 = X.C122127Kl.A06     // Catch:{ all -> 0x0039 }
            r0.add(r3)     // Catch:{ all -> 0x0039 }
            goto L_0x003c
        L_0x0039:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x003c:
            monitor-exit(r1)
            X.8LS r0 = X.AnonymousClass8LS.A00
            X.C122127Kl.A08(r0)
        L_0x0042:
            int r0 = r8.getChildCount()
            if (r0 <= 0) goto L_0x0089
            android.view.View r4 = r8.getChildAt(r4)
            boolean r0 = r4 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r0 == 0) goto L_0x0054
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            if (r4 != 0) goto L_0x0065
        L_0x0054:
            android.content.Context r0 = r8.getContext()
            X.C04220Ms.A06(r0)
            androidx.compose.ui.platform.AndroidComposeView r4 = new androidx.compose.ui.platform.AndroidComposeView
            r4.<init>(r0)
            android.view.ViewGroup$LayoutParams r0 = A00
            r8.addView((android.view.View) r4, (android.view.ViewGroup.LayoutParams) r0)
        L_0x0065:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x00ac
            java.util.Map r0 = X.AnonymousClass6FE.A00(r4)
            boolean r0 = X.C86164wN.A1R(r0)
            if (r0 == 0) goto L_0x00ac
            r1 = 2131302105(0x7f0916d9, float:1.8222287E38)
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r4.setTag(r1, r0)
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled
            if (r0 != 0) goto L_0x00ac
            goto L_0x008d
        L_0x0089:
            r8.removeAllViews()
            goto L_0x0054
        L_0x008d:
            java.lang.String r0 = "androidx.compose.ui.platform.InspectableValueKt"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = "isDebugInspectorInfoEnabled"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x00a1 }
            r1.setAccessible(r2)     // Catch:{ Exception -> 0x00a1 }
            r0 = 0
            r1.setBoolean(r0, r2)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00ac
        L_0x00a1:
            r0 = 752(0x2f0, float:1.054E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Could not access isDebugInspectorInfoEnabled. Please set explicitly."
            android.util.Log.w(r1, r0)
        L_0x00ac:
            X.7Y3 r1 = r4.A0V
            X.52z r0 = new X.52z
            r0.<init>(r1)
            X.7W5 r3 = new X.7W5
            r3.<init>(r0, r7)
            r2 = 2131309152(0x7f093260, float:1.823658E38)
            java.lang.Object r1 = r4.getTag(r2)
            boolean r0 = r1 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r0 == 0) goto L_0x00c7
            androidx.compose.ui.platform.WrappedComposition r1 = (androidx.compose.ui.platform.WrappedComposition) r1
            if (r1 != 0) goto L_0x00cf
        L_0x00c7:
            androidx.compose.ui.platform.WrappedComposition r1 = new androidx.compose.ui.platform.WrappedComposition
            r1.<init>(r3, r4)
            r4.setTag(r2, r1)
        L_0x00cf:
            r1.CjK(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1188272k.A00(X.6vH, X.50n, X.0YP):X.8la");
    }
}
