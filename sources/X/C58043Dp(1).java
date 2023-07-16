package X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Dp  reason: invalid class name and case insensitive filesystem */
public final class C58043Dp {
    public final C62083Xb A00(AnonymousClass1UI r14) {
        Long l;
        Map map;
        Long l2;
        Map map2;
        if (r14 == null || (r14.A03 == null && r14.A04 == null)) {
            return new C62083Xb();
        }
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Long l3 = r14.A01;
            C04220Ms.A06(l3);
            long millis = timeUnit.toMillis(l3.longValue());
            Long valueOf = Long.valueOf(millis);
            long j = C62083Xb.A03;
            if (valueOf != null) {
                j = millis;
            }
            List<C567938o> list = r14.A04;
            if (list == null) {
                map = AnonymousClass4To.A00();
            } else {
                HashMap A0y = AnonymousClass0wJ.A0y();
                for (C567938o r5 : list) {
                    Integer num = r5.A00;
                    C04220Ms.A06(num);
                    QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) C18200wM.A0f(QuickPromotionSurface.A02, num.intValue());
                    if (!(quickPromotionSurface == null || (l = r5.A01) == null)) {
                        A0y.put(quickPromotionSurface, Long.valueOf(timeUnit.toMillis(l.longValue())));
                    }
                }
                map = A0y;
            }
            List<C567838n> list2 = r14.A03;
            if (list2 == null) {
                map2 = AnonymousClass4To.A00();
            } else {
                HashMap A0y2 = AnonymousClass0wJ.A0y();
                HashMap A0y3 = AnonymousClass0wJ.A0y();
                for (QuickPromotionSlot quickPromotionSlot : QuickPromotionSlot.values()) {
                    A0y3.put(C18190wL.A0r(Locale.ROOT, quickPromotionSlot.name()), quickPromotionSlot);
                }
                for (C567838n r1 : list2) {
                    Object obj = A0y3.get(r1.A01);
                    if (!(obj == null || (l2 = r1.A00) == null)) {
                        A0y2.put(obj, Long.valueOf(timeUnit.toMillis(l2.longValue())));
                    }
                }
                map2 = A0y2;
            }
            return new C62083Xb(map2, map, j);
        } catch (Exception e) {
            C10450iM.A06("IG-QP", "Failed parsing cooldown rules", e);
            return new C62083Xb();
        }
    }
}
