package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HG  reason: invalid class name */
public final class AnonymousClass4HG implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass268 r2 = AnonymousClass268.A04;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r2.A02(obj)) {
            FragmentActivity fragmentActivity = this.A00;
            UserSession A02 = C05030Qo.A02(userSession);
            C18190wL.A10();
            C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
            A0Q.A03 = C29141wn.A0B(A02, "", false, true, false);
            A0Q.A05();
        }
    }

    public AnonymousClass4HG(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
