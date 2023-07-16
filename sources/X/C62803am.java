package X;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.service.session.UserSession;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape94S0100000_I2_74;

/* renamed from: X.3am  reason: invalid class name and case insensitive filesystem */
public final class C62803am {
    public static SharedPreferences.Editor A00(C62803am r1, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return r1.A06(userSession).edit();
    }

    public static SharedPreferences A01(C62803am r1, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return r1.A06(userSession);
    }

    public final long A04(UserSession userSession) {
        Integer B94;
        int intValue;
        C04220Ms.A0B(userSession, 0);
        C84674tf A0Z = AnonymousClass0wJ.A0Y(userSession).A0Z();
        if (!(A0Z == null || (B94 = A0Z.B94()) == null || (intValue = B94.intValue()) < 0)) {
            long j = (long) intValue;
            if (j > 0) {
                return j;
            }
        }
        return C18180wK.A05(A06(userSession), "DAILY_QUOTA");
    }

    public final synchronized SharedPreferences A06(UserSession userSession) {
        return ((C63043bN) userSession.A01(C63043bN.class, new KtLambdaShape94S0100000_I2_74(userSession, 12))).A00;
    }

    public final boolean A08(UserSession userSession) {
        return A01(this, userSession).getBoolean("HAS_USER_EVER_SET_BREAKS", false);
    }

    public final C57613Bt A07(UserSession userSession, String str) {
        C04220Ms.A0B(str, 1);
        C57613Bt r6 = new C57613Bt(str, 0, 0);
        String A0W = C18250wR.A0W(A06(userSession), AnonymousClass00U.A0L("SCREEN_TIME_BY_SCREEN_", str));
        if (!(A0W == null || A0W.length() == 0)) {
            try {
                return (C57613Bt) new Gson().A06(A0W, r6.getClass());
            } catch (LWW | IllegalStateException unused) {
                C10450iM.A03("TimeSpentPreferences", "Corrupted Time Spent By Screen Data");
            }
        }
        return null;
    }

    public static final List A02(UserSession userSession) {
        List B5a;
        C84674tf A0Z = AnonymousClass0wJ.A0Y(userSession).A0Z();
        if (A0Z == null || (B5a = A0Z.B5a()) == null || B5a.isEmpty()) {
            return null;
        }
        return B5a;
    }

    public final long A03(ScreenTimeScreenType screenTimeScreenType, UserSession userSession) {
        long j;
        C57613Bt A07 = A07(userSession, screenTimeScreenType.toString());
        if (A07 == null) {
            return 0;
        }
        long j2 = A07.A00 - A07.A01;
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        C18190wL.A1W(instance);
        if (C04220Ms.A0I(instance.getTime(), A07.A03)) {
            j = A07.A02;
        } else {
            j = 0;
        }
        return j + j2;
    }

    public final long A05(UserSession userSession) {
        return C18180wK.A05(A01(this, userSession), "TAKE_A_BREAK");
    }
}
