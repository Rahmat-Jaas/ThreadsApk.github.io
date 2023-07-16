package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.4Hn  reason: invalid class name and case insensitive filesystem */
public final class C71104Hn implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession;
        Fragment A02;
        C04220Ms.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("deal_template_id");
        if (queryParameter == null) {
            C122117Ki.A06();
            userSession = this.A01;
            C04220Ms.A0B(userSession, 0);
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            A02 = C62853b1.A03(userSession, "com.instagram.incentive_platform.screens.deal_information", C63203gz.A03("entry_point", C18190wL.A0r(locale, "QP")));
        } else {
            C61743Ve A06 = C122117Ki.A06();
            userSession = this.A01;
            A02 = A06.A02(userSession, queryParameter, "QP");
        }
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00, userSession);
        A0Q.A07 = "QP";
        A0Q.A03 = A02;
        A0Q.A05();
    }

    public C71104Hn(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
