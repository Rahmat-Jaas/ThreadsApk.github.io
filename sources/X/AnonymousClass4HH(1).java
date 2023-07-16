package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HH  reason: invalid class name */
public final class AnonymousClass4HH implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        int i = 2131835754;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36324694496453245L)) {
            i = 2131823368;
        }
        Fragment fragment = this.A00;
        String A0k = AnonymousClass0wJ.A0k(fragment.requireContext(), i);
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        A0N.A0S = A0k;
        A0N.A0e = true;
        C63743iE.A02("com.instagram.portable_settings.remixes_guides_and_sharing_settings", AnonymousClass0wJ.A0y()).A0C(fragment.requireActivity(), A0N);
    }

    public AnonymousClass4HH(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
