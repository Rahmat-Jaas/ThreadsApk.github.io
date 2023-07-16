package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xt  reason: invalid class name and case insensitive filesystem */
public final class C66613xt implements C147138nS {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final String A03;
    public final boolean A04;

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        UserSession userSession = this.A02;
        Class<FanClubSettingsRecommendationsRepository> cls2 = FanClubSettingsRecommendationsRepository.class;
        String str = this.A03;
        return new C19470zv((FanClubSettingsRecommendationsRepository) userSession.A01(cls2, C18250wR.A0g(userSession, 30)), new C62723ab(new AnonymousClass3HY(this.A00, this.A01, userSession, str, 48), userSession, str), this.A04);
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public C66613xt(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        AnonymousClass0wJ.A1P(userSession, str);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A03 = str;
        this.A04 = z;
        this.A00 = fragment;
    }
}
