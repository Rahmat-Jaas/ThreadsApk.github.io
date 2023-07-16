package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7bX  reason: invalid class name and case insensitive filesystem */
public final class C124657bX implements C147138nS {
    public final Context A00;
    public final AnonymousClass06E A01;
    public final UserSession A02;
    public final List A03;

    public C124657bX(Context context, AnonymousClass06E r2, UserSession userSession, List list) {
        AnonymousClass0wJ.A1O(context, userSession);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = list;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new F6u(this.A00, this.A01, this.A02, this.A03);
    }
}
