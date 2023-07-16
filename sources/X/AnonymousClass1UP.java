package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1UP  reason: invalid class name */
public final class AnonymousClass1UP extends AnonymousClass1iZ {
    public final C83534rZ A00;
    public final String A01;
    public volatile I0W A02;

    public AnonymousClass1UP(C83534rZ r1, UserSession userSession, String str) {
        super(userSession);
        this.A01 = str;
        this.A00 = r1;
    }

    public final void A00(AnonymousClass3XX r6, UserSession userSession) {
        String errorMessage;
        String A022;
        int A03 = C14030oh.A03(1386290186);
        Object obj = r6.A00;
        if (!AnonymousClass0wJ.A1W(obj)) {
            A022 = "thread fetch failed for an unknown reason";
        } else {
            Throwable th = r6.A01;
            if (th != null) {
                AnonymousClass0LU.A0I("DirectThreadLoader", "thread fetch failed because of a throwable", th);
                this.A00.onFailure();
                C14030oh.A0A(-962893049, A03);
            }
            AnonymousClass1j3 r3 = (AnonymousClass1j3) obj;
            if (r3.getErrorMessage() == null) {
                errorMessage = "";
            } else {
                errorMessage = r3.getErrorMessage();
            }
            A022 = AnonymousClass00U.A02(r3.mStatusCode, errorMessage);
        }
        AnonymousClass0LU.A0D("DirectThreadLoader", A022);
        this.A00.onFailure();
        C14030oh.A0A(-962893049, A03);
    }

    public final /* bridge */ /* synthetic */ void A02(UserSession userSession, Object obj) {
        int A03 = C14030oh.A03(-1281000220);
        int A032 = C14030oh.A03(819951208);
        this.A00.CN7((I0W) null);
        C14030oh.A0A(292046228, A032);
        C14030oh.A0A(2140458812, A03);
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        C14030oh.A03(-621413623);
        C14030oh.A03(-702182462);
        C60883Qx.A00(userSession);
        throw C18210wN.A0W(C28174Ezk.A00(642));
    }
}
