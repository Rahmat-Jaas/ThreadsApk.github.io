package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.47p  reason: invalid class name and case insensitive filesystem */
public final class C692647p implements C10390iG, AnonymousClass0i4 {
    public static UserSession A02;
    public static AnonymousClass3UL A03;
    public static boolean A04;
    public final C37228Jmt A00;
    public final AnonymousClass0gW A01;

    public static C692647p A00(UserSession userSession) {
        Class<C692647p> cls = C692647p.class;
        C692647p r1 = (C692647p) userSession.A00(cls);
        if (r1 != null) {
            return r1;
        }
        C692647p r12 = new C692647p(new C37228Jmt(C10600ic.A00, new C686644y(), 29884922), new C11900kz(C09820gj.A00, AnonymousClass0gN.A00(), "pending_reel_tray_seen_state"), userSession);
        C691847d.A0F.addIfAbsent(r12);
        userSession.A04(cls, r12);
        return r12;
    }

    public final void A01() {
        AnonymousClass3UL r0;
        if (!A04) {
            A02.getUserId();
            C37228Jmt jmt = this.A00;
            AnonymousClass36M r02 = (AnonymousClass36M) jmt.A01(AnonymousClass00U.A0L("pending_reel_tray_seen_state_", A02.getUserId()), true);
            if (!(r02 == null || (r0 = r02.A00) == null)) {
                A03 = r0;
                jmt.A03(AnonymousClass00U.A0L("pending_reel_tray_seen_state_", A02.getUserId()));
            }
            A04 = true;
        }
    }

    public final void onSessionWillEnd() {
        if (A02 != null) {
            C691847d.A04(this);
        }
        UserSession userSession = A02;
        if (userSession == null || !C63803iN.A05(AnonymousClass0TJ.A05, userSession, 36320833321113874L).booleanValue()) {
            this.A01.AKp(new AnonymousClass1mR(this));
            return;
        }
        AnonymousClass3UL r1 = A03;
        if (!r1.A00.isEmpty()) {
            H1T A0N = AnonymousClass0wJ.A0N(A02);
            A0N.A0J("feed/record_reels_tray_seen_state/");
            String A002 = AnonymousClass3UL.A00(r1.A00);
            if (A002 != null) {
                A0N.A0O("reel_tray_impressions", A002);
            }
            A0N.A04.A0P = true;
            C31155GhB.A03(AnonymousClass0wJ.A0S(A0N));
        }
    }

    public C692647p(C37228Jmt jmt, AnonymousClass0gW r3, UserSession userSession) {
        A02 = userSession;
        this.A00 = jmt;
        A03 = new AnonymousClass3UL();
        this.A01 = r3;
        A04 = false;
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(1678308291);
        UserSession userSession = A02;
        if (userSession == null || !C63803iN.A05(AnonymousClass0TJ.A05, userSession, 36320833321113874L).booleanValue()) {
            this.A01.AKp(new AnonymousClass1mR(this));
        } else {
            AnonymousClass3UL r1 = A03;
            if (!r1.A00.isEmpty()) {
                H1T A0N = AnonymousClass0wJ.A0N(A02);
                A0N.A0J("feed/record_reels_tray_seen_state/");
                String A002 = AnonymousClass3UL.A00(r1.A00);
                if (A002 != null) {
                    A0N.A0O("reel_tray_impressions", A002);
                }
                A0N.A04.A0P = true;
                C31155GhB.A03(AnonymousClass0wJ.A0S(A0N));
            }
        }
        A04 = false;
        C14030oh.A0A(407820513, A032);
    }

    public final void onAppForegrounded() {
        int A032 = C14030oh.A03(1867879719);
        if (!C63803iN.A05(AnonymousClass0TJ.A05, A02, 36320833321113874L).booleanValue()) {
            this.A01.AKp(new AnonymousClass1mQ(this));
        }
        C14030oh.A0A(828219110, A032);
    }
}
