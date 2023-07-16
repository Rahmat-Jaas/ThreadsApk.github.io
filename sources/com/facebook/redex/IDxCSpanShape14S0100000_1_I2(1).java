package com.facebook.redex;

import android.text.style.ClickableSpan;

public class IDxCSpanShape14S0100000_1_I2 extends ClickableSpan {
    public Object A00;
    public final int A01;

    public IDxCSpanShape14S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a1, code lost:
        r1 = X.C18230wP.A0Y(r3, r2, r1, r0);
        r0 = "advanced_post_settings";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f0, code lost:
        r1 = X.C18230wP.A0Y(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00fa, code lost:
        ((android.view.View.OnClickListener) r7.A00).onClick(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0101, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        r1.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        r1.A04();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0033;
                case 1: goto L_0x0041;
                case 2: goto L_0x0056;
                case 3: goto L_0x00f6;
                case 4: goto L_0x006f;
                case 5: goto L_0x0084;
                case 6: goto L_0x0093;
                case 7: goto L_0x0102;
                case 8: goto L_0x011b;
                case 9: goto L_0x0121;
                case 10: goto L_0x0135;
                case 11: goto L_0x014f;
                case 12: goto L_0x00a8;
                case 13: goto L_0x00fa;
                case 14: goto L_0x00e4;
                case 15: goto L_0x0177;
                case 16: goto L_0x0186;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A00
            X.1Yy r0 = (X.C22661Yy) r0
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.0Oa r0 = r0.A06
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r0)
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r0)
            X.0TJ r2 = X.C18180wK.A0J(r3)
            r0 = 36881463991337197(0x83077f000000ed, double:3.38732456563236E-306)
            java.lang.String r1 = X.C63803iN.A0C(r2, r3, r0)
            X.9wF r0 = X.C171209wF.A26
            X.Jpy r1 = X.C18230wP.A0Y(r5, r4, r0, r1)
            java.lang.String r0 = "reels_share_to_fb_upsell_fragment"
        L_0x002c:
            r1.A07(r0)
        L_0x002f:
            r1.A04()
        L_0x0032:
            return
        L_0x0033:
            java.lang.Object r0 = r7.A00
            X.1kw r0 = (X.C24981kw) r0
            androidx.fragment.app.FragmentActivity r3 = r0.A01
            com.instagram.service.session.UserSession r2 = r0.A02
            X.9wF r1 = X.C171209wF.A0P
            java.lang.String r0 = "https://help.instagram.com/1695974997209192"
            goto L_0x00f0
        L_0x0041:
            java.lang.Object r0 = r7.A00
            X.1wn r0 = (X.C29141wn) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.service.session.UserSession r2 = r0.A01
            X.9wF r1 = X.C171209wF.A2V
            java.lang.String r0 = "https://help.instagram.com/225479678901832"
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "caption_options"
            goto L_0x002c
        L_0x0056:
            java.lang.Object r0 = r7.A00
            X.1YY r0 = (X.AnonymousClass1YY) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0Oa r0 = r0.A05
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            X.9wF r1 = X.C171209wF.A25
            java.lang.String r0 = "https://help.instagram.com/1549313575265878"
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "recommend_to_facebook_optimization_upsell"
            goto L_0x002c
        L_0x006f:
            java.lang.Object r0 = r7.A00
            X.1dl r0 = (X.AnonymousClass1dl) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.service.session.UserSession r2 = r0.A00
            X.9wF r1 = X.C171209wF.A2V
            java.lang.String r0 = "https://help.instagram.com/225479678901832"
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "video_captions_share"
            goto L_0x002c
        L_0x0084:
            java.lang.Object r0 = r7.A00
            X.1dj r0 = (X.C23391dj) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.service.session.UserSession r2 = r0.A05
            X.9wF r1 = X.C171209wF.A2V
            java.lang.String r0 = "https://help.instagram.com/225479678901832"
            goto L_0x00a1
        L_0x0093:
            java.lang.Object r0 = r7.A00
            X.1dj r0 = (X.C23391dj) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.service.session.UserSession r2 = r0.A05
            X.9wF r1 = X.C171209wF.A2V
            java.lang.String r0 = "https://help.instagram.com/113355287252104"
        L_0x00a1:
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "advanced_post_settings"
            goto L_0x002c
        L_0x00a8:
            java.lang.Object r0 = r7.A00
            X.1YP r0 = (X.AnonymousClass1YP) r0
            X.3An r1 = r0.A00
            if (r1 == 0) goto L_0x0032
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r4 = r1.A02
            X.BKH r0 = r1.A01
            X.Jqm r3 = r1.A00
            X.BKU r2 = r0.A0M
            if (r2 == 0) goto L_0x00dd
            X.0nS r1 = r4.A04
            java.lang.String r0 = "reel_viewer_dashboard_fb_viewers_bottom_sheet_story_settings_click"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2595(0xa23, float:3.636E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = r4.getModuleName()
            X.C18240wQ.A15(r1, r0)
            java.lang.String r0 = r2.A33()
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            r1.A12(r0)
            r1.Bb4()
        L_0x00dd:
            r0 = 1
            r4.A0F = r0
            r3.A06()
            return
        L_0x00e4:
            java.lang.Object r0 = r7.A00
            X.3G2 r0 = (X.AnonymousClass3G2) r0
            android.app.Activity r3 = r0.A01
            com.instagram.service.session.UserSession r2 = r0.A04
            X.9wF r1 = X.C171209wF.A1b
            java.lang.String r0 = "https://help.instagram.com/3256192917954293"
        L_0x00f0:
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            goto L_0x002f
        L_0x00f6:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
        L_0x00fa:
            java.lang.Object r0 = r7.A00
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r8)
            return
        L_0x0102:
            java.lang.Object r0 = r7.A00
            X.5x3 r0 = (X.AnonymousClass5x3) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A00
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            X.9wF r3 = X.C171209wF.A12
            java.lang.String r6 = "encrypted_backups_gdrive_setup"
            java.lang.String r5 = "https://help.instagram.com/936296650678728"
            r4 = 0
            X.C37412JrW.A06(r1, r2, r3, r4, r5, r6)
            return
        L_0x011b:
            java.lang.Object r0 = r7.A00
            X.C18240wQ.A1G(r0)
            return
        L_0x0121:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = r7.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2) r0
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r0
            java.lang.Object r0 = r0.A00
            X.0YY r0 = (X.AnonymousClass0YY) r0
            r0.invoke(r8)
            return
        L_0x0135:
            r0 = 6
            com.facebook.redex.IDxAListenerShape459S0100000_1_I2 r3 = new com.facebook.redex.IDxAListenerShape459S0100000_1_I2
            r3.<init>(r7, r0)
            X.3Ej r2 = X.C35762Os.A00()
            java.lang.Object r1 = r7.A00
            X.1aw r1 = (X.AnonymousClass1aw) r1
            com.instagram.service.session.UserSession r0 = r1.A05
            X.1q7 r1 = r2.A00(r1, r0, r3)
            java.lang.String r0 = "ig_reset_password_with_fb"
            r1.A06(r0)
            return
        L_0x014f:
            X.3Xr r5 = com.instagram.simplewebview.SimpleWebViewActivity.A01
            java.lang.Object r4 = r7.A00
            X.IcN r4 = (X.C34640IcN) r4
            android.content.Context r3 = r4.requireContext()
            X.0i6 r2 = r4.getSession()
            android.content.Context r1 = r4.requireContext()
            java.lang.String r0 = "https://help.instagram.com/227486307449481"
            java.lang.String r0 = X.AnonymousClass3W8.A01(r1, r0)
            X.JhV r1 = new X.JhV
            r1.<init>((java.lang.String) r0)
            r0 = 2131824324(0x7f110ec4, float:1.9281473E38)
            java.lang.String r0 = r4.getString(r0)
            X.AnonymousClass3Xr.A01(r3, r2, r5, r1, r0)
            return
        L_0x0177:
            java.lang.Object r1 = r7.A00
            X.3zH r1 = (X.C67273zH) r1
            android.app.Dialog r0 = r1.A00
            if (r0 == 0) goto L_0x0182
            r0.dismiss()
        L_0x0182:
            X.C67273zH.A02(r1)
            return
        L_0x0186:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = r7.A00
            X.1gd r0 = (X.C23941gd) r0
            com.instagram.service.session.UserSession r3 = r0.A03
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36882941460283701(0x8308d700030135, double:3.388258922943419E-306)
            java.lang.String r0 = X.C63803iN.A0C(r2, r3, r0)
            android.net.Uri r1 = X.C15430rJ.A01(r0)
            android.content.Context r0 = r8.getContext()
            X.C10650ih.A06(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCSpanShape14S0100000_1_I2.onClick(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        r3.setColor(r3.linkColor);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        r3.setUnderlineText(r0);
        r3.setFakeBoldText(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        r3.setUnderlineText(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r0 = com.instagram.barcelona.R.color.igds_link;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = r1.getColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r3.setColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateDrawState(android.text.TextPaint r3) {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0005;
                case 2: goto L_0x0049;
                case 3: goto L_0x0051;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0056;
                case 8: goto L_0x0066;
                case 9: goto L_0x0070;
                case 10: goto L_0x0075;
                case 11: goto L_0x008c;
                case 12: goto L_0x002d;
                case 13: goto L_0x0094;
                case 14: goto L_0x0030;
                case 15: goto L_0x003a;
                case 16: goto L_0x0049;
                case 17: goto L_0x0049;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r2.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r1 = r0.requireContext()
            r0 = 0
            r3.setUnderlineText(r0)
        L_0x0011:
            r0 = 2131100082(0x7f0601b2, float:1.7812535E38)
        L_0x0014:
            int r0 = r1.getColor(r0)
        L_0x0018:
            r3.setColor(r0)
            return
        L_0x001c:
            X.C18240wQ.A0t(r3)
            java.lang.Object r0 = r2.A00
            X.1kw r0 = (X.C24981kw) r0
            android.content.Context r1 = r0.A00
            r0 = 2130971027(0x7f040993, float:1.755078E38)
            int r0 = X.C121907Is.A02(r1, r0)
            goto L_0x0014
        L_0x002d:
            int r0 = r3.linkColor
            goto L_0x0018
        L_0x0030:
            X.C18240wQ.A0t(r3)
            java.lang.Object r0 = r2.A00
            X.3G2 r0 = (X.AnonymousClass3G2) r0
            android.content.Context r1 = r0.A02
            goto L_0x0011
        L_0x003a:
            r0 = 0
            r3.setUnderlineText(r0)
            java.lang.Object r0 = r2.A00
            X.3zH r0 = (X.C67273zH) r0
            X.IcN r0 = r0.A04
            android.content.Context r1 = r0.requireContext()
            goto L_0x0011
        L_0x0049:
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            super.updateDrawState(r3)
            goto L_0x006a
        L_0x0051:
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            goto L_0x0099
        L_0x0056:
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            super.updateDrawState(r3)
            int r0 = r3.linkColor
            r3.setColor(r0)
            r3.setFakeBoldText(r1)
            goto L_0x0099
        L_0x0066:
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
        L_0x006a:
            int r0 = r3.linkColor
            r3.setColor(r0)
            goto L_0x0099
        L_0x0070:
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            goto L_0x0084
        L_0x0075:
            super.updateDrawState(r3)
            java.lang.Object r0 = r2.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            int r0 = X.C18180wK.A00(r0)
            r3.setColor(r0)
            r0 = 0
        L_0x0084:
            r3.setUnderlineText(r0)
            r0 = 1
            r3.setFakeBoldText(r0)
            return
        L_0x008c:
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            super.updateDrawState(r3)
            goto L_0x0099
        L_0x0094:
            r0 = -1
            r3.setColor(r0)
            r1 = 0
        L_0x0099:
            r3.setUnderlineText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCSpanShape14S0100000_1_I2.updateDrawState(android.text.TextPaint):void");
    }
}
