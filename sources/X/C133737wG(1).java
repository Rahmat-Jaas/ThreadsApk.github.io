package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7wG  reason: invalid class name and case insensitive filesystem */
public final class C133737wG implements C84344sz {
    public final boolean BR1(Context context, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        return !EAW.A0I.A00(context, userSession).A0V();
    }

    public final void Bj5(Context context, C15730rn r4, UserSession userSession) {
        r4.A09("upload_in_progress", Boolean.valueOf(EAW.A0I.A00(context, userSession).A0V()));
    }

    public final String AOU(Context context, UserSession userSession, boolean z) {
        int i = 2131838005;
        if (z) {
            i = 2131838004;
        }
        return AnonymousClass0wJ.A0k(context, i);
    }

    public final String AOV(Context context, UserSession userSession, boolean z) {
        return AnonymousClass0wJ.A0k(context, 2131829248);
    }
}
