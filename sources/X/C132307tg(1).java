package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.7tg  reason: invalid class name and case insensitive filesystem */
public final class C132307tg implements AnonymousClass0i1 {
    public boolean A00;
    public final SharedPreferences A01;
    public final C104696cD A02;
    public final UserSession A03;

    public C132307tg(C104696cD r4, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A02 = r4;
        this.A03 = userSession;
        this.A01 = AnonymousClass3Zs.A03(userSession).A02(D2R.A2Z, getClass());
    }

    public final void onUserSessionWillEnd(boolean z) {
    }
}
