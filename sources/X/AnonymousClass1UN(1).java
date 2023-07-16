package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1UN  reason: invalid class name */
public final class AnonymousClass1UN extends AnonymousClass1iZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C82514pp A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1UN(C82514pp r1, UserSession userSession, String str, String str2, int i) {
        super(userSession);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void A00(AnonymousClass3XX r5, UserSession userSession) {
        int A032 = C14030oh.A03(-543398185);
        AnonymousClass0wJ.A1N(userSession, r5);
        super.A00(r5, userSession);
        AnonymousClass2NU.A00(r5, userSession, this.A02, this.A03, this.A00);
        C14030oh.A0A(739013452, A032);
    }

    public final /* bridge */ /* synthetic */ void A02(UserSession userSession, Object obj) {
        int A032 = C14030oh.A03(-1127860606);
        int A033 = C14030oh.A03(1247020658);
        AnonymousClass0wJ.A1N(userSession, obj);
        super.A02(userSession, obj);
        AnonymousClass2NU.A00((AnonymousClass3XX) null, userSession, this.A02, this.A03, this.A00);
        this.A01.onSuccess();
        C14030oh.A0A(1777304712, A033);
        C14030oh.A0A(1250228816, A032);
    }
}
