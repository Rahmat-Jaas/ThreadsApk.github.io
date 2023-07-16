package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4BW  reason: invalid class name */
public final class AnonymousClass4BW implements C82474pl {
    public final UserSession A00;

    public final void Bgn(Bundle bundle) {
        int i = 0;
        C04220Ms.A0B(bundle, 0);
        UserSession userSession = this.A00;
        if (!C35072Lz.A00(userSession) || AnonymousClass2MS.A00(userSession)) {
            i = 1;
            if (C548530j.A00.A05(userSession)) {
                i = 2;
            }
        }
        bundle.putInt("interest_based_channel_implicit_audience_type", i);
    }

    public AnonymousClass4BW(UserSession userSession) {
        this.A00 = userSession;
    }
}
