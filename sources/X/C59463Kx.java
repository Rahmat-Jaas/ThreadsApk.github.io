package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.util.IDxACallbackShape4S0400000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.3Kx  reason: invalid class name and case insensitive filesystem */
public final class C59463Kx {
    public static final void A00(Context context, View view, Fragment fragment, UserSession userSession, Map map) {
        UserSession userSession2 = userSession;
        boolean A1V = C18210wN.A1V(userSession);
        View view2 = view;
        if (view.isEnabled()) {
            view.setEnabled(A1V);
            Fragment fragment2 = fragment;
            AnonymousClass4A9 A00 = C63263h8.A00(userSession, "com.instagram.branded_content.screens.post_level_age_geo_gating_load_screen", map);
            A00.A00 = new IDxACallbackShape4S0400000_1_I2(context, view2, fragment2, userSession2, A1V ? 1 : 0);
            ((C145538kf) fragment2).schedule(A00);
        }
    }

    public static final void A01(Context context, View view, Fragment fragment, UserSession userSession, Map map) {
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession, 1);
        View view2 = view;
        if (view.isEnabled()) {
            view.setEnabled(false);
            Fragment fragment2 = fragment;
            AnonymousClass4A9 A00 = C63263h8.A00(userSession, "com.instagram.branded_content.screens.post_level_country_gating_load_screen", map);
            A00.A00 = new IDxACallbackShape4S0400000_1_I2(context, view2, fragment2, userSession2, 1);
            ((C145538kf) fragment2).schedule(A00);
        }
    }
}
