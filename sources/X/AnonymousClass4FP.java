package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.4FP  reason: invalid class name */
public final class AnonymousClass4FP implements C84194si {
    public final Context A00;
    public final C85874vu A01;
    public final User A02;

    public AnonymousClass4FP(Context context, C85874vu r3, User user) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = user;
    }

    public final String AUg() {
        return "generic";
    }

    public final String AUe() {
        String str;
        User user = this.A02;
        String Ahf = user.A05.Ahf();
        LIP A0H = user.A0H();
        if (A0H != null) {
            str = A0H.A01;
        } else {
            str = null;
        }
        if (Ahf != null && Ahf.length() != 0) {
            return Ahf;
        }
        if (str == null || str.length() == 0) {
            return AnonymousClass0wJ.A0k(this.A00, 2131822400);
        }
        return str;
    }

    public final void onClick() {
    }
}
