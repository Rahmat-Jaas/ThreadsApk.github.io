package X;

import android.app.Activity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxCListenerShape663S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.49h  reason: invalid class name and case insensitive filesystem */
public final class C696149h implements AnonymousClass0i4, CallerContextable {
    public static final String __redex_internal_original_name = "FxCrosspostingAcccountsCenterBottomSheetUpsellManager";
    public C58273Et A00;
    public AnonymousClass215 A01 = AnonymousClass215.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    public C67263zF A02;
    public AnonymousClass36F A03;
    public String A04 = "";
    public boolean A05;
    public boolean A06;
    public final C82394pY A07 = C18220wO.A0P(this, 78);
    public final UserSession A08;
    public final Activity A09;

    public static final void A00(AnonymousClass29W r6, C696149h r7) {
        UserSession userSession = r7.A08;
        AnonymousClass2AC r4 = AnonymousClass2AC.A08;
        AnonymousClass2AD r3 = AnonymousClass2AD.A0D;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        A002.A07("is_account_linked", C18180wK.A0X());
        C18210wN.A1D(A002, 1);
        C49322rC.A00(r4, r6, r3, A002, userSession);
    }

    public static final void A01(C696149h r6) {
        UserSession userSession = r6.A08;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 2342162034352853869L)) {
            IDxCListenerShape663S0100000_1_I2 iDxCListenerShape663S0100000_1_I2 = new IDxCListenerShape663S0100000_1_I2(r6, 5);
            AnonymousClass1v3 A002 = AnonymousClass3ZC.A00(userSession);
            AnonymousClass2AC r1 = AnonymousClass2AC.A08;
            C04220Ms.A0B(r1, 0);
            A002.A00 = r1;
            A002.A06 = true;
            A002.A04 = iDxCListenerShape663S0100000_1_I2;
            A002.A06(r6.A09);
            return;
        }
        if (!C18190wL.A1X(C28161tl.A04(userSession), "auto_cross_post_to_facebook_feed")) {
            C67263zF.A03.A02(userSession, "upsell", true, true);
            C67263zF r0 = r6.A02;
            if (r0 == null) {
                r0 = C60303Om.A00(userSession);
                r6.A02 = r0;
            }
            r0.A04(userSession, "upsell", true);
        }
        C58273Et r02 = r6.A00;
        if (r02 != null) {
            r02.A00(true);
        }
        AnonymousClass3LY.A00(userSession).A02(r6.A07, AnonymousClass46O.class);
    }

    public static final boolean A02(C696149h r3) {
        UserSession userSession = r3.A08;
        if (!C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 2342162034352984942L) || C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317341511847477L)) {
            return false;
        }
        return C18190wL.A1X(C28161tl.A04(userSession), "fx_cal_ig_fb_feed_crosspost_after_share_ac_upsell_seen");
    }

    public final void onSessionWillEnd() {
        this.A08.A03(C696149h.class);
    }

    public C696149h(Activity activity, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, activity);
        this.A08 = userSession;
        this.A09 = activity;
    }
}
