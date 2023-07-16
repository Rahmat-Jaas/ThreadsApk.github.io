package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IJ  reason: invalid class name */
public final class AnonymousClass4IJ implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        uri.getQueryParameter("email");
        C60113Ns.A01(this.A00.getActivity(), this.A01);
        throw null;
    }

    public AnonymousClass4IJ(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
