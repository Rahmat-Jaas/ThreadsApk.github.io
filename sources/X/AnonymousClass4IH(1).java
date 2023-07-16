package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IH  reason: invalid class name */
public final class AnonymousClass4IH implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C25786Drz A0Q = C18180wK.A0Q(this.A00.getActivity(), this.A01);
        C18190wL.A10();
        A0Q.A03 = new C29101wj();
        A0Q.A05();
    }

    public AnonymousClass4IH(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
