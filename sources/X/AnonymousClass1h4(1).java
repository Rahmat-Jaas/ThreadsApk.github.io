package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1h4  reason: invalid class name */
public final class AnonymousClass1h4 extends C63873iU {
    public UserSession A00;
    public User A01;
    public Integer A02;

    public AnonymousClass1h4(UserSession userSession, User user, Integer num) {
        this.A00 = userSession;
        this.A02 = num;
        this.A01 = user;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(942000989);
        int A032 = C14030oh.A03(-1284177850);
        Integer num = this.A02;
        if (num == AnonymousClass006.A0C) {
            throw C18210wN.A0W("fetchUserInfo");
        }
        if (num == AnonymousClass006.A05) {
            User user = this.A01;
            Boolean A0X = C18180wK.A0X();
            C41840MeW meW = user.A05;
            meW.Cpr(A0X);
            meW.Cps(A0X);
            UserSession userSession = this.A00;
            user.A1t(userSession);
            C18210wN.A1J(userSession, user);
        }
        C14030oh.A0A(1865576430, A032);
        C14030oh.A0A(306640816, A03);
    }
}
