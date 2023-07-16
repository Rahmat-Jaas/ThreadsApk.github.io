package X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.service.session.UserSession;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Rd  reason: invalid class name and case insensitive filesystem */
public final class C60933Rd {
    public static C58053Dq A00;
    public static final long A01 = C18210wN.A06();
    public static final long A02 = TimeUnit.SECONDS.toMillis(10);

    public static C32165H8c A00(QuickPromotionSlot quickPromotionSlot, UserSession userSession, Integer num, int i) {
        EnumMap enumMap = new EnumMap(QuickPromotionSurface.class);
        for (QuickPromotionSurface quickPromotionSurface : QuickPromotionSurface.values()) {
            EnumSet A002 = M5W.A00(quickPromotionSlot, quickPromotionSurface);
            if (!A002.isEmpty()) {
                enumMap.put(quickPromotionSurface, A002);
            }
        }
        C58053Dq r2 = A00;
        if (r2 == null) {
            r2 = new C58053Dq();
            A00 = r2;
        }
        H1T A003 = r2.A00((AnonymousClass3UU) null, userSession, num, enumMap, i);
        A003.A01 = new CY0(C18987Aon.A00, AnonymousClass3O1.class);
        return C18190wL.A0Q(A003);
    }
}
