package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.0z8  reason: invalid class name and case insensitive filesystem */
public final class C19090z8 extends AnonymousClass00C {
    public final /* synthetic */ AnonymousClass1QE A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19090z8(AnonymousClass1QE r2) {
        super(true);
        this.A00 = r2;
    }

    public final void A01() {
        AnonymousClass1QE r5 = this.A00;
        UserSession userSession = r5.A00;
        userSession.getClass();
        AnonymousClass3LY.A00(userSession).CWx(new C686945c(C32642Cq.A00(r5.A03), "fbap"));
        UserSession userSession2 = r5.A00;
        userSession2.getClass();
        C63133bc.A02(r5, userSession2, r5.A01, "av_fbap", "camera_permission_granting", r5.A02);
        A02(false);
    }
}
