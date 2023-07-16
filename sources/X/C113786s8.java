package X;

import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6s8  reason: invalid class name and case insensitive filesystem */
public final class C113786s8 {
    public final AnonymousClass0e5 A00;
    public final C102496Vk A01;
    public final String A02;

    public final void A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C28161tl A012 = AnonymousClass3WS.A01(userSession);
        AnonymousClass0wJ.A12(C28161tl.A02(A012), this.A02, System.currentTimeMillis());
    }

    public final boolean A01(UserSession userSession) {
        Object A022;
        AnonymousClass0e5 r0 = this.A00;
        if (r0 != null && C18190wL.A1Z(r0.A02(userSession), true)) {
            return false;
        }
        C28161tl A012 = AnonymousClass3WS.A01(userSession);
        long A05 = C18180wK.A05(A012.A00, this.A02);
        C102496Vk r1 = this.A01;
        if (r1 instanceof C965965s) {
            A022 = ((C965965s) r1).A00;
        } else {
            A022 = ((C965865r) r1).A00.A02(userSession);
        }
        if (C18240wQ.A09(A05) >= TimeUnit.DAYS.toMillis(C18190wL.A08(A022))) {
            return false;
        }
        return true;
    }

    public C113786s8(AnonymousClass0e5 r1, C102496Vk r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }
}
