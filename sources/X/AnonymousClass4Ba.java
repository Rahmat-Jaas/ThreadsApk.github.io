package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ba  reason: invalid class name */
public final class AnonymousClass4Ba implements C82484pm {
    public final Bundle A00;
    public final UserSession A01;

    public final boolean BVr() {
        UserSession userSession = this.A01;
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36320008692307579L) || C28161tl.A04(userSession).getBoolean("channel_creator_nux_variant", false)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4Ba(Bundle bundle, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = bundle;
    }
}
