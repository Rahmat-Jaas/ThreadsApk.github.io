package X;

import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.List;

/* renamed from: X.0fj  reason: invalid class name and case insensitive filesystem */
public final class C09570fj {
    public static final BackgroundGradientColors A00(C11380k0 r2) {
        if (r2 == null) {
            return null;
        }
        List list = r2.A01;
        return new BackgroundGradientColors(((Number) list.get(0)).intValue(), ((Number) list.get(list.size() - 1)).intValue());
    }

    public static final C11380k0 A01(BackgroundGradientColors backgroundGradientColors, int i) {
        if (backgroundGradientColors == null) {
            return null;
        }
        int i2 = 0;
        List A17 = C06750aI.A17(Integer.valueOf(backgroundGradientColors.A01), Integer.valueOf(backgroundGradientColors.A00));
        if (i % 180 != 0) {
            i2 = 1;
        }
        return new C11380k0(A17, i2);
    }
}
