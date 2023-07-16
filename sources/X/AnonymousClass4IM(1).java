package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IM  reason: invalid class name */
public final class AnonymousClass4IM implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C63743iE A02 = C63743iE.A02("com.instagram.settings.privacy.comments", AnonymousClass0wJ.A0y());
        Fragment fragment = this.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        IgBloksScreenConfig A0N = C18190wL.A0N(this.A01);
        C18210wN.A0s(fragment.requireActivity(), A0N, 2131832934);
        A0N.A0e = true;
        A02.A0C(requireActivity, A0N);
    }

    public AnonymousClass4IM(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
