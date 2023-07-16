package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JG  reason: invalid class name */
public final class AnonymousClass4JG implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Handler A02 = AnonymousClass0wJ.A0F();

    public final void BN1(Uri uri, Bundle bundle) {
        this.A02.post(new C72724Pl(this));
    }

    public AnonymousClass4JG(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
