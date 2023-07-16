package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.7tV  reason: invalid class name and case insensitive filesystem */
public final class C132197tV implements AnonymousClass0i1 {
    public SharedPreferences A00;
    public C09810gi A01 = C09820gj.A00;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132197tV(UserSession userSession) {
        this.A00 = AnonymousClass3Zs.A03(userSession).A01(D2R.A07);
    }
}
