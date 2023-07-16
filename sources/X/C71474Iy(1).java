package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.4Iy  reason: invalid class name and case insensitive filesystem */
public final class C71474Iy implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter;
        UserSession userSession = this.A01;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36314837546109116L)) {
            C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00, userSession);
            String str = "QP";
            A0Q.A07 = str;
            C58783Hg A002 = AnonymousClass3WJ.A00();
            if (!(uri == null || (queryParameter = uri.getQueryParameter("origin")) == null)) {
                str = C18220wO.A0u(Locale.ROOT, queryParameter);
            }
            A0Q.A03 = A002.A02(str);
            A0Q.A05();
        }
    }

    public C71474Iy(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
