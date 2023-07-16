package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4F6  reason: invalid class name */
public final class AnonymousClass4F6 implements C82834qL {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass4F6(FragmentActivity fragmentActivity, UserSession userSession, boolean z) {
        this.A02 = z;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void onFinished() {
        boolean z = this.A02;
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C682543b r4 = new C682543b(AnonymousClass3XQ.A0A);
        if (z) {
            C67323zM.A07(fragmentActivity, (Uri) null, r4, userSession, C18200wM.A00(), false, false, false, true);
        } else {
            C67323zM.A08(fragmentActivity, r4, userSession);
        }
    }
}
