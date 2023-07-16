package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2St  reason: invalid class name and case insensitive filesystem */
public final class C36812St {
    public static final void A00(C963064g r29, String str, AnonymousClass0YP r31) {
        Long l;
        C28221tt r3;
        long j;
        Long l2;
        C963064g r15 = r29;
        String str2 = str;
        boolean A1Y = AnonymousClass0wJ.A1Y(str2, r15);
        for (QuickPromotionSurface quickPromotionSurface : QuickPromotionSurface.values()) {
            List<C57833Cq> A00 = r15.A00(quickPromotionSurface);
            if (A00 != null) {
                ArrayList A0w = AnonymousClass0wJ.A0w(A00);
                for (C57833Cq r4 : A00) {
                    C04220Ms.A04(r4);
                    AnonymousClass3GI r12 = r4.A02;
                    C04220Ms.A06(r12);
                    C568038p r11 = r4.A01;
                    if (r11 != null) {
                        l = r11.A00;
                    } else {
                        l = null;
                    }
                    Long A0V = C18210wN.A0V();
                    if (l == null) {
                        l = A0V;
                    }
                    long longValue = l.longValue();
                    if (!(r11 == null || (l2 = r11.A01) == null)) {
                        A0V = l2;
                    }
                    long longValue2 = A0V.longValue();
                    Long l3 = r4.A03;
                    List list = r12.A06;
                    if (list == null || (r3 = (C28221tt) list.get(A1Y ? 1 : 0)) == null) {
                        throw new IOException("Unexpected null creatives");
                    }
                    C62303Ye A002 = AnonymousClass3XY.A00(AnonymousClass3XY.A01(), str2, r12.A05);
                    if (A002 == null) {
                        A002 = new C62303Ye(str2, r12.A05, longValue);
                        AnonymousClass3XY.A01().A01.A01(A002);
                    }
                    AnonymousClass3GI r13 = r4.A02;
                    if (l3 != null) {
                        j = l3.longValue();
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    C28221tt r18 = r3;
                    QuickPromotionSurface quickPromotionSurface2 = quickPromotionSurface;
                    A0w.add(new AnonymousClass18L(C36802Ss.A00(quickPromotionSurface2, r18, r13, A002, str2, r4.A00, longValue2, longValue, j, r4.A05, r4.A04)));
                }
                r31.invoke(quickPromotionSurface, A0w);
            }
        }
    }
}
