package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Iv  reason: invalid class name and case insensitive filesystem */
public final class C71444Iv implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C25786Drz A0Q = C18180wK.A0Q(this.A00, this.A01);
        A0Q.A0D = true;
        AnonymousClass3WJ.A00();
        CUJ cuj = new CUJ();
        cuj.setArguments(C18180wK.A09("ARG_IS_FROM_CONTENT_PREVIEW_NUDGE", false));
        A0Q.A03 = cuj;
        A0Q.A05();
    }

    public C71444Iv(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
