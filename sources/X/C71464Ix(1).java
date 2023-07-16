package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ix  reason: invalid class name and case insensitive filesystem */
public final class C71464Ix implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        String queryParameter;
        UserSession userSession = this.A01;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36314837546174653L)) {
            if (uri == null || (str = uri.getQueryParameter("origin")) == null) {
                str = AnonymousClass3R0.A00(AnonymousClass006.A0j);
            }
            C04220Ms.A09(str);
            if (uri != null && (queryParameter = uri.getQueryParameter("media_owner_igid")) != null) {
                AnonymousClass3WJ.A01().A04(this.A00, userSession, (Boolean) null, (Boolean) null, queryParameter, str);
            }
        }
    }

    public C71464Ix(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
