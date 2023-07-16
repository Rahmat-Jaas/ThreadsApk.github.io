package X;

import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3xf  reason: invalid class name and case insensitive filesystem */
public final class C66473xf implements C147138nS {
    public final UserSession A00;
    public final String A01;
    public final List A02;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass105(this.A00, this.A01, this.A02);
    }

    public C66473xf(UserSession userSession, String str, List list) {
        AnonymousClass0wJ.A1O(userSession, str);
        C04220Ms.A0B(list, 3);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = list;
    }
}
