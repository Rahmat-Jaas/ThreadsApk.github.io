package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Iw  reason: invalid class name and case insensitive filesystem */
public final class C71454Iw implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        A0Q.A0D = true;
        AnonymousClass3WJ.A02();
        C04220Ms.A0B("QP", 1);
        AnonymousClass1bT r1 = new AnonymousClass1bT();
        Bundle A09 = C18180wK.A09("origin", "QP");
        AnonymousClass3W9.A02(A09, userSession);
        C18180wK.A0x(A09, r1, A0Q);
    }

    public C71454Iw(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
