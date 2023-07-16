package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3b8  reason: invalid class name and case insensitive filesystem */
public final class C62913b8 {
    public static final boolean A00(MonetizationRepository monetizationRepository) {
        C04220Ms.A0B(monetizationRepository, 0);
        return monetizationRepository.A05(UserMonetizationProductType.FAN_CLUB_CREATOR);
    }

    public static final boolean A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C84624tY A0I = AnonymousClass0wJ.A0Y(userSession).A0I();
        if (A0I == null || A0I.AhE() == null || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36320055931246245L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C84624tY A0I = AnonymousClass0wJ.A0Y(userSession).A0I();
        if (A0I == null || A0I.AhE() == null || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36323672294039542L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C84624tY A0I = AnonymousClass0wJ.A0Y(userSession).A0I();
        if (A0I == null || A0I.AhE() == null || !C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36320055931246245L)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C84624tY A0I = AnonymousClass0wJ.A0Y(userSession).A0I();
        if (A0I == null || A0I.AhE() == null || !C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36323672294105079L)) {
            return false;
        }
        return true;
    }
}
