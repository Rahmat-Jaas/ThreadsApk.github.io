package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Id  reason: invalid class name and case insensitive filesystem */
public final class C71264Id implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C04220Ms.A0B(uri, 0);
        FragmentActivity requireActivity = this.A00.requireActivity();
        Bundle A06 = C18180wK.A06();
        A06.putString("UniversalCreationQuickCameraFragment.ARGUMENT_STARTING_LIVE_VISIBILITY_MODE", uri.getQueryParameter("live_visibility_mode"));
        C63863iT.A03(requireActivity, A06, this.A01, TransparentModalActivity.class, "universal_creation_live_camera").A0I(requireActivity);
    }

    public C71264Id(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
