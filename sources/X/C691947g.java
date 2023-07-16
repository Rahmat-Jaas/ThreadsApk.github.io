package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.47g  reason: invalid class name and case insensitive filesystem */
public final class C691947g implements C10390iG {
    public final /* synthetic */ C29681z6 A00;
    public final /* synthetic */ AnonymousClass1nS A01;

    public C691947g(C29681z6 r1, AnonymousClass1nS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        C14030oh.A0A(1295627371, C14030oh.A03(948521902));
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(454018903);
        UserSession userSession = this.A01.A00.A06;
        if (C63793iM.A0E(userSession)) {
            C29681z6 r5 = this.A00;
            if (r5.A00.A00.A00 + (C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36600238122929589L) * 3600 * 1000) <= System.currentTimeMillis()) {
                r5.A04(C697249u.A07, new AnonymousClass4NS(this), "app_start");
            }
        }
        C14030oh.A0A(1981891748, A03);
    }
}
