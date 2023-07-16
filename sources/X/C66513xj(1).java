package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xj  reason: invalid class name and case insensitive filesystem */
public final class C66513xj implements C147138nS {
    public final IGRevShareProductType A00;
    public final UserSession A01;
    public final String A02;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass10J(this.A00, new C567038f(new AnonymousClass2S7(), this.A01), this.A02);
    }

    public C66513xj(IGRevShareProductType iGRevShareProductType, UserSession userSession, String str) {
        AnonymousClass0wJ.A1O(userSession, iGRevShareProductType);
        this.A01 = userSession;
        this.A00 = iGRevShareProductType;
        this.A02 = str;
    }
}
