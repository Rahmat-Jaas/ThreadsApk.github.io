package X;

import com.instagram.api.schemas.CallToAction;
import com.instagram.api.schemas.Destination;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bq  reason: invalid class name and case insensitive filesystem */
public final class C124847bq implements C147138nS {
    public final CallToAction A00;
    public final Destination A01;
    public final C37741K2b A02;
    public final AnonymousClass6PJ A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public /* synthetic */ C124847bq(CallToAction callToAction, Destination destination, C37741K2b k2b, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        AnonymousClass6PJ r1 = new AnonymousClass6PJ();
        C04220Ms.A0B(userSession, 1);
        C18190wL.A1S(destination, 3, callToAction);
        this.A04 = userSession;
        this.A05 = str;
        this.A01 = destination;
        this.A06 = str2;
        this.A00 = callToAction;
        this.A08 = z;
        this.A07 = z2;
        this.A02 = k2b;
        this.A03 = r1;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A04;
        String str = this.A05;
        Destination destination = this.A01;
        String str2 = this.A06;
        return new C881857b(this.A00, destination, this.A02, this.A03, userSession, str, str2, this.A08, this.A07);
    }
}
