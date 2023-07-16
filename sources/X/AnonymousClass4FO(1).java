package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.4FO  reason: invalid class name */
public final class AnonymousClass4FO implements C84194si {
    public final Context A00;
    public final C85874vu A01;
    public final User A02;

    public AnonymousClass4FO(Context context, C85874vu r3, User user) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = user;
    }

    public final String AUg() {
        return "generic";
    }

    public final String AUe() {
        return AnonymousClass0wJ.A0k(this.A00, 2131822819);
    }

    public final void onClick() {
        this.A01.BnK(this.A02, "button_tray");
    }
}
