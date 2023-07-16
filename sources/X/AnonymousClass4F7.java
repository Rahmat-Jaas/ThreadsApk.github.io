package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4F7  reason: invalid class name */
public final class AnonymousClass4F7 implements C82834qL {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C313625r A03;

    public AnonymousClass4F7(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession, C313625r r4) {
        this.A02 = userSession;
        this.A03 = r4;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void onFinished() {
        UserSession userSession = this.A02;
        C54142yy.A00(userSession, this.A03);
        C67323zM.A07(this.A00, (Uri) null, this.A01, userSession, C18200wM.A00(), false, false, false, false);
    }
}
