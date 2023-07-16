package X;

import android.app.Application;
import com.instagram.service.session.UserSession;

/* renamed from: X.10l  reason: invalid class name and case insensitive filesystem */
public final class C195910l extends C884358b {
    public final Application A00;
    public final AnonymousClass49Y A01;
    public final AnonymousClass24S A02;
    public final AnonymousClass49W A03;
    public final AnonymousClass20y A04;
    public final UserSession A05;
    public final Integer A06;

    public final C62793ak create(Class cls) {
        AnonymousClass20y r5 = this.A04;
        int ordinal = r5.ordinal();
        if (ordinal == 1) {
            UserSession userSession = this.A05;
            return new C25651ob(this.A00, this.A01, this.A02, r5, userSession, this.A06);
        } else if (ordinal == 0) {
            UserSession userSession2 = this.A05;
            return new C25641oa(this.A00, this.A01, this.A02, this.A03, r5, userSession2, this.A06);
        } else {
            throw AnonymousClass4VZ.A00();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C195910l(Application application, AnonymousClass49Y r3, AnonymousClass24S r4, AnonymousClass49W r5, AnonymousClass20y r6, UserSession userSession, Integer num) {
        super(application);
        AnonymousClass0wJ.A1Q(userSession, r3);
        C18180wK.A1R(r5, r6);
        C04220Ms.A0B(r4, 6);
        this.A00 = application;
        this.A05 = userSession;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A06 = num;
    }
}
