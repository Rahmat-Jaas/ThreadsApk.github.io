package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4Jl  reason: invalid class name and case insensitive filesystem */
public final class C71604Jl implements C0N {
    public final C106376ew A00;

    public final View BHL(BKH bkh, C1525190h r3) {
        C04220Ms.A0B(r3, 0);
        return r3.A02();
    }

    public final BO8 BHM(BKH bkh, C1525190h r3, UserSession userSession) {
        return null;
    }

    public final C27828Etx BHO(Context context, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        C04220Ms.A0B(context, 1);
        CharSequence text = context.getText(2131827102);
        C04220Ms.A06(text);
        return new C26431qd(text);
    }

    public final D0f BHN() {
        return D0f.BELOW_ANCHOR;
    }

    public final void CPT(C11630kW r6, BKH bkh, C19589Ayp ayp, UserSession userSession) {
        SharedPreferences sharedPreferences = this.A00.A00;
        AnonymousClass0wJ.A14(sharedPreferences, "exclusive_story_badge_tooltip_count", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "exclusive_story_badge_tooltip_timestamp", System.currentTimeMillis());
    }

    public C71604Jl(UserSession userSession) {
        this.A00 = AnonymousClass2SP.A00(userSession);
    }

    public final boolean Ct9(BKH bkh, C19589Ayp ayp, C1525190h r8, UserSession userSession) {
        String str;
        User A2Z;
        boolean A1Y = AnonymousClass0wJ.A1Y(userSession, bkh);
        C04220Ms.A0B(r8, 3);
        if (r8.A02() != null) {
            SharedPreferences sharedPreferences = this.A00.A00;
            if (sharedPreferences.getInt("exclusive_story_badge_tooltip_count", A1Y ? 1 : 0) < 3 && System.currentTimeMillis() - C18180wK.A05(sharedPreferences, "exclusive_story_badge_tooltip_timestamp") > C18210wN.A06()) {
                String id = AnonymousClass0wJ.A0Y(userSession).getId();
                BKU bku = bkh.A0M;
                if (bku == null || (A2Z = bku.A2Z(userSession)) == null) {
                    str = null;
                } else {
                    str = A2Z.getId();
                }
                if (C04220Ms.A0I(id, str)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
