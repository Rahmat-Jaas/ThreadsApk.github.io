package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.4Fg  reason: invalid class name and case insensitive filesystem */
public final class C70574Fg implements C84194si, CallerContextable {
    public static final String __redex_internal_original_name = "ProfileContactActionButton";
    public final Context A00;
    public final C85874vu A01;
    public final User A02;
    public final ArrayList A03;

    public C70574Fg(Context context, C85874vu r3, User user, ArrayList arrayList) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A03 = arrayList;
        this.A01 = r3;
        this.A02 = user;
        if (!C18250wR.A1K(arrayList)) {
            throw C18180wK.A0a("Cannot create a bundled action button without Business actions to bundle");
        } else if (user.A2y()) {
            user.getId();
        }
    }

    public final String AUg() {
        return "generic";
    }

    public final String AUe() {
        return AnonymousClass0wJ.A0k(this.A00, 2131824317);
    }

    public final void onClick() {
        this.A01.BnM(this.A03);
    }
}
