package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IN  reason: invalid class name */
public final class AnonymousClass4IN implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        uri.getQueryParameter("email");
        C60113Ns.A01(this.A00, this.A01);
        throw null;
    }

    public AnonymousClass4IN(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
