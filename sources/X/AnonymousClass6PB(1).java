package X;

import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.Destination;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6PB  reason: invalid class name */
public final class AnonymousClass6PB {
    public static final List A00(Destination destination, UserSession userSession, List list) {
        AnonymousClass0TJ r2;
        long j;
        C04220Ms.A0B(list, 0);
        C04220Ms.A0B(userSession, 1);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) it.next();
            if (adsAPIInstagramPosition.ordinal() == 3) {
                int ordinal = destination.ordinal();
                if (ordinal == 1 || ordinal == 4) {
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325935741543766L;
                } else if (ordinal == 2) {
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325935741412692L;
                }
                if (!C63803iN.A0E(r2, userSession, j)) {
                }
            }
            A0v.add(adsAPIInstagramPosition);
        }
        return A0v;
    }
}
