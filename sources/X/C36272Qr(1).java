package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import com.facebook.redex.IDxTCallbackShape564S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Qr  reason: invalid class name and case insensitive filesystem */
public final class C36272Qr {
    public static void A00(Activity activity, View view, C161639e8 r11, UserSession userSession) {
        SharedPreferences A04 = C28161tl.A04(userSession);
        boolean A1W = C18230wP.A1W(A04.getInt("preference_feed_picker_nux_count", 0), 3);
        boolean A1X = C18180wK.A1X(((System.currentTimeMillis() - A04.getLong("preference_feed_picker_nux_last_seen_time", 0)) > C18210wN.A06() ? 1 : ((System.currentTimeMillis() - A04.getLong("preference_feed_picker_nux_last_seen_time", 0)) == C18210wN.A06() ? 0 : -1)));
        if (A1W && A1X && r11.A02 < 2.0f && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342159440194571381L)) {
            C25553Dnn A01 = AnonymousClass4DS.A01(activity, activity.getString(2131827432));
            A01.A02(view, 0, activity.getResources().getDimensionPixelOffset(R.dimen.account_section_text_margin_horizontal), true);
            A01.A05 = new IDxTCallbackShape564S0100000_1_I2(userSession, 3);
            A01.A04(AnonymousClass3TC.A06);
            C18200wM.A1Q(A01);
        }
    }
}
