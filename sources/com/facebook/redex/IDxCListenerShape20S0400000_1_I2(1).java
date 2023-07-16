package com.facebook.redex;

import X.AnonymousClass3HX;
import X.AnonymousClass601;
import X.BKU;
import X.C109326jp;
import X.C127397h3;
import X.C34640IcN;
import android.content.DialogInterface;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape20S0400000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCListenerShape20S0400000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A00 = obj;
        this.A02 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01c0, code lost:
        r3.A00 = r1;
        X.C18220wO.A1C(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        X.C63893iY.A0F(r5, r3, r4, r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.A04
            r5 = r24
            switch(r1) {
                case 2: goto L_0x0042;
                case 3: goto L_0x02a5;
                case 4: goto L_0x0269;
                case 5: goto L_0x01fd;
                case 6: goto L_0x01c6;
                case 7: goto L_0x018f;
                case 8: goto L_0x015d;
                case 9: goto L_0x0136;
                case 10: goto L_0x0113;
                case 11: goto L_0x0022;
                case 12: goto L_0x00e3;
                case 13: goto L_0x00b1;
                case 14: goto L_0x0090;
                case 15: goto L_0x0057;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r5 = r0.A01
            X.601 r5 = (X.AnonymousClass601) r5
            java.lang.Object r4 = r0.A02
            X.6jp r4 = (X.C109326jp) r4
            X.3VO r3 = X.AnonymousClass3VO.A00()
            java.lang.Object r2 = r0.A03
            r1 = 0
            r3.A02(r2, r1)
            java.lang.Object r1 = r0.A00
        L_0x001d:
            r0 = 1
            X.C63893iY.A0F(r5, r3, r4, r1, r0)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r4 = r0.A00
            X.25A r4 = (X.AnonymousClass25A) r4
            java.lang.Object r3 = r0.A01
            X.0bf r3 = (X.C07530bf) r3
            java.lang.Object r2 = r0.A02
            X.4tZ r2 = (X.C84634tZ) r2
            java.lang.Object r1 = r0.A03
            X.3GF r1 = (X.AnonymousClass3GF) r1
            r4.A00(r3)
            r5.dismiss()
            if (r2 == 0) goto L_0x0021
            com.instagram.login.delegate.IDxBActionShape54S0000000_1_I2 r4 = (com.instagram.login.delegate.IDxBActionShape54S0000000_1_I2) r4
            int r0 = r4.A00
            switch(r0) {
                case 2: goto L_0x02d0;
                case 3: goto L_0x02d4;
                case 4: goto L_0x02d8;
                case 5: goto L_0x02dc;
                case 6: goto L_0x02e0;
                case 7: goto L_0x02e4;
                case 8: goto L_0x0041;
                case 9: goto L_0x0041;
                case 10: goto L_0x02e8;
                default: goto L_0x0041;
            }
        L_0x0041:
            return
        L_0x0042:
            java.lang.Object r5 = r0.A02
            X.601 r5 = (X.AnonymousClass601) r5
            java.lang.Object r4 = r0.A03
            X.6jp r4 = (X.C109326jp) r4
            X.3VO r3 = X.AnonymousClass3VO.A00()
            java.lang.Object r2 = r0.A00
            r1 = 0
            r3.A02(r2, r1)
            java.lang.Object r1 = r0.A01
            goto L_0x001d
        L_0x0057:
            java.lang.Object r4 = r0.A03
            X.Drj r4 = (X.C25770Drj) r4
            X.8kf r6 = r4.A01
            com.instagram.service.session.UserSession r5 = r4.A02
            X.H1T r3 = X.AnonymousClass0wJ.A0O(r5)
            java.lang.String r1 = "accounts/set_public/"
            r3.A0J(r1)
            r2 = 4
            com.instagram.common.api.base.IDxRParserShape118S0100000_1_I2 r1 = new com.instagram.common.api.base.IDxRParserShape118S0100000_1_I2
            r1.<init>(r4, r2)
            r3.A01 = r1
            X.H8c r4 = X.C18190wL.A0Q(r3)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A00
            X.3iU r2 = (X.C63873iU) r2
            java.lang.Object r0 = r0.A02
            X.1Th r0 = (X.C22081Th) r0
            X.1sb r1 = new X.1sb
            r1.<init>(r2, r0)
            X.1iH r0 = new X.1iH
            r0.<init>(r3, r1, r5)
            r4.A00 = r0
            r6.schedule(r4)
            return
        L_0x0090:
            java.lang.Object r1 = r0.A01
            X.4t4 r1 = (X.C84394t4) r1
            r1.BrW()
            r1 = 175(0xaf, float:2.45E-43)
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r4 = X.C63873iU.A06(r0, r1)
            java.lang.Object r3 = r0.A03
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.Drj r2 = X.C37088JkK.A00(r3)
            java.lang.Object r1 = r0.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.A07(r1, r4, r3, r0)
            return
        L_0x00b1:
            java.lang.Object r6 = r0.A00
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r0.A01
            X.0bf r5 = (X.C07530bf) r5
            java.lang.Object r4 = r0.A02
            X.3ac r4 = (X.C62733ac) r4
            java.lang.Object r3 = r0.A03
            X.3iU r3 = (X.C63873iU) r3
            java.lang.String r2 = r4.A03
            r2.getClass()
            java.lang.String r1 = r4.A05
            java.lang.String r0 = r4.A00()
            X.H8c r0 = X.C63883iV.A04(r6, r5, r2, r1, r0)
            r0.A00 = r3
            X.C31155GhB.A03(r0)
            java.lang.Class<X.3hV> r2 = X.C63453hV.class
            monitor-enter(r2)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e0 }
            X.C63453hV.A00 = r0     // Catch:{ all -> 0x00e0 }
            monitor-exit(r2)
            return
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00e3:
            java.lang.Object r6 = r0.A03
            X.0bf r6 = (X.C07530bf) r6
            java.lang.String r2 = "login_tapped"
            r1 = 0
            X.265 r7 = X.AnonymousClass265.ACCESS_DIALOG
            X.3Vg r3 = X.C63313hF.A02(r6, r1, r7, r2)
            java.lang.Object r4 = r0.A00
            X.4tW r4 = (X.C84604tW) r4
            java.lang.String r2 = r4.AOZ()
            java.lang.String r1 = "auth_type"
            r3.A03(r1, r2)
            r3.A01()
            X.3Ty r1 = X.AnonymousClass3Ty.A00
            java.lang.Object r2 = r0.A02
            X.IcN r2 = (X.C34640IcN) r2
            java.lang.Object r3 = r0.A01
            X.4tZ r3 = (X.C84634tZ) r3
            X.4EV r5 = new X.4EV
            r5.<init>(r0)
            r1.A00(r2, r3, r4, r5, r6, r7)
            return
        L_0x0113:
            java.lang.Object r1 = r0.A00
            X.25A r1 = (X.AnonymousClass25A) r1
            java.lang.Object r4 = r0.A01
            X.0bf r4 = (X.C07530bf) r4
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A03
            X.3BW r2 = (X.AnonymousClass3BW) r2
            r1.A00(r4)
            r5.dismiss()
            java.lang.String r0 = r2.A02
            X.JhV r1 = new X.JhV
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = r2.A01
            X.C18210wN.A0t(r3, r4, r1, r0)
            return
        L_0x0136:
            java.lang.Object r7 = r0.A02
            X.BKU r7 = (X.BKU) r7
            java.lang.Object r8 = r0.A03
            com.instagram.service.session.UserSession r8 = (com.instagram.service.session.UserSession) r8
            java.lang.Object r1 = r0.A01
            X.IcN r1 = (X.C34640IcN) r1
            androidx.fragment.app.FragmentActivity r6 = r1.requireActivity()
            java.lang.String r11 = r1.getModuleName()
            java.lang.Class r10 = r1.getClass()
            com.instagram.user.model.User r9 = X.AnonymousClass0wJ.A0Y(r8)
            X.C19514Axb.A02(r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r0.A00
            android.content.DialogInterface$OnDismissListener r0 = (android.content.DialogInterface.OnDismissListener) r0
            r0.onDismiss(r5)
            return
        L_0x015d:
            java.lang.Object r6 = r0.A03
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            java.lang.Object r5 = r0.A02
            X.BKU r5 = (X.BKU) r5
            X.H1T r4 = X.AnonymousClass0wJ.A0O(r6)
            X.BKN r3 = r5.A0f
            java.lang.String r1 = r3.A4Y
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "media/%s/cancel_delete/"
            r4.A0T(r1, r2)
            java.lang.String r2 = r3.A4Y
            java.lang.String r1 = "media_id"
            r4.A0O(r1, r2)
            X.H8c r3 = X.AnonymousClass0wJ.A0S(r4)
            java.lang.Object r2 = r0.A01
            X.IcN r2 = (X.C34640IcN) r2
            java.lang.Object r0 = r0.A00
            android.content.DialogInterface$OnDismissListener r0 = (android.content.DialogInterface.OnDismissListener) r0
            X.1qg r1 = new X.1qg
            r1.<init>(r0, r2, r5, r6)
            goto L_0x01c0
        L_0x018f:
            java.lang.Object r6 = r0.A03
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            java.lang.Object r5 = r0.A02
            X.BKU r5 = (X.BKU) r5
            X.H1T r4 = X.AnonymousClass0wJ.A0O(r6)
            X.BKN r3 = r5.A0f
            java.lang.String r1 = r3.A4Y
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "media/%s/hard_delete/"
            r4.A0T(r1, r2)
            java.lang.String r2 = r3.A4Y
            java.lang.String r1 = "media_id"
            r4.A0O(r1, r2)
            X.H8c r3 = X.AnonymousClass0wJ.A0S(r4)
            java.lang.Object r2 = r0.A01
            X.IcN r2 = (X.C34640IcN) r2
            java.lang.Object r0 = r0.A00
            android.content.DialogInterface$OnDismissListener r0 = (android.content.DialogInterface.OnDismissListener) r0
            X.1qf r1 = new X.1qf
            r1.<init>(r0, r2, r5, r6)
        L_0x01c0:
            r3.A00 = r1
            X.C18220wO.A1C(r2, r3)
            return
        L_0x01c6:
            X.3bU r1 = X.C63093bU.A00()
            java.lang.Object r3 = r0.A03
            X.0i6 r3 = (X.C10300i6) r3
            java.lang.Integer r4 = X.AnonymousClass006.A0Y
            java.lang.Integer r5 = X.AnonymousClass006.A0N
            java.lang.Object r2 = r0.A02
            X.0kW r2 = (X.C11630kW) r2
            java.lang.Integer r6 = X.AnonymousClass006.A1L
            r7 = 0
            r1.A04(r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            boolean r1 = r2 instanceof X.C84654td
            if (r1 == 0) goto L_0x01ef
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.controller.BusinessConversionController"
            X.C04220Ms.A0C(r2, r0)
            X.4td r2 = (X.C84654td) r2
            r2.BMy()
            return
        L_0x01ef:
            java.lang.Object r2 = r0.A01
            X.0m7 r2 = (X.C12560m7) r2
            r1 = 1
            java.lang.String r0 = "reg_gdpr_entrance"
            r2.A1C(r0, r1)
            r2.A0b()
            return
        L_0x01fd:
            java.lang.Object r3 = r0.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r5 = r0.A01
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            java.lang.Object r4 = r0.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A03
            X.4nt r2 = (X.C81494nt) r2
            X.2A7 r1 = X.AnonymousClass2A7.A0C
            X.29l r0 = X.AnonymousClass2P1.A00(r4)
            X.C63243h6.A03(r1, r0, r5)
            r8 = 0
            java.lang.String r4 = "com.bloks.www.fxim.settings.photo"
            r0 = 1
            X.C04220Ms.A0B(r5, r0)
            r6 = 2
            java.lang.Integer r16 = X.C66883yU.A0F
            java.lang.Integer r15 = X.AnonymousClass006.A00
            java.lang.Integer r14 = X.AnonymousClass006.A0C
            com.instagram.fxim.controller.FXIMControllerSyncImpl$launchFlow$config$1 r9 = new com.instagram.fxim.controller.FXIMControllerSyncImpl$launchFlow$config$1
            r9.<init>(r2)
            r20 = 0
            X.3yU r7 = new X.3yU
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r17 = r15
            r18 = r8
            r19 = r8
            r21 = r20
            r22 = r20
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.instagram.bloks.hosting.IgBloksScreenConfig r5 = X.C18190wL.A0N(r5)
            r5.A0P = r4
            r5.A01 = r7
            java.util.LinkedHashMap r2 = X.C18220wO.A0y()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_reminders_flow"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "requested_screen_component_type"
            r2.put(r0, r1)
            java.util.HashMap r1 = X.C37067Jjv.A02(r2)
            X.3iE r0 = new X.3iE
            r0.<init>(r1, r8, r4)
            r0.A0E(r3, r5)
            return
        L_0x0269:
            java.lang.Object r4 = r0.A02
            X.38P r4 = (X.AnonymousClass38P) r4
            java.lang.Integer r2 = r4.A01
            java.lang.Integer r3 = X.AnonymousClass006.A00
            if (r2 != r3) goto L_0x028f
            X.3iC r2 = r4.A00
            r1 = 1
            r2.A0D(r3, r1)
        L_0x0279:
            java.lang.Object r1 = r0.A03
            X.3AD r1 = (X.AnonymousClass3AD) r1
            com.instagram.service.session.UserSession r4 = r1.A02
            X.2A8 r3 = X.AnonymousClass2A8.A0H
            java.lang.Object r2 = r0.A01
            X.2A9 r2 = (X.AnonymousClass2A9) r2
            X.29h r1 = X.C318729h.CAL_FLOW
            java.lang.Object r0 = r0.A00
            java.util.Map r0 = (java.util.Map) r0
            X.C62383Zj.A00(r1, r2, r3, r4, r0)
            return
        L_0x028f:
            java.lang.Integer r1 = X.AnonymousClass006.A01
            X.3iC r3 = r4.A00
            if (r2 != r1) goto L_0x0299
            r3.A0B()
            goto L_0x0279
        L_0x0299:
            com.instagram.service.session.UserSession r1 = r3.A08
            boolean r2 = X.C63533hk.A06(r1)
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r3.A0D(r1, r2)
            goto L_0x0279
        L_0x02a5:
            java.lang.Object r1 = r0.A02
            android.content.Context r1 = (android.content.Context) r1
            X.C18210wN.A0p(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r0.A03
            X.0i6 r1 = (X.C10300i6) r1
            X.Drz r2 = X.C18180wK.A0Q(r2, r1)
            X.1an r1 = new X.1an
            r1.<init>()
            r2.A03 = r1
            java.lang.Object r0 = r0.A01
            X.0kW r0 = (X.C11630kW) r0
            java.lang.String r0 = r0.getModuleName()
            r2.A07 = r0
            r0 = 1
            r2.A0B = r0
            r2.A05()
            return
        L_0x02d0:
            r2.CJv()
            return
        L_0x02d4:
            r2.CJw()
            return
        L_0x02d8:
            r2.C5R()
            return
        L_0x02dc:
            r2.CLz(r1)
            return
        L_0x02e0:
            r2.CJu()
            return
        L_0x02e4:
            r2.C8f()
            return
        L_0x02e8:
            r2.CM7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape20S0400000_1_I2.onClick(android.content.DialogInterface, int):void");
    }

    public IDxCListenerShape20S0400000_1_I2(AnonymousClass3HX r1, AnonymousClass601 r2, C127397h3 r3, C109326jp r4, int i) {
        this.A04 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = r2;
                this.A02 = r4;
                this.A03 = r3;
                this.A00 = r1;
                break;
            default:
                this.A02 = r2;
                this.A03 = r4;
                this.A00 = r3;
                this.A01 = r1;
                break;
        }
    }

    public IDxCListenerShape20S0400000_1_I2(DialogInterface.OnDismissListener onDismissListener, C34640IcN icN, BKU bku, UserSession userSession, int i) {
        this.A04 = i;
        switch (i) {
            case 7:
            case 8:
                this.A03 = userSession;
                this.A02 = bku;
                break;
            default:
                this.A02 = bku;
                this.A03 = userSession;
                break;
        }
        this.A01 = icN;
        this.A00 = onDismissListener;
    }
}
