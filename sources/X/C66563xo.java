package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastInfoApi;

/* renamed from: X.3xo  reason: invalid class name and case insensitive filesystem */
public final class C66563xo implements C147138nS {
    public final UserSession A00;
    public final User A01;
    public final AnonymousClass3HS A02;
    public final String A03;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        User user = this.A01;
        String str = this.A03;
        return new C19430zr(userSession, user, new IgLiveBroadcastInfoApi(userSession), this.A02, str);
    }

    public C66563xo(UserSession userSession, User user, AnonymousClass3HS r3, String str) {
        AnonymousClass0wJ.A1O(userSession, user);
        this.A00 = userSession;
        this.A01 = user;
        this.A03 = str;
        this.A02 = r3;
    }
}
