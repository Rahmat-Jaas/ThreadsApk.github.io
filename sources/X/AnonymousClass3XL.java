package X;

import android.os.Build;
import android.util.Pair;

/* renamed from: X.3XL  reason: invalid class name */
public final class AnonymousClass3XL {
    public static Boolean A00;
    public static final int[] A01 = {720, 640, 400};

    public static Pair A00(int i, int i2, int i3) {
        float f = (((float) i2) * 1.0f) / ((float) i3);
        if (A01()) {
            int i4 = Integer.MAX_VALUE;
            int i5 = i;
            for (int i6 : A01) {
                int i7 = i - i6;
                if (Math.abs(i7) < i4) {
                    i4 = Math.abs(i7);
                    i5 = i6;
                }
            }
            i = i5;
        }
        int round = Math.round(((float) i) / 16.0f) << 4;
        return C18220wO.A0H(Integer.valueOf(round), Math.round((((float) round) / f) / 16.0f) << 4);
    }

    public static boolean A01() {
        boolean z = true;
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18297346659975883L)) {
            return true;
        }
        Boolean bool = A00;
        if (bool == null) {
            String str = Build.MODEL;
            if (!str.contains("XT1049") && !str.contains("XT1050") && !str.contains("XT1052") && !str.contains("XT1053") && !str.contains("XT1055") && !str.contains("XT1056") && !str.contains("XT1058") && !str.contains("XT1060")) {
                z = false;
            }
            bool = Boolean.valueOf(z);
            A00 = bool;
        }
        return bool.booleanValue();
    }
}
