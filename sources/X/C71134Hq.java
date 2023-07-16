package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hq  reason: invalid class name and case insensitive filesystem */
public final class C71134Hq implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass268 r2 = AnonymousClass268.A08;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r2.A02(obj)) {
            C18210wN.A0L(userSession).A00();
            throw C18200wM.A0d();
        }
    }

    public C71134Hq(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
