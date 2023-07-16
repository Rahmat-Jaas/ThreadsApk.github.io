package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bT  reason: invalid class name and case insensitive filesystem */
public final class C124617bT implements C147138nS {
    public final Context A00;
    public final AnonymousClass06E A01;
    public final UserSession A02;

    public C124617bT(Context context, AnonymousClass06E r2, UserSession userSession) {
        AnonymousClass0wJ.A1O(context, userSession);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new F6t(this.A00, this.A01, this.A02);
    }
}
