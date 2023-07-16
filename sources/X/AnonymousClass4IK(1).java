package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IK  reason: invalid class name */
public final class AnonymousClass4IK implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("type");
        FragmentActivity activity = this.A00.getActivity();
        UserSession userSession = this.A01;
        C25786Drz A0Q = C18180wK.A0Q(activity, userSession);
        A0Q.A03 = C63463hW.A01().A04(userSession, queryParameter);
        A0Q.A05();
    }

    public AnonymousClass4IK(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
