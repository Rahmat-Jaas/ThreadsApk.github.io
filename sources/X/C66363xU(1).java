package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xU  reason: invalid class name and case insensitive filesystem */
public final class C66363xU implements C147138nS {
    public final IGRevShareProductType A00;
    public final UserSession A01;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserMonetizationProductType userMonetizationProductType;
        C1195275r r6;
        IGRevShareProductType iGRevShareProductType = this.A00;
        int ordinal = iGRevShareProductType.ordinal();
        if (ordinal == 1) {
            userMonetizationProductType = UserMonetizationProductType.REELS_OVERLAY_ADS;
        } else if (ordinal != 2) {
            userMonetizationProductType = UserMonetizationProductType.UNRECOGNIZED;
        } else {
            userMonetizationProductType = UserMonetizationProductType.REVSHARE;
        }
        UserSession userSession = this.A01;
        MonetizationRepository A002 = AnonymousClass2RN.A00(userSession);
        synchronized (C1195275r.A02) {
            C04220Ms.A0B(userMonetizationProductType, 1);
            r6 = new C1195275r(userSession);
        }
        AnonymousClass77T r5 = (AnonymousClass77T) userSession.A00(AnonymousClass77T.class);
        if (r5 == null) {
            r5 = new AnonymousClass77T(userSession);
        }
        return new CA6(iGRevShareProductType, userMonetizationProductType, A002, r5, r6, userSession);
    }

    public C66363xU(IGRevShareProductType iGRevShareProductType, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, iGRevShareProductType);
        this.A01 = userSession;
        this.A00 = iGRevShareProductType;
    }
}
