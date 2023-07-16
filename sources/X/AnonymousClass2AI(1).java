package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import fxcache.model.FxCalAccount;
import java.util.HashMap;

/* renamed from: X.2AI  reason: invalid class name */
public enum AnonymousClass2AI implements CallerContextable {
    ;
    
    public static final String __redex_internal_original_name = "SharingAccount";
    public final int A00;
    public final int A01;
    public final String A02;

    public final String A00(Context context, User user) {
        String A18;
        C04220Ms.A0B(context, 0);
        int i = this.A01;
        if (i != 2131826983 || (A18 = user.A18()) == null || A18.length() == 0 || !user.Apo()) {
            return AnonymousClass0wJ.A0k(context, i);
        }
        String A182 = user.A18();
        if (A182 != null) {
            return A182;
        }
        throw AnonymousClass0wJ.A0b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (X.C67373zR.A08(r11) != false) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(androidx.fragment.app.Fragment r8, X.C26141q7 r9, X.C84554tP r10, com.instagram.service.session.UserSession r11, X.C24741jy r12) {
        /*
            r7 = this;
            r1 = 0
            X.C04220Ms.A0B(r10, r1)
            r2 = 1
            X.AnonymousClass0wJ.A1Q(r12, r9)
            r0 = 4
            X.C04220Ms.A0B(r11, r0)
            com.instagram.user.model.User r6 = X.AnonymousClass0wJ.A0Y(r11)
            X.1tl r5 = X.AnonymousClass3WS.A01(r11)
            boolean r0 = r7.A06(r10)
            r4 = 0
            if (r0 == 0) goto L_0x0037
            r7.A05(r10, r1)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36313952782649088(0x81035900000700, double:3.0284281920737844E-306)
            boolean r0 = X.C63803iN.A0E(r2, r11, r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = "off"
        L_0x002d:
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r5)
            java.lang.String r0 = "share_to_fb_settings"
            X.C18180wK.A0v(r1, r0, r2)
        L_0x0036:
            return
        L_0x0037:
            boolean r1 = r6.A2l()
            boolean r0 = r7.A08(r10, r11)
            if (r0 == 0) goto L_0x0063
            if (r1 == 0) goto L_0x0063
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36313952782780162(0x81035900020702, double:3.028428192156676E-306)
            boolean r0 = X.C63803iN.A0E(r3, r11, r0)
            if (r0 == 0) goto L_0x0063
        L_0x0050:
            r7.A05(r10, r2)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36313952782649088(0x81035900000700, double:3.0284281920737844E-306)
            boolean r0 = X.C63803iN.A0E(r2, r11, r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = "on"
            goto L_0x002d
        L_0x0063:
            boolean r0 = r7.A09(r11)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00bc
            X.2AI r1 = A04
            if (r7 != r1) goto L_0x00d8
            boolean r0 = X.C67373zR.A0A(r11)
            if (r0 == 0) goto L_0x007b
            boolean r0 = X.C67373zR.A08(r11)
            if (r0 != 0) goto L_0x00bc
        L_0x007b:
            X.264 r4 = X.AnonymousClass264.A0b
            r0 = 0
            X.0nS r1 = X.C13330nS.A01(r0, r11)
            java.lang.String r0 = "facebook_connect_clicked"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 606(0x25e, float:8.49E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            java.lang.String r1 = "share_photo"
            java.lang.String r0 = "location"
            r2.A0T(r0, r1)
            r2.Bb4()
            boolean r0 = r6.Apo()
            if (r0 == 0) goto L_0x00f8
            r12.A02 = r4
            com.instagram.service.session.UserSession r3 = r12.A04
            X.1z6 r2 = X.C35692Ol.A00(r3)
            com.facebook.common.callercontext.CallerContext r1 = X.C24741jy.A06
            java.lang.String r0 = "ig_android_linking_cache_ig_to_fb_authorization"
            boolean r0 = r2.A05(r1, r0)
            if (r0 == 0) goto L_0x00f0
            boolean r0 = X.C67373zR.A0D(r3)
            if (r0 == 0) goto L_0x00f0
            X.4s2 r0 = r12.A00
            r0.Blp(r4)
            return
        L_0x00bc:
            X.2AI r1 = A04
            if (r7 != r1) goto L_0x00cc
            boolean r0 = X.C67373zR.A0A(r11)
            if (r0 != 0) goto L_0x00cc
            boolean r0 = X.AnonymousClass3z6.A01(r11)
            if (r0 != 0) goto L_0x00d8
        L_0x00cc:
            boolean r0 = r10.Bgl()
            if (r0 == 0) goto L_0x00de
            boolean r0 = X.C67373zR.A0D(r11)
            if (r0 != 0) goto L_0x00de
        L_0x00d8:
            if (r7 == r1) goto L_0x007b
            r7.A04(r8, r11)
            return
        L_0x00de:
            if (r7 != r1) goto L_0x00e7
            boolean r0 = r6.Apo()
            if (r0 == 0) goto L_0x00e7
            r4 = 1
        L_0x00e7:
            boolean r0 = X.C67373zR.A0K(r6)
            if (r4 == 0) goto L_0x0050
            if (r0 == 0) goto L_0x0050
            return
        L_0x00f0:
            androidx.fragment.app.Fragment r1 = r12.A03
            X.1zH r0 = X.C29771zH.A04
            X.C67363zQ.A08(r1, r3, r4, r0)
            return
        L_0x00f8:
            r7.A03(r8, r9, r11, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AI.A02(androidx.fragment.app.Fragment, X.1q7, X.4tP, com.instagram.service.session.UserSession, X.1jy):void");
    }

    public final String A01(UserSession userSession) {
        AnonymousClass3EH r1;
        if (this instanceof C28771ux) {
            C04620Ok A0V = C18240wQ.A0V(userSession);
            if (!A0V.A01(userSession).A2y()) {
                return "";
            }
            if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36322894904630807L)) {
                return A0V.A01(userSession).A1N();
            }
            Class<AnonymousClass2AI> cls = AnonymousClass2AI.class;
            C110456li A012 = C63333hI.A01(C63333hI.A00(cls), userSession);
            if (A012 == null || (r1 = A012.A00) == null) {
                return null;
            }
            return (String) r1.A00(C63333hI.A00(cls), userSession);
        } else if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36325317266121774L)) {
            return C67373zR.A01(userSession);
        } else {
            C04620Ok r12 = C06810aP.A01;
            if (C18200wM.A1X(userSession, r12)) {
                return r12.A01(userSession).A18();
            }
            if (C67363zQ.A0H(userSession)) {
                return C67363zQ.A01(userSession).A02;
            }
            FxCalAccount A013 = C35692Ol.A00(userSession).A01(CallerContext.A00(AnonymousClass2AI.class), "ig_to_fb_sharing_account");
            if (A013 != null) {
                return A013.A04;
            }
            return null;
        }
    }

    public final void A04(Fragment fragment, UserSession userSession) {
        String str;
        if (this instanceof C28771ux) {
            C49182qy.A00(userSession).A00("start_funnel");
            if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36328220664015172L)) {
                C34572Kb.A00(C304921n.IG_WHATSAPP_LINK, userSession).CXf(fragment, new KtCSuperShape0S3100000_I2((Object) null, (String) null, (String) null, "ShareToOtherAppsEntryPoint", 7), "whatsapp_linking_in_sharing_to_other_apps");
                return;
            }
            String A012 = A01(userSession);
            if (A012 == null || A012.length() == 0) {
                str = "com.instagram.wa_linking.ig_whatsapp_linking_upsell.UpsellScreen";
            } else {
                str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
            }
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("back_stack_tag", "ShareToOtherAppsEntryPoint");
            A0y.put("entrypoint", "whatsapp_linking_in_sharing_to_other_apps");
            C63743iE A022 = C63743iE.A02(str, A0y);
            IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
            C18230wP.A1A(fragment, A0N, 2131838095);
            AnonymousClass1c8 A023 = C62853b1.A02(A0N, A022);
            C25786Drz A0Q = C18180wK.A0Q(fragment.requireActivity(), userSession);
            A0Q.A07 = "ShareToOtherAppsEntryPoint";
            A0Q.A08();
            A0Q.A03 = A023;
            A0Q.A05();
        }
    }

    public final void A05(C84554tP r2, boolean z) {
        if (!(this instanceof C28771ux)) {
            C04220Ms.A0B(r2, 0);
            r2.CmC(z);
        }
    }

    public final boolean A06(C84554tP r2) {
        if (this instanceof C28771ux) {
            return false;
        }
        C04220Ms.A0B(r2, 0);
        return r2.BTl();
    }

    public boolean A07(C84554tP r3, UserSession userSession) {
        if (r3 == null) {
            throw AnonymousClass0wJ.A0b();
        } else if (r3.ARp() != C23920D1i.DEFAULT || r3.BO2() || r3.BNl()) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean A09(UserSession userSession) {
        if (this instanceof C28771ux) {
            C04220Ms.A0B(userSession, 0);
            return AnonymousClass0wJ.A0Y(userSession).A2y();
        }
        C04220Ms.A0B(userSession, 0);
        return C67373zR.A08(userSession);
    }

    public final boolean A0A(UserSession userSession) {
        if (this instanceof C28781uy) {
            C04220Ms.A0B(userSession, 0);
            if (C67373zR.A08(userSession)) {
                return true;
            }
            return C35692Ol.A00(userSession).A05(CallerContext.A00(AnonymousClass2AI.class), "ig_to_fb_sharing_account");
        }
        C04220Ms.A0B(userSession, 0);
        return A09(userSession);
    }

    /* access modifiers changed from: public */
    AnonymousClass2AI(int i, int i2, String str) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = i2;
    }

    public final void A03(Fragment fragment, C26141q7 r4, UserSession userSession, AnonymousClass264 r6) {
        AnonymousClass0wJ.A1N(fragment, r4);
        AnonymousClass0wJ.A1Q(r6, userSession);
        String A002 = r6.A00();
        if (this instanceof C28781uy) {
            C04220Ms.A0B(A002, 2);
            r4.A06(A002);
            return;
        }
        C18180wK.A1P(fragment, 0, userSession);
        A04(fragment, userSession);
    }

    public final boolean A08(C84554tP r2, UserSession userSession) {
        AnonymousClass0wJ.A1N(userSession, r2);
        if (this != A04) {
            return false;
        }
        if (AnonymousClass0wJ.A0Y(userSession).A17() != null || r2.Bgl()) {
            return true;
        }
        return false;
    }
}
