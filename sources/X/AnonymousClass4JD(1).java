package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JD  reason: invalid class name */
public final class AnonymousClass4JD implements C82924qU {
    public final FragmentActivity A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void BN1(Uri uri, Bundle bundle) {
        C04220Ms.A0B(uri, 0);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        A0Q.A07 = "QP";
        A0Q.A03 = C122117Ki.A06().A01(fragmentActivity, this.A01, userSession, uri.getQueryParameter("fbid_of_incentive"), "QP");
        A0Q.A05();
    }

    public AnonymousClass4JD(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
