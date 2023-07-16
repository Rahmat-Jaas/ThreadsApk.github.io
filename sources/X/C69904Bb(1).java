package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Bb  reason: invalid class name and case insensitive filesystem */
public final class C69904Bb implements C82484pm {
    public final Bundle A00;
    public final UserSession A01;

    public final boolean BVr() {
        UserSession userSession = this.A01;
        if (!C35072Lz.A00(userSession) || !AnonymousClass2MS.A00(userSession)) {
            return false;
        }
        return true;
    }

    public C69904Bb(Bundle bundle, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = bundle;
    }
}
