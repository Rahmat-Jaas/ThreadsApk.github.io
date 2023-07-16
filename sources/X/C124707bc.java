package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bc  reason: invalid class name and case insensitive filesystem */
public final class C124707bc implements C147138nS {
    public final Context A00;
    public final C11630kW A01;
    public final UserSession A02;
    public final String A03;

    public C124707bc(Context context, C11630kW r3, UserSession userSession, String str) {
        C18180wK.A1Q(userSession, 1, r3);
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = context;
        this.A01 = r3;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new C882757k(this.A00, this.A01, this.A02, this.A03);
    }
}
