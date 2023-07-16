package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.facebook.redex.IDxPCallbackShape480S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Zo  reason: invalid class name */
public final class AnonymousClass3Zo {
    public static final boolean A02(Context context) {
        if (Build.VERSION.SDK_INT < 33 || C18180wK.A1W(context.checkSelfPermission("android.permission.POST_NOTIFICATIONS"))) {
            return false;
        }
        return true;
    }

    public static final void A00(Context context, FragmentActivity fragmentActivity, AnonymousClass3Zo r12, UserSession userSession) {
        SharedPreferences A0C = C18200wM.A0C();
        if (A0C.getInt("preference_push_permission_impression_count", 0) > 0 && A0C.getInt("priming_screen_shown_count", 0) == 0) {
            long A05 = C18180wK.A05(A0C, "preference_push_permission_dialog_impression_timestamp");
            if (TimeUnit.MILLISECONDS.toDays(C18240wQ.A09(A05)) >= C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36609949043856377L)) {
                AnonymousClass0wJ.A11(A0C.edit(), "priming_screen_shown_count", A0C.getInt("priming_screen_shown_count", 0) + 1);
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "instagram_android_13_notifications_priming_event"), 1687);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    A0I.A0T("experiment_group", "in_priming_test_v2");
                    C18230wP.A1G(A0I, "priming_screen_impression");
                    A0I.Bb4();
                }
                C25828Dsm A0W = C18190wL.A0W(context);
                A0W.A0L(2131821339);
                A0W.A0K(2131821337);
                A0W.A0P(C18250wR.A0E(fragmentActivity, userSession, r12, 33), 2131821338);
                A0W.A0N(new IDxCListenerShape77S0200000_1_I2(38, (Object) userSession, (Object) r12), 2131821336);
                A0W.A0i(context.getDrawable(R.drawable.ig_illustrations_illo_settings_heart_refresh));
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
            }
        }
    }

    public static final void A01(FragmentActivity fragmentActivity) {
        C08350dD A00 = C08360dF.A00();
        AnonymousClass0wJ.A12(C18220wO.A0B(A00), "preference_push_permission_dialog_impression_timestamp", System.currentTimeMillis());
        AnonymousClass7K8.A02(fragmentActivity, new IDxPCallbackShape480S0100000_1_I2(A00, 2), new String[]{"android.permission.POST_NOTIFICATIONS"});
    }
}
