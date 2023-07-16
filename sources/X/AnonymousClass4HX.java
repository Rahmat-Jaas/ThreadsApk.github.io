package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HX  reason: invalid class name */
public final class AnonymousClass4HX implements C82924qU {
    public UserSession A00;
    public final FragmentActivity A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A00;
        C63863iT.A0A(this.A01, C18180wK.A06(), userSession, "profile_fullname_screen");
    }

    public AnonymousClass4HX(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A00 = userSession;
    }
}
