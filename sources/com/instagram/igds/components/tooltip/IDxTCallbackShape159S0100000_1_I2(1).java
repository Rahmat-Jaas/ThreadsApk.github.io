package com.instagram.igds.components.tooltip;

import X.AnonymousClass0wJ;
import X.AnonymousClass17J;
import X.AnonymousClass225;
import X.AnonymousClass25P;
import X.AnonymousClass25R;
import X.AnonymousClass3GM;
import X.AnonymousClass4DQ;
import X.AnonymousClass4EH;
import X.C08350dD;
import X.C08360dF;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C25402Dl2;
import X.C25918DvM;
import X.C27091rx;
import X.C29511yH;
import X.C60113Ns;
import X.C684944a;
import X.C81554nz;
import android.content.SharedPreferences;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import java.util.Map;

public class IDxTCallbackShape159S0100000_1_I2 extends AnonymousClass4DQ {
    public Object A00;
    public final int A01;

    public IDxTCallbackShape159S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void CPO(C25918DvM dvM) {
        AnonymousClass17J r6;
        switch (this.A01) {
            case 9:
                C29511yH r2 = (C29511yH) this.A00;
                AnonymousClass3GM viewModel = r2.getViewModel();
                if (viewModel instanceof C27091rx) {
                    C27091rx r1 = (C27091rx) viewModel;
                    if ((!AnonymousClass0wJ.A1X(r1.A0I.getValue()) || r1.A02) && (r6 = r1.A01) != null) {
                        C684944a r3 = r1.A00;
                        AnonymousClass25R r5 = r1.A01;
                        AnonymousClass25P r4 = AnonymousClass25P.TOAST;
                        Map A002 = C27091rx.A00(r6);
                        AnonymousClass0wJ.A1O(r5, r4);
                        C684944a.A00(r3, r4, r5, r6, (Integer) null, "click", A002);
                    }
                }
                C81554nz r0 = r2.A07;
                if (r0 != null) {
                    C25402Dl2 dl2 = ((AnonymousClass4EH) r0).A00;
                    C25402Dl2.A00(dl2.A02, dl2, dl2.A03);
                    return;
                }
                return;
            case 10:
                ((EditProfileFieldsController) this.A00).A04().A00.callOnClick();
                return;
            case 11:
                EditProfileFieldsController editProfileFieldsController = (EditProfileFieldsController) this.A00;
                C60113Ns.A01(editProfileFieldsController.A03(), editProfileFieldsController.A06);
                throw null;
            default:
                return;
        }
    }

    public final void CPP(C25918DvM dvM) {
        AnonymousClass225 r0;
        if (9 - this.A01 == 0) {
            AnonymousClass3GM viewModel = ((C29511yH) this.A00).getViewModel();
            AnonymousClass17J r02 = viewModel.A01;
            if (r02 == null || r02.A00() <= 0) {
                r0 = AnonymousClass225.IDLE;
            } else {
                r0 = AnonymousClass225.HIDDEN;
            }
            viewModel.A01(r0);
        }
    }

