package X;

import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3xg  reason: invalid class name and case insensitive filesystem */
public final class C66483xg implements C147138nS {
    public final AnonymousClass35Z A00;
    public final UserSession A01;
    public final List A02;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public /* synthetic */ C66483xg(UserSession userSession, List list) {
        AnonymousClass35Z r1 = new AnonymousClass35Z(userSession);
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = list;
        this.A00 = r1;
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass10T(this.A00, this.A01, this.A02);
    }
}
