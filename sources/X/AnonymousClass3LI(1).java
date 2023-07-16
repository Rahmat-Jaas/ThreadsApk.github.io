package X;

import android.content.Context;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3LI  reason: invalid class name */
public final class AnonymousClass3LI {
    public static final void A00(Context context, BKU bku, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        User A2Z = bku.A2Z(userSession);
        if (A2Z != null) {
            Boolean BBh = A2Z.A05.BBh();
            if (BBh != null && BBh.booleanValue() && !C18190wL.A1X(C28161tl.A04(userSession), "seen_aggregate_promote_engagement_nux")) {
                A01(context, userSession);
                return;
            }
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A01(Context context, UserSession userSession) {
        boolean A1Z = AnonymousClass0wJ.A1Z(context, userSession);
        AnonymousClass0wJ.A13(C28161tl.A03(userSession), "seen_aggregate_promote_engagement_nux", A1Z);
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0I(R.drawable.empty_state_heart);
        A0W.A0L(2131837441);
        A0W.A0K(2131837442);
        A0W.A0q(A1Z);
        A0W.A0r(A1Z);
        A0W.A0P(C64143jh.A00, 2131831976);
        AnonymousClass0wJ.A1K(A0W);
    }
}
