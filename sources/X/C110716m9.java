package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6m9  reason: invalid class name and case insensitive filesystem */
public final class C110716m9 {
    public C131427rw A00;
    public User A01;
    public String A02;
    public final AnonymousClass3HX A03;
    public final C127397h3 A04;
    public final UserSession A05;

    public C110716m9(AnonymousClass3HX r4, C127397h3 r5) {
        User A032;
        this.A03 = r4;
        this.A04 = r5;
        C10300i6 A0E = C63913ic.A0E(r4);
        C18200wM.A1R(A0E);
        UserSession userSession = (UserSession) A0E;
        this.A05 = userSession;
        C1193774x r1 = (C1193774x) C127397h3.A0A(r5, 38);
        this.A02 = C127397h3.A0D(r5);
        if (r1 != null) {
            A032 = r1.A00;
        } else {
            A032 = AnonymousClass6VR.A00(userSession).A03(this.A02);
        }
        this.A01 = A032;
        if (A032 != null) {
            this.A02 = A032.getId();
        }
    }
}
