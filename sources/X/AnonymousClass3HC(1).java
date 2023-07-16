package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.service.session.UserSession;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.3HC  reason: invalid class name */
public final class AnonymousClass3HC {
    public final QuickPromotionSurface A00;
    public final Map A01 = new EnumMap(Trigger.class);
    public final UserSession A02;

    public AnonymousClass3HC(QuickPromotionSurface quickPromotionSurface, UserSession userSession) {
        C04220Ms.A0B(quickPromotionSurface, 2);
        this.A02 = userSession;
        this.A00 = quickPromotionSurface;
    }

    public final int A00(Trigger trigger) {
        C04220Ms.A0B(trigger, 0);
        C61263Sn A012 = A01(trigger);
        if (A012 == null || A012.A02.A02) {
            return 3;
        }
        long j = A012.A00;
        if (-1 == j) {
            return 0;
        }
        if (j + C61263Sn.A03 <= System.currentTimeMillis()) {
            return 2;
        }
        return 1;
    }

    public final C61263Sn A01(Trigger trigger) {
        if (trigger.A02) {
            C10450iM.A03("IG-QP", "Stored data was requested for a trigger that can't be prefetched.");
            return null;
        }
        Map map = this.A01;
        if (map.get(trigger) == null) {
            map.put(trigger, new C61263Sn(trigger));
        }
        Object obj = map.get(trigger);
        if (obj != null) {
            return (C61263Sn) obj;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
