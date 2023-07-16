package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JK  reason: invalid class name */
public final class AnonymousClass4JK implements C82924qU {
    public final Fragment A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A02;
        Fragment fragment = this.A00;
        C11630kW r1 = this.A01;
        if (C34832Lb.A00(fragment.requireContext(), userSession)) {
            AnonymousClass3h4.A05(r1, userSession, true);
        } else {
            AnonymousClass3h4.A01(fragment, (C11630kW) null, (C82844qM) null, userSession, "qp", true);
        }
    }

    public AnonymousClass4JK(Fragment fragment, C11630kW r2, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = r2;
        this.A02 = userSession;
    }
}
