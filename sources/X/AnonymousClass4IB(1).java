package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IB  reason: invalid class name */
public final class AnonymousClass4IB implements C82924qU {
    public UserSession A00;
    public final FragmentActivity A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A00;
        C38039KHq A002 = AnonymousClass3LY.A00(userSession);
        userSession.getUserId();
        A002.CWx(new C689145y());
    }

    public AnonymousClass4IB(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A00 = userSession;
    }
}
