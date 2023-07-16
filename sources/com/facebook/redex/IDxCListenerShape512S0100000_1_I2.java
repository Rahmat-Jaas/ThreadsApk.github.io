package com.facebook.redex;

import android.widget.RadioGroup;

public class IDxCListenerShape512S0100000_1_I2 implements RadioGroup.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape512S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01de, code lost:
        if (r2.A0B == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x021f, code lost:
        if (r4.equals("others_on_fb") == false) goto L_0x016b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.RadioGroup r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r4 = r21
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0289;
                case 1: goto L_0x0053;
                case 2: goto L_0x006a;
                case 3: goto L_0x0081;
                case 4: goto L_0x02ab;
                case 5: goto L_0x00c6;
                case 6: goto L_0x0328;
                case 7: goto L_0x0137;
                default: goto L_0x0009;
            }
        L_0x0009:
            if (r21 != 0) goto L_0x0021
            java.lang.Object r0 = r7.A00
            X.1xS r0 = (X.C29181xS) r0
            X.0Oa r0 = r0.A0A
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.49e r3 = X.C60333Op.A00(r0)
            java.lang.String r2 = "facebook_advanced_option"
            r1 = 0
            r0 = 1
            r3.A02(r1, r2, r0, r0)
        L_0x0020:
            return
        L_0x0021:
            if (r21 <= 0) goto L_0x0020
            int r3 = r21 + -1
            java.lang.Object r2 = r7.A00
            X.1xS r2 = (X.C29181xS) r2
            java.util.ArrayList r1 = r2.A09
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0020
            java.lang.Object r1 = r1.get(r3)
            X.C04220Ms.A06(r1)
            X.1j1 r1 = (X.AnonymousClass1j1) r1
            X.0Oa r0 = r2.A0A
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.49e r0 = X.C60333Op.A00(r0)
            java.lang.String r2 = r1.A01
            java.lang.String r3 = r1.A02
            java.lang.String r4 = r1.A00
            r6 = 1
            java.lang.String r5 = "facebook_advanced_option"
            r1 = 0
            r7 = r6
            r0.A01(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0053:
            java.lang.Object r2 = r7.A00
            com.instagram.business.fragment.BusinessAttributeSyncBaseFragment r2 = (com.instagram.business.fragment.BusinessAttributeSyncBaseFragment) r2
            java.util.List r1 = r2.A06
            int r0 = r21 + -1
            java.lang.Object r0 = r1.get(r0)
            X.3aI r0 = (X.C62563aI) r0
            com.instagram.business.model.BusinessAttribute r1 = r2.A04
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0020
            r1.A01 = r0
            return
        L_0x006a:
            java.lang.Object r2 = r7.A00
            com.instagram.business.fragment.BusinessAttributeSyncBaseFragment r2 = (com.instagram.business.fragment.BusinessAttributeSyncBaseFragment) r2
            java.util.List r1 = r2.A06
            int r0 = r21 + -1
            java.lang.Object r0 = r1.get(r0)
            X.3aI r0 = (X.C62563aI) r0
            com.instagram.business.model.BusinessAttribute r1 = r2.A04
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0020
            r1.A05 = r0
            return
        L_0x0081:
            java.lang.Object r2 = r7.A00
            X.1dW r2 = (X.AnonymousClass1dW) r2
            java.lang.Integer[] r0 = X.C18240wQ.A1Z()
            r0 = r0[r21]
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x00c0;
                case 2: goto L_0x00c3;
                default: goto L_0x0092;
            }
        L_0x0092:
            java.lang.String r0 = "UNKNOWN"
        L_0x0094:
            r2.A04 = r0
            com.instagram.actionbar.ActionButton r0 = r2.A01
            if (r0 == 0) goto L_0x0020
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r2.A03
            android.widget.EditText r0 = r0.A01
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0020
            X.AnonymousClass1dW.A00(r2)
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r2.A05
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b8
            r0 = 1
            r2.A06 = r0
        L_0x00b8:
            com.instagram.actionbar.ActionButton r1 = r2.A01
            boolean r0 = r2.A06
            r1.setEnabled(r0)
            return
        L_0x00c0:
            java.lang.String r0 = "CALL"
            goto L_0x0094
        L_0x00c3:
            java.lang.String r0 = "TEXT"
            goto L_0x0094
        L_0x00c6:
            java.lang.Object r5 = r7.A00
            X.1wM r5 = (X.AnonymousClass1wM) r5
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.util.List r0 = r5.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x00d4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r1 = r2.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            java.lang.String r0 = r1.A00
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00d4
        L_0x00e8:
            int r1 = r1.A02
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            com.instagram.base.activity.IgFragmentActivity r0 = (com.instagram.base.activity.IgFragmentActivity) r0
            r0.setDefaultNightMode(r1)
            r0 = 1
            if (r1 == r0) goto L_0x0124
            r0 = 2
            if (r1 == r0) goto L_0x0121
            r3 = -1
        L_0x00fb:
            com.instagram.service.session.UserSession r1 = r5.A00
            r0 = 0
            X.0nS r1 = X.C13330nS.A01(r0, r1)
            java.lang.String r0 = "dark_mode_in_app_toggled"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 508(0x1fc, float:7.12E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0020
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "in_app_dark_mode_setting"
            r2.A0S(r0, r1)
            r2.Bb4()
            return
        L_0x0121:
            r3 = 2
            goto L_0x00fb
        L_0x0124:
            r3 = 1
            goto L_0x00fb
        L_0x0127:
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.C34822La.A00(r0)
            if (r0 == 0) goto L_0x0134
            X.3T1 r1 = X.AnonymousClass3T1.A05
            goto L_0x00e8
        L_0x0134:
            X.3T1 r1 = X.AnonymousClass3T1.A06
            goto L_0x00e8
        L_0x0137:
            java.lang.Object r2 = r7.A00
            X.4Ke r2 = (X.C71774Ke) r2
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r0 = r2.A0D
            if (r0 == 0) goto L_0x0020
            r3 = r0[r21]
            java.lang.String[] r7 = X.C548930u.A00
            int r6 = r7.length
            r5 = 0
            r4 = 0
        L_0x0146:
            if (r4 >= r6) goto L_0x0153
            r1 = r7[r4]
            java.lang.String r0 = r2.A09
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0285
            r5 = 1
        L_0x0153:
            X.266 r1 = r2.A07
            X.266 r4 = X.AnonymousClass266.A04
            if (r1 == r4) goto L_0x01e2
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x01e2
            if (r5 == 0) goto L_0x01e2
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A00 = r3
            r0.A01 = r3
            r0.A09 = r3
        L_0x0167:
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A07 = r3
        L_0x016b:
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r6 = r2.A01
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r9 = r6.A05
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r13 = r6.A08
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r14 = r6.A07
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r4 = r6.A04
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r0 = r6.A06
            r10 = 0
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r8 = new com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel
            r11 = r10
            r12 = r10
            r15 = r10
            r16 = r10
            r17 = r4
            r18 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            int r1 = r1.ordinal()
            r0 = 2
            if (r1 != r0) goto L_0x01dc
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x01e0
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r9 = r6.A05
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r8 = r6.A08
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r7 = r6.A07
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r5 = r6.A03
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r4 = r6.A02
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r1 = r6.A04
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r0 = r6.A06
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r6 = new com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel
            r13 = r8
            r14 = r7
            r15 = r5
            r16 = r4
            r17 = r1
            r18 = r0
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x01ae:
            X.49K r4 = r2.A06
            java.lang.String r0 = r2.A09
            r4.A01(r6, r0)
            java.lang.String r1 = r3.A03
            X.1xR r0 = r2.A02
            if (r0 == 0) goto L_0x01c1
            X.3Sw r0 = r2.A03
            if (r0 == 0) goto L_0x01c1
            r0.A00 = r1
        L_0x01c1:
            r1 = 0
            X.3Sw r0 = r2.A03
            if (r0 == 0) goto L_0x01c8
            r0.A01 = r1
        L_0x01c8:
            android.content.Context r3 = r2.A04
            r1 = 2131830492(0x7f1126dc, float:1.9293983E38)
            r0 = 1
            android.widget.Toast r0 = X.C63813iO.A03(r3, r10, r1, r0)
            r4.A00 = r0
            X.1xR r0 = r2.A02
            if (r0 == 0) goto L_0x0020
            r0.A00()
            return
        L_0x01dc:
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x01ae
        L_0x01e0:
            r6 = r8
            goto L_0x01ae
        L_0x01e2:
            if (r1 != r4) goto L_0x01f2
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x01f2
            if (r5 == 0) goto L_0x01f2
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A03 = r3
            r0.A02 = r3
            goto L_0x0167
        L_0x01f2:
            java.lang.String r4 = r2.A09
            int r0 = r4.hashCode()
            switch(r0) {
                case -2143256302: goto L_0x0277;
                case -1890055046: goto L_0x0269;
                case -1839818691: goto L_0x025b;
                case -1275916548: goto L_0x024d;
                case -456614348: goto L_0x023f;
                case -371252023: goto L_0x0231;
                case -8227469: goto L_0x0223;
                case 949752640: goto L_0x0219;
                case 949752738: goto L_0x020b;
                case 1767124056: goto L_0x01fd;
                default: goto L_0x01fb;
            }
        L_0x01fb:
            goto L_0x016b
        L_0x01fd:
            java.lang.String r0 = "group_message_setting"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A04 = r3
            goto L_0x016b
        L_0x020b:
            java.lang.String r0 = "others_on_ig"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A08 = r3
            goto L_0x016b
        L_0x0219:
            java.lang.String r0 = "others_on_fb"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0167
            goto L_0x016b
        L_0x0223:
            java.lang.String r0 = "fb_liked_or_followed_your_page"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A02 = r3
            goto L_0x016b
        L_0x0231:
            java.lang.String r0 = "ig_verified"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A06 = r3
            goto L_0x016b
        L_0x023f:
            java.lang.String r0 = "ig_followers"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A05 = r3
            goto L_0x016b
        L_0x024d:
            java.lang.String r0 = "fb_messaged_your_page"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A03 = r3
            goto L_0x016b
        L_0x025b:
            java.lang.String r0 = "people_with_your_phone_number"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A09 = r3
            goto L_0x016b
        L_0x0269:
            java.lang.String r0 = "fb_friends_of_friends"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A01 = r3
            goto L_0x016b
        L_0x0277:
            java.lang.String r0 = "fb_friends"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x016b
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r2.A01
            r0.A00 = r3
            goto L_0x016b
        L_0x0285:
            int r4 = r4 + 1
            goto L_0x0146
        L_0x0289:
            java.lang.Object r3 = r7.A00
            X.1f1 r3 = (X.AnonymousClass1f1) r3
            java.util.List r0 = r3.A06
            r2 = 1
            int r4 = r21 - r2
            java.lang.String r1 = X.C62563aI.A00(r0, r4)
            java.lang.String r0 = "instagram"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02a4
            com.instagram.business.model.BusinessAttribute r0 = r3.A03
            X.AnonymousClass1f1.A00(r3, r0, r2)
            return
        L_0x02a4:
            com.instagram.business.model.BusinessAttribute r1 = r3.A02
            r0 = 0
            X.AnonymousClass1f1.A00(r3, r1, r0)
            return
        L_0x02ab:
            if (r21 == 0) goto L_0x0325
            r0 = 1
            if (r4 == r0) goto L_0x0322
            java.lang.Integer r6 = X.AnonymousClass006.A00
        L_0x02b2:
            java.lang.Object r5 = r7.A00
            X.4AX r5 = (X.AnonymousClass4AX) r5
            com.instagram.service.session.UserSession r10 = r5.A0E
            X.1tl r0 = X.AnonymousClass3WS.A01(r10)
            java.lang.Integer r9 = X.AnonymousClass006.A01
            java.lang.String r8 = "anyone"
            java.lang.String r3 = "reel_message_prefs"
            java.lang.String r1 = X.C28161tl.A06(r0, r3, r8)
            r4 = r9
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x02d9
            java.lang.Integer r4 = X.AnonymousClass006.A0C
            java.lang.String r0 = "following"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02d9
            java.lang.Integer r4 = X.AnonymousClass006.A00
        L_0x02d9:
            X.1tl r0 = X.AnonymousClass3WS.A01(r10)
            int r2 = r6.intValue()
            switch(r2) {
                case 0: goto L_0x031d;
                case 1: goto L_0x0320;
                default: goto L_0x02e4;
            }
        L_0x02e4:
            java.lang.String r1 = "following"
        L_0x02e6:
            android.content.SharedPreferences$Editor r0 = X.C28161tl.A02(r0)
            X.C18180wK.A0v(r0, r3, r1)
            X.1dm r3 = r5.A0G
            X.H1T r1 = new X.H1T
            r1.<init>(r10)
            r1.A0F(r9)
            java.lang.String r0 = "users/set_reel_settings/"
            r1.A0J(r0)
            switch(r2) {
                case 0: goto L_0x031a;
                case 1: goto L_0x0301;
                default: goto L_0x02ff;
            }
        L_0x02ff:
            java.lang.String r8 = "following"
        L_0x0301:
            java.lang.String r0 = "message_prefs"
            r1.A0O(r0, r8)
            X.H8c r2 = X.AnonymousClass0wJ.A0S(r1)
            r1 = 16
            com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r4, (java.lang.Object) r7)
            r2.A00 = r0
            r3.schedule(r2)
            X.AnonymousClass4AX.A04(r5)
            return
        L_0x031a:
            java.lang.String r8 = "off"
            goto L_0x0301
        L_0x031d:
            java.lang.String r1 = "off"
            goto L_0x02e6
        L_0x0320:
            r1 = r8
            goto L_0x02e6
        L_0x0322:
            java.lang.Integer r6 = X.AnonymousClass006.A0C
            goto L_0x02b2
        L_0x0325:
            java.lang.Integer r6 = X.AnonymousClass006.A01
            goto L_0x02b2
        L_0x0328:
            java.lang.Object r5 = r7.A00
            X.1wK r5 = (X.AnonymousClass1wK) r5
            com.instagram.service.session.UserSession r0 = r5.A00
            X.0nS r1 = X.C13330nS.A01(r5, r0)
            java.lang.String r0 = "data_saver_feature_toggled"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 510(0x1fe, float:7.15E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "network_pref_value"
            X.0A2 r0 = r3.A00
            r0.A6J(r1, r2)
            java.lang.String r1 = "HighQualityMedia"
            java.lang.String r0 = "feature"
            r3.A0T(r0, r1)
            r3.Bb4()
            androidx.fragment.app.Fragment r0 = r5.getTargetFragment()
            X.1wN r0 = (X.AnonymousClass1wN) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A03(r0)
            java.lang.String r0 = "data_saver_network_resources_quality"
            X.AnonymousClass0wJ.A11(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape512S0100000_1_I2.onCheckedChanged(android.widget.RadioGroup, int):void");
    }
}
