package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4Fb  reason: invalid class name and case insensitive filesystem */
public final class C70524Fb implements C84194si {
    public final Context A00;
    public final C11630kW A01;
    public final C85874vu A02;
    public final UserSession A03;
    public final User A04;

    public C70524Fb(Context context, C11630kW r3, C85874vu r4, UserSession userSession, User user) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A02 = r4;
        this.A04 = user;
        this.A03 = userSession;
        this.A01 = r3;
    }

    public final String AUg() {
        return "generic";
    }

    public final String AUe() {
        int i;
        Context context = this.A00;
        UserSession userSession = this.A03;
        if (!Boolean.TRUE.equals(AnonymousClass0wJ.A0Y(userSession).A05.BRG()) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316400914009181L)) {
            i = 2131826213;
        } else {
            i = 2131836455;
        }
        return AnonymousClass0wJ.A0k(context, i);
    }

    public final void onClick() {
        UserSession userSession = this.A03;
        C11630kW r1 = this.A01;
        String id = this.A04.getId();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r1, userSession), "ig_cg_click_profile_donate_cta"), 1119);
        A0I.A0S("charity_user_id", AnonymousClass0wJ.A0d(id));
        A0I.A0O(C40321Lcb.IG_CHARITY_BUSINESS_PROFILE, C28174Ezk.A00(195));
        A0I.Bb4();
    }
}
