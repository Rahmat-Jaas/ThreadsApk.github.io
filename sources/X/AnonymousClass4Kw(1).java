package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Kw  reason: invalid class name */
public class AnonymousClass4Kw implements C83814s2 {
    public final C38039KHq A00;
    public final UserSession A01;
    public final Fragment A02;

    public final void onAuthorizeFail() {
    }

    public final void Blp(AnonymousClass264 r3) {
        if (this instanceof AnonymousClass1v1) {
            ((AnonymousClass1v1) this).A00.Bll();
        } else {
            AnonymousClass3LY.A00(this.A01).CWx(new AnonymousClass462());
        }
    }

    public AnonymousClass4Kw(Fragment fragment, UserSession userSession) {
        AnonymousClass0wJ.A1P(fragment, userSession);
        this.A02 = fragment;
        this.A01 = userSession;
        this.A00 = AnonymousClass3LY.A00(userSession);
    }
}
