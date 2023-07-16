package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.1v4  reason: invalid class name */
public final class AnonymousClass1v4 extends C697049r {
    public static final C62753ae A0A = new C62753ae();
    public Boolean A00;
    public Boolean A01;
    public Float A02;
    public Float A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public boolean A08;
    public boolean A09;

    public final int A07() {
        String str;
        C28161tl A012 = AnonymousClass3WS.A01(this.A08);
        boolean z = this.A09;
        boolean z2 = this.A08;
        SharedPreferences sharedPreferences = A012.A00;
        if (z) {
            if (z2) {
                str = "story_xpost_user_migration_upsell_display_count";
            } else {
                str = "story_xpost_user_migration_upsell_second_wave_display_count";
            }
        } else if (z2) {
            str = "feed_xpost_user_migration_upsell_display_count";
        } else {
            str = "feed_xpost_user_migration_upsell_second_wave_display_count";
        }
        return C18190wL.A04(sharedPreferences, str) + 1;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A08.A03(AnonymousClass1v4.class);
    }

    public static final void A00(UserSession userSession) {
        if (!C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36322907789729310L)) {
            return;
        }
        if ((!C61453Tm.A00(userSession) && C62183Xq.A00(userSession)) || (C61453Tm.A00(userSession) && !C62183Xq.A00(userSession))) {
            C62753ae.A01(userSession);
            C62753ae.A02(userSession);
        }
    }

    public AnonymousClass1v4(UserSession userSession) {
        super(userSession);
    }
}
