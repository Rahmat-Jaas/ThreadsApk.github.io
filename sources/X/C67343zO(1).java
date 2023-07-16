package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1;
import com.instagram.service.session.UserSession;

/* renamed from: X.3zO  reason: invalid class name and case insensitive filesystem */
public final class C67343zO implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67343zO.class);
    public static final C67343zO A01 = new C67343zO();
    public static final String __redex_internal_original_name = "ReelsShareToFacebookUtils";

    public static final boolean A03(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (C04660Oo.A01(userSession) == AnonymousClass266.A04) {
            return C67373zR.A0D(userSession);
        }
        return C35692Ol.A00(userSession).A05(A00, "ig_android_linking_cache_ig_to_fb_reels_crossposting");
    }

    public static final boolean A04(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (!C67373zR.A0E(userSession) || !C60343Oq.A01(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        if (!A03(userSession)) {
            return false;
        }
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (!C63803iN.A0E(r2, userSession, 36319656499615018L)) {
            return C63803iN.A0E(r2, userSession, 36319656499811628L);
        }
        return false;
    }

    public static final boolean A07(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (!C62183Xq.A00(userSession) || C18190wL.A1X(AnonymousClass3Zu.A03(userSession).A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED")) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean A08(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (!A03(userSession)) {
            return false;
        }
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        return !C63803iN.A0E(r2, userSession, 36319656499615018L) && C63803iN.A0E(r2, userSession, 36317607799820130L);
    }

    public final boolean A09(UserSession userSession) {
        if (A05(userSession)) {
            return A01((KtCSuperShape1S0100000_I2_1) null, userSession);
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36319656499615018L) || !C63803iN.A0E(r2, userSession, 36319656499811628L)) {
            return false;
        }
        return true;
    }

    public static void A00(AnonymousClass0V3 r2, UserSession userSession) {
        r2.A07("is_account_linked", Boolean.valueOf(A03(userSession)));
    }

    public static final boolean A01(KtCSuperShape1S0100000_I2_1 ktCSuperShape1S0100000_I2_1, UserSession userSession) {
        C319029k r0;
        boolean A1X = C18190wL.A1X(AnonymousClass3Zu.A03(userSession).A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED");
        boolean A08 = AnonymousClass3Zu.A03(userSession).A08();
        if (A1X && A08) {
            C10450iM.A03("ReelsShareToFacebook", "<shouldShowShareToFacebook> both ccp && xar are true");
        }
        if (!A1X) {
            if (!A08) {
                AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
                if ((A03.A08() || (C18180wK.A05(A03.A04, "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS") <= A03.A03() && System.currentTimeMillis() - A03.A03() <= 1814400000)) && C34732Kr.A00(userSession, true)) {
                    if (ktCSuperShape1S0100000_I2_1 != null) {
                        r0 = C319029k.XAR_TOGGLE_IS_MORE_RECENT_THAN_CCP;
                    }
                    return false;
                }
            } else if (C34732Kr.A00(userSession, true)) {
                if (ktCSuperShape1S0100000_I2_1 != null) {
                    r0 = C319029k.XAR_IS_ENABLED_ON_SERVER;
                }
                return false;
            } else {
                C10450iM.A03("ReelsShareToFacebook", "<shouldShowShareToFacebook> xar=ON but not eligible for xar");
            }
            ktCSuperShape1S0100000_I2_1.A00 = r0;
            return false;
        }
        return true;
    }

    public static final boolean A02(KtCSuperShape1S0100000_I2_1 ktCSuperShape1S0100000_I2_1, UserSession userSession) {
        C319029k r0;
        if (!A03(userSession)) {
            if (ktCSuperShape1S0100000_I2_1 != null) {
                r0 = C319029k.NO_LINKED_FACEBOOK_ACCOUNT;
            }
            return false;
        }
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36319656499615018L)) {
            if (ktCSuperShape1S0100000_I2_1 != null) {
                r0 = C319029k.USER_IN_NO_SHARING_GK;
            }
            return false;
        }
        if (!C63803iN.A0E(r2, userSession, 36317607799820130L)) {
            if (ktCSuperShape1S0100000_I2_1 != null) {
                r0 = C319029k.CCP_LAUNCHER_IS_ENABLED_IS_FALSE;
            }
        } else if (!A01(ktCSuperShape1S0100000_I2_1, userSession)) {
            return false;
        } else {
            return true;
        }
        return false;
        ktCSuperShape1S0100000_I2_1.A00 = r0;
        return false;
    }
}
