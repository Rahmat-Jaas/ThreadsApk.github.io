package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1lU  reason: invalid class name */
public final class AnonymousClass1lU extends C30809GWj {
    public final C63873iU A00;
    public final GXN A01;
    public final UserSession A02;
    public final String A03;

    public final void A02(Exception exc) {
        C63873iU r1 = this.A00;
        exc.getClass();
        r1.onFail(new AnonymousClass3XX((Throwable) exc));
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        UserSession userSession = this.A02;
        String str = this.A03;
        GXN gxn = this.A01;
        AnonymousClass0wJ.A1N(userSession, str);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("accounts/change_profile_picture/");
        A0O.A04.A02 = new AnonymousClass41Y(gxn, userSession, str);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C21711Rw.class, C59343Kl.class);
        A0T.A00 = this.A00;
        C31155GhB.A03(A0T);
    }

    public AnonymousClass1lU(C63873iU r1, GXN gxn, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = gxn;
    }
}
