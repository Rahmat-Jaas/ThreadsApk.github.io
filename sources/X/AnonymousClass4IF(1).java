package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IF  reason: invalid class name */
public final class AnonymousClass4IF implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        A0Q.A03 = C111986om.A01.A00().A02(userSession);
        A0Q.A05();
    }

    public AnonymousClass4IF(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
