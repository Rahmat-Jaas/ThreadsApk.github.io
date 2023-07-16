package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hx  reason: invalid class name and case insensitive filesystem */
public final class C71204Hx implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (fragment instanceof UserDetailFragment) {
            throw C18210wN.A0W("getNavBarView");
        }
        C309923u r3 = C309923u.PROFILE_NUX_DIALOG;
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("NametagFragment.ARGUMENT_ENTRY_POINT", r3);
        A06.putBoolean("NametagFragment.ARGUMENT_SCAN_MODE", false);
        C63863iT.A04(activity, A06, this.A01, TransparentModalActivity.class, "nametag").A0I(activity);
    }

    public C71204Hx(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
