package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;

/* renamed from: X.2Ss  reason: invalid class name and case insensitive filesystem */
public final class C36802Ss {
    public static C28291u0 A00(QuickPromotionSurface quickPromotionSurface, C28221tt r3, AnonymousClass3GI r4, C62303Ye r5, String str, int i, long j, long j2, long j3, boolean z, boolean z2) {
        int ordinal = quickPromotionSurface.ordinal();
        if (ordinal == 1) {
            return new C28281tz(quickPromotionSurface, r3, r4, r5, str, i, j, j2, j3, z, z2);
        }
        if (ordinal == 0 || ordinal == 10) {
            return new C28271ty(quickPromotionSurface, r3, r4, r5, str, i, j, j2, j3, z, z2);
        }
        if (ordinal != 2) {
            return new C28291u0(quickPromotionSurface, r3, r4, r5, str, i, j, j2, j3, z, z2);
        }
        return new C28261tx(quickPromotionSurface, r3, r4, r5, str, i, j, j2, j3, z, z2);
    }
}
