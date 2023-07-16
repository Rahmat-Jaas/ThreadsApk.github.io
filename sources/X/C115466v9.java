package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.6v9  reason: invalid class name and case insensitive filesystem */
public final class C115466v9 {
    public final UserSession A00;

    public final boolean A00(BKU bku) {
        C04220Ms.A0B(bku, 0);
        if (bku.A4K()) {
            return true;
        }
        UserSession userSession = this.A00;
        if (C19573AyZ.A00(bku, userSession) || !AnonymousClass2OP.A00(userSession).A00) {
            return false;
        }
        return true;
    }

    public final boolean A03(BKU bku, boolean z) {
        C04220Ms.A0B(bku, 0);
        UserSession userSession = this.A00;
        C04220Ms.A0B(userSession, 0);
        boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36319510470530243L);
        if (!z) {
            return false;
        }
        if (!bku.A4K()) {
            if (bku.Aup() != C28991Ffc.VIDEO || !A0E || C19573AyZ.A00(bku, userSession)) {
                return false;
            }
            if (bku.A4K() || AnonymousClass2OP.A00(userSession).A00) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A01(BKU bku) {
        UserSession userSession = this.A00;
        boolean A0E = C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36319510470530243L);
        if (C19573AyZ.A00(bku, userSession)) {
            return false;
        }
        if (bku.A4K() || (AnonymousClass2OP.A00(userSession).A00 && A0E)) {
            return true;
        }
        return false;
    }

    public final boolean A02(BKU bku) {
        UserSession userSession = this.A00;
        if (C19573AyZ.A00(bku, userSession)) {
            return true;
        }
        if (!bku.BZm() || bku.A4K() || AnonymousClass2OP.A00(userSession).A00) {
            return false;
        }
        return true;
    }

    public C115466v9(UserSession userSession) {
        this.A00 = userSession;
    }
}
