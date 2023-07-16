package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ho  reason: invalid class name and case insensitive filesystem */
public final class C71114Ho implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        A0Q.A07 = "QP";
        A0Q.A03 = C122117Ki.A06().A04(userSession, "QP", uri.getQueryParameter("id"), uri.getQueryParameter("program"));
        A0Q.A05();
    }

    public C71114Ho(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
