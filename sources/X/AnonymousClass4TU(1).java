package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Comparator;

/* renamed from: X.4TU  reason: invalid class name */
public final class AnonymousClass4TU implements Comparator {
    public final QuickPromotionSurface A00;
    public final AnonymousClass39L A01;

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        C28291u0 r10 = (C28291u0) ((C81644o8) obj);
        C28291u0 r11 = (C28291u0) ((C81644o8) obj2);
        int i = r10.A01;
        int i2 = r11.A01;
        if (i == i2) {
            AnonymousClass39L r8 = this.A01;
            QuickPromotionSurface quickPromotionSurface = this.A00;
            QuickPromotionSurface quickPromotionSurface2 = r10.A06;
            QuickPromotionSurface quickPromotionSurface3 = r11.A06;
            QuickPromotionSurface[] quickPromotionSurfaceArr = r8.A01;
            int i3 = 0;
            while (true) {
                length = quickPromotionSurfaceArr.length;
                if (i3 < length) {
                    if (quickPromotionSurfaceArr[i3] == quickPromotionSurface2) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (quickPromotionSurfaceArr[i4] == quickPromotionSurface3) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    if (quickPromotionSurfaceArr[i5] == quickPromotionSurface) {
                        break;
                    }
                    i5++;
                } else {
                    i5 = -1;
                    break;
                }
            }
            int i6 = r8.A00;
            int i7 = i3 - i5;
            if (i5 >= i3) {
                i7 = i3 + (i6 - i5);
            }
            int i8 = i4 - i5;
            if (i5 >= i4) {
                i8 = i4 + (i6 - i5);
            }
            if (i7 == i8) {
                return 0;
            }
            if (i7 > i8) {
                return 1;
            }
            return -1;
        } else if (i < i2) {
            return -1;
        } else {
            return 1;
        }
    }

    public AnonymousClass4TU(QuickPromotionSurface quickPromotionSurface, AnonymousClass39L r4) {
        this.A01 = r4;
        this.A00 = quickPromotionSurface == null ? r4.A01[r4.A00 - 1] : quickPromotionSurface;
    }
}
