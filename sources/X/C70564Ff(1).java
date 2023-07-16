package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.user.model.User;

/* renamed from: X.4Ff  reason: invalid class name and case insensitive filesystem */
public final class C70564Ff implements C84194si, CallerContextable {
    public static final String __redex_internal_original_name = "ProfileActionWhatsAppButton";
    public final Context A00;
    public final C85874vu A01;
    public final User A02;

    public C70564Ff(Context context, C85874vu r3, User user) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = user;
    }

    public final String AUg() {
        return "generic";
    }

    public final String AUe() {
        User user = this.A02;
        if (user.A2y()) {
            user.getId();
        }
        return AnonymousClass0wJ.A0k(this.A00, 2131838087);
    }

    public final void onClick() {
    }
}
