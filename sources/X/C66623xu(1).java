package X;

import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xu  reason: invalid class name and case insensitive filesystem */
public final class C66623xu implements C147138nS {
    public final long A00;
    public final C21281Qc A01;
    public final UserSession A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;

    public C66623xu(C21281Qc r2, UserSession userSession, Integer num, String str, long j, boolean z) {
        C04220Ms.A0B(userSession, 2);
        this.A05 = z;
        this.A02 = userSession;
        this.A00 = j;
        this.A04 = str;
        this.A03 = num;
        this.A01 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        if (!this.A05) {
            return new AnonymousClass1f7(new C555533r(this.A02), this.A00);
        }
        UserSession userSession = this.A02;
        C555433q r5 = new C555433q(AnonymousClass2QB.A00(userSession));
        C695348z A002 = AnonymousClass2QA.A00(userSession);
        MonetizationRepository A003 = AnonymousClass2RN.A00(userSession);
        long j = this.A00;
        String str = this.A04;
        return new AnonymousClass1f8(this.A01, r5, A002, A003, AnonymousClass3WS.A01(userSession), userSession, this.A03, str, j);
    }
}
