package X;

import android.app.Activity;
import com.facebook.redex.IDxCListenerShape15S0400000_1_I2;
import com.instagram.reels.bottomsheet.rollcall.RollCallNuxBottomSheetHelper$maybeShowRollCallNuxBottomSheet$1;
import com.instagram.service.session.UserSession;

/* renamed from: X.2TC  reason: invalid class name */
public final class AnonymousClass2TC {
    public static /* synthetic */ void A00(Activity activity, UserSession userSession) {
        C04220Ms.A0B(activity, 0);
        UserSession userSession2 = userSession;
        C18532Ah8 A00 = AnonymousClass2TK.A00(userSession);
        if (!A00.A07.getBoolean("has_seen_roll_call_nux", false)) {
            C37032Jj9 A0L = C18210wN.A0L(userSession);
            A0L.A0I = null;
            C37383Jqm A002 = A0L.A00();
            AnonymousClass1YA r8 = new AnonymousClass1YA();
            AnonymousClass1Xm r5 = new AnonymousClass1Xm();
            r8.mLifecycleRegistry.A07(new RollCallNuxBottomSheetHelper$maybeShowRollCallNuxBottomSheet$1(A00));
            r8.A00 = C18210wN.A0H(A002, 65);
            r8.A01 = new IDxCListenerShape15S0400000_1_I2(19, r5, userSession2, activity, r8);
            C37383Jqm.A00(activity, r8, A002);
        }
    }
}
