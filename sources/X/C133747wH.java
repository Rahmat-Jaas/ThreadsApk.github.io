package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7wH  reason: invalid class name and case insensitive filesystem */
public final class C133747wH implements C84344sz {
    public final String AOU(Context context, UserSession userSession, boolean z) {
        int i = 2131838005;
        if (z) {
            i = 2131838004;
        }
        return context.getString(i);
    }

    public final String AOV(Context context, UserSession userSession, boolean z) {
        return context.getString(2131829248);
    }

    public final boolean BR1(Context context, UserSession userSession) {
        C32337HGt.A01();
        return true;
    }

    public final void Bj5(Context context, C15730rn r4, UserSession userSession) {
        C32337HGt.A01();
        r4.A09("upload_in_progress", C18180wK.A0Y());
    }
}
