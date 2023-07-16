package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.48p  reason: invalid class name and case insensitive filesystem */
public final class C694548p implements AnonymousClass0i4 {
    public final SharedPreferences A00;
    public final UserSession A01;

    public final void onSessionWillEnd() {
        this.A01.A03(C694548p.class);
    }

    public C694548p(UserSession userSession) {
        this.A01 = userSession;
        SharedPreferences A012 = AnonymousClass3Zs.A03(userSession).A01(D2R.A1p);
        this.A00 = A012;
        int i = A012.getInt("app_version_number", -1);
        int A002 = C10380iF.A00();
        if (i != A002) {
            C18190wL.A11(this.A00);
            AnonymousClass0wJ.A11(A012.edit(), "app_version_number", A002);
        }
    }
}
