package androidx.compose.ui.tooling;

import androidx.activity.ComponentActivity;

public final class PreviewActivity extends ComponentActivity {
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        r0 = X.C18190wL.A0a("PreviewParameterProvider constructor can not have parameters");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -143662076(0xfffffffff76fe404, float:-4.865561E33)
            int r4 = X.C14030oh.A00(r0)
            super.onCreate(r12)
            android.content.pm.ApplicationInfo r0 = r11.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 != 0) goto L_0x001e
            r11.finish()
            r0 = 2036440635(0x79619e3b, float:7.3217256E34)
        L_0x001a:
            X.C14030oh.A07(r0, r4)
            return
        L_0x001e:
            android.content.Intent r1 = r11.getIntent()
            if (r1 == 0) goto L_0x00af
            java.lang.String r0 = "composable"
            java.lang.String r1 = r1.getStringExtra(r0)
            if (r1 == 0) goto L_0x00af
            r6 = 0
            r0 = 46
            r5 = r1
            r7 = 0
            int r0 = X.AnonymousClass8bP.A0F(r1, r0)
            r8 = -1
            if (r0 == r8) goto L_0x003c
            java.lang.String r5 = X.C18230wP.A0s(r1, r7, r0)
        L_0x003c:
            java.lang.String r3 = X.AnonymousClass8bP.A0W(r1, r1)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "parameterProviderClassName"
            java.lang.String r10 = r1.getStringExtra(r0)
            if (r10 == 0) goto L_0x0075
            r9 = 0
            java.lang.Class r0 = java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x0054 }
            if (r0 == 0) goto L_0x0067
            goto L_0x0066
        L_0x0054:
            r2 = move-exception
            java.lang.String r1 = "Unable to find PreviewProvider '"
            r0 = 39
            java.lang.String r1 = X.AnonymousClass00U.A0M(r1, r10, r0)
            X.C04220Ms.A0B(r1, r7)
            java.lang.String r0 = "PreviewLogger"
            android.util.Log.e(r0, r1, r2)
            goto L_0x0067
        L_0x0066:
            r9 = r0
        L_0x0067:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "parameterProviderIndex"
            int r8 = r1.getIntExtra(r0, r8)
            if (r9 == 0) goto L_0x007e
            goto L_0x00fb
        L_0x0075:
            X.8Qn r1 = new X.8Qn
            r1.<init>(r5, r3)
            r0 = -161032931(0xfffffffff666d51d, float:-1.1704597E33)
            goto L_0x0088
        L_0x007e:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            kotlin.jvm.internal.KtLambdaShape3S2100000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape3S2100000_I2
            r1.<init>(r0, r5, r3)
            r0 = 1507674311(0x59dd48c7, float:7.7857487E15)
        L_0x0088:
            X.7WY r2 = X.AnonymousClass7WY.A00(r1, r0)
            android.view.Window r0 = r11.getWindow()
            android.view.View r1 = r0.getDecorView()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r0.getChildAt(r7)
            boolean r0 = r1 instanceof androidx.compose.ui.platform.ComposeView
            if (r0 == 0) goto L_0x00b4
            androidx.compose.ui.platform.ComposeView r1 = (androidx.compose.ui.platform.ComposeView) r1
            if (r1 == 0) goto L_0x00b4
            r1.setParentCompositionContext(r6)
            r1.setContent(r2)
        L_0x00af:
            r0 = 1239188405(0x49dc83b5, float:1806454.6)
            goto L_0x001a
        L_0x00b4:
            androidx.compose.ui.platform.ComposeView r3 = new androidx.compose.ui.platform.ComposeView
            r3.<init>(r11, r6, r7)
            r3.setParentCompositionContext(r6)
            r3.setContent(r2)
            android.view.Window r0 = r11.getWindow()
            android.view.View r2 = r0.getDecorView()
            X.C04220Ms.A06(r2)
            X.066 r0 = X.C116066wM.A00(r2)
            if (r0 != 0) goto L_0x00d3
            X.C116066wM.A01(r2, r11)
        L_0x00d3:
            X.06C r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner.A00(r2)
            if (r0 != 0) goto L_0x00df
            r0 = 2131309013(0x7f0931d5, float:1.8236298E38)
            r2.setTag(r0, r11)
        L_0x00df:
            X.8Me r0 = X.C138978Me.A00
            X.8mw r1 = X.AnonymousClass8bL.A08(r2, r0)
            X.8Mf r0 = X.C138988Mf.A00
            java.lang.Object r0 = X.C146838mw.A00(r0, r1)
            X.0rp r0 = (X.C15750rp) r0
            if (r0 != 0) goto L_0x00f5
            r0 = 2131309012(0x7f0931d4, float:1.8236296E38)
            r2.setTag(r0, r11)
        L_0x00f5:
            android.view.ViewGroup$LayoutParams r0 = X.AnonymousClass6WH.A00
            r11.setContentView(r3, r0)
            goto L_0x00af
        L_0x00fb:
            java.lang.reflect.Constructor[] r5 = r9.getConstructors()     // Catch:{ 6Bc -> 0x0144 }
            X.C04220Ms.A06(r5)     // Catch:{ 6Bc -> 0x0144 }
            int r4 = r5.length     // Catch:{ 6Bc -> 0x0144 }
            r3 = 0
            r2 = 0
        L_0x0105:
            r0 = 1
            if (r3 >= r4) goto L_0x011b
            r1 = r5[r3]     // Catch:{ 6Bc -> 0x0144 }
            java.lang.Class[] r0 = r1.getParameterTypes()     // Catch:{ 6Bc -> 0x0144 }
            X.C04220Ms.A06(r0)     // Catch:{ 6Bc -> 0x0144 }
            int r0 = r0.length     // Catch:{ 6Bc -> 0x0144 }
            if (r0 != 0) goto L_0x0118
            if (r2 != 0) goto L_0x0136
            r6 = r1
            r2 = 1
        L_0x0118:
            int r3 = r3 + 1
            goto L_0x0105
        L_0x011b:
            if (r2 == 0) goto L_0x0136
            if (r6 == 0) goto L_0x0136
            r6.setAccessible(r0)     // Catch:{ 6Bc -> 0x0144 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ 6Bc -> 0x0144 }
            java.lang.Object r1 = r6.newInstance(r0)     // Catch:{ 6Bc -> 0x0144 }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>"
            X.C04220Ms.A0C(r1, r0)     // Catch:{ 6Bc -> 0x0144 }
            if (r8 >= 0) goto L_0x013d
            java.lang.String r0 = "getValues"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)     // Catch:{ 6Bc -> 0x0144 }
            goto L_0x0143
        L_0x0136:
            java.lang.String r0 = "PreviewParameterProvider constructor can not have parameters"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ 6Bc -> 0x0144 }
            goto L_0x0143
        L_0x013d:
            java.lang.String r0 = "getValues"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)     // Catch:{ 6Bc -> 0x0144 }
        L_0x0143:
            throw r0     // Catch:{ 6Bc -> 0x0144 }
        L_0x0144:
            java.lang.String r0 = "Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.PreviewActivity.onCreate(android.os.Bundle):void");
    }
}
