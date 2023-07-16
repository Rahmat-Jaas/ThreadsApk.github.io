package X;

import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Jg  reason: invalid class name and case insensitive filesystem */
public final class C71554Jg implements C0N {
    public final BO8 BHM(BKH bkh, C1525190h r3, UserSession userSession) {
        return null;
    }

    public final D0f BHN() {
        return D0f.ABOVE_ANCHOR;
    }

    public final View BHL(BKH bkh, C1525190h r3) {
        return r3.A04();
    }

    public final C27828Etx BHO(Context context, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        return new C26431qd((CharSequence) context.getString(2131828342));
    }

    public final void CPT(C11630kW r4, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(userSession)), "story_highlights_seen_tooltip", true);
    }

    public final boolean Ct9(BKH bkh, C19589Ayp ayp, C1525190h r5, UserSession userSession) {
        if (r5.A04() == null || C18190wL.A1X(C28161tl.A04(userSession), "story_highlights_seen_tooltip")) {
            return false;
        }
        return true;
    }
}
