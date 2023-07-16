package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4S9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4S9 implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C82164pB A01;
    public final /* synthetic */ UserSession A02;

    public /* synthetic */ AnonymousClass4S9(Fragment fragment, C82164pB r2, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void run() {
        Fragment fragment = this.A00;
        UserSession userSession = this.A02;
        C82164pB r1 = this.A01;
        if (fragment.isResumed()) {
            AnonymousClass4Aj.A06(r1, userSession, (String) null);
        }
    }
}
