package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.fanclub.consideration.FanClubConsiderationRepository;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xq  reason: invalid class name and case insensitive filesystem */
public final class C66583xq implements C147138nS {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C66583xq(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        C04220Ms.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = z;
        this.A02 = str2;
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        Application application = this.A00.getApplication();
        C04220Ms.A06(application);
        UserSession userSession = this.A01;
        return new FanClubConsiderationViewModel(application, new FanClubConsiderationRepository(userSession), (AnonymousClass490) userSession.A01(AnonymousClass490.class, C18250wR.A0f(userSession, 4)), AnonymousClass2SP.A00(userSession), userSession, this.A02, this.A03, this.A04);
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }
}
