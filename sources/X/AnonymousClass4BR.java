package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4BR  reason: invalid class name */
public final class AnonymousClass4BR implements C82474pl {
    public final UserSession A00;

    public final void Bgn(Bundle bundle) {
        AnonymousClass20y r0;
        C04220Ms.A0B(bundle, 0);
        UserSession userSession = this.A00;
        if (!C35072Lz.A00(userSession) || !AnonymousClass2MS.A00(userSession)) {
            if (C35072Lz.A00(userSession)) {
                r0 = AnonymousClass20y.Social;
            } else {
                r0 = AnonymousClass20y.Broadcast;
            }
            C35292Mw.A00(bundle, r0);
        }
    }

    public AnonymousClass4BR(UserSession userSession) {
        this.A00 = userSession;
    }
}
