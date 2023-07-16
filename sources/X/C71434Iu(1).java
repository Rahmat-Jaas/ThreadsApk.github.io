package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Iu  reason: invalid class name and case insensitive filesystem */
public final class C71434Iu implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C04220Ms.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("entrypoint");
        if ("PRODUCT_SWIPE_UP_LINK_NUDGE".equals(queryParameter) || "QP_DEEP_LINK".equals(queryParameter)) {
            Fragment fragment = this.A00;
            if (fragment instanceof C34640IcN) {
                ((C34640IcN) fragment).getRootActivity();
            }
        }
    }

    public C71434Iu(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
