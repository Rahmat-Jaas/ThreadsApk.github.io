package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hu  reason: invalid class name and case insensitive filesystem */
public final class C71174Hu implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass268 r2 = AnonymousClass268.A0C;
        String valueOf = String.valueOf(uri);
        UserSession userSession = this.A01;
        if (r2.A02(valueOf)) {
            C33452Ft.A00(this.A00.requireActivity(), userSession);
        }
    }

    public C71174Hu(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
