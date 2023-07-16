package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ih  reason: invalid class name and case insensitive filesystem */
public final class C71304Ih implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass268 r1 = AnonymousClass268.A0N;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A02(obj)) {
            C63743iE A02 = C63743iE.A02("com.instagram.bullying.privacy.safety_check_options", AnonymousClass0wJ.A0y());
            FragmentActivity fragmentActivity = this.A00;
            IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
            A0N.A0S = "";
            A02.A0C(fragmentActivity, A0N);
        }
    }

    public C71304Ih(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
