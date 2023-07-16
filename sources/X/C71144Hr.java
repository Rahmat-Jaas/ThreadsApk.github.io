package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hr  reason: invalid class name and case insensitive filesystem */
public final class C71144Hr implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass268 r1 = AnonymousClass268.A09;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A02(obj)) {
            String queryParameter = uri.getQueryParameter("source_promotion");
            AnonymousClass3DE r2 = new AnonymousClass3DE(queryParameter, (String) null);
            C63473hX A012 = C63473hX.A01(userSession);
            r2.A04 = "upgrade_started";
            r2.A05 = "upgrade";
            A012.A08(r2);
            AnonymousClass3DE r22 = new AnonymousClass3DE(queryParameter, (String) null);
            C63473hX A013 = C63473hX.A01(userSession);
            r22.A04 = "qp_upsell_one_tap_upgrade_clicked";
            r22.A05 = "upgrade";
            A013.A08(r22);
            C63473hX A014 = C63473hX.A01(userSession);
            AnonymousClass3DE r12 = new AnonymousClass3DE(queryParameter, (String) null);
            r12.A05 = "upgrade";
            A014.A07(new C25821oz(this), r12);
        }
    }

    public C71144Hr(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
