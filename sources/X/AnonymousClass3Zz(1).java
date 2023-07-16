package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape20S1100000_1_I2;
import com.facebook.redex.IDxCListenerShape2S1300000_1_I2;
import com.facebook.redex.IDxDListenerShape185S0200000_1_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.3Zz  reason: invalid class name */
public final class AnonymousClass3Zz {
    public static Integer A01(String str) {
        for (Integer num : AnonymousClass006.A00(13)) {
            if (C54552zd.A00(num).equals(str.toUpperCase(Locale.US))) {
                return num;
            }
        }
        return null;
    }

    public static void A02(Context context, FragmentActivity fragmentActivity, C10300i6 r18, UserSession userSession, String str, long j) {
        IDxCListenerShape2S1300000_1_I2 iDxCListenerShape2S1300000_1_I2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C25828Dsm A0W = C18190wL.A0W(fragmentActivity2);
        String str2 = str;
        boolean equals = str2.equals("ig_ts_entry_point_direct_header");
        int i = R.drawable.ig_illustrations_qp_clock;
        if (equals) {
            i = R.drawable.ig_illustrations_qp_moon_refresh;
        }
        Context context2 = context;
        C18230wP.A11(context2, A0W, i);
        A0W.A02 = context2.getResources().getString(2131832004);
        UserSession userSession2 = userSession;
        A0W.A0p(C18190wL.A0h(context2.getResources(), C60653Py.A00(context2.getResources(), (int) (j / 60), C63803iN.A0E(AnonymousClass0TJ.A05, userSession2, 36316134626102240L), false), 2131832001));
        A0W.A0P(new IDxCListenerShape20S1100000_1_I2(str2, (Object) userSession2, 13), 2131832003);
        if (equals) {
            iDxCListenerShape2S1300000_1_I2 = new IDxCListenerShape2S1300000_1_I2(context2, fragmentActivity2, userSession2, str2, 7);
        } else {
            iDxCListenerShape2S1300000_1_I2 = new IDxCListenerShape2S1300000_1_I2(fragmentActivity, r18, userSession, str, 6);
        }
        A0W.A0O(iDxCListenerShape2S1300000_1_I2, 2131832002);
        AnonymousClass0wJ.A1K(A0W);
        Integer A01 = A01(str2);
        C04220Ms.A0B(userSession2, 0);
        C63583hq.A04(userSession2, AnonymousClass006.A0M, A01, (Long) null, (Long) null, (Long) null, "take_break", true);
    }

    public static boolean A03(UserSession userSession) {
        ArrayList A0v;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        long A08 = C18240wQ.A08(C63803iN.A0E(r2, userSession, 36316134626102240L) ? 1 : 0);
        long A04 = C63043bN.A01.A04(userSession);
        String[] split = C63803iN.A0C(r2, userSession, 36879084579717299L).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        if (split.length > 0) {
            A0v = C18200wM.A0s(Arrays.asList(split));
        } else {
            A0v = AnonymousClass0wJ.A0v();
        }
        if (A04 < 0 || !A0v.contains(String.valueOf(A04 / A08))) {
            return false;
        }
        return true;
    }

    public static C37383Jqm A00(Context context, AnonymousClass37X r6, UserSession userSession, AnonymousClass3UZ r8) {
        r8.A00();
        IDxDListenerShape185S0200000_1_I2 iDxDListenerShape185S0200000_1_I2 = new IDxDListenerShape185S0200000_1_I2(4, r6, userSession);
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, context);
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        int i = 2131824739;
        if (A03(userSession)) {
            i = 2131824726;
        }
        C18230wP.A10(context, A0L, i);
        if (A03(userSession)) {
            A0L.A0R = context.getString(2131826219);
        } else {
            A0L.A0R = context.getString(2131824736);
            A0L.A0S = context.getString(2131824737);
            A0L.A0X = A1Z;
        }
        A0L.A0W = A1Z;
        A0L.A0J = iDxDListenerShape185S0200000_1_I2;
        return A0L.A00();
    }
}
