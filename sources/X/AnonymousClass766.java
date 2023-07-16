package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.766  reason: invalid class name */
public final class AnonymousClass766 {
    public Context A00;
    public Fragment A01;
    public UserSession A02;

    public AnonymousClass766(Fragment fragment, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragment.requireContext();
        this.A01 = fragment;
    }

    public AnonymousClass766() {
    }
}
