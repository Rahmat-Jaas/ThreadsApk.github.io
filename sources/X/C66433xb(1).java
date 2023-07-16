package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xb  reason: invalid class name and case insensitive filesystem */
public final class C66433xb implements C147138nS {
    public final FragmentActivity A00;
    public final C8A A01;
    public final UserSession A02;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A02;
        C25786Drz A0Q = C18180wK.A0Q(this.A00, userSession);
        C28161tl A012 = AnonymousClass3WS.A01(userSession);
        return new CBJ(A0Q, C04220Ms.A0B(userSession, 0), this.A01, AnonymousClass2MX.A00(userSession), A012, userSession);
    }

    public C66433xb(FragmentActivity fragmentActivity, C8A c8a, UserSession userSession) {
        AnonymousClass0wJ.A1P(userSession, c8a);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = c8a;
    }
}
