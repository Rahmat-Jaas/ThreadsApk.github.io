package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4H7  reason: invalid class name */
public final class AnonymousClass4H7 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass4H7(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        C34552Jz.A00().A00(C18180wK.A06(), this.A00, this.A01, "DEEPLINK_QP");
    }
}
