package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3V2  reason: invalid class name */
public final class AnonymousClass3V2 {
    public final UserSession A00;

    public static AnonymousClass3V2 A00(UserSession userSession) {
        return (AnonymousClass3V2) C18180wK.A0c(userSession, AnonymousClass3V2.class, 23);
    }

    public final boolean A01() {
        UserSession userSession = this.A00;
        boolean z = false;
        if (C28161tl.A04(userSession).getInt("data_saver_mode_on", -1) != -1) {
            z = true;
        }
        if (!z || C28161tl.A04(userSession).getInt("data_saver_mode_on", -1) != 1) {
            return false;
        }
        return true;
    }

    public AnonymousClass3V2(UserSession userSession) {
        this.A00 = userSession;
    }

    public final boolean A02() {
        if (!A01()) {
            return false;
        }
        int i = C28161tl.A04(this.A00).getInt("data_saver_network_resources_quality", -1);
        if (i != -1) {
            if (i == -1) {
                return false;
            }
            if (i == 0) {
                return true;
            }
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                throw C18190wL.A0a("Unexpected network setting value");
            }
        }
        if (!AnonymousClass0fS.A0B(C10600ic.A00)) {
            return true;
        }
        return false;
    }
}
