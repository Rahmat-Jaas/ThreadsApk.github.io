package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Il  reason: invalid class name and case insensitive filesystem */
public final class C71344Il implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C25786Drz A0Q = C18180wK.A0Q(this.A00.getActivity(), this.A01);
        A0Q.A03 = C62653aT.A01().A01(AnonymousClass006.A00, false, false);
        A0Q.A07 = C63833iQ.A07(525, 24, 95);
        A0Q.A05();
    }

    public C71344Il(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
