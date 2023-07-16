package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.6oX  reason: invalid class name and case insensitive filesystem */
public final class C111856oX {
    public final SharedPreferences A00;

    public final void A00(String str) {
        C04220Ms.A0B(str, 0);
        AnonymousClass0wJ.A13(this.A00.edit(), AnonymousClass00U.A0N("gifts_feed_non_recorded_gifter_disclaimer", str, '_'), true);
    }

    public /* synthetic */ C111856oX(UserSession userSession) {
        this.A00 = AnonymousClass3Zs.A03(userSession).A02(D2R.A0e, C111856oX.class);
    }
}
