package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Lb  reason: invalid class name and case insensitive filesystem */
public final class C34832Lb {
    public static final boolean A00(Context context, UserSession userSession) {
        boolean A1Y = AnonymousClass0wJ.A1Y(context, userSession);
        if (!C18180wK.A1W(context.checkSelfPermission("android.permission.READ_CONTACTS")) || !C28161tl.A04(userSession).getBoolean("allow_contacts_sync", A1Y)) {
            return false;
        }
        return true;
    }
}
