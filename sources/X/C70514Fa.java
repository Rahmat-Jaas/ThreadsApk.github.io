package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4Fa  reason: invalid class name and case insensitive filesystem */
public final class C70514Fa implements C84194si {
    public final Context A00;
    public final C85874vu A01;
    public final UserSession A02;
    public final User A03;

    public C70514Fa(Context context, C85874vu r3, UserSession userSession, User user) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = user;
        this.A02 = userSession;
    }

    public final String AUg() {
        return "generic";
    }

    public final String AUe() {
        String str;
        C146558mR A08 = this.A03.A08();
        if (A08 == null || A08.AdT() == null) {
            str = "";
        } else {
            str = A08.AdT();
        }
        C04220Ms.A06(str);
        return str;
    }

    public final void onClick() {
        this.A01.BnN(this.A03, "support");
    }
}
