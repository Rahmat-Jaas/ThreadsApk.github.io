package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.List;

/* renamed from: X.64g  reason: invalid class name and case insensitive filesystem */
public final class C963064g extends AnonymousClass1UE {
    public String A00;
    public List A01;
    public List A02;

    public final List A00(QuickPromotionSurface quickPromotionSurface) {
        C106396ey r0;
        C560035k r02;
        List<C108356iE> list = this.A02;
        List list2 = null;
        if (list != null) {
            for (C108356iE r3 : list) {
                if (quickPromotionSurface.A00 == r3.A01.intValue()) {
                    C106386ex r03 = r3.A00;
                    if (r03 == null || (r0 = r03.A00) == null || (r02 = r0.A00) == null || (list2 = r02.A00) == null) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        break;
                    }
                }
            }
        }
        return list2;
    }
}
