package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.58P  reason: invalid class name */
public final class AnonymousClass58P extends C62793ak implements C147138nS {
    public final C86084wF A00;
    public final C28172Ezi A01;
    public final UserSession A02;

    public AnonymousClass58P(UserSession userSession) {
        this.A02 = userSession;
        C27456Enm enm = new C27456Enm(AnonymousClass006.A00, 0, 0);
        this.A00 = enm;
        this.A01 = new C27198Efl((C148838sG) null, enm);
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final /* synthetic */ C62793ak create(Class cls) {
        throw C86134wK.A0s("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
}
