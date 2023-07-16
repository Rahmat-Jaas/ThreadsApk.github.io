package X;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;
import com.instagram.fanclub.settings.repository.FanClubSettingsRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.10k  reason: invalid class name and case insensitive filesystem */
public final class C195810k extends C884358b {
    public final Application A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C195810k(Application application, Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        super(application);
        C18180wK.A1Q(userSession, 2, str);
        this.A00 = application;
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A04 = str;
        this.A05 = z;
        this.A01 = fragment;
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        Application application = this.A00;
        UserSession userSession = this.A03;
        String str = this.A04;
        AnonymousClass3HY r3 = new AnonymousClass3HY(this.A01, this.A02, userSession, str, 48);
        String userId = userSession.getUserId();
        C106376ew A002 = AnonymousClass2SP.A00(userSession);
        C695148w r5 = (C695148w) userSession.A01(C695148w.class, C18250wR.A0g(userSession, 18));
        return new C19240zX(application, r3, new FanClubSettingsRepository(new FanClubApi(userSession), r5, (FanClubSettingsRecommendationsRepository) userSession.A01(FanClubSettingsRecommendationsRepository.class, C18250wR.A0g(userSession, 30)), AnonymousClass2RN.A00(userSession), A002, userId), userSession, str, this.A05);
    }
}
