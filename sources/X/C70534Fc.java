package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.4Fc  reason: invalid class name and case insensitive filesystem */
public final class C70534Fc implements C84194si {
    public final Context A00;
    public final C11630kW A01;
    public final C85944w1 A02;
    public final User A03;
    public final boolean A04;

    public C70534Fc(Context context, C11630kW r3, C85944w1 r4, User user, boolean z) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A02 = r4;
        this.A03 = user;
        this.A01 = r3;
        this.A04 = z;
    }

    public final String AUe() {
        return AnonymousClass0wJ.A0k(this.A00, 2131829211);
    }

    public final String AUg() {
        if (this.A04) {
            return "invite";
        }
        return "generic";
    }

    public final void onClick() {
    }
}
