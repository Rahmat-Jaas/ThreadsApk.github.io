package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xh  reason: invalid class name and case insensitive filesystem */
public final class C66493xh implements C147138nS {
    public final IGRevShareProductType A00;
    public final UserSession A01;
    public final String A02;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        int i;
        AnonymousClass0TJ r2;
        long j;
        UserSession userSession = this.A01;
        C559035a r5 = new C559035a(userSession);
        boolean A1W = AnonymousClass0wJ.A1W(this.A02);
        IGRevShareProductType iGRevShareProductType = this.A00;
        int ordinal = iGRevShareProductType.ordinal();
        if (ordinal != 2) {
            if (ordinal == 1) {
                r2 = AnonymousClass0TJ.A05;
                j = 36600040555613594L;
            }
            i = -1;
            return new AnonymousClass10M(iGRevShareProductType, r5, userSession, AnonymousClass0wJ.A04(i));
        }
        if (!A1W) {
            r2 = AnonymousClass0TJ.A05;
            j = 36601389175869104L;
        }
        i = -1;
        return new AnonymousClass10M(iGRevShareProductType, r5, userSession, AnonymousClass0wJ.A04(i));
        i = C63803iN.A07(r2, userSession, j);
        return new AnonymousClass10M(iGRevShareProductType, r5, userSession, AnonymousClass0wJ.A04(i));
    }

    public C66493xh(IGRevShareProductType iGRevShareProductType, UserSession userSession, String str) {
        AnonymousClass0wJ.A1P(userSession, iGRevShareProductType);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = iGRevShareProductType;
    }
}
