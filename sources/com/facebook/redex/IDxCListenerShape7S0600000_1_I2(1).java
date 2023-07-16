package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape7S0600000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public IDxCListenerShape7S0600000_1_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A05 = obj3;
        this.A04 = obj2;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A01 = obj6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.jvm.internal.KtLambdaShape4S0500000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.jvm.internal.KtLambdaShape6S0400000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlin.jvm.internal.KtLambdaShape6S0400000_I2} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r3 = r16
            int r0 = r3.A06
            switch(r0) {
                case 0: goto L_0x004b;
                case 1: goto L_0x009b;
                case 2: goto L_0x00d2;
                case 3: goto L_0x0100;
                case 4: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            X.0dD r0 = X.C08360dF.A00()
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18220wO.A0B(r0)
            java.lang.String r0 = "has_user_confirmed_dialog"
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            java.lang.Object r5 = r3.A02
            X.0i6 r5 = (X.C10300i6) r5
            java.lang.Object r0 = r3.A05
            X.265 r0 = (X.AnonymousClass265) r0
            java.lang.String r4 = r0.A01
            java.lang.Object r1 = r3.A00
            X.25r r1 = (X.C313625r) r1
            java.lang.Object r0 = r3.A04
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.C18210wN.A0n(r2, r5, r4)
            r2 = 0
            X.C62223Xv.A00(r5, r1, r2, r0, r4)
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18190wL.A19(r0)
            android.content.Context r0 = r0.requireContext()
            X.AnonymousClass3Y3.A01(r0)
            java.lang.Object r1 = r3.A03
            X.4o2 r1 = (X.C81584o2) r1
            if (r1 == 0) goto L_0x0007
            com.facebook.redex.IDxEListenerShape711S0100000_1_I2 r1 = (com.facebook.redex.IDxEListenerShape711S0100000_1_I2) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x015e;
                case 1: goto L_0x0153;
                case 2: goto L_0x014b;
                case 3: goto L_0x0143;
                default: goto L_0x004a;
            }
        L_0x004a:
            return
        L_0x004b:
            java.lang.Object r6 = r3.A00
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r0 = r3.A02
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            r7 = r18
            r0 = r0[r18]
            r5 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r5)
            r0.show()
            java.lang.Object r4 = r3.A01
            X.4ty r4 = (X.C84854ty) r4
            java.lang.Object r0 = r3.A03
            X.4nO r0 = (X.C81224nO) r0
            java.lang.String r0 = X.AnonymousClass1j3.A02(r0)
            java.lang.String r1 = "/QP/force_mode/"
            java.lang.String r0 = android.net.Uri.encode(r0)
            java.lang.String r2 = X.AnonymousClass00U.A0L(r1, r0)
            r1 = r4
            com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler r1 = (com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler) r1
            X.C04220Ms.A0B(r2, r5)
            monitor-enter(r1)
            X.0Oa r0 = r1.A02     // Catch:{ all -> 0x0098 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0098 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0098 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0098 }
            X.AnonymousClass0wJ.A11(r0, r2, r7)     // Catch:{ all -> 0x0098 }
            monitor-exit(r1)
            java.lang.Object r1 = r3.A05
            X.LyD r1 = (X.C41174LyD) r1
            java.lang.Object r0 = r3.A04
            androidx.preference.PreferenceScreen r0 = (androidx.preference.PreferenceScreen) r0
            r1.A01(r6, r0, r4)
            return
        L_0x0098:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x009b:
            java.lang.Object r5 = r3.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r13 = r3.A05
            X.0i6 r13 = (X.C10300i6) r13
            java.lang.Object r2 = r3.A04
            X.06E r2 = (X.AnonymousClass06E) r2
            java.lang.Object r0 = r3.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.Object r9 = r3.A01
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            java.lang.Object r8 = r3.A02
            X.H1T r3 = X.AnonymousClass0wJ.A0O(r13)
            java.lang.Object[] r1 = X.C18220wO.A1Y(r0, r9)
            java.lang.String r0 = "groups/%s/unblock/%s/"
            r3.A0T(r0, r1)
            java.lang.Class<X.1R8> r1 = X.AnonymousClass1R8.class
            java.lang.Class<X.3KQ> r0 = X.AnonymousClass3KQ.class
            X.H8c r0 = X.AnonymousClass0wJ.A0T(r3, r1, r0)
            r11 = 47
            kotlin.jvm.internal.KtLambdaShape6S0400000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape6S0400000_I2
            r10 = r3
            r12 = r5
            r14 = r8
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0132
        L_0x00d2:
            java.lang.Object r5 = r3.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r3.A05
            X.0i6 r6 = (X.C10300i6) r6
            java.lang.Object r2 = r3.A04
            X.06E r2 = (X.AnonymousClass06E) r2
            java.lang.Object r7 = r3.A03
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.Object r9 = r3.A02
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            java.lang.Object r8 = r3.A01
            X.H1T r3 = X.AnonymousClass0wJ.A0O(r6)
            java.lang.Object[] r1 = X.C18220wO.A1Y(r7, r9)
            java.lang.String r0 = "groups/%s/block/%s/"
            r3.A0T(r0, r1)
            java.lang.Class<X.1R8> r1 = X.AnonymousClass1R8.class
            java.lang.Class<X.3KQ> r0 = X.AnonymousClass3KQ.class
            X.H8c r0 = X.AnonymousClass0wJ.A0T(r3, r1, r0)
            r4 = 13
            goto L_0x012d
        L_0x0100:
            java.lang.Object r5 = r3.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r3.A05
            X.0i6 r6 = (X.C10300i6) r6
            java.lang.Object r2 = r3.A04
            X.06E r2 = (X.AnonymousClass06E) r2
            java.lang.Object r7 = r3.A03
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.Object r9 = r3.A02
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            java.lang.Object r8 = r3.A01
            X.H1T r3 = X.AnonymousClass0wJ.A0O(r6)
            java.lang.Object[] r1 = X.C18220wO.A1Y(r7, r9)
            java.lang.String r0 = "groups/%s/remove_member/%s/"
            r3.A0T(r0, r1)
            java.lang.Class<X.1R8> r1 = X.AnonymousClass1R8.class
            java.lang.Class<X.3KQ> r0 = X.AnonymousClass3KQ.class
            X.H8c r0 = X.AnonymousClass0wJ.A0T(r3, r1, r0)
            r4 = 14
        L_0x012d:
            kotlin.jvm.internal.KtLambdaShape4S0500000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape4S0500000_I2
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x0132:
            r11 = 9
            com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2 r10 = new com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2
            r12 = r5
            r13 = r8
            r14 = r9
            r15 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A00 = r10
            X.C31155GhB.A01(r5, r2, r0)
            return
        L_0x0143:
            java.lang.Object r0 = r1.A00
            X.1cl r0 = (X.AnonymousClass1cl) r0
            X.AnonymousClass1cl.A01(r0)
            return
        L_0x014b:
            java.lang.Object r0 = r1.A00
            X.1ck r0 = (X.AnonymousClass1ck) r0
            X.AnonymousClass1ck.A00(r0)
            return
        L_0x0153:
            java.lang.Object r0 = r1.A00
            X.1cg r0 = (X.C23201cg) r0
            X.C23201cg.A02(r0)
            X.C18210wN.A13(r0)
            return
        L_0x015e:
            X.AnonymousClass3RH.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape7S0600000_1_I2.onClick(android.content.DialogInterface, int):void");
    }
}
