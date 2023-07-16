package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HJ  reason: invalid class name */
public final class AnonymousClass4HJ implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        if (C563236s.A01 != null) {
            UserSession userSession = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            C04220Ms.A0B(userSession, 0);
            C63863iT.A0A(fragmentActivity, C18180wK.A06(), userSession, "trend");
        }
    }

    public AnonymousClass4HJ(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
