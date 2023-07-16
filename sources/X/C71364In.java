package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4In  reason: invalid class name and case insensitive filesystem */
public final class C71364In implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        FragmentActivity activity = this.A00.getActivity();
        UserSession userSession = this.A01;
        C25786Drz A0Q = C18180wK.A0Q(activity, userSession);
        A0Q.A03 = AnonymousClass3UZ.A02.A00().A02(userSession, AnonymousClass006.A1L);
        A0Q.A05();
    }

    public C71364In(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
