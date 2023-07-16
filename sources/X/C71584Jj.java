package X;

import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Jj  reason: invalid class name and case insensitive filesystem */
public final class C71584Jj implements C0N {
    public final View BHL(BKH bkh, C1525190h r3) {
        C04220Ms.A0B(r3, 0);
        return r3.A09();
    }

    public final BO8 BHM(BKH bkh, C1525190h r3, UserSession userSession) {
        return null;
    }

    public final C27828Etx BHO(Context context, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        C04220Ms.A0B(context, 1);
        return new C26431qd((CharSequence) AnonymousClass0wJ.A0k(context, 2131835785));
    }

    public final D0f BHN() {
        return D0f.BELOW_ANCHOR;
    }

    public final void CPT(C11630kW r4, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A00(userSession)), "reels_shop_entrypoint_nux", true);
    }

    public final boolean Ct9(BKH bkh, C19589Ayp ayp, C1525190h r9, UserSession userSession) {
        View A09;
        Boolean bool;
        boolean A1Y = AnonymousClass0wJ.A1Y(userSession, bkh);
        C04220Ms.A0B(r9, 3);
        BKU bku = bkh.A0M;
        if (bku == null) {
            return A1Y;
        }
        if (!C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36325987281085809L) || !AnonymousClass0wJ.A0Y(userSession).A31() || C28161tl.A04(userSession).getBoolean("reels_shop_entrypoint_nux", A1Y) || !C19573AyZ.A00(bku, userSession) || (A09 = r9.A09()) == null || A09.getVisibility() != 0 || (bool = bku.A0f.A30) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
