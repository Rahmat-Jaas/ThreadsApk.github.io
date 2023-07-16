package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4IC  reason: invalid class name */
public final class AnonymousClass4IC implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public AnonymousClass4IC(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        UserSession userSession = this.A01;
        A0y.put("target_user_id", userSession.getUserId());
        A0y.put("referer_type", "QuickPromotion");
        C63743iE A02 = C63743iE.A02("com.instagram.interactions.about_this_account", A0y);
        Fragment fragment = this.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18230wP.A1A(fragment, A0N, 2131820840);
        A0N.A0P = "account_transparency_bloks";
        C63743iE.A07(requireActivity, A0N, A02);
    }
}
