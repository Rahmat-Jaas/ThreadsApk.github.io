package X;

import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3xH  reason: invalid class name and case insensitive filesystem */
public final class C66233xH implements C147138nS {
    public final UserSession A00;
    public final List A01;

    public C66233xH(UserSession userSession, List list) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = list;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new C883257p(new C23416Cri(this.A00), this.A01);
    }
}
