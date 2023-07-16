package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4S4  reason: invalid class name */
public final class AnonymousClass4S4 implements Runnable {
    public final /* synthetic */ C696349j A00;
    public final /* synthetic */ String A01;

    public final void run() {
        FragmentActivity fragmentActivity = null;
        try {
            fragmentActivity = H5O.A01().A06();
        } catch (ClassCastException | IndexOutOfBoundsException unused) {
        }
        UserSession userSession = this.A00.A02;
        C63433hT.A04(fragmentActivity, userSession);
        AnonymousClass0wJ.A13(C62803am.A00(C63043bN.A01, userSession), AnonymousClass00U.A0L("TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", this.A01), true);
    }

    public AnonymousClass4S4(C696349j r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
