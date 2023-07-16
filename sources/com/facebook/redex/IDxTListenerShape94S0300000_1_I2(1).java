package com.facebook.redex;

import X.C33516HpC;

public class IDxTListenerShape94S0300000_1_I2 implements C33516HpC {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxTListenerShape94S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj2;
        this.A00 = obj;
        this.A01 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0113, code lost:
        if (X.C63823iP.A0C(X.AnonymousClass0wJ.A0X(r7)) == false) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onToggle(boolean r26) {
        /*
            r25 = this;
            r6 = r25
            int r1 = r6.A03
            r0 = r26
            switch(r1) {
                case 0: goto L_0x0255;
                case 1: goto L_0x020c;
                case 2: goto L_0x0191;
                case 3: goto L_0x0129;
                case 4: goto L_0x0266;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r6.A02
            X.1ae r1 = (X.AnonymousClass1ae) r1
            X.0Oa r2 = r1.A0I
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r2)
            X.0kW r5 = r1.A0H
            X.AnonymousClass0wJ.A1N(r2, r5)
            X.3Ui r8 = new X.3Ui
            r8.<init>(r5, r2)
            X.3DJ r9 = X.C696349j.A02(r1)
            java.lang.String r2 = r1.A0D
            r4 = 1
            X.C04220Ms.A0B(r2, r4)
            java.lang.String r18 = "ig_quiet_mode_toggle_tapped"
            r10 = 0
            r21 = 4088(0xff8, float:5.729E-42)
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r19 = r2
            r20 = r10
            X.AnonymousClass3Ui.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r26 != 0) goto L_0x00c1
            X.0Oa r9 = r1.A0I
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r9)
            boolean r2 = X.C63823iP.A0C(r2)
            if (r2 != 0) goto L_0x00c1
            com.instagram.service.session.UserSession r8 = X.AnonymousClass0wJ.A0X(r9)
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r2 = 36320360875104189(0x81092d001317bd, double:3.0324806955457075E-306)
            boolean r2 = X.C63803iN.A0E(r7, r8, r2)
            if (r2 == 0) goto L_0x00c1
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r9)
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            java.lang.Object r0 = r6.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r7 = X.C18190wL.A0A(r0)
            java.lang.String r2 = r1.A0D
            r0 = 0
            X.C18180wK.A1P(r3, r0, r2)
            X.Jj9 r6 = X.C18210wN.A0L(r3)
            r0 = 2131833962(0x7f11346a, float:1.930102E38)
            java.lang.String r0 = r7.getString(r0)
            r6.A0R = r0
            r1 = 17
            com.facebook.redex.IDxCListenerShape8S1200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape8S1200000_1_I2
            r0.<init>((androidx.fragment.app.FragmentActivity) r5, (com.instagram.service.session.UserSession) r3, (java.lang.String) r2, (int) r1)
            r6.A0A = r0
            r6.A0k = r4
            r0 = 2131833961(0x7f113469, float:1.9301019E38)
            java.lang.String r0 = r7.getString(r0)
            r6.A0S = r0
            r1 = 16
            com.facebook.redex.IDxCListenerShape8S1200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape8S1200000_1_I2
            r0.<init>((androidx.fragment.app.FragmentActivity) r5, (com.instagram.service.session.UserSession) r3, (java.lang.String) r2, (int) r1)
            r6.A0B = r0
            r6.A0n = r4
            X.4Li r0 = new X.4Li
            r0.<init>(r3, r2)
            r6.A0J = r0
            X.Jqm r1 = r6.A00()
            X.1w8 r0 = new X.1w8
            r0.<init>()
            X.C37383Jqm.A00(r5, r0, r1)
            X.3Ui r8 = X.C60583Pr.A01(r3)
            X.3DJ r9 = X.C63823iP.A05(r3)
            java.lang.String r18 = "ig_quiet_mode_pause_bottom_sheet_shown"
            r19 = r2
            X.AnonymousClass3Ui.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x00bf:
            r0 = 1
            return r0
        L_0x00c1:
            X.0Oa r7 = r1.A0I
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r7)
            X.AnonymousClass0wJ.A1N(r2, r5)
            X.3Ui r11 = new X.3Ui
            r11.<init>(r5, r2)
            X.3DJ r12 = X.C696349j.A02(r1)
            java.lang.Object r5 = r6.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            boolean r6 = r5.A2w()
            java.lang.String r2 = r1.A0D
            r4 = 0
            if (r26 != 0) goto L_0x00e8
            java.lang.Boolean r15 = X.C18180wK.A0X()
            java.lang.Long r10 = X.C18210wN.A0V()
        L_0x00e8:
            r3 = 3
            X.C04220Ms.A0B(r2, r3)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            java.lang.String r21 = "ig_quiet_mode_toggled"
            r24 = 176(0xb0, float:2.47E-43)
            r18 = r10
            r19 = r10
            r20 = r10
            r22 = r2
            r23 = r4
            X.AnonymousClass3Ui.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5.A2X(r0)
            if (r26 != 0) goto L_0x0115
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r7)
            boolean r2 = X.C63823iP.A0C(r2)
            r12 = 1
            if (r2 != 0) goto L_0x0116
        L_0x0115:
            r12 = 0
        L_0x0116:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r6 = X.C18200wM.A0M(r1)
            r11 = 7
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0221000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0221000_I2
            r7 = r2
            r8 = r1
            r9 = r5
            r10 = r4
            r13 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.C25237DiI.A00(r4, r4, r2, r6, r3)
            goto L_0x00bf
        L_0x0129:
            java.lang.Object r5 = r6.A00
            X.0yP r5 = (X.C19000yP) r5
            java.lang.Object r1 = r6.A01
            java.lang.Object r4 = r6.A02
            android.view.View r4 = (android.view.View) r4
            X.2AI r2 = X.AnonymousClass2AI.A04
            r6 = 0
            if (r1 != r2) goto L_0x017e
            com.instagram.service.session.UserSession r3 = r5.A0P
            boolean r1 = X.C62183Xq.A00(r3)
            if (r1 != 0) goto L_0x014a
            com.instagram.model.sharelater.ShareLaterMedia r1 = r5.A0O
            if (r1 == 0) goto L_0x018f
            boolean r1 = r2.A06(r1)
            if (r1 == 0) goto L_0x018f
        L_0x014a:
            r1 = 1
        L_0x014b:
            if (r1 == r0) goto L_0x0177
            boolean r1 = r5.A09
            if (r1 == 0) goto L_0x0177
            boolean r2 = r5.A06
            boolean r1 = r5.A07
            if (r2 == 0) goto L_0x0188
            if (r1 == 0) goto L_0x0185
            java.lang.String r2 = "profile_icon_and_tooltip_show_both"
        L_0x015b:
            java.lang.String r1 = "click"
            X.C49192qz.A00(r3, r1, r2, r0)
            java.lang.Class<X.0yP> r1 = X.C19000yP.class
            com.facebook.common.callercontext.CallerContext r2 = com.facebook.common.callercontext.CallerContext.A00(r1)
            java.lang.String r1 = "ig_android_linking_cache_feed_composer"
            boolean r1 = X.C61853Wb.A01(r2, r3, r1)
            if (r1 != 0) goto L_0x0175
            X.2A8 r2 = X.AnonymousClass2A8.A0G
            X.2A9 r1 = X.AnonymousClass2A9.A0C
            X.C62383Zj.A01(r1, r2, r3)
        L_0x0175:
            r5.A09 = r6
        L_0x0177:
            if (r26 == 0) goto L_0x0182
            X.29d r1 = X.C318329d.ONE_TIME_ON
        L_0x017b:
            X.C19000yP.A00(r1, r5, r0)
        L_0x017e:
            r4.performClick()
            goto L_0x01ae
        L_0x0182:
            X.29d r1 = X.C318329d.ONE_TIME_OFF
            goto L_0x017b
        L_0x0185:
            java.lang.String r2 = "profile_icon_only_shown_only"
            goto L_0x015b
        L_0x0188:
            if (r1 == 0) goto L_0x018d
            java.lang.String r2 = "tooltip_shown_only"
            goto L_0x015b
        L_0x018d:
            r2 = 0
            goto L_0x015b
        L_0x018f:
            r1 = 0
            goto L_0x014b
        L_0x0191:
            java.lang.Object r5 = r6.A00
            X.0yP r5 = (X.C19000yP) r5
            java.lang.Object r4 = r6.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r6.A02
            X.3AG r3 = (X.AnonymousClass3AG) r3
            boolean r1 = r5.A0C
            if (r1 == 0) goto L_0x01b0
            X.3Rx r2 = r5.A02
            if (r2 == 0) goto L_0x01b0
            r1 = 2131826945(0x7f111901, float:1.9286789E38)
            r0 = 2131826926(0x7f1118ee, float:1.928675E38)
            X.C61103Rx.A00(r2, r1, r0)
        L_0x01ae:
            r0 = 0
            return r0
        L_0x01b0:
            r1 = 0
            r4.performClick()
            if (r26 == 0) goto L_0x01d0
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x01e0
            com.instagram.service.session.UserSession r2 = r5.A0P
            X.49M r0 = X.C35812Ox.A00(r2)
            java.lang.String r1 = r3.A00
            java.util.Set r0 = r0.A01
            r0.add(r1)
            X.2A8 r1 = X.AnonymousClass2A8.A03
        L_0x01c9:
            X.2A9 r0 = X.AnonymousClass2A9.A0D
            X.C62383Zj.A01(r0, r1, r2)
            goto L_0x00bf
        L_0x01d0:
            com.instagram.service.session.UserSession r2 = r5.A0P
            X.49M r0 = X.C35812Ox.A00(r2)
            java.lang.String r1 = r3.A00
            java.util.Set r0 = r0.A01
            r0.remove(r1)
            X.2A8 r1 = X.AnonymousClass2A8.A02
            goto L_0x01c9
        L_0x01e0:
            com.instagram.service.session.UserSession r0 = r5.A0P
            X.49M r2 = X.C35812Ox.A00(r0)
            X.IcN r4 = r5.A0N
            java.lang.String r7 = r3.A00
            X.C04220Ms.A0B(r4, r1)
            X.3Ej r1 = X.C35762Os.A00()
            X.2Or r0 = r1.A00
            if (r0 != 0) goto L_0x01fc
            X.2Or r0 = new X.2Or
            r0.<init>()
            r1.A00 = r0
        L_0x01fc:
            X.1q9 r3 = new X.1q9
            r3.<init>()
            com.instagram.service.session.UserSession r5 = r2.A03
            java.lang.String r6 = "ig_ig_feed_cross_posting"
            r8 = 51738(0xca1a, float:7.25E-41)
            r3.A00(r4, r5, r6, r7, r8)
            goto L_0x01ae
        L_0x020c:
            java.lang.Object r3 = r6.A00
            X.4Ex r3 = (X.C70504Ex) r3
            android.view.ViewGroup r2 = r3.A07
            r1 = 0
            r2.setLayoutTransition(r1)
            r7 = 1
            X.3TK r6 = r3.A0D
            if (r26 == 0) goto L_0x023b
            android.transition.Scene r1 = r6.A02
            java.lang.Runnable r0 = r6.A07
            r1.setEnterAction(r0)
            r1 = 0
            android.view.ViewGroup r5 = r6.A05
            android.transition.Scene r4 = r6.A02
            android.transition.TransitionSet r3 = r6.A04
            r0 = 2
            int[] r2 = new int[r0]
            r0 = 2131308746(0x7f0930ca, float:1.8235756E38)
            r2[r1] = r0
            r0 = 2131308755(0x7f0930d3, float:1.8235775E38)
        L_0x0234:
            r2[r7] = r0
            X.AnonymousClass3TK.A00(r4, r3, r5, r6, r2)
            goto L_0x00bf
        L_0x023b:
            android.transition.Scene r1 = r6.A01
            java.lang.Runnable r0 = r6.A06
            r1.setEnterAction(r0)
            r1 = 0
            android.view.ViewGroup r5 = r6.A05
            android.transition.Scene r4 = r6.A01
            android.transition.TransitionSet r3 = r6.A04
            r0 = 2
            int[] r2 = new int[r0]
            r0 = 2131301331(0x7f0913d3, float:1.8220717E38)
            r2[r1] = r0
            r0 = 2131300746(0x7f09118a, float:1.821953E38)
            goto L_0x0234
        L_0x0255:
            java.lang.Object r3 = r6.A00
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r3 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r3
            java.lang.Object r2 = r6.A02
            com.instagram.igds.components.switchbutton.IgSwitch r2 = (com.instagram.igds.components.switchbutton.IgSwitch) r2
            java.lang.Object r1 = r6.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            com.instagram.business.fragment.ProfileDisplayOptionsFragment.A02(r3, r2, r1, r0)
            goto L_0x00bf
        L_0x0266:
            java.lang.Object r5 = r6.A02
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            java.lang.Object r4 = r6.A00
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r6.A01
            r1 = 58
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r2 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2
            r2.<init>(r1, r4, r3)
            if (r26 == 0) goto L_0x02d7
            java.lang.String r1 = "everyone"
        L_0x027b:
            java.lang.String r0 = "live_broadcast"
            X.H8c r0 = X.AnonymousClass3OP.A01(r5, r0, r1)
            r0.A00 = r2
            X.C31155GhB.A03(r0)
            X.30f r0 = X.C548230f.A00
            if (r0 == 0) goto L_0x02da
            r3 = 1
            boolean r0 = X.C09660ft.A01(r4)
            if (r0 != 0) goto L_0x02b3
            X.C63853iS.A0B(r4)
        L_0x0294:
            X.30f r0 = X.C548230f.A00
            if (r0 == 0) goto L_0x02da
            r2 = 0
            java.lang.String r1 = X.C63853iS.A00(r4, r5)
            if (r1 == 0) goto L_0x02ae
            boolean r0 = X.AnonymousClass8bQ.A0n(r1)
            if (r0 != 0) goto L_0x02ae
            java.lang.Boolean r0 = X.AnonymousClass3Zd.A01(r4, r1, r2)
        L_0x02a9:
            boolean r0 = X.C18190wL.A1Z(r0, r3)
            return r0
        L_0x02ae:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x02a9
        L_0x02b3:
            r2 = 0
            java.lang.String r1 = X.C63853iS.A00(r4, r5)
            if (r1 == 0) goto L_0x02d2
            boolean r0 = X.AnonymousClass8bQ.A0n(r1)
            if (r0 != 0) goto L_0x02d2
            java.lang.Boolean r0 = X.AnonymousClass3Zd.A01(r4, r1, r2)
        L_0x02c4:
            boolean r0 = X.C18190wL.A1Z(r0, r3)
            if (r0 != 0) goto L_0x0294
            java.lang.String r0 = X.C63853iS.A00(r4, r5)
            X.C63853iS.A0E(r4, r0)
            goto L_0x0294
        L_0x02d2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x02c4
        L_0x02d7:
            java.lang.String r1 = "off"
            goto L_0x027b
        L_0x02da:
            X.C18250wR.A0k()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxTListenerShape94S0300000_1_I2.onToggle(boolean):boolean");
    }
}
