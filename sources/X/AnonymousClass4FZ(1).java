package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4FZ  reason: invalid class name */
public final class AnonymousClass4FZ implements C84194si {
    public final Context A00;
    public final C85874vu A01;
    public final UserSession A02;
    public final User A03;

    public AnonymousClass4FZ(Context context, C85874vu r3, UserSession userSession, User user) {
        C04220Ms.A0B(context, 2);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r3;
        this.A03 = user;
    }

    public final String AUg() {
        return "generic";
    }

    public final String AUe() {
        return C59523Ld.A00(this.A00, AnonymousClass2O8.A00(this.A02, this.A03)).toString();
    }

    public final void onClick() {
    }
}
