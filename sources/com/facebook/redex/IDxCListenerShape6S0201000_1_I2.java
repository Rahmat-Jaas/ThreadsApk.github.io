package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape6S0201000_1_I2 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape6S0201000_1_I2(int i, int i2, Object obj, Object obj2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        X.C14030oh.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0431, code lost:
        X.C14030oh.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0434, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r21) {
        /*
            r20 = this;
            r3 = r20
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x034e;
                case 1: goto L_0x002a;
                case 2: goto L_0x036c;
                case 3: goto L_0x0400;
                case 4: goto L_0x030a;
                case 5: goto L_0x0330;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 936113435(0x37cbf51b, float:2.4313622E-5)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A01
            X.1lH r0 = (X.AnonymousClass1lH) r0
            X.3TH r0 = r0.A00
            java.lang.String r4 = r0.A04
            if (r4 == 0) goto L_0x0023
            java.lang.Object r0 = r3.A02
            X.1kr r0 = (X.C24931kr) r0
            int r2 = r3.A00
            X.3IU r0 = r0.A01
            r0.A02(r4, r2)
        L_0x0023:
            r0 = 302530203(0x12083e9b, float:4.29912E-28)
        L_0x0026:
            X.C14030oh.A0C(r0, r1)
            return
        L_0x002a:
            r0 = 1010310184(0x3c381c28, float:0.011237182)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A02
            X.44T r0 = (X.AnonymousClass44T) r0
            java.lang.Object r2 = r3.A01
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r2 = r2.first
            X.D12 r2 = (X.D12) r2
            int r3 = r3.A00
            int r4 = r2.ordinal()
            switch(r4) {
                case 0: goto L_0x0080;
                case 1: goto L_0x009a;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00c9;
                case 4: goto L_0x0046;
                case 5: goto L_0x044e;
                case 6: goto L_0x047f;
                case 7: goto L_0x0100;
                case 8: goto L_0x0106;
                case 9: goto L_0x013e;
                case 10: goto L_0x0173;
                case 11: goto L_0x01c6;
                case 12: goto L_0x048b;
                case 13: goto L_0x020c;
                case 14: goto L_0x0252;
                case 15: goto L_0x027a;
                case 16: goto L_0x02b0;
                case 17: goto L_0x02ca;
                case 18: goto L_0x02e4;
                default: goto L_0x0046;
            }
        L_0x0046:
            com.instagram.service.session.UserSession r5 = r0.A06
            X.0kW r4 = r0.A04
            X.0nS r5 = X.C13330nS.A01(r4, r5)
            java.lang.String r4 = "ig_user_option_picked"
            X.0A2 r5 = X.AnonymousClass0wJ.A0M(r5, r4)
            r4 = 1468(0x5bc, float:2.057E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r5, r4)
            com.instagram.user.model.User r0 = r0.A09
            java.lang.String r4 = r0.getId()
            java.lang.String r0 = "media_id"
            r5.A0T(r0, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "pos"
            X.0A2 r0 = r5.A00
            r0.A6J(r3, r4)
            java.lang.String r2 = r2.name()
            java.lang.String r0 = "option"
            r5.A0T(r0, r2)
            r5.Bb4()
            r0 = -536655911(0xffffffffe00347d9, float:-3.7839073E19)
            goto L_0x0026
        L_0x0080:
            X.Jih r5 = X.C37006Jih.A00
            android.content.Context r6 = r0.A00
            com.instagram.service.session.UserSession r8 = r0.A06
            androidx.fragment.app.FragmentActivity r7 = r0.A01
            X.0kW r4 = r0.A04
            java.lang.String r11 = r4.getModuleName()
            com.instagram.user.model.User r9 = r0.A09
            X.L1Q r10 = r0.A0A
            java.lang.String r12 = r9.BK7()
            r5.A00(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0046
        L_0x009a:
            X.3HG r4 = r0.A08
            com.instagram.user.model.User r6 = r0.A09
            X.4sA r5 = r0.A07
            java.lang.String r7 = "profile"
            r8 = 1
            r9 = 0
            r4.A01(r5, r6, r7, r8, r9)
            goto L_0x0046
        L_0x00a8:
            java.lang.String r4 = "copy_profile_url"
            X.AnonymousClass44T.A00(r0, r4)
            com.instagram.service.session.UserSession r6 = r0.A06
            androidx.fragment.app.FragmentActivity r7 = r0.A01
            X.IcN r4 = r0.A03
            X.0m7 r8 = r4.mFragmentManager
            com.instagram.user.model.User r5 = r0.A09
            X.06E r9 = r0.A02
            r4 = 2
            com.facebook.redex.IDxFunctionShape361S0100000_1_I2 r10 = new com.facebook.redex.IDxFunctionShape361S0100000_1_I2
            r10.<init>(r7, r4)
            java.lang.String r14 = "copy_link"
            r13 = r5
            r11 = r0
            r12 = r6
            X.AnonymousClass3iG.A05(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0046
        L_0x00c9:
            com.instagram.user.model.User r12 = r0.A09
            java.lang.String r5 = r12.BK7()
            X.IcN r10 = r0.A03
            androidx.fragment.app.FragmentActivity r6 = r10.requireActivity()
            X.0m7 r7 = r10.getParentFragmentManager()
            X.06E r8 = X.AnonymousClass06E.A00(r10)
            com.instagram.service.session.UserSession r11 = r0.A06
            java.lang.String r4 = "@"
            java.lang.String r5 = X.AnonymousClass00U.A0L(r4, r5)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r18 = r5.toUpperCase(r4)
            r19 = 0
            com.facebook.redex.IDxFunctionShape10S1400000_1_I2 r9 = new com.facebook.redex.IDxFunctionShape10S1400000_1_I2
            r13 = r9
            r14 = r11
            r15 = r6
            r16 = r10
            r17 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r13 = "qr_code"
            X.AnonymousClass3iG.A05(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0046
        L_0x0100:
            r4 = 0
            X.AnonymousClass44T.A01(r0, r4)
            goto L_0x0046
        L_0x0106:
            androidx.fragment.app.FragmentActivity r4 = r0.A01
            if (r4 == 0) goto L_0x0046
            java.lang.Integer r4 = X.AnonymousClass006.A01
            com.instagram.service.session.UserSession r7 = r0.A06
            X.C60503Pj.A01(r0, r7, r4)
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            com.instagram.user.model.User r4 = r0.A09
            java.lang.String r5 = r4.getId()
            java.lang.String r4 = "shared_user_id"
            r6.put(r4, r5)
            java.lang.String r4 = "com.bloks.www.ig.bloks.your_shared_activity.entry"
            X.3iE r8 = X.C63743iE.A02(r4, r6)
            X.IcN r5 = r0.A03
            android.content.Context r6 = r5.getContext()
            X.3Yl r9 = new X.3Yl
            r9.<init>(r7)
            r4 = 2131835689(0x7f113b29, float:1.9304524E38)
            java.lang.String r5 = r5.getString(r4)
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = r9.A00
            r4.A0S = r5
            goto L_0x0205
        L_0x013e:
            java.lang.String r4 = "remove_follower"
            X.AnonymousClass44T.A00(r0, r4)
            X.0nS r5 = r0.A05
            com.instagram.user.model.User r10 = r0.A09
            java.lang.String r6 = r10.getId()
            java.lang.String r4 = "remove_follower_dialog_impression"
            X.0A2 r5 = X.AnonymousClass0wJ.A0M(r5, r4)
            r4 = 2632(0xa48, float:3.688E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r5, r4)
            java.lang.String r4 = "target_id"
            r5.A0T(r4, r6)
            r5.Bb4()
            android.content.Context r5 = r0.A00
            androidx.fragment.app.FragmentActivity r4 = r0.A01
            com.instagram.service.session.UserSession r8 = r0.A06
            X.0kW r7 = r0.A04
            X.IcN r6 = r0.A03
            X.4Mk r9 = new X.4Mk
            r9.<init>(r0)
            X.C50432sz.A00(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0046
        L_0x0173:
            com.instagram.user.model.User r10 = r0.A09
            java.lang.String r11 = r10.getId()
            boolean r4 = r10.BXy()
            java.lang.String r5 = "click"
            X.0nS r6 = r0.A05
            if (r4 == 0) goto L_0x01a0
            java.lang.String r4 = "unrestrict_option"
            X.C63773iK.A09(r6, r5, r4, r11)
            X.JXd r6 = X.C36480JXd.A02
            androidx.fragment.app.FragmentActivity r7 = r0.A01
            X.06E r8 = r0.A02
            com.instagram.service.session.UserSession r9 = r0.A06
            X.0kW r4 = r0.A04
            java.lang.String r12 = r4.getModuleName()
            X.4NG r10 = new X.4NG
            r10.<init>(r0, r11)
            r6.A03(r7, r8, r9, r10, r11, r12)
            goto L_0x0046
        L_0x01a0:
            java.lang.String r4 = "restrict_option"
            X.C63773iK.A09(r6, r5, r4, r11)
            X.JXd r4 = X.C36480JXd.A02
            r4.A00()
            com.instagram.service.session.UserSession r9 = r0.A06
            android.content.Context r5 = r0.A00
            X.0kW r4 = r0.A04
            java.lang.String r14 = r4.getModuleName()
            X.22x r12 = X.C307722x.PROFILE_OVERFLOW
            r7 = 0
            X.4NL r13 = new X.4NL
            r13.<init>(r0, r11)
            r16 = 0
            r8 = r7
            r11 = r7
            r15 = r7
            X.C61913Wi.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0046
        L_0x01c6:
            java.lang.String r4 = "about_this_account"
            X.AnonymousClass44T.A00(r0, r4)
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            com.instagram.user.model.User r4 = r0.A09
            java.lang.String r5 = r4.getId()
            java.lang.String r4 = "target_user_id"
            r6.put(r4, r5)
            java.lang.String r5 = "referer_type"
            java.lang.String r4 = "ProfileMore"
            r6.put(r5, r4)
            java.lang.String r4 = "com.instagram.interactions.about_this_account"
            X.3iE r8 = X.C63743iE.A02(r4, r6)
            androidx.fragment.app.FragmentActivity r6 = r0.A01
            com.instagram.service.session.UserSession r4 = r0.A06
            X.3Yl r9 = new X.3Yl
            r9.<init>(r4)
            android.content.Context r5 = r0.A00
            r4 = 2131820841(0x7f110129, float:1.9274408E38)
            java.lang.String r5 = r5.getString(r4)
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = r9.A00
            r4.A0S = r5
            java.lang.String r4 = "account_transparency_bloks"
            r9.A03(r4)
            r9.A01()
        L_0x0205:
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = r9.A00
            r8.A0C(r6, r4)
            goto L_0x0046
        L_0x020c:
            org.json.JSONObject r7 = X.C18230wP.A0y()
            java.lang.String r5 = "business_owner_igid"
            com.instagram.user.model.User r6 = r0.A09     // Catch:{ JSONException -> 0x022e }
            java.lang.String r4 = r6.getId()     // Catch:{ JSONException -> 0x022e }
            r7.put(r5, r4)     // Catch:{ JSONException -> 0x022e }
            java.lang.String r5 = "source"
            X.MeW r4 = r6.A05     // Catch:{ JSONException -> 0x022e }
            java.lang.String r4 = r4.B8G()     // Catch:{ JSONException -> 0x022e }
            r7.put(r5, r4)     // Catch:{ JSONException -> 0x022e }
            java.lang.String r5 = "delivery_method"
            java.lang.String r4 = "profile"
            r7.put(r5, r4)     // Catch:{ JSONException -> 0x022e }
            goto L_0x0235
        L_0x022e:
            java.lang.String r5 = "UserOptionDialogClickListener.handleLeaveAReview"
            java.lang.String r4 = "JSON error"
            X.C10450iM.A03(r5, r4)
        L_0x0235:
            java.lang.String r7 = r7.toString()
            androidx.fragment.app.FragmentActivity r5 = r0.A01
            com.instagram.service.session.UserSession r4 = r0.A06
            X.Drz r6 = X.C18180wK.A0Q(r5, r4)
            com.instagram.util.fragment.IgFragmentFactoryImpl r5 = com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            java.lang.String r4 = "mlex_survey"
            androidx.fragment.app.Fragment r4 = r5.A03(r4, r7)
            r6.A03 = r4
            r6.A05()
            goto L_0x0046
        L_0x0252:
            com.instagram.user.model.User r4 = r0.A09
            java.lang.String r5 = r4.getId()
            r4 = 742(0x2e6, float:1.04E-42)
            java.lang.String r4 = X.C28174Ezk.A00(r4)
            java.util.Map r6 = java.util.Collections.singletonMap(r4, r5)
            X.IcN r7 = r0.A03
            com.instagram.service.session.UserSession r5 = r0.A06
            java.lang.String r4 = "com.instagram.branded_content.wishlists.creator_lists_selector_bottom_sheet"
            X.4A9 r6 = X.C63263h8.A00(r5, r4, r6)
            r5 = 9
            com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2 r4 = new com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2
            r4.<init>((java.lang.Object) r0, (int) r5)
            r6.A00 = r4
            r7.schedule(r6)
            goto L_0x0046
        L_0x027a:
            com.instagram.user.model.User r5 = r0.A09
            X.4te r4 = r5.A0J()
            if (r4 == 0) goto L_0x02ae
            X.4te r4 = r5.A0J()
            java.lang.String r10 = r4.Al6()
        L_0x028a:
            X.3RM r8 = X.AnonymousClass3RM.A00
            if (r8 != 0) goto L_0x0295
            X.3RM r8 = new X.3RM
            r8.<init>()
            X.AnonymousClass3RM.A00 = r8
        L_0x0295:
            androidx.fragment.app.FragmentActivity r4 = r0.A01
            com.instagram.service.session.UserSession r7 = r0.A06
            X.0kW r5 = r0.A04
            X.LcG r6 = X.C40309LcG.A0n
            r9 = 0
            X.AnonymousClass0wJ.A1N(r4, r7)
            X.AnonymousClass0wJ.A1Q(r5, r6)
            r11 = r9
            X.3ad r4 = X.AnonymousClass3RM.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            r4.A04()
            goto L_0x0046
        L_0x02ae:
            r10 = 0
            goto L_0x028a
        L_0x02b0:
            androidx.fragment.app.FragmentActivity r4 = r0.A01
            if (r4 == 0) goto L_0x0046
            X.C36042Pu.A00()
            com.instagram.service.session.UserSession r6 = r0.A06
            com.instagram.user.model.User r7 = r0.A09
            X.0kW r5 = r0.A04
            r9 = 0
            X.AnonymousClass0wJ.A1O(r6, r7)
            r0 = 3
            X.C04220Ms.A0B(r5, r0)
            r8 = 0
            X.AnonymousClass77I.A00(r4, r5, r6, r7, r8, r9)
            throw r8
        L_0x02ca:
            androidx.fragment.app.FragmentActivity r8 = r0.A01
            if (r8 == 0) goto L_0x0046
            X.0kW r4 = r0.A04
            r4.getModuleName()
            X.77I r7 = X.C36042Pu.A00()
            com.instagram.service.session.UserSession r6 = r0.A06
            X.4Ue r5 = new X.4Ue
            r5.<init>(r0)
            r4 = 0
            r7.A01(r8, r6, r4, r5)
            goto L_0x0046
        L_0x02e4:
            com.instagram.user.model.User r4 = r0.A09
            X.MeW r5 = r4.A05
            java.lang.String r4 = r5.Acb()
            if (r4 == 0) goto L_0x0046
            java.lang.String r6 = r5.Acb()
            com.instagram.mediakit.analytics.MediaKitEntryPoint r5 = com.instagram.mediakit.analytics.MediaKitEntryPoint.PROFILE
            java.lang.String r4 = X.C18230wP.A0r(r5)
            com.instagram.mediakit.config.MediaKitConfig r7 = new com.instagram.mediakit.config.MediaKitConfig
            r7.<init>(r5, r6, r4)
            X.4tp r6 = X.AnonymousClass3XJ.A00()
            androidx.fragment.app.FragmentActivity r5 = r0.A01
            com.instagram.service.session.UserSession r4 = r0.A06
            r6.CVc(r5, r7, r4)
            goto L_0x0046
        L_0x030a:
            r0 = 1986754425(0x766b7779, float:1.193958E33)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A02
            android.content.DialogInterface$OnClickListener r4 = (android.content.DialogInterface.OnClickListener) r4
            if (r4 == 0) goto L_0x0322
            java.lang.Object r0 = r3.A01
            X.3DS r0 = (X.AnonymousClass3DS) r0
            android.app.Dialog r2 = r0.A06
            int r0 = r3.A00
            r4.onClick(r2, r0)
        L_0x0322:
            java.lang.Object r0 = r3.A01
            X.3DS r0 = (X.AnonymousClass3DS) r0
            android.app.Dialog r0 = r0.A06
            r0.dismiss()
            r0 = 429074607(0x199328af, float:1.5215876E-23)
            goto L_0x0026
        L_0x0330:
            r0 = -652198130(0xffffffffd9203f0e, float:-2.81908285E15)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A02
            android.content.DialogInterface$OnClickListener r4 = (android.content.DialogInterface.OnClickListener) r4
            java.lang.Object r0 = r3.A01
            X.3ZB r0 = (X.AnonymousClass3ZB) r0
            X.I1U r2 = r0.A0E
            int r0 = r3.A00
            r4.onClick(r2, r0)
            r2.dismiss()
            r0 = -1123481642(0xffffffffbd0907d6, float:-0.03345474)
            goto L_0x0026
        L_0x034e:
            r0 = 506026828(0x1e295b4c, float:8.965665E-21)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A02
            X.11K r0 = (X.AnonymousClass11K) r0
            X.GFK r1 = r0.A00
            if (r1 == 0) goto L_0x0367
            int r0 = r3.A00
            r2 = r21
            X.C04220Ms.A07(r2)
            r1.A00(r2, r0)
        L_0x0367:
            r0 = -476269851(0xffffffffe39cb2e5, float:-5.7811656E21)
            goto L_0x0431
        L_0x036c:
            r0 = -667047126(0xffffffffd83dab2a, float:-8.3417137E14)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r8 = r3.A02
            X.I7Z r8 = (X.I7Z) r8
            boolean r0 = r8.A05
            int r7 = r3.A00
            java.lang.Object r9 = r3.A01
            if (r0 == 0) goto L_0x03ae
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<com.instagram.api.schemas.SuggestedUserItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.instagram.api.schemas.SuggestedUserItem> }"
            X.C04220Ms.A0C(r9, r0)
            java.util.AbstractList r9 = (java.util.AbstractList) r9
            int r1 = r9.size()
            int r0 = r8.A00
            int r5 = java.lang.Math.min(r1, r0)
            r4 = 0
            r3 = 0
        L_0x0392:
            if (r3 >= r5) goto L_0x03e8
            java.lang.Object r2 = r9.get(r4)
            X.C04220Ms.A06(r2)
            X.172 r2 = (X.AnonymousClass172) r2
            com.instagram.user.model.User r0 = r2.A00
            if (r0 == 0) goto L_0x0392
            java.util.ArrayList r1 = r8.A0B
            int r0 = r7 + r3
            r1.add(r0, r2)
            r9.remove(r4)
            int r3 = r3 + 1
            goto L_0x0392
        L_0x03ae:
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<com.instagram.api.schemas.NuxMediaResponse>{ kotlin.collections.TypeAliasesKt.ArrayList<com.instagram.api.schemas.NuxMediaResponse> }"
            X.C04220Ms.A0C(r9, r0)
            java.util.AbstractCollection r9 = (java.util.AbstractCollection) r9
            java.util.ArrayList r5 = r8.A0B
            r5.remove(r7)
            r8.notifyItemRemoved(r7)
            java.util.Iterator r4 = r9.iterator()
            r3 = 0
        L_0x03c2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03e4
            java.lang.Object r2 = r4.next()
            X.18V r2 = (X.AnonymousClass18V) r2
            java.util.List r1 = r2.A01
            com.instagram.user.model.User r0 = r2.A00
            if (r0 == 0) goto L_0x03c2
            if (r1 == 0) goto L_0x03c2
            boolean r0 = X.C18190wL.A1a(r1)
            if (r0 == 0) goto L_0x03c2
            int r0 = r7 + r3
            r5.add(r0, r2)
            int r3 = r3 + 1
            goto L_0x03c2
        L_0x03e4:
            r8.notifyItemRangeInserted(r7, r3)
            goto L_0x03fc
        L_0x03e8:
            int r0 = r7 + 1
            r8.notifyItemRangeInserted(r0, r3)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x03fc
            java.util.ArrayList r0 = r8.A0B
            int r7 = r7 + r3
            r0.remove(r7)
            r8.notifyItemRemoved(r7)
        L_0x03fc:
            r0 = -2088907867(0xffffffff837dcba5, float:-7.458379E-37)
            goto L_0x0431
        L_0x0400:
            r0 = -1897134210(0xffffffff8eec077e, float:-5.8185706E-30)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r8 = r3.A01
            X.1dk r8 = (X.C23401dk) r8
            java.lang.Object r7 = r3.A02
            X.3Fz r7 = (X.C58523Fz) r7
            int r5 = r3.A00
            java.util.List r4 = r7.A05
            int r2 = r4.size()
            int r3 = r7.A00
            int r2 = r2 - r3
            boolean r1 = r7.A03
            r0 = 10
            if (r1 == 0) goto L_0x0422
            r0 = 50
        L_0x0422:
            if (r2 >= r0) goto L_0x0435
            java.lang.String r2 = r7.A02
            if (r2 == 0) goto L_0x0435
            com.instagram.user.model.User r1 = r7.A04
            r0 = 0
            X.C23401dk.A03(r8, r1, r2, r0)
        L_0x042e:
            r0 = -1944679452(0xffffffff8c168be4, float:-1.1597676E-31)
        L_0x0431:
            X.C14030oh.A0C(r0, r6)
            return
        L_0x0435:
            int r3 = r3 + r5
            r7.A00 = r3
            int r1 = r4.size()
            int r0 = r7.A01
            if (r3 != r1) goto L_0x0442
            int r5 = r5 + -1
        L_0x0442:
            int r0 = r0 + r5
            r7.A01 = r0
            X.0y1 r1 = r8.A05
            r0 = -348973539(0xffffffffeb33161d, float:-2.1650215E26)
            X.C14020og.A00(r1, r0)
            goto L_0x042e
        L_0x044e:
            java.lang.String r1 = "send_profile_as_message"
            X.AnonymousClass44T.A00(r0, r1)
            X.IcN r2 = r0.A03
            r1 = 75
            java.lang.String r1 = X.C28174Ezk.A00(r1)
            X.0rn r3 = X.C15730rn.A00(r2, r1)
            com.instagram.user.model.User r1 = r0.A09
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = "user_id"
            r3.A0D(r1, r2)
            X.JlQ r1 = X.C103066Xr.A00
            X.Je6 r1 = r1.A02
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "nav_chain"
            r3.A0D(r1, r2)
            com.instagram.service.session.UserSession r0 = r0.A06
            X.C18180wK.A1K(r3, r0)
            java.lang.NullPointerException r8 = X.C18200wM.A0d()
            throw r8
        L_0x047f:
            com.instagram.user.model.User r0 = r0.A09
            r0.getId()
            java.lang.String r0 = "addWhiteList"
            java.lang.NullPointerException r8 = X.C18210wN.A0W(r0)
            throw r8
        L_0x048b:
            java.lang.String r1 = "manage_notifications"
            X.AnonymousClass44T.A00(r0, r1)
            X.C60113Ns.A00()
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape6S0201000_1_I2.onClick(android.view.View):void");
    }
}
