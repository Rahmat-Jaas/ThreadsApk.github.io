package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4I9  reason: invalid class name */
public final class AnonymousClass4I9 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        if (C35092Mb.A00(userSession)) {
            C23411dm.A06(AnonymousClass0wJ.A0Q(this.A00, userSession));
            throw C18200wM.A0d();
        }
    }

    public AnonymousClass4I9(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
