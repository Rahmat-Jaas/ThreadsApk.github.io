package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hg  reason: invalid class name and case insensitive filesystem */
public final class C71034Hg implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        String str2;
        if (uri == null || (str = uri.getQueryParameter("origin")) == null) {
            str = "qp";
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        A0Q.A0D = true;
        AnonymousClass3WJ.A00();
        if (C63803iN.A0E(C18250wR.A0D(str, 1), userSession, 36326884929251110L)) {
            str2 = "com.bloks.www.ig_subscriptions.creator_experience.special_deals";
        } else {
            str2 = "com.instagram.user_pay.fan_club.screens.creator_onboarding.special_deals";
        }
        A0Q.A03 = C62853b1.A03(userSession, str2, C63203gz.A03("origin", str));
        A0Q.A05();
    }

    public C71034Hg(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
