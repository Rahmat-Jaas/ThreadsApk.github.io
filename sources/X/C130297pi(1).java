package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7pi  reason: invalid class name and case insensitive filesystem */
public final class C130297pi implements C21746BzX {
    public final String A00;
    public final String A01;

    public final C32165H8c Amb(UserSession userSession, boolean z) {
        C04220Ms.A0B(userSession, 0);
        String str = this.A01;
        String str2 = this.A00;
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("clips/reshared_media/");
        A0O.A0P("query", str);
        A0O.A0P("max_id", str2);
        return AnonymousClass0wJ.A0T(A0O, C21835C2k.class, C18633Aim.class);
    }

    public final C32165H8c BFX(UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 0);
        String str2 = this.A01;
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("clips/reshared_media/");
        A0O.A0P("query", str2);
        A0O.A0P("max_id", str);
        return AnonymousClass0wJ.A0T(A0O, C21835C2k.class, C18633Aim.class);
    }

    public final /* synthetic */ void Cp0(String str) {
    }

    public C130297pi(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public final /* synthetic */ boolean BUJ(boolean z) {
        return false;
    }
}
