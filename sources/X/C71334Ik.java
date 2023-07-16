package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ik  reason: invalid class name and case insensitive filesystem */
public final class C71334Ik implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C25786Drz A0Q = C18180wK.A0Q(this.A00.getActivity(), this.A01);
        A0Q.A03 = new AnonymousClass1ZD();
        A0Q.A05();
    }

    public C71334Ik(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
