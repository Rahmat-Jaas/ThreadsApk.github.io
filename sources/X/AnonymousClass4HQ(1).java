package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HQ  reason: invalid class name */
public final class AnonymousClass4HQ implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317723763937222L)) {
            C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00, userSession);
            A0Q.A07 = "QP";
            A0Q.A03 = new AnonymousClass1ZE();
            A0Q.A05();
        }
    }

    public AnonymousClass4HQ(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
