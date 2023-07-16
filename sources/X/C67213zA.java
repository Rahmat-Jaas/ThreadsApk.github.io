package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.3zA  reason: invalid class name and case insensitive filesystem */
public final class C67213zA implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67213zA.class);
    public static final String __redex_internal_original_name = "CrosspostToFBFeedAutoshareUpsellDialogHelper";

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007f, code lost:
        if (X.C67373zR.A0D(r11) != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r10, com.instagram.service.session.UserSession r11) {
        /*
            r7 = 0
            boolean r1 = X.AnonymousClass0wJ.A1Z(r11, r10)
            X.3zF r2 = new X.3zF
            r2.<init>(r11)
            X.Dsm r6 = X.C18190wL.A0W(r10)
            r0 = 2131827387(0x7f111abb, float:1.9287685E38)
            r6.A0L(r0)
            r6.A0q(r1)
            r6.A0r(r1)
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r3 = 36322581372083635(0x810b3200021db3, double:3.033884946776733E-306)
            boolean r0 = X.C63803iN.A0E(r8, r11, r3)
            r1 = 2131827381(0x7f111ab5, float:1.9287673E38)
            if (r0 == 0) goto L_0x002d
            r1 = 2131827388(0x7f111abc, float:1.9287687E38)
        L_0x002d:
            r0 = 72
            X.C18190wL.A1R(r6, r2, r11, r0, r1)
            r2 = 2131831869(0x7f112c3d, float:1.9296776E38)
            r1 = 168(0xa8, float:2.35E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape217S0100000_1_I2
            r0.<init>((com.instagram.service.session.UserSession) r11, (int) r1)
            r6.A0O(r0, r2)
            r1 = 9
            com.facebook.redex.IDxDListenerShape320S0100000_1_I2 r0 = new com.facebook.redex.IDxDListenerShape320S0100000_1_I2
            r0.<init>(r11, r1)
            r6.A0e(r0)
            r1 = 36325317266121774(0x810daf0000242e, double:3.035615137183013E-306)
            boolean r0 = X.C63803iN.A0E(r8, r11, r1)
            if (r0 == 0) goto L_0x0113
            java.lang.String r5 = X.C67373zR.A01(r11)
        L_0x0058:
            if (r5 == 0) goto L_0x0149
            boolean r0 = X.C63803iN.A0E(r8, r11, r3)
            if (r0 == 0) goto L_0x0149
            boolean r0 = X.C63803iN.A0E(r8, r11, r1)
            int r0 = X.C18200wM.A06(r11, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.16t r2 = X.C63073bQ.A01(r11)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r11)
            boolean r0 = r0.Apo()
            if (r0 != 0) goto L_0x0081
            boolean r1 = X.C67373zR.A0D(r11)
            r0 = 0
            if (r1 == 0) goto L_0x0082
        L_0x0081:
            r0 = 1
        L_0x0082:
            java.lang.String r3 = X.C63143c0.A04(r10, r2, r3, r0)
            boolean r0 = X.C67373zR.A0D(r11)
            if (r0 == 0) goto L_0x00ea
            if (r3 == 0) goto L_0x0107
            r0 = 36322581372018098(0x810b3200011db2, double:3.033884946735287E-306)
            boolean r0 = X.C63803iN.A0E(r8, r11, r0)
            if (r0 == 0) goto L_0x0107
            android.content.res.Resources r2 = r10.getResources()
            r1 = 2131827384(0x7f111ab8, float:1.928768E38)
        L_0x00a0:
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r3}
        L_0x00a4:
            android.text.Spanned r0 = X.C16370sw.A00(r2, r0, r1)
            X.C04220Ms.A09(r0)
        L_0x00ab:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.A0p(r0)
            X.AnonymousClass0wJ.A1K(r6)
            android.content.SharedPreferences r0 = X.C28161tl.A04(r11)
            java.lang.String r2 = "feed_fb_autoshare_upsell_dialog_display_count"
            int r0 = r0.getInt(r2, r7)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C28161tl.A03(r11)
            X.AnonymousClass0wJ.A11(r0, r2, r1)
            X.1tl r0 = X.AnonymousClass3WS.A01(r11)
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r3 = X.C28161tl.A02(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toSeconds(r1)
            java.lang.String r0 = "feed_fb_autoshare_upsell_dialog_last_seen_sec"
            X.AnonymousClass0wJ.A12(r3, r0, r1)
            X.29W r0 = X.AnonymousClass29W.VIEW
            A01(r0, r11)
            X.2AD r1 = X.AnonymousClass2AD.A0P
            X.2AC r0 = X.AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE
            X.C63423hS.A01(r0, r1, r11)
            return
        L_0x00ea:
            if (r3 == 0) goto L_0x00ff
            r0 = 36322581372018098(0x810b3200011db2, double:3.033884946735287E-306)
            boolean r0 = X.C63803iN.A0E(r8, r11, r0)
            if (r0 == 0) goto L_0x00ff
            android.content.res.Resources r2 = r10.getResources()
            r1 = 2131827386(0x7f111aba, float:1.9287683E38)
            goto L_0x00a0
        L_0x00ff:
            android.content.res.Resources r2 = r10.getResources()
            r1 = 2131827385(0x7f111ab9, float:1.9287681E38)
            goto L_0x010e
        L_0x0107:
            android.content.res.Resources r2 = r10.getResources()
            r1 = 2131827383(0x7f111ab7, float:1.9287677E38)
        L_0x010e:
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            goto L_0x00a4
        L_0x0113:
            X.0Ok r5 = X.C06810aP.A01
            boolean r0 = X.C18200wM.A1X(r11, r5)
            if (r0 == 0) goto L_0x0125
            com.instagram.user.model.User r0 = r5.A01(r11)
            java.lang.String r5 = r0.A18()
            goto L_0x0058
        L_0x0125:
            boolean r0 = X.C67363zQ.A0H(r11)
            if (r0 == 0) goto L_0x0133
            X.1j1 r0 = X.C67363zQ.A01(r11)
            java.lang.String r5 = r0.A02
            goto L_0x0058
        L_0x0133:
            X.1z6 r9 = X.C35692Ol.A00(r11)
            java.lang.Class<X.3zA> r0 = X.C67213zA.class
            com.facebook.common.callercontext.CallerContext r5 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r0 = "ig_android_linking_cache_feed_composer"
            fxcache.model.FxCalAccount r0 = r9.A01(r5, r0)
            if (r0 == 0) goto L_0x0149
            java.lang.String r5 = r0.A04
            goto L_0x0058
        L_0x0149:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131827382(0x7f111ab6, float:1.9287675E38)
            java.lang.String r0 = X.C18190wL.A0g(r1, r0)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67213zA.A00(android.content.Context, com.instagram.service.session.UserSession):void");
    }

    public static final boolean A02(UserSession userSession) {
        boolean A05;
        C04220Ms.A0B(userSession, 0);
        C28161tl A01 = AnonymousClass3WS.A01(userSession);
        if (C67373zR.A0A(userSession)) {
            A05 = C67373zR.A08(userSession);
        } else {
            A05 = C35692Ol.A00(userSession).A05(A00, "ig_android_linking_cache_ig_to_fb_feed_auto_share_upsell_dialog");
        }
        if (!C62183Xq.A00(userSession) && A05) {
            long j = A01.A00.getLong("feed_fb_autoshare_upsell_dialog_last_seen_sec", 0);
            if ((j == 0 || C18180wK.A04() - j > 604800) && C28161tl.A04(userSession).getInt("feed_fb_autoshare_upsell_dialog_display_count", 0) < 3) {
                if (!C63423hS.A03(AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE, AnonymousClass2AD.A0P, userSession)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final void A01(AnonymousClass29W r6, UserSession userSession) {
        AnonymousClass2AC r5 = AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE;
        AnonymousClass2AD r4 = AnonymousClass2AD.A0P;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        C18210wN.A1D(A002, (long) C28161tl.A04(userSession).getInt("feed_fb_autoshare_upsell_dialog_display_count", 0));
        C49322rC.A00(r5, r6, r4, A002, userSession);
    }
}
