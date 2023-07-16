package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HL  reason: invalid class name */
public final class AnonymousClass4HL implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C04220Ms.A0B(uri, 0);
        String A002 = AnonymousClass2RK.A00(uri.getQueryParameter("origin"));
        if (A002 == null) {
            A002 = "QP";
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        A0Q.A07 = A002;
        A0Q.A03 = AnonymousClass2FT.A00().A01().A00(userSession, A002, uri.getQueryParameter("id"), (String) null, false);
        A0Q.A05();
    }

    public AnonymousClass4HL(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
