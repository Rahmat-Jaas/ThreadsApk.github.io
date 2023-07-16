package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IW  reason: invalid class name */
public final class AnonymousClass4IW implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        throw C18210wN.A0W("getFragmentArguments");
    }

    public AnonymousClass4IW(Fragment fragment, UserSession userSession) {
        this.A00 = fragment.getActivity();
        this.A01 = userSession;
    }
}
