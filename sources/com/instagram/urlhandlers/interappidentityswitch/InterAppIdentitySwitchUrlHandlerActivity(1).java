package com.instagram.urlhandlers.interappidentityswitch;

import X.AnonymousClass0RJ;
import X.C10300i6;
import X.C11630kW;
import com.instagram.base.activity.IgFragmentActivity;

public class InterAppIdentitySwitchUrlHandlerActivity extends IgFragmentActivity implements C11630kW, AnonymousClass0RJ {
    public C10300i6 A00;

    public final String getModuleName() {
        return "inter_app_identity_switch";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0119, code lost:
        if ("instagram".equals(r4) != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0132, code lost:
        if (r4.contains(r7) == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02e0, code lost:
        if (r7 == false) goto L_0x02e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r52) {
        /*
            r51 = this;
            r0 = -1922710390(0xffffffff8d65c48a, float:-7.080265E-31)
            int r19 = X.C14030oh.A00(r0)
            r0 = r51
            r1 = r52
            super.onCreate(r1)
            android.content.Intent r7 = r0.getIntent()
            android.os.Bundle r8 = X.C18210wN.A0B(r7)
            if (r8 != 0) goto L_0x0024
            r0.finish()
            r1 = -79065308(0xfffffffffb498f24, float:-1.0465549E36)
        L_0x001e:
            r0 = r19
            X.C14030oh.A07(r1, r0)
            return
        L_0x0024:
            java.lang.String r1 = "extra_source_intent"
            android.os.Parcelable r5 = r8.getParcelable(r1)
            android.content.Intent r5 = (android.content.Intent) r5
            if (r5 == 0) goto L_0x032f
            X.2Op r2 = new X.2Op
            r2.<init>()
            r11 = 0
            X.4WC r1 = new X.4WC
            r1.<init>(r2)
            X.4WD r4 = new X.4WD
            r4.<init>(r2)
            X.0ro r3 = new X.0ro
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x0047:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r2.next()
            X.0rM r1 = (X.C15460rM) r1
            r3.A03(r1, r4)
            goto L_0x0047
        L_0x0057:
            X.0rl r1 = r3.A00()
            boolean r1 = r1.A01(r0, r5, r11)
            if (r1 == 0) goto L_0x032f
            X.0RG r6 = X.AnonymousClass0RA.A0C
            X.0i6 r1 = r6.A02(r8)
            r0.A00 = r1
            java.lang.String r18 = X.C18180wK.A0e()
            java.lang.String r5 = X.C18190wL.A0i(r8)
            r5.getClass()
            android.net.Uri r4 = X.C15430rJ.A01(r5)
            java.lang.String r1 = "initiator_app"
            java.lang.String r34 = r4.getQueryParameter(r1)
            java.lang.String r1 = "start_time"
            java.lang.String r17 = r4.getQueryParameter(r1)
            java.lang.String r1 = "account_id"
            java.lang.String r3 = r7.getStringExtra(r1)
            java.lang.String r1 = "inter_app_identity_switch"
            java.lang.String r42 = r4.getQueryParameter(r1)
            java.lang.String r1 = "xapp_session_id"
            java.lang.String r36 = r4.getQueryParameter(r1)
            X.0i6 r2 = r0.A00
            boolean r1 = r2 instanceof com.instagram.service.session.UserSession
            if (r1 != 0) goto L_0x00cd
            X.AnonymousClass3YR.A00(r0, r8, r2)
            if (r17 == 0) goto L_0x00c8
            if (r34 == 0) goto L_0x00c8
            if (r3 == 0) goto L_0x00a9
            java.lang.Long r11 = X.AnonymousClass0wJ.A0d(r3)
        L_0x00a9:
            X.0i6 r0 = r0.A00
            r48 = 0
            X.28R r37 = X.AnonymousClass28R.INTER_APP
            r49 = 1
            double r46 = java.lang.Double.parseDouble(r17)
            java.lang.String r44 = "logged_out"
            r38 = r0
            r39 = r11
            r40 = r11
            r41 = r18
            r43 = r34
            r45 = r36
            r50 = r48
            X.C63453hV.A01(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50)
        L_0x00c8:
            r1 = -1939245562(0xffffffff8c697606, float:-1.7985183E-31)
            goto L_0x001e
        L_0x00cd:
            java.lang.String r1 = "destination_url"
            java.lang.String r8 = r7.getStringExtra(r1)
            r7 = 3
            r14 = 0
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[]{r5, r8, r3}
            r2 = 0
        L_0x00da:
            r1 = r5[r2]
            boolean r1 = X.C121687Hl.A03(r1)
            if (r1 == 0) goto L_0x00ea
            r0.finish()
            r1 = -1795868486(0xffffffff94f538ba, float:-2.4761053E-26)
            goto L_0x001e
        L_0x00ea:
            int r2 = r2 + 1
            if (r2 < r7) goto L_0x00da
            r8.getClass()     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r1 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r8, r1)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r1.getClass()     // Catch:{ IOException | SecurityException -> 0x0314 }
            android.net.Uri r2 = X.C15430rJ.A01(r1)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r13 = 1
            X.C04220Ms.A0B(r2, r13)     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r4 = r4.getScheme()     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r7 = r2.getScheme()     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r1 != 0) goto L_0x011b
            java.lang.String r1 = "instagram"
            boolean r1 = r1.equals(r4)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r5 = 0
            if (r1 == 0) goto L_0x011c
        L_0x011b:
            r5 = 1
        L_0x011c:
            if (r7 == 0) goto L_0x0134
            int r1 = r7.length()     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r1 == 0) goto L_0x0134
            java.util.HashSet r4 = X.C18200wM.A0u()     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r1 = "instagram"
            r4.add(r1)     // Catch:{ IOException | SecurityException -> 0x0314 }
            boolean r4 = r4.contains(r7)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r1 = 1
            if (r4 != 0) goto L_0x0135
        L_0x0134:
            r1 = 0
        L_0x0135:
            if (r5 == 0) goto L_0x0310
            if (r1 == 0) goto L_0x0310
            X.0bf r27 = r6.A05(r0)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.0i6 r1 = r0.A00     // Catch:{ IOException | SecurityException -> 0x0314 }
            com.instagram.service.session.UserSession r4 = X.C05030Qo.A02(r1)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.0i6 r15 = r0.A00     // Catch:{ IOException | SecurityException -> 0x0314 }
            r3.getClass()     // Catch:{ IOException | SecurityException -> 0x0314 }
            r18.getClass()     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r42 != 0) goto L_0x014f
            java.lang.String r42 = ""
        L_0x014f:
            java.lang.Long r31 = X.AnonymousClass0wJ.A0d(r3)     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r1 = r4.getUserId()     // Catch:{ IOException | SecurityException -> 0x0314 }
            boolean r1 = r3.equals(r1)     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r1 == 0) goto L_0x0193
            android.content.Intent r1 = X.C62333Yi.A00(r0)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r1.setData(r2)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.C10650ih.A09(r0, r1)     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r17 == 0) goto L_0x0188
            if (r34 == 0) goto L_0x0188
            X.28R r37 = X.AnonymousClass28R.INTER_APP     // Catch:{ IOException | SecurityException -> 0x0314 }
            double r46 = java.lang.Double.parseDouble(r17)     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r44 = "active_session"
            r38 = r15
            r39 = r31
            r40 = r31
            r41 = r18
            r43 = r34
            r45 = r36
            r48 = r13
            r49 = r13
            r50 = r13
            X.C63453hV.A01(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50)     // Catch:{ IOException | SecurityException -> 0x0314 }
        L_0x0188:
            boolean r1 = r0.isTaskRoot()     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r1 == 0) goto L_0x00c8
            r0.finish()     // Catch:{ IOException | SecurityException -> 0x0314 }
            goto L_0x00c8
        L_0x0193:
            android.content.Intent r5 = X.C62333Yi.A00(r0)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r5.setData(r2)     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r6 = "event_session_id"
            r1 = r18
            r5.putExtra(r6, r1)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.0BO r1 = r4.multipleAccountHelper     // Catch:{ IOException | SecurityException -> 0x0314 }
            boolean r6 = r1.A0O(r3)     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r6 == 0) goto L_0x0228
            com.instagram.user.model.User r6 = r1.A0E(r3)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r6.getClass()     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r3 = r6.BK7()     // Catch:{ IOException | SecurityException -> 0x0314 }
            boolean r2 = r1.A0N(r0, r4, r6)     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r2 == 0) goto L_0x02e2
            android.content.res.Resources r7 = r0.getResources()     // Catch:{ IOException | SecurityException -> 0x0314 }
            r2 = 2131827796(0x7f111c54, float:1.9288515E38)
            java.lang.String r7 = X.C18190wL.A0h(r7, r3, r2)     // Catch:{ IOException | SecurityException -> 0x0314 }
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ IOException | SecurityException -> 0x0314 }
            r2 = 2131827795(0x7f111c53, float:1.9288513E38)
            java.lang.String r3 = X.C18190wL.A0h(r8, r3, r2)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r21 = 4
            com.facebook.redex.IDxCListenerShape9S0500000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape9S0500000_1_I2     // Catch:{ IOException | SecurityException -> 0x0314 }
            r20 = r2
            r22 = r1
            r23 = r4
            r24 = r6
            r25 = r0
            r26 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r1 = 176(0xb0, float:2.47E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r5 = new com.facebook.redex.IDxCListenerShape217S0100000_1_I2     // Catch:{ IOException | SecurityException -> 0x0314 }
            r5.<init>((androidx.fragment.app.FragmentActivity) r0, (int) r1)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r4 = 2131824237(0x7f110e6d, float:1.9281296E38)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            X.AnonymousClass0wJ.A1M(r7, r13, r3)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.Dsm r0 = X.C18190wL.A0W(r0)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r0.A02 = r7     // Catch:{ IOException | SecurityException -> 0x0314 }
            r0.A0p(r3)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r0.A0P(r2, r4)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r0.A0O(r5, r1)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.AnonymousClass0wJ.A1K(r0)     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r17 == 0) goto L_0x00c8
            if (r34 == 0) goto L_0x00c8
            X.28R r37 = X.AnonymousClass28R.INTER_APP     // Catch:{ IOException | SecurityException -> 0x0314 }
            double r46 = java.lang.Double.parseDouble(r17)     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r44 = "inactive_session"
            r38 = r15
            r39 = r31
            r40 = r31
            r41 = r18
            r43 = r34
            r45 = r36
            r48 = r13
            r49 = r13
            r50 = r13
            X.C63453hV.A01(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50)     // Catch:{ IOException | SecurityException -> 0x0314 }
            goto L_0x00c8
        L_0x0228:
            X.3hk r5 = X.C63533hk.A02(r4)     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.util.List r6 = r5.A08(r15)     // Catch:{ IOException | SecurityException -> 0x0314 }
            boolean r6 = r6.isEmpty()     // Catch:{ IOException | SecurityException -> 0x0314 }
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x02e2
            r7 = 0
            java.util.List r5 = r5.A07()     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.util.Iterator r16 = r5.iterator()     // Catch:{ IOException | SecurityException -> 0x0314 }
        L_0x0241:
            boolean r5 = r16.hasNext()     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r5 == 0) goto L_0x02e0
            java.lang.Object r5 = r16.next()     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.3ac r5 = (X.C62733ac) r5     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r6 = r5.A05     // Catch:{ IOException | SecurityException -> 0x0314 }
            boolean r6 = r6.equals(r3)     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r6 == 0) goto L_0x0241
            java.lang.String r7 = r5.A06     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.4Dh r6 = new X.4Dh     // Catch:{ IOException | SecurityException -> 0x0314 }
            r6.<init>(r0)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.265 r30 = X.AnonymousClass265.A0p     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.1rV r20 = new X.1rV     // Catch:{ IOException | SecurityException -> 0x0314 }
            r23 = r0
            r24 = r0
            r28 = r1
            r29 = r4
            r32 = r7
            r33 = r3
            r35 = r18
            r21 = r2
            r22 = r0
            r25 = r15
            r26 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ IOException | SecurityException -> 0x0314 }
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ IOException | SecurityException -> 0x0314 }
            r6 = 2131827796(0x7f111c54, float:1.9288515E38)
            java.lang.String r8 = X.C18190wL.A0h(r8, r7, r6)     // Catch:{ IOException | SecurityException -> 0x0314 }
            android.content.res.Resources r9 = r0.getResources()     // Catch:{ IOException | SecurityException -> 0x0314 }
            r6 = 2131827795(0x7f111c53, float:1.9288513E38)
            java.lang.String r7 = X.C18190wL.A0h(r9, r7, r6)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r22 = 13
            com.facebook.redex.IDxCListenerShape20S0400000_1_I2 r12 = new com.facebook.redex.IDxCListenerShape20S0400000_1_I2     // Catch:{ IOException | SecurityException -> 0x0314 }
            r21 = r12
            r24 = r20
            r25 = r27
            r26 = r5
            r21.<init>((int) r22, (java.lang.Object) r23, (java.lang.Object) r24, (java.lang.Object) r25, (java.lang.Object) r26)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r5 = 177(0xb1, float:2.48E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r10 = new com.facebook.redex.IDxCListenerShape217S0100000_1_I2     // Catch:{ IOException | SecurityException -> 0x0314 }
            r10.<init>((androidx.fragment.app.FragmentActivity) r0, (int) r5)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r9 = 2131824237(0x7f110e6d, float:1.9281296E38)
            r6 = 2131823054(0x7f1109ce, float:1.9278897E38)
            X.AnonymousClass0wJ.A1M(r8, r13, r7)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.Dsm r5 = X.C18190wL.A0W(r0)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r5.A02 = r8     // Catch:{ IOException | SecurityException -> 0x0314 }
            r5.A0p(r7)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r5.A0P(r12, r9)     // Catch:{ IOException | SecurityException -> 0x0314 }
            r5.A0O(r10, r6)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.AnonymousClass0wJ.A1K(r5)     // Catch:{ IOException | SecurityException -> 0x0314 }
            if (r17 == 0) goto L_0x02dd
            if (r34 == 0) goto L_0x02dd
            X.28R r28 = X.AnonymousClass28R.INTER_APP     // Catch:{ IOException | SecurityException -> 0x0314 }
            double r37 = java.lang.Double.parseDouble(r17)     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r35 = "logged_out"
            r29 = r15
            r30 = r31
            r32 = r18
            r39 = r14
            r40 = r13
            r41 = r13
            r33 = r42
            X.C63453hV.A01(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40, r41)     // Catch:{ IOException | SecurityException -> 0x0314 }
        L_0x02dd:
            r7 = 1
            goto L_0x0241
        L_0x02e0:
            if (r7 != 0) goto L_0x00c8
        L_0x02e2:
            if (r17 == 0) goto L_0x0303
            if (r34 == 0) goto L_0x0303
            X.28R r37 = X.AnonymousClass28R.INTER_APP     // Catch:{ IOException | SecurityException -> 0x0314 }
            double r46 = java.lang.Double.parseDouble(r17)     // Catch:{ IOException | SecurityException -> 0x0314 }
            java.lang.String r44 = "logged_out"
            r38 = r15
            r39 = r31
            r40 = r31
            r41 = r18
            r43 = r34
            r45 = r36
            r48 = r14
            r49 = r13
            r50 = r14
            X.C63453hV.A01(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50)     // Catch:{ IOException | SecurityException -> 0x0314 }
        L_0x0303:
            X.0R6 r1 = r1.A0C(r0, r4, r11, r14)     // Catch:{ IOException | SecurityException -> 0x0314 }
            X.3YR r2 = X.AnonymousClass3YR.A00     // Catch:{ IOException | SecurityException -> 0x0314 }
            android.os.Bundle r1 = r1.A00     // Catch:{ IOException | SecurityException -> 0x0314 }
            r2.A03(r0, r1, r4, r14)     // Catch:{ IOException | SecurityException -> 0x0314 }
            goto L_0x00c8
        L_0x0310:
            r0.finish()     // Catch:{ IOException | SecurityException -> 0x0314 }
            goto L_0x032a
        L_0x0314:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c8
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "InterAppRedirect"
            X.C10450iM.A03(r0, r1)
            goto L_0x00c8
        L_0x032a:
            r1 = 713249368(0x2a835258, float:2.3327412E-13)
            goto L_0x001e
        L_0x032f:
            r0.finish()
            r1 = -1690962391(0xffffffff9b35f629, float:-1.5051508E-22)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.interappidentityswitch.InterAppIdentitySwitchUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
