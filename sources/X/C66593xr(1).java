package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xr  reason: invalid class name and case insensitive filesystem */
public final class C66593xr implements C147138nS {
    public final FragmentActivity A00;
    public final C565837t A01;
    public final FanClubSettingsRecommendationsRepository A02;
    public final C62723ab A03;
    public final UserSession A04;

    public /* synthetic */ C66593xr(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C565837t r3 = new C565837t(userSession);
        FanClubSettingsRecommendationsRepository fanClubSettingsRecommendationsRepository = new FanClubSettingsRecommendationsRepository(new FanClubApi(userSession));
        C62723ab r1 = new C62723ab(new AnonymousClass3HY((Fragment) null, fragmentActivity, userSession, "UNKNOWN", 56), userSession, str);
        C04220Ms.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r3;
        this.A02 = fanClubSettingsRecommendationsRepository;
        this.A03 = r1;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass108(this.A01, this.A02, this.A03);
    }
}
