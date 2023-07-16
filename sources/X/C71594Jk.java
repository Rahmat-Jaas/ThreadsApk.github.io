package X;

import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Jk  reason: invalid class name and case insensitive filesystem */
public final class C71594Jk implements C0N {
    public final UserSession A00;

    public final BO8 BHM(BKH bkh, C1525190h r3, UserSession userSession) {
        return null;
    }

    public final D0f BHN() {
        return D0f.BELOW_ANCHOR;
    }

    public C71594Jk(UserSession userSession) {
        this.A00 = userSession;
    }

    public final View BHL(BKH bkh, C1525190h r3) {
        return r3.A01();
    }

    public final C27828Etx BHO(Context context, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        return new C26431qd((CharSequence) AnonymousClass0wJ.A0l(context, bkh.A0M.A2Z(this.A00).BK7(), 2131836888));
    }

    public final void CPT(C11630kW r5, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        AnonymousClass0wJ.A14(C28161tl.A04(userSession), "favorites_badge_nux_impression_count", 0);
        C28161tl A01 = AnonymousClass3WS.A01(userSession);
        AnonymousClass0wJ.A12(C28161tl.A02(A01), "favorites_badge_nux_last_timestamp", System.currentTimeMillis());
    }

    public final boolean Ct9(BKH bkh, C19589Ayp ayp, C1525190h r8, UserSession userSession) {
        if (System.currentTimeMillis() - C18180wK.A05(C28161tl.A04(userSession), "favorites_badge_nux_last_timestamp") > 86400000 && !C28161tl.A04(userSession).getBoolean("has_tapped_on_favorites_badge", false) && C28161tl.A04(userSession).getInt("favorites_badge_nux_impression_count", 0) < 5) {
            BKU bku = bkh.A0M;
            if (!bku.A4k() || r8.A01() == null || C32572Cj.A00(bku.A2Z(userSession), AnonymousClass0wJ.A0Y(userSession))) {
                return false;
            }
            return true;
        }
        return false;
    }
}
