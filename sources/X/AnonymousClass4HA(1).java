package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HA  reason: invalid class name */
public final class AnonymousClass4HA implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        Bundle A06 = C18180wK.A06();
        C63863iT.A02(fragment.getActivity(), A06, this.A01, ModalActivity.class, "profile_photo").A0I(activity);
    }

    public AnonymousClass4HA(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
