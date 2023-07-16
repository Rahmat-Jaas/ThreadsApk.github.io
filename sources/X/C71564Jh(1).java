package X;

import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4Jh  reason: invalid class name and case insensitive filesystem */
public final class C71564Jh implements C0N {
    public final View BHL(BKH bkh, C1525190h r3) {
        C04220Ms.A0B(r3, 0);
        return r3.A05();
    }

    public final BO8 BHM(BKH bkh, C1525190h r3, UserSession userSession) {
        return null;
    }

    public final C27828Etx BHO(Context context, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        C04220Ms.A0B(context, 1);
        return new C26431qd((CharSequence) C18190wL.A0g(context.getResources(), 2131826006));
    }

    public final void CPT(C11630kW r5, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        String str;
        String str2;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0wJ.A1O(r5, bkh);
        String str3 = bkh.A0U;
        C04220Ms.A06(str3);
        User user = bkh.A0S;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        if (bkh.A0z()) {
            str2 = "story_highlight_action_sheet";
        } else {
            str2 = "location_story_action_sheet";
        }
        C63673i6.A03(r5, userSession, str3, str, str2);
        AnonymousClass0wJ.A13(C28161tl.A03(userSession), "has_seen_external_sharing_overflow_user_education", false);
        AnonymousClass0wJ.A13(C28161tl.A03(userSession), "has_tapped_on_external_sharing_overflow_user_education", false);
    }

    public final boolean Ct9(BKH bkh, C19589Ayp ayp, C1525190h r6, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return C28161tl.A04(userSession).getBoolean("has_seen_external_sharing_overflow_user_education", false);
    }

    public final D0f BHN() {
        return D0f.ABOVE_ANCHOR;
    }
}
