package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hl  reason: invalid class name and case insensitive filesystem */
public final class C71084Hl implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00, this.A01);
        A0Q.A07 = "QP";
        A0Q.A03 = AnonymousClass2S8.A00().A00().A00(IGRevShareProductType.PROFILE_ADS, "QP", uri.getQueryParameter("id"));
        A0Q.A05();
    }

    public C71084Hl(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
