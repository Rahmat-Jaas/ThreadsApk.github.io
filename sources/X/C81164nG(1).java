package X;

/* renamed from: X.4nG  reason: invalid class name and case insensitive filesystem */
public abstract class C81164nG extends C58493Fw {
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014a, code lost:
        if (r1 != null) goto L_0x011e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass601 r8, X.C63893iY r9) {
        /*
            r7 = this;
            r2 = 0
            java.lang.String r0 = X.C63893iY.A0D(r9, r2)
            X.C04220Ms.A0B(r0, r2)
            X.MMo r0 = X.C18180wK.A0L(r0)
            libraries.fxcallauncher.model.FxUnifiedLauncherCallbackInfo r3 = X.AnonymousClass300.parseFromJson(r0)
            java.lang.String r0 = r3.A01
            r7.A01 = r0
            java.util.List r1 = r3.A03
            r7.A03 = r1
            java.lang.String r0 = r3.A02
            r7.A02 = r0
            java.lang.String r0 = r3.A00
            r7.A00 = r0
            boolean r0 = r1.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = r7.A02
            if (r0 == 0) goto L_0x0159
            int r0 = r0.length()
            if (r0 > 0) goto L_0x003e
            java.lang.String r0 = r7.A00
            if (r0 == 0) goto L_0x0156
            int r0 = r0.length()
            if (r0 > 0) goto L_0x003e
            r1 = 0
        L_0x003e:
            r7.A04 = r1
            X.3HX r0 = r8.A00
            r6 = 0
            if (r0 == 0) goto L_0x014d
            r1 = 2131300943(0x7f09124f, float:1.821993E38)
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r5 = r0.get(r1)
        L_0x004e:
            androidx.fragment.app.FragmentActivity r4 = X.C63913ic.A05(r8)
            if (r5 == 0) goto L_0x00f0
            boolean r0 = r5 instanceof X.C26141q7
            if (r0 == 0) goto L_0x0095
            X.1q7 r5 = (X.C26141q7) r5
            java.lang.String r0 = r7.A00
            if (r0 == 0) goto L_0x0156
            r5.A05(r0)
        L_0x0061:
            X.0i6 r3 = X.C63913ic.A0F(r8)
            X.C18200wM.A1R(r3)
            X.KHq r2 = X.AnonymousClass3LY.A00(r3)
            boolean r1 = r7.A04
            X.46O r0 = new X.46O
            r0.<init>(r1)
            r2.CWx(r0)
            X.KHq r2 = X.AnonymousClass3LY.A00(r3)
            boolean r0 = r7.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.46B r0 = new X.46B
            r0.<init>(r1)
            r2.CWx(r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r3)
            X.464 r0 = new X.464
            r0.<init>()
            r1.CWx(r0)
            return r6
        L_0x0095:
            boolean r0 = r5 instanceof X.C81154nF
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r7.A00
            if (r0 == 0) goto L_0x0156
            int r1 = r0.length()
            X.4nH r5 = (X.C81174nH) r5
            r0 = r5
            X.4nF r0 = (X.C81154nF) r0
            X.49s r4 = r0.A01
            java.lang.String r3 = r5.A01()
            if (r1 <= 0) goto L_0x00cf
            r5.A00()
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            X.C04220Ms.A0B(r3, r2)
            X.29X r0 = X.AnonymousClass29X.CLIENT_FLOW_SUCCEEDED
            java.lang.String r2 = ""
            X.C697149s.A00(r0, r4, r2, r3, r1)
            X.3BR r0 = r5.A02
            if (r0 == 0) goto L_0x015c
            X.34d r0 = r0.A01
            X.1q7 r0 = r0.A00
            X.4sH r1 = r0.A02
            java.lang.String r0 = r0.A05
            r1.onAuthorizeSuccess(r2, r0)
            goto L_0x0061
        L_0x00cf:
            java.lang.String r0 = r5.A00()
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "Client Flow Interrupted"
            X.AnonymousClass0wJ.A1O(r3, r0)
            X.29X r0 = X.AnonymousClass29X.CLIENT_FLOW_FAILED
            X.C697149s.A00(r0, r4, r1, r3, r2)
            X.3BR r0 = r5.A02
            if (r0 == 0) goto L_0x015c
            X.34d r0 = r0.A01
            X.1q7 r0 = r0.A00
            X.4sH r0 = r0.A02
            r0.onAuthorizeFail()
            goto L_0x0061
        L_0x00f0:
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0061
            android.content.Intent r3 = X.C18230wP.A0B()
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            java.util.List r0 = r7.A03
            if (r0 == 0) goto L_0x0153
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x0148
            java.util.List r0 = r7.A00()
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x0148
            java.util.List r0 = r7.A00()
            java.lang.Object r0 = r0.get(r2)
            libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount r0 = (libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount) r0
            java.lang.String r1 = r0.A02
        L_0x011e:
            java.lang.String r0 = "userID"
            r5.put(r0, r1)
            java.lang.String r0 = "bloks_on_activity_result"
            r3.putExtra(r0, r5)
            java.lang.String r1 = r7.A01
            if (r1 == 0) goto L_0x0150
            java.lang.String r0 = "tokenString"
            r5.put(r0, r1)
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x0150
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0144
            r0 = -1
            r4.setResult(r0, r3)
        L_0x013f:
            r4.finish()
            goto L_0x0061
        L_0x0144:
            r4.setResult(r2, r3)
            goto L_0x013f
        L_0x0148:
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L_0x0159
            goto L_0x011e
        L_0x014d:
            r5 = r6
            goto L_0x004e
        L_0x0150:
            java.lang.String r0 = "tokenString_DEPRECATED_DO_NOT_USE"
            goto L_0x015e
        L_0x0153:
            java.lang.String r0 = "addedAccounts"
            goto L_0x015e
        L_0x0156:
            java.lang.String r0 = "obId"
            goto L_0x015e
        L_0x0159:
            java.lang.String r0 = "userId_DEPRECATED_DO_NOT_USE"
            goto L_0x015e
        L_0x015c:
            java.lang.String r0 = "unifiedLauncherFlowConfig"
        L_0x015e:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81164nG.A01(X.601, X.3iY):java.lang.Object");
    }
}