    public final void CPQ(C25918DvM dvM) {
        switch (this.A01) {
            case 8:
                C08350dD A002 = C08360dF.A00();
                AnonymousClass0wJ.A12(C18220wO.A0B(A002), "long_press_account_switcher_row_to_create_shortcut_tooltip_last_impression_time", System.currentTimeMillis());
                SharedPreferences A0C = C18200wM.A0C();
                AnonymousClass0wJ.A11(A0C.edit(), "long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", C18190wL.A04(A0C, "long_press_account_switcher_row_to_create_shortcut_tooltip_impressions") + 1);
                return;
            case 9:
                ((C29511yH) this.A00).getViewModel().A01(AnonymousClass225.VISIBLE);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0111, code lost:
        X.C18210wN.A1D(r2, (long) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0168, code lost:
        r0 = r2.putInt(r1, X.C18190wL.A04(r0, r1) + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01b3, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01b6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01c5, code lost:
        r0 = r3.edit().putInt(r2, X.C18190wL.A04(r3, r2) + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01f3, code lost:
        r0 = r1.putBoolean(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01f7, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x021c, code lost:
        X.C49322rC.A00(r9, r7, r8, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x021f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r2 = (X.C27091rx) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CPS(X.C25918DvM r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x01fb;
                case 1: goto L_0x01e4;
                case 2: goto L_0x01d4;
                case 3: goto L_0x01b7;
                case 4: goto L_0x01af;
                case 5: goto L_0x01af;
                case 6: goto L_0x019f;
                case 7: goto L_0x0198;
                case 8: goto L_0x0005;
                case 9: goto L_0x0006;
                case 10: goto L_0x0186;
                case 11: goto L_0x0174;
                case 12: goto L_0x0158;
                case 13: goto L_0x0131;
                case 14: goto L_0x0126;
                case 15: goto L_0x0117;
                case 16: goto L_0x00d1;
                case 17: goto L_0x0092;
                case 18: goto L_0x0048;
                case 19: goto L_0x003c;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r10.A00
            X.1yH r0 = (X.C29511yH) r0
            X.3GM r2 = r0.getViewModel()
            boolean r0 = r2 instanceof X.C27091rx
            if (r0 == 0) goto L_0x0005
            X.1rx r2 = (X.C27091rx) r2
            X.17J r4 = r2.A01
            if (r4 == 0) goto L_0x0005
            int r1 = r4.A01
            int r0 = r4.A00
            int r1 = r1 + r0
            if (r1 <= 0) goto L_0x0005
            X.44a r1 = r2.A00
            X.25R r3 = r2.A01
            X.25P r2 = X.AnonymousClass25P.TOAST
            java.util.Map r7 = X.C27091rx.A00(r4)
            r0 = 1
            X.C04220Ms.A0B(r3, r0)
            X.4sh r0 = r1.A00
            boolean r0 = r0.CsX(r2, r3, r4)
            if (r0 == 0) goto L_0x0005
            r5 = 0
            java.lang.String r6 = "impression"
            X.C684944a.A00(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x003c:
            java.lang.Object r0 = r10.A00
            X.4T0 r0 = (X.AnonymousClass4T0) r0
            X.1tl r0 = r0.A03
            android.content.SharedPreferences r3 = r0.A00
            java.lang.String r2 = "zero_rating_video_setting_banner_tooltip"
            goto L_0x01c5
        L_0x0048:
            java.lang.Object r4 = r10.A00
            X.4Si r4 = (X.C73424Si) r4
            X.1tl r0 = r4.A01
            android.content.SharedPreferences r9 = r0.A00
            java.lang.String r8 = "xshare_facebook_page_nux_impression"
            r7 = 0
            int r0 = r9.getInt(r8, r7)
            android.content.SharedPreferences$Editor r1 = r9.edit()
            int r0 = r0 + 1
            X.AnonymousClass0wJ.A11(r1, r8, r0)
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r3 = r9.edit()
            java.lang.String r0 = "xshare_facebook_page_nux_last_seen_time"
            X.AnonymousClass0wJ.A12(r3, r0, r1)
            X.14U r6 = X.AnonymousClass14U.A00()
            X.0yP r2 = r4.A02
            com.instagram.model.sharelater.ShareLaterMedia r0 = r2.A0O
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "ig_media_id"
            r6.A0A(r0, r1)
        L_0x007e:
            com.instagram.service.session.UserSession r5 = r2.A0P
            X.2AC r4 = X.AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_TOOLTIP
            X.2AD r3 = X.AnonymousClass2AD.A0b
            X.29W r2 = X.AnonymousClass29W.VIEW
            int r0 = r9.getInt(r8, r7)
            long r0 = (long) r0
            X.C18210wN.A1D(r6, r0)
            X.C49322rC.A00(r4, r2, r3, r6, r5)
            return
        L_0x0092:
            java.lang.Object r6 = r10.A00
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            android.content.SharedPreferences r0 = X.C28161tl.A04(r6)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r5 = "fb_feed_crossposting_toggle_tooltip_show_times"
            r4 = 0
            int r0 = r0.getInt(r5, r4)
            int r0 = r0 + 1
            X.AnonymousClass0wJ.A11(r1, r5, r0)
            X.1tl r0 = X.AnonymousClass3WS.A01(r6)
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "fb_feed_crossposting_toggle_tooltip_last_seen_time_in_ms"
            X.AnonymousClass0wJ.A12(r1, r0, r2)
            X.2AC r9 = X.AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_TOOLTIP
            X.2AD r8 = X.AnonymousClass2AD.A0Y
            X.29W r7 = X.AnonymousClass29W.VIEW
            X.14U r2 = X.AnonymousClass14U.A00()
            X.C67343zO.A00(r2, r6)
            android.content.SharedPreferences r0 = X.C28161tl.A04(r6)
            int r0 = r0.getInt(r5, r4)
            goto L_0x0111
        L_0x00d1:
            java.lang.Object r6 = r10.A00
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            android.content.SharedPreferences r1 = X.C28161tl.A04(r6)
            android.content.SharedPreferences$Editor r2 = r1.edit()
            java.lang.String r0 = "xpost_to_facebook_feed_server_mtime_in_second"
            r3 = 0
            int r1 = r1.getInt(r0, r3)
            java.lang.String r0 = "feed_last_server_xposting_turn_on_time_in_second"
            X.AnonymousClass0wJ.A11(r2, r0, r1)
            android.content.SharedPreferences r0 = X.C28161tl.A04(r6)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = "fb_currently_sharing_feed_tooltip_show_times"
            int r0 = r0.getInt(r1, r3)
            int r0 = r0 + 1
            X.AnonymousClass0wJ.A11(r2, r1, r0)
            X.2AC r9 = X.AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_TOOLTIP
            X.2AD r8 = X.AnonymousClass2AD.A0Z
            X.29W r7 = X.AnonymousClass29W.VIEW
            X.14U r2 = X.AnonymousClass14U.A00()
            X.C67343zO.A00(r2, r6)
            android.content.SharedPreferences r0 = X.C28161tl.A04(r6)
            int r0 = r0.getInt(r1, r3)
        L_0x0111:
            long r0 = (long) r0
            X.C18210wN.A1D(r2, r0)
            goto L_0x021c
        L_0x0117:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            android.content.SharedPreferences r0 = X.C28161tl.A04(r0)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = "fb_feed_crossposting_advanced_settings_tooltip"
            goto L_0x0168
        L_0x0126:
            java.lang.Object r0 = r10.A00
            X.3Hb r0 = (X.C58753Hb) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A07
            r0 = 0
            r1.set(r0)
            return
        L_0x0131:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            android.content.SharedPreferences r6 = X.C28161tl.A04(r0)
            java.lang.String r5 = "clips_prompt_tooltip_impression_count"
            int r4 = X.C18190wL.A04(r6, r5)
            android.content.SharedPreferences$Editor r3 = r6.edit()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "last_seen_timestamp_for_clips_prompt_tooltip"
            X.AnonymousClass0wJ.A12(r3, r0, r1)
            android.content.SharedPreferences$Editor r1 = r6.edit()
            int r0 = r4 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r5, r0)
            goto L_0x01f7
        L_0x0158:
            java.lang.Object r0 = r10.A00
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r0 = (com.instagram.reels.dashboard.fragment.ReelDashboardFragment) r0
            com.instagram.service.session.UserSession r0 = r0.A0A
            android.content.SharedPreferences r0 = X.C28161tl.A04(r0)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = "reel_dashboard_add_to_story_nux_seen_count"
        L_0x0168:
            int r0 = X.C18190wL.A04(r0, r1)
            int r0 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r2.putInt(r1, r0)
            goto L_0x01f7
        L_0x0174:
            java.lang.Object r0 = r10.A00
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            com.instagram.service.session.UserSession r0 = r0.A06
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "should_show_multiple_links_tooltip"
            goto L_0x01f3
        L_0x0186:
            java.lang.Object r0 = r10.A00
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            com.instagram.service.session.UserSession r0 = r0.A06
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "should_show_bio_linking_tooltip"
            goto L_0x01f3
        L_0x0198:
            java.lang.Object r0 = r10.A00
            X.EK3 r0 = (X.EK3) r0
            X.0ZU r0 = r0.A0B
            goto L_0x01b3
        L_0x019f:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "has_seen_daisy_creation_nux"
            goto L_0x01f3
        L_0x01af:
            java.lang.Object r0 = r10.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
        L_0x01b3:
            r0.invoke()
            return
        L_0x01b7:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            android.content.SharedPreferences r3 = X.C28161tl.A04(r0)
            r0 = 654(0x28e, float:9.16E-43)
            java.lang.String r2 = X.C28174Ezk.A00(r0)
        L_0x01c5:
            int r0 = X.C18190wL.A04(r3, r2)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r3.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            goto L_0x01f7
        L_0x01d4:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "feed_share_sheet_audience_control_row_tooltip"
            goto L_0x01f3
        L_0x01e4:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "seen_comment_reply_surface_nux"
        L_0x01f3:
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x01f7:
            r0.apply()
            return
        L_0x01fb:
            java.lang.Object r0 = r10.A00
            X.3Ss r0 = (X.C61313Ss) r0
            com.instagram.service.session.UserSession r6 = r0.A03
            X.3ZL r0 = X.AnonymousClass3Zu.A03(r6)
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3ZL.A00(r0)
            java.lang.String r0 = "PREFERENCE_REELS_HAS_SHOWN_CROSS_POST_TO_FACEBOOK_TOOLTIP"
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            X.2AC r9 = X.AnonymousClass2AC.A0G
            X.2AD r8 = X.AnonymousClass2AD.A0d
            X.29W r7 = X.AnonymousClass29W.VIEW
            X.14U r2 = X.AnonymousClass14U.A00()
            X.C67343zO.A00(r2, r6)
        L_0x021c:
            X.C49322rC.A00(r9, r7, r8, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.tooltip.IDxTCallbackShape159S0100000_1_I2.CPS(X.DvM):void");
    }
}
