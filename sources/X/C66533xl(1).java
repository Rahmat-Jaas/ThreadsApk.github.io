package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3xl  reason: invalid class name and case insensitive filesystem */
public final class C66533xl implements C147138nS {
    public final int A00;
    public final AnonymousClass20y A01;
    public final UserSession A02;
    public final C305421t A03;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C62793ak r3;
        AnonymousClass20y r32 = this.A01;
        int ordinal = r32.ordinal();
        if (ordinal == 1) {
            C305421t r1 = this.A03;
            if (r1 != null) {
                if (r1 == C305421t.JoinWaitlist) {
                    UserSession userSession = this.A02;
                    return new AnonymousClass1oX(userSession, AnonymousClass0wJ.A0Y(userSession), this.A00);
                } else if (r1 == C305421t.WaitlistPending) {
                    UserSession userSession2 = this.A02;
                    return new AnonymousClass1oY(userSession2, AnonymousClass0wJ.A0Y(userSession2), this.A00);
                }
            }
            UserSession userSession3 = this.A02;
            return new C25681oe(userSession3, AnonymousClass0wJ.A0Y(userSession3), this.A00);
        } else if (ordinal == 0) {
            UserSession userSession4 = this.A02;
            boolean z = AnonymousClass3Zs.A03(userSession4).A01(D2R.A0q).getBoolean(AnonymousClass3MD.A00(r32), false);
            User A0Y = AnonymousClass0wJ.A0Y(userSession4);
            int i = this.A00;
            if (z) {
                r3 = new C25671od(userSession4, A0Y, i);
            } else {
                r3 = new C25661oc(userSession4, A0Y, i);
            }
            C04220Ms.A0C(r3, "null cannot be cast to non-null type T of com.instagram.direct.fragment.channels.ViewModelFactory.create");
            return r3;
        } else {
            throw AnonymousClass4VZ.A00();
        }
    }

    public C66533xl(C305421t r1, AnonymousClass20y r2, UserSession userSession, int i) {
        AnonymousClass0wJ.A1O(r2, userSession);
        this.A01 = r2;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = r1;
    }
}
