package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IA  reason: invalid class name */
public final class AnonymousClass4IA implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00, this.A01);
        A0Q.A07 = "QP";
        C58033Do A002 = AnonymousClass2S8.A00().A00();
        if (uri != null) {
            str = uri.getQueryParameter("id");
        } else {
            str = null;
        }
        A0Q.A03 = A002.A00(IGRevShareProductType.REELS_OVERLAY_ADS, "QP", str);
        A0Q.A05();
    }

    public AnonymousClass4IA(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
