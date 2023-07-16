package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hd  reason: invalid class name and case insensitive filesystem */
public final class C71004Hd implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C04220Ms.A0B(uri, 0);
        AnonymousClass268 r1 = AnonymousClass268.A06;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A02(obj)) {
            C22871as r2 = new C22871as();
            Bundle A06 = C18180wK.A06();
            C18190wL.A12(uri, A06, "trigger");
            C18190wL.A12(uri, A06, "event");
            r2.setArguments(A06);
            AnonymousClass0wJ.A19(r2, this.A00, userSession);
        }
    }

    public C71004Hd(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
