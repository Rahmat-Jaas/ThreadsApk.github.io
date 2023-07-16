package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4BS  reason: invalid class name */
public final class AnonymousClass4BS implements C82474pl {
    public final UserSession A00;

    public final void Bgn(Bundle bundle) {
        C84624tY A0I;
        C04220Ms.A0B(bundle, 0);
        UserSession userSession = this.A00;
        User A03 = AnonymousClass6VR.A00(userSession).A03(userSession.getUserId());
        if (A03 != null && (A0I = A03.A0I()) != null && A0I.AZ6() != null) {
            bundle.putInt("subscriber_connected_fan_count_arg", C18210wN.A03(A0I.AZ6()));
        }
    }

    public AnonymousClass4BS(UserSession userSession) {
        this.A00 = userSession;
    }
}
