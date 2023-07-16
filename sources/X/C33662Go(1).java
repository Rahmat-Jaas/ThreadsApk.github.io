package X;

/* renamed from: X.2Go  reason: invalid class name and case insensitive filesystem */
public final class C33662Go {
    /* JADX WARNING: type inference failed for: r6v4, types: [X.1rT] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ac, code lost:
        r0.A00 = r6;
        X.C31155GhB.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02b3, code lost:
        X.C10450iM.A03(X.C67313zL.__redex_internal_original_name, "No users found");
        new android.app.AlertDialog.Builder(r3).setMessage(2131831836).setTitle(2131826851).setPositiveButton(2131826195, X.C64223jt.A00).show();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass601 r27, X.C63893iY r28) {
        /*
            r8 = 0
            r9 = r27
            r4 = r28
            boolean r2 = X.AnonymousClass0wJ.A1Z(r4, r9)
            java.lang.Object r1 = X.C63893iY.A0B(r4, r8)
            r1.getClass()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            X.C04220Ms.A0C(r1, r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = X.C63893iY.A0C(r4, r3, r2)
            java.lang.String r6 = (java.lang.String) r6
            r0 = 2
            java.lang.Object r5 = X.C63893iY.A0C(r4, r3, r0)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 4
            java.lang.Object r7 = X.C63893iY.A0B(r4, r0)
            r7.getClass()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Double"
            X.C04220Ms.A0C(r7, r0)
            java.lang.Double r7 = (java.lang.Double) r7
            r0 = 5
            java.lang.Object r4 = X.C63893iY.A0C(r4, r3, r0)
            java.lang.String r4 = (java.lang.String) r4
            X.0i6 r0 = X.C63913ic.A0F(r9)
            com.instagram.service.session.UserSession r15 = X.C05030Qo.A02(r0)
            androidx.fragment.app.FragmentActivity r3 = X.C63913ic.A05(r9)
            androidx.fragment.app.Fragment r17 = X.C63913ic.A01(r9)
            X.0kW r18 = X.C63913ic.A0A(r9)
            java.lang.String r0 = "bloks"
            X.C63453hV.A02(r15, r0, r5)
            java.lang.String r11 = "direct_inbox"
            boolean r0 = r11.equals(r5)
            if (r0 == 0) goto L_0x006f
            X.C30978Gcg.A00(r15)
            r9 = 0
            r0 = 10000008(0x989688, float:1.4012996E-38)
            com.facebook.msys.mci.TraceLogger.broadcastEvent(r0, r8, r9)
            X.01V r9 = X.AnonymousClass01V.A0p
            X.GFJ r0 = new X.GFJ
            r0.<init>(r9)
            r0.A00()
        L_0x006f:
            int r0 = r6.hashCode()
            switch(r0) {
                case -1040357245: goto L_0x023e;
                case -190139236: goto L_0x01e8;
                case 1002241282: goto L_0x00e0;
                case 1004714737: goto L_0x0078;
                default: goto L_0x0076;
            }
        L_0x0076:
            r0 = 0
            return r0
        L_0x0078:
            java.lang.String r0 = "LOGGED_OUT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0076
            X.3hk r0 = X.C63533hk.A02(r15)
            java.util.List r6 = r0.A07()
            r0 = 3
            com.facebook.redex.IDxOSessionShape141S0000000_1_I2 r2 = new com.facebook.redex.IDxOSessionShape141S0000000_1_I2
            r2.<init>(r0)
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0bf r8 = r0.A05(r2)
            java.util.Iterator r10 = r6.iterator()
        L_0x0098:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r9 = r10.next()
            X.3ac r9 = (X.C62733ac) r9
            java.lang.String r0 = r9.A05
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0098
            X.4Dh r2 = new X.4Dh
            r2.<init>(r3)
            X.265 r22 = X.AnonymousClass265.A16
            java.lang.String r0 = r9.A06
            X.1rU r6 = new X.1rU
            r21 = r15
            r23 = r7
            r24 = r0
            r25 = r1
            r26 = r4
            r27 = r1
            r28 = r5
            r16 = r6
            r19 = r2
            r20 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r2 = r9.A03
            if (r2 == 0) goto L_0x0098
            java.lang.String r0 = r9.A00()
            X.H8c r0 = X.C63883iV.A04(r3, r8, r2, r1, r0)
            r0.A00 = r6
            X.C31155GhB.A03(r0)
            goto L_0x0098
        L_0x00e0:
            java.lang.String r0 = "LOGGED_IN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0076
            X.0BO r10 = r15.multipleAccountHelper
            X.0RL r0 = r10.A00
            r6 = 0
            java.util.List r0 = r0.A04(r6)
            java.util.Iterator r12 = r0.iterator()
        L_0x00f5:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r9 = r12.next()
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            java.lang.String r0 = r9.getId()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r10.A0N(r3, r15, r9)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "mini_switcher_select"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x017c
            X.29q r11 = X.C319629q.MINI_SWITCHER_SELECT
        L_0x011b:
            X.29q r0 = X.C319629q.DIRECT_INBOX
            if (r11 != r0) goto L_0x017a
            java.lang.String r13 = "all"
            java.lang.String r11 = "direct_inbox_account_switch"
            X.3Yi r0 = X.C62333Yi.A01()
            X.C04220Ms.A0B(r3, r8)
            android.content.Intent r12 = r0.A03(r3, r8)
            android.net.Uri$Builder r14 = new android.net.Uri$Builder
            r14.<init>()
            java.lang.String r0 = "ig"
            android.net.Uri$Builder r0 = r14.scheme(r0)
            android.net.Uri$Builder r11 = r0.authority(r11)
            java.lang.String r0 = "filter_type"
            android.net.Uri r0 = X.C18220wO.A0F(r11, r0, r13)
            r12.setData(r0)
        L_0x0146:
            r16 = r10
            r17 = r3
            r18 = r12
            r19 = r15
            r20 = r9
            r21 = r5
            r22 = r8
            r16.A0I(r17, r18, r19, r20, r21, r22)
            X.28R r14 = X.AnonymousClass28R.INTRA_APP
            double r23 = r7.doubleValue()
            java.lang.Long r16 = X.AnonymousClass0wJ.A0d(r1)
            java.lang.Long r17 = X.AnonymousClass0wJ.A0d(r1)
            r21 = r6
            r22 = r6
            r26 = r2
            r27 = r2
            r20 = r6
            r25 = r2
            r18 = r4
            r19 = r5
            X.C63453hV.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27)
            goto L_0x0076
        L_0x017a:
            r12 = 0
            goto L_0x0146
        L_0x017c:
            java.lang.String r0 = "profile_title"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0187
            X.29q r11 = X.C319629q.PROFILE_TITLE
            goto L_0x011b
        L_0x0187:
            java.lang.String r0 = "tab_bar_long_press"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0192
            X.29q r11 = X.C319629q.TAB_BAR_LONG_PRESS
            goto L_0x011b
        L_0x0192:
            java.lang.String r0 = "tab_bar_double_tap"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x019e
            X.29q r11 = X.C319629q.TAB_BAR_DOUBLE_TAP
            goto L_0x011b
        L_0x019e:
            java.lang.String r0 = "bookmark"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01aa
            X.29q r11 = X.C319629q.BOOKMARK
            goto L_0x011b
        L_0x01aa:
            boolean r0 = r5.equals(r11)
            if (r0 == 0) goto L_0x01b4
            X.29q r11 = X.C319629q.DIRECT_INBOX
            goto L_0x011b
        L_0x01b4:
            java.lang.String r0 = "unknown_nt_action"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01c0
            X.29q r11 = X.C319629q.UNKNOWN_NT_ACTION
            goto L_0x011b
        L_0x01c0:
            java.lang.String r0 = "new_account_created"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01cc
            X.29q r11 = X.C319629q.NEW_ACCOUNT_CREATED
            goto L_0x011b
        L_0x01cc:
            java.lang.String r0 = "snack_bar"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01d8
            X.29q r11 = X.C319629q.SNACK_BAR
            goto L_0x011b
        L_0x01d8:
            java.lang.String r0 = "horizontal_switch"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01e4
            X.29q r11 = X.C319629q.HORIZONTAL_SWITCH
            goto L_0x011b
        L_0x01e4:
            X.29q r11 = X.C319629q.UNKNOWN
            goto L_0x011b
        L_0x01e8:
            java.lang.String r0 = "DEFERRED_CHILD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0076
            X.3an r0 = X.C62813an.A01(r15)
            X.3Yv r0 = r0.A00
            if (r0 == 0) goto L_0x0076
            java.util.HashMap r0 = r0.A00
            com.google.common.collect.ImmutableList r0 = X.C18240wQ.A0J(r0)
            X.83w r4 = r0.iterator()
        L_0x0202:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r5 = r4.next()
            X.3H7 r5 = (X.AnonymousClass3H7) r5
            java.lang.String r0 = r5.A01
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0202
            com.facebook.redex.IDxOSessionShape141S0000000_1_I2 r4 = new com.facebook.redex.IDxOSessionShape141S0000000_1_I2
            r4.<init>(r2)
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0bf r10 = r0.A05(r4)
            X.4Dh r9 = new X.4Dh
            r9.<init>(r3)
            X.265 r11 = X.AnonymousClass265.A0Z
            java.lang.String r12 = r5.A01()
            X.1rT r6 = new X.1rT
            r13 = r1
            r7 = r17
            r8 = r18
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = r5.A02
            r0 = 0
            X.H8c r0 = X.C63883iV.A04(r3, r10, r2, r1, r0)
            goto L_0x02ac
        L_0x023e:
            java.lang.String r0 = "DEFERRED_RECOVERED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0076
            X.3an r0 = X.C62813an.A01(r15)
            X.3Yv r0 = r0.A00
            if (r0 == 0) goto L_0x0076
            java.util.HashMap r0 = r0.A01
            com.google.common.collect.ImmutableList r0 = X.C18240wQ.A0J(r0)
            X.83w r2 = r0.iterator()
        L_0x0258:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r5 = r2.next()
            X.3FU r5 = (X.AnonymousClass3FU) r5
            java.lang.String r0 = r5.A00()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0258
            r0 = 2
            com.facebook.redex.IDxOSessionShape141S0000000_1_I2 r2 = new com.facebook.redex.IDxOSessionShape141S0000000_1_I2
            r2.<init>(r0)
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0bf r4 = r0.A05(r2)
            X.4Dh r2 = new X.4Dh
            r2.<init>(r3)
            X.265 r14 = X.AnonymousClass265.A0Z
            com.instagram.user.model.MicroUserDict r0 = r5.A00
            X.C04220Ms.A0B(r0, r8)
            java.lang.String r0 = r0.A0F
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = ""
        L_0x028c:
            com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2 r6 = new com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2
            r9 = r6
            r10 = r17
            r11 = r18
            r12 = r2
            r13 = r4
            r15 = r11
            r16 = r5
            r17 = r0
            r18 = r1
            r19 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = r5.A01
            java.lang.String r1 = r5.A00()
            r0 = 0
            X.H8c r0 = X.C63883iV.A04(r3, r4, r2, r1, r0)
        L_0x02ac:
            r0.A00 = r6
            X.C31155GhB.A03(r0)
            goto L_0x0076
        L_0x02b3:
            java.lang.String r1 = "CompanyIdentitySwitcherHelper"
            java.lang.String r0 = "No users found"
            X.C10450iM.A03(r1, r0)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r3)
            r0 = 2131831836(0x7f112c1c, float:1.9296709E38)
            android.app.AlertDialog$Builder r1 = r1.setMessage(r0)
            r0 = 2131826851(0x7f1118a3, float:1.9286598E38)
            android.app.AlertDialog$Builder r2 = r1.setTitle(r0)
            r1 = 2131826195(0x7f111613, float:1.9285268E38)
            X.3jt r0 = X.C64223jt.A00
            android.app.AlertDialog$Builder r0 = r2.setPositiveButton(r1, r0)
            r0.show()
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33662Go.A00(X.601, X.3iY):java.lang.Object");
    }
}
