package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hh  reason: invalid class name and case insensitive filesystem */
public final class C71044Hh implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        new AnonymousClass433(this.A00, this.A01).A02("feed_timeline", "", "qp_banner");
    }

    public C71044Hh(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
