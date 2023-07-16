package X;

import android.content.Context;
import com.facebook.redex.IDxProviderShape63S0300000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.85c  reason: invalid class name and case insensitive filesystem */
public final class C1369385c implements C04560Oe {
    public final Context A00;
    public final UserSession A01;
    public final C04560Oe A02;
    public final C04560Oe A03;
    public final C04560Oe A04;

    public final /* bridge */ /* synthetic */ Object get() {
        C04560Oe r3 = this.A03;
        UserSession userSession = this.A01;
        C108226i1 r1 = new C108226i1(userSession);
        C121157Ek r8 = new C121157Ek(AnonymousClass7Kz.A09(), (C104996ci) r3.get(), r1);
        C128897kY r10 = new C128897kY(userSession);
        C109396jw r13 = new C109396jw(r10, userSession);
        r3.get();
        C107096g8 r12 = new C107096g8(r13);
        Context context = this.A00;
        AnonymousClass7IP r5 = new AnonymousClass7IP(r12, r10, new C106076eS(context));
        return new C1203379t(context, r5, r5, (C1193474t) this.A02.get(), r8, (C113376rI) this.A04.get(), r10, AnonymousClass7Kz.A09(), (C104996ci) r3.get(), r13, (C125627dd) new IDxProviderShape63S0300000_2_I2(context, userSession, r3, 1).get());
    }

    public C1369385c(Context context, UserSession userSession, C04560Oe r3, C04560Oe r4, C04560Oe r5) {
        this.A00 = context;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = userSession;
        this.A02 = r5;
    }
}
