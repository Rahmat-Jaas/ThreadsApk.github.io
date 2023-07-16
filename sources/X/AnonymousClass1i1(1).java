package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1i1  reason: invalid class name */
public final class AnonymousClass1i1 extends C63873iU {
    public final /* synthetic */ AnonymousClass3T0 A00;

    public AnonymousClass1i1(AnonymousClass3T0 r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(2113405071);
        C63813iO.A04(2131827051);
        C14030oh.A0A(1563808966, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-246074596);
        C50242sg.A00(this.A00.A00.mView, false);
        C14030oh.A0A(2027852007, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1071380075);
        C50242sg.A00(this.A00.A00.mView, true);
        C14030oh.A0A(1734531395, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1254469947);
        C22011Ta r8 = (C22011Ta) obj;
        int A032 = C14030oh.A03(-1480323978);
        AnonymousClass3T0 r6 = this.A00;
        UserSession userSession = r6.A02;
        AnonymousClass3LY.A00(userSession).CWx(new C688645t());
        C04620Ok r2 = C06810aP.A01;
        r2.A01(userSession).A1e();
        AnonymousClass6VR.A00(userSession).A04(r2.A01(userSession));
        C62973bE.A03(r6.A00.requireContext(), r8.A00, r8.A01);
        C14030oh.A0A(-199737143, A032);
        C14030oh.A0A(1972172603, A03);
    }
}
