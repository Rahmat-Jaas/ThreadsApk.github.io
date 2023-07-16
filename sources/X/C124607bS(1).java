package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape4S0210000_I2;

/* renamed from: X.7bS  reason: invalid class name and case insensitive filesystem */
public final class C124607bS implements C147138nS {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;

    public C124607bS(UserSession userSession, Context context, boolean z) {
        AnonymousClass0wJ.A1O(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = z;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        if (cls.isAssignableFrom(CBN.class)) {
            Context A09 = C18230wP.A09(this.A00);
            UserSession userSession = this.A01;
            boolean z = this.A02;
            C24949Dck dck = (C24949Dck) userSession.A01(C24949Dck.class, new KtLambdaShape4S0210000_I2(13, A09, userSession, z));
            dck.A00 = z;
            return new CBN(dck, userSession);
        }
        throw C18190wL.A0a(AnonymousClass0wJ.A0t("Unknown ViewModel class: ", cls));
    }
}
