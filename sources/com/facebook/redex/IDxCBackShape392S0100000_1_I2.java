package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass289;
import X.AnonymousClass4n2;
import X.C04620Ok;
import X.C06810aP;
import X.C18180wK;
import X.C18230wP;
import X.C39777Kzl;
import X.C562036e;
import X.HAP;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxCBackShape392S0100000_1_I2 implements C39777Kzl {
    public Object A00;
    public final int A01;

    public IDxCBackShape392S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.H8c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: X.4A9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: X.H8c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: X.H8c} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        r7.A03 = r2;
        r7.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01a5, code lost:
        r0.setArguments(r3);
        X.C37383Jqm.A00(r1, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01b7, code lost:
        r1 = X.C63863iT.A02(r6, r3, X.AnonymousClass0wJ.A0U(r0), com.instagram.modal.ModalActivity.class, "encrypted_backups_screen");
        r1.A0F();
        r1.A07 = true;
        r1.A0I(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01e7, code lost:
        if (r0 != null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0212, code lost:
        X.C31155GhB.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0215, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0236, code lost:
        r1.A0I(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0239, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onButtonClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x006c;
                case 1: goto L_0x008f;
                case 2: goto L_0x00b5;
                case 3: goto L_0x0134;
                case 4: goto L_0x01cd;
                case 5: goto L_0x0005;
                case 6: goto L_0x01f4;
                case 7: goto L_0x0216;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x023a;
                case 12: goto L_0x026f;
                case 13: goto L_0x000d;
                case 14: goto L_0x004a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            X.4q0 r0 = (X.C82624q0) r0
            r0.CHP()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r6 = r8.A00
            X.1as r6 = (X.C22871as) r6
            X.0Oa r5 = r6.A09
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r5)
            java.lang.String r1 = "igwb"
            java.lang.String r0 = "show_confirmation_toast_button_tapped"
            r4 = 0
            X.C62423Zt.A01(r6, r2, r1, r0, r4)
            androidx.fragment.app.FragmentActivity r2 = r6.A00
            java.lang.String r1 = "activity"
            if (r2 != 0) goto L_0x0029
            X.C04220Ms.A0E(r1)
            throw r4
        L_0x0029:
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r5)
            X.Drz r7 = X.C18180wK.A0Q(r2, r0)
            X.36r r0 = X.C35372Ne.A00()
            X.3Dh r3 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = r6.A00
            if (r2 != 0) goto L_0x003f
            X.C04220Ms.A0E(r1)
            throw r4
        L_0x003f:
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r5)
            java.lang.Integer r0 = X.AnonymousClass006.A15
            androidx.fragment.app.Fragment r2 = r3.A00(r2, r1, r0)
            goto L_0x0066
        L_0x004a:
            X.3UZ r0 = X.AnonymousClass3UZ.A02
            if (r0 == 0) goto L_0x000c
            X.3IP r2 = r0.A00()
            java.lang.Integer r1 = X.AnonymousClass006.A0j
            java.lang.Object r3 = r8.A00
            X.4Lo r3 = (X.C71994Lo) r3
            com.instagram.service.session.UserSession r0 = r3.A09
            androidx.fragment.app.Fragment r2 = r2.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r3.A07
            X.0i6 r0 = r3.A08
            X.Drz r7 = X.C18180wK.A0Q(r1, r0)
        L_0x0066:
            r7.A03 = r2
            r7.A05()
            return
        L_0x006c:
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.String r1 = "dictionary_manager_entrypoint"
            java.lang.String r0 = "bloks"
            r5.putString(r1, r0)
            java.lang.Object r4 = r8.A00
            com.instagram.comments.fragment.CommentThreadFragment r4 = (com.instagram.comments.fragment.CommentThreadFragment) r4
            com.instagram.service.session.UserSession r3 = r4.A0Z
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r0 = "muted_words_dictionary_manager"
            X.3iT r1 = X.C63863iT.A05(r1, r5, r3, r2, r0)
            android.content.Context r0 = r4.requireContext()
            goto L_0x0236
        L_0x008f:
            java.lang.String r1 = "media_id"
            java.lang.String r0 = "0"
            kotlin.Pair r2 = X.C18180wK.A0p(r1, r0)
            java.lang.String r1 = "module"
            java.lang.String r0 = ""
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            java.util.Map r3 = X.AnonymousClass4WJ.A0G(r2, r0)
            java.lang.Object r2 = r8.A00
            X.HAP r2 = (X.HAP) r2
            com.instagram.service.session.UserSession r1 = r2.A08
            java.lang.String r0 = "com.instagram.sensitivity.see_why_sheets.news_sheet_action"
            X.4A9 r1 = X.C63263h8.A00(r1, r0, r3)
            r0 = 3
            X.AnonymousClass4A9.A00(r1, r2, r0)
            goto L_0x0212
        L_0x00b5:
            r0 = 0
            X.C04220Ms.A0B(r9, r0)
            java.lang.Object r5 = r8.A00
            X.CS8 r5 = (X.CS8) r5
            android.content.Context r7 = X.C18190wL.A0A(r9)
            android.app.Activity r6 = X.C10040hd.A00(r7)
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "BUNDLE_SURFACE"
            java.lang.String r0 = ""
            java.lang.String r0 = X.C18210wN.A0b(r2, r1, r0)
            X.20v r1 = X.C303820v.valueOf(r0)
            android.os.Bundle r3 = r5.mArguments
            if (r3 != 0) goto L_0x00dd
            android.os.Bundle r3 = X.C18180wK.A06()
        L_0x00dd:
            X.20v r0 = X.C303820v.BOTTOM_SHEET
            if (r1 != r0) goto L_0x0129
            X.0Oa r0 = r5.A0C
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r4 = X.C18210wN.A0L(r0)
            X.17a r2 = X.AnonymousClass17a.A00(r4)
            r0 = 348(0x15c, float:4.88E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r6, r0)
            r2.A04 = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131823054(0x7f1109ce, float:1.9278897E38)
            java.lang.String r0 = X.C18190wL.A0g(r1, r0)
            r2.A07 = r0
            X.JPd r0 = r2.A01()
            r4.A0F = r0
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x0127
            r0 = 2131832550(0x7f112ee6, float:1.9298157E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0117:
            r4.A0O = r0
            X.Jqm r2 = r4.A00()
            android.app.Activity r1 = X.C10040hd.A00(r7)
            X.CS8 r0 = new X.CS8
            r0.<init>()
            goto L_0x01a5
        L_0x0127:
            r0 = 0
            goto L_0x0117
        L_0x0129:
            java.lang.String r1 = "RESTORE_WITH_PIN"
            java.lang.String r0 = "BUNDLE_SCREEN"
            r3.putString(r0, r1)
            X.0Oa r0 = r5.A0C
            goto L_0x01b7
        L_0x0134:
            r0 = 0
            X.C04220Ms.A0B(r9, r0)
            java.lang.Object r5 = r8.A00
            X.CS4 r5 = (X.CS4) r5
            android.content.Context r7 = X.C18190wL.A0A(r9)
            android.app.Activity r6 = X.C10040hd.A00(r7)
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "BUNDLE_SURFACE"
            java.lang.String r0 = ""
            java.lang.String r0 = X.C18210wN.A0b(r2, r1, r0)
            X.20v r1 = X.C303820v.valueOf(r0)
            android.os.Bundle r3 = r5.mArguments
            if (r3 != 0) goto L_0x015c
            android.os.Bundle r3 = X.C18180wK.A06()
        L_0x015c:
            X.20v r0 = X.C303820v.BOTTOM_SHEET
            if (r1 != r0) goto L_0x01ae
            X.0Oa r0 = r5.A06
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r4 = X.C18210wN.A0L(r0)
            X.17a r2 = X.AnonymousClass17a.A00(r4)
            r0 = 352(0x160, float:4.93E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r6, r0)
            r2.A04 = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131823054(0x7f1109ce, float:1.9278897E38)
            java.lang.String r0 = X.C18190wL.A0g(r1, r0)
            r2.A07 = r0
            X.JPd r0 = r2.A01()
            r4.A0F = r0
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x01ac
            r0 = 2131832559(0x7f112eef, float:1.9298175E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0196:
            r4.A0O = r0
            X.Jqm r2 = r4.A00()
            android.app.Activity r1 = X.C10040hd.A00(r7)
            X.CS4 r0 = new X.CS4
            r0.<init>()
        L_0x01a5:
            r0.setArguments(r3)
            X.C37383Jqm.A00(r1, r0, r2)
            return
        L_0x01ac:
            r0 = 0
            goto L_0x0196
        L_0x01ae:
            java.lang.String r1 = "CREATE_PIN"
            java.lang.String r0 = "BUNDLE_SCREEN"
            r3.putString(r0, r1)
            X.0Oa r0 = r5.A06
        L_0x01b7:
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "encrypted_backups_screen"
            X.3iT r1 = X.C63863iT.A02(r6, r3, r2, r1, r0)
            r1.A0F()
            r0 = 1
            r1.A07 = r0
            r1.A0I(r6)
            return
        L_0x01cd:
            java.lang.Object r5 = r8.A00
            X.1aY r5 = (X.AnonymousClass1aY) r5
            com.instagram.service.session.UserSession r4 = r5.A0A
            if (r4 == 0) goto L_0x01ed
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.C18180wK.A06()
            android.app.Activity r1 = r5.A00
            if (r1 == 0) goto L_0x01ea
            java.lang.String r0 = "direct_greeting_setting_fragment"
            X.3iT r1 = X.C63863iT.A02(r1, r2, r4, r3, r0)
            android.app.Activity r0 = r5.A00
            if (r0 == 0) goto L_0x01ea
            goto L_0x0236
        L_0x01ea:
            java.lang.String r0 = "activity"
            goto L_0x01ef
        L_0x01ed:
            java.lang.String r0 = "userSession"
        L_0x01ef:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x01f4:
            java.lang.Object r3 = r8.A00
            X.4Hc r3 = (X.C70994Hc) r3
            com.instagram.service.session.UserSession r0 = r3.A01
            r2 = 2
            X.H1T r1 = X.AnonymousClass0wJ.A0N(r0)
            java.lang.String r0 = "video_call/change_notification_settings/"
            r1.A0J(r0)
            java.lang.String r0 = "push_option"
            r1.A0K(r0, r2)
            X.H8c r1 = X.AnonymousClass0wJ.A0S(r1)
            r0 = 122(0x7a, float:1.71E-43)
            X.C63873iU.A0E(r1, r3, r0)
        L_0x0212:
            X.C31155GhB.A03(r1)
            return
        L_0x0216:
            java.lang.Object r5 = r8.A00
            X.4JP r5 = (X.AnonymousClass4JP) r5
            androidx.fragment.app.FragmentActivity r4 = r5.A01
            if (r4 != 0) goto L_0x0226
            java.lang.String r1 = "RequestEnableDirectOnlyNotificationsHandler"
            java.lang.String r0 = "Unable to lookup the attached fragment activity for navigation to notification settings"
            X.C10450iM.A03(r1, r0)
            return
        L_0x0226:
            com.instagram.service.session.UserSession r3 = r5.A03
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "settings_notifications"
            X.3iT r1 = X.C63863iT.A04(r4, r1, r3, r2, r0)
            android.content.Context r0 = r5.A00
        L_0x0236:
            r1.A0I(r0)
            return
        L_0x023a:
            java.lang.Object r5 = r8.A00
            X.1dM r5 = (X.AnonymousClass1dM) r5
            android.os.Handler r1 = r5.A0D
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            java.util.Set r0 = r5.A0H
            java.util.Set r4 = r5.A0G
            r0.addAll(r4)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x0253:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0268
            java.lang.Object r1 = r2.next()
            X.3Vc r1 = (X.C61723Vc) r1
            r0 = 0
            r1.A04 = r0
            kotlin.Unit r0 = kotlin.Unit.A00
            r3.add(r0)
            goto L_0x0253
        L_0x0268:
            r4.clear()
            X.AnonymousClass1dM.A00(r5)
            return
        L_0x026f:
            java.lang.Object r0 = r8.A00
            X.3Fj r0 = (X.AnonymousClass3Fj) r0
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCBackShape392S0100000_1_I2.onButtonClick(android.view.View):void");
    }

    public final void onDismiss() {
    }

    public final void onShow() {
        if (1 - this.A01 == 0) {
            C04620Ok r1 = C06810aP.A01;
            HAP hap = (HAP) this.A00;
            UserSession userSession = hap.A08;
            User A012 = r1.A01(userSession);
            AnonymousClass289 r8 = AnonymousClass289.GENPOP_STORY_LINK_ERROR_IMPRESSION;
            Long A02 = AnonymousClass4n2.A02(C18230wP.A0q(userSession));
            long j = 0;
            boolean A2u = A012.A2u();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(((C562036e) hap.A09.getValue()).A00, "sable_news_event"), 2677);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0O(r8, "event_name");
                if (A02 != null) {
                    j = A02.longValue();
                }
                A0I.A0S("ig_user_id", Long.valueOf(j));
                A0I.A0S("account_viewed_id", 0L);
                A0I.A0Q("viewer_is_regulated_c18", Boolean.valueOf(A2u));
                A0I.Bb4();
            }
        }
    }
}
