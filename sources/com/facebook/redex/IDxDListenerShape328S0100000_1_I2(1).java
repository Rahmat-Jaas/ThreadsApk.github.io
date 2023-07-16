package com.facebook.redex;

import X.C21659By5;

public class IDxDListenerShape328S0100000_1_I2 implements C21659By5 {
    public Object A00;
    public final int A01;

    public IDxDListenerShape328S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0140, code lost:
        r0 = X.C63863iT.A06(r5, r4, r7, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0144, code lost:
        r0.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02bb, code lost:
        r1.A0C = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r2.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02d0, code lost:
        X.AnonymousClass1x0.A0D(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bmo() {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x01df;
                case 1: goto L_0x01c6;
                case 2: goto L_0x02c6;
                case 3: goto L_0x02be;
                case 4: goto L_0x02b4;
                case 5: goto L_0x02a9;
                case 6: goto L_0x02a1;
                case 7: goto L_0x0282;
                case 8: goto L_0x0256;
                case 9: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r11.A00
            X.3G7 r2 = (X.AnonymousClass3G7) r2
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x0005
            int r1 = r0.intValue()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            r6 = 1
            switch(r1) {
                case 0: goto L_0x01ad;
                case 1: goto L_0x018b;
                case 2: goto L_0x014c;
                case 3: goto L_0x0101;
                case 4: goto L_0x00e7;
                case 5: goto L_0x0018;
                case 6: goto L_0x00d1;
                case 7: goto L_0x0092;
                case 8: goto L_0x0071;
                case 9: goto L_0x02d4;
                case 10: goto L_0x005e;
                case 11: goto L_0x002e;
                case 12: goto L_0x001c;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = 0
            r2.A01 = r0
            return
        L_0x001c:
            com.instagram.service.session.UserSession r4 = r2.A04
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.C18180wK.A06()
            android.app.Activity r5 = r2.A02
            java.lang.String r0 = "event_creation_screen"
            X.3iT r0 = X.C63863iT.A05(r5, r1, r4, r3, r0)
            goto L_0x0147
        L_0x002e:
            android.app.Activity r5 = r2.A02
            com.instagram.service.session.UserSession r4 = r2.A04
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36321443206208299(0x810a2900091b2b, double:3.033165166094144E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            if (r0 == 0) goto L_0x0018
            android.os.Bundle r3 = X.C18180wK.A06()
            X.20y r0 = X.AnonymousClass20y.Broadcast
            X.C35292Mw.A00(r3, r0)
            X.21t r0 = X.C305421t.WaitlistPending
            X.C04220Ms.A0B(r0, r6)
            java.lang.String r1 = "WaitlistPending"
            java.lang.String r0 = "BroadcastChannelNuxActionType"
            r3.putString(r0, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "direct_interest_channel_info"
            X.3iT r0 = X.C63863iT.A02(r5, r3, r4, r1, r0)
            goto L_0x0147
        L_0x005e:
            android.app.Activity r3 = r2.A02
            X.C04220Ms.A0C(r3, r0)
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            com.instagram.service.session.UserSession r1 = r2.A04
            X.24S r0 = X.AnonymousClass24S.PROFILE
            X.3Ff r0 = X.AnonymousClass2MZ.A00(r3, r0, r1)
            r0.A00()
            goto L_0x0018
        L_0x0071:
            com.instagram.service.session.UserSession r5 = r2.A04
            X.0kW r4 = r2.A03
            X.23m r3 = X.C309223m.SELF
            java.lang.String r1 = r5.getUserId()
            java.lang.String r0 = "group_profile_creation_tap"
            X.C63513hd.A02(r4, r3, r5, r0, r1)
            X.77I r4 = X.C36042Pu.A00()
            android.app.Activity r3 = r2.A02
            r0 = 48
            kotlin.jvm.internal.KtLambdaShape165S0100000_I2_20 r1 = new kotlin.jvm.internal.KtLambdaShape165S0100000_I2_20
            r1.<init>(r2, r0)
            r0 = 0
            r4.A01(r3, r5, r0, r1)
            goto L_0x0018
        L_0x0092:
            com.instagram.service.session.UserSession r7 = r2.A04
            X.0kW r4 = r2.A03
            X.23m r3 = X.C309223m.SELF
            java.lang.String r1 = r7.getUserId()
            java.lang.String r0 = "fundraiser_creation_tap"
            X.C63513hd.A02(r4, r3, r7, r0, r1)
            android.app.Activity r5 = r2.A02
            java.lang.String r3 = "PROFILE_COMPOSER"
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "source_name"
            r1.put(r0, r3)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "com.instagram.social_impact.standalone_fundraiser_creation.view"
            X.3iE r3 = X.C63743iE.A02(r0, r1)
            X.3Yl r1 = new X.3Yl
            r1.<init>(r7)
            r0 = 0
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r1.A00
            r1.A0h = r0
            java.lang.String r0 = ""
            r1.A0S = r0
            r1.A0e = r6
            android.os.Bundle r1 = X.C62853b1.A00(r1, r3)
            java.lang.String r0 = "bloks"
            X.3iT r0 = X.C63863iT.A02(r5, r1, r7, r4, r0)
            goto L_0x0144
        L_0x00d1:
            X.JjS r3 = X.AnonymousClass2K0.A00()
            com.instagram.service.session.UserSession r5 = r2.A04
            android.app.Activity r4 = r2.A02
            X.C04220Ms.A0C(r4, r0)
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            r7 = 0
            r8 = 0
            java.lang.String r6 = "universal_creation_menu"
            r3.A04(r4, r5, r6, r7, r8)
            goto L_0x0018
        L_0x00e7:
            com.instagram.service.session.UserSession r7 = r2.A04
            X.0kW r4 = r2.A03
            X.23m r3 = X.C309223m.SELF
            java.lang.String r1 = r7.getUserId()
            java.lang.String r0 = "live_creation_tap"
            X.C63513hd.A02(r4, r3, r7, r0, r1)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            android.app.Activity r5 = r2.A02
            java.lang.String r0 = "universal_creation_live_camera"
            goto L_0x0140
        L_0x0101:
            com.instagram.service.session.UserSession r7 = r2.A04
            X.0kW r4 = r2.A03
            X.23m r3 = X.C309223m.SELF
            java.lang.String r1 = r7.getUserId()
            java.lang.String r0 = "reel_creation_tap"
            X.C63513hd.A02(r4, r3, r7, r0, r1)
            X.AhA r1 = X.AnonymousClass3LM.A00()
            X.9zz r0 = X.C171799zz.A2r
            X.AfR r1 = r1.A04(r0, r7)
            r1.A0g = r6
            r0 = 0
            r1.A0F = r0
            android.os.Bundle r4 = r1.A00()
            java.lang.String r0 = "modal_dismiss_on_cancel"
            r4.putBoolean(r0, r6)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325806892524810(0x810e210002250a, double:3.03592477889186E-306)
            boolean r0 = X.C63803iN.A0E(r3, r7, r0)
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = "ARGS_DISABLE_SWIPE_TO_DISMISS"
            r4.putBoolean(r0, r6)
        L_0x013a:
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            android.app.Activity r5 = r2.A02
            java.lang.String r0 = "clips_camera"
        L_0x0140:
            X.3iT r0 = X.C63863iT.A06(r5, r4, r7, r1, r0)
        L_0x0144:
            r0.A0F()
        L_0x0147:
            r0.A0I(r5)
            goto L_0x0018
        L_0x014c:
            com.instagram.service.session.UserSession r7 = r2.A04
            X.0kW r4 = r2.A03
            X.23m r3 = X.C309223m.SELF
            java.lang.String r1 = r7.getUserId()
            java.lang.String r0 = "highlight_creation_tap"
            X.C63513hd.A02(r4, r3, r7, r0, r1)
            android.app.Activity r5 = r2.A02
            X.D1j r4 = X.C23921D1j.UNIVERSAL_CREATION_MENU
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "archive_multi_select_mode"
            r1.putBoolean(r0, r6)
            java.lang.String r0 = "is_standalone_reel_archive"
            r1.putBoolean(r0, r6)
            java.lang.String r0 = "hide_privacy_footer"
            r1.putBoolean(r0, r6)
            java.lang.String r0 = "highlight_management_source"
            r1.putSerializable(r0, r4)
            java.lang.String r0 = "suggested_highlights_enabled"
            r1.putBoolean(r0, r6)
            java.lang.String r0 = "archive_reels"
            X.3iT r1 = X.C63863iT.A02(r5, r1, r7, r3, r0)
            r0 = 501(0x1f5, float:7.02E-43)
            r1.A0H(r5, r0)
            goto L_0x0018
        L_0x018b:
            com.instagram.service.session.UserSession r7 = r2.A04
            X.0kW r4 = r2.A03
            X.23m r3 = X.C309223m.SELF
            java.lang.String r1 = r7.getUserId()
            java.lang.String r0 = "story_creation_tap"
            X.C63513hd.A02(r4, r3, r7, r0, r1)
            android.app.Activity r3 = r2.A02
            X.9zz r5 = X.C171799zz.A2r
            r4 = 0
            r0 = 17452(0x442c, float:2.4455E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r10 = 0
            r6 = r4
            r9 = r4
            X.C25204Dhj.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0018
        L_0x01ad:
            com.instagram.service.session.UserSession r5 = r2.A04
            X.0kW r4 = r2.A03
            X.23m r3 = X.C309223m.SELF
            java.lang.String r1 = r5.getUserId()
            java.lang.String r0 = "post_creation_tap"
            X.C63513hd.A02(r4, r3, r5, r0, r1)
            android.app.Activity r3 = r2.A02
            X.9zz r1 = X.C171799zz.A2r
            r0 = 0
            X.C25204Dhj.A01(r3, r1, r0, r5)
            goto L_0x0018
        L_0x01c6:
            java.lang.Object r2 = r11.A00
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r2 = (com.instagram.reels.dashboard.fragment.ReelDashboardFragment) r2
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x0005
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            com.instagram.service.session.UserSession r0 = r2.A0A
            X.Drz r0 = X.C18180wK.A0Q(r1, r0)
            X.C61423Tj.A00(r0)
            r0 = 0
            r2.A0F = r0
            return
        L_0x01df:
            java.lang.Object r6 = r11.A00
            X.3C6 r6 = (X.AnonymousClass3C6) r6
            java.lang.Integer r0 = r6.A01
            if (r0 == 0) goto L_0x0005
            X.IcN r5 = r6.A02
            android.content.Context r3 = r5.getContext()
            if (r3 == 0) goto L_0x0228
            java.lang.Integer r0 = r6.A01
            if (r0 == 0) goto L_0x0228
            int r1 = r0.intValue()
            r2 = 1
            r0 = 0
            if (r1 == r0) goto L_0x0241
            if (r1 == r2) goto L_0x022c
            r0 = 3
            if (r1 != r0) goto L_0x0228
            X.AhA r1 = X.AnonymousClass3LM.A00()
            com.instagram.service.session.UserSession r4 = r6.A04
            X.9zz r0 = X.C171799zz.A2r
            X.AfR r0 = r1.A04(r0, r4)
            r0.A0g = r2
            android.os.Bundle r3 = r0.A00()
            java.lang.String r0 = "modal_dismiss_on_cancel"
            r3.putBoolean(r0, r2)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r0 = "clips_camera"
            X.3iT r1 = X.C63863iT.A03(r1, r3, r4, r2, r0)
            r0 = 102(0x66, float:1.43E-43)
        L_0x0225:
            r1.A0J(r5, r0)
        L_0x0228:
            r0 = 0
            r6.A01 = r0
            return
        L_0x022c:
            android.os.Bundle r4 = X.C18180wK.A06()
            com.instagram.service.session.UserSession r3 = r6.A04
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r0 = "universal_creation_story_camera"
            X.3iT r1 = X.C63863iT.A03(r1, r4, r3, r2, r0)
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0225
        L_0x0241:
            java.lang.Class<com.instagram.creation.activity.MediaCaptureActivity> r0 = com.instagram.creation.activity.MediaCaptureActivity.class
            android.content.Intent r2 = X.C18250wR.A04(r3, r0)
            com.instagram.service.session.UserSession r0 = r6.A04
            X.C18230wP.A12(r2, r0)
            r1 = 100
            X.05L r0 = X.C18230wP.A0O()
            r0.A0B(r2, r5, r1)
            goto L_0x0228
        L_0x0256:
            java.lang.Object r6 = r11.A00
            X.49h r6 = (X.C696149h) r6
            boolean r0 = r6.A05
            r5 = 0
            if (r0 != 0) goto L_0x027f
            com.instagram.service.session.UserSession r4 = r6.A08
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 2342162034353050479(0x208107f60005136f, double:4.064759281106824E-152)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x0275
            X.3Et r0 = r6.A00
            if (r0 == 0) goto L_0x0275
            r0.A00(r5)
        L_0x0275:
            X.2A8 r3 = X.AnonymousClass2A8.A0E
            X.2A9 r2 = X.AnonymousClass2A9.A05
            X.29h r1 = X.C318729h.CAL_FLOW
            r0 = 0
            X.C62383Zj.A00(r1, r2, r3, r4, r0)
        L_0x027f:
            r6.A05 = r5
            return
        L_0x0282:
            java.lang.Object r2 = r11.A00
            X.49r r2 = (X.C697049r) r2
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x0292
            X.4qd r1 = r2.A04
            if (r1 == 0) goto L_0x0292
            r0 = 0
            r1.afterSelection(r0)
        L_0x0292:
            r0 = 0
            r2.A04 = r0
            r2.A03 = r0
            r2.A01 = r0
            r2.A02 = r0
            r0 = 0
            r2.A05 = r0
            r2.A07 = r0
            return
        L_0x02a1:
            java.lang.Object r0 = r11.A00
            X.4tG r0 = (X.C84514tG) r0
            r0.onBottomSheetClosed()
            return
        L_0x02a9:
            r0 = 0
            X.C29371xr.A0A = r0
            java.lang.Object r1 = r11.A00
            X.1xr r1 = (X.C29371xr) r1
            r1.A07 = r0
            r0 = 1
            goto L_0x02bb
        L_0x02b4:
            java.lang.Object r1 = r11.A00
            X.1xr r1 = (X.C29371xr) r1
            r0 = 0
            r1.A07 = r0
        L_0x02bb:
            r1.A0C = r0
            return
        L_0x02be:
            java.lang.Object r1 = r11.A00
            X.1x0 r1 = (X.AnonymousClass1x0) r1
            r0 = 0
            r1.A09 = r0
            goto L_0x02d0
        L_0x02c6:
            java.lang.Object r1 = r11.A00
            X.1x0 r1 = (X.AnonymousClass1x0) r1
            r0 = 0
            r1.A08 = r0
            r1.A09 = r0
            r0 = 1
        L_0x02d0:
            X.AnonymousClass1x0.A0D(r1, r0)
            return
        L_0x02d4:
            X.C36042Pu.A00()
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxDListenerShape328S0100000_1_I2.Bmo():void");
    }

    public final void Bmq() {
    }
}
