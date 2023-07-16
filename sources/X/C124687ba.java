package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7ba  reason: invalid class name and case insensitive filesystem */
public final class C124687ba implements C147138nS {
    public final Context A00;
    public final C121177En A01;
    public final C11630kW A02;
    public final UserSession A03;

    public C124687ba(Context context, C121177En r2, C11630kW r3, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, r3);
        this.A03 = userSession;
        this.A02 = r3;
        this.A00 = context;
        this.A01 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A03;
        return new AnonymousClass57M(this.A01, new C107856hQ(userSession, this.A00), this.A02, userSession);
    }
}
