package X;

import android.view.View;
import java.util.Locale;

/* renamed from: X.7I7  reason: invalid class name */
public final class AnonymousClass7I7 {
    public static final int A00 = View.MeasureSpec.makeMeasureSpec(0, 0);

    public static boolean A01(int i, int i2) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int i3 = A00;
        if (mode == i3 && View.MeasureSpec.getMode(i2) == i3) {
            return true;
        }
        return false;
    }

    public static String A00(int i) {
        String str;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            str = "AT_MOST";
        } else if (mode == 1073741824) {
            str = I17.A00(159);
        } else if (mode == A00) {
            str = "UNSPECIFIED";
        } else {
            str = "INVALID";
        }
        return String.format(Locale.US, "[%d, %s]", new Object[]{Integer.valueOf(size), str});
    }

    public static boolean A02(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (i == i2) {
            return true;
        }
        int i4 = A00;
        if (mode2 == i4 && mode == i4) {
            return true;
        }
        float f = (float) i3;
        if (mode == 1073741824) {
            if (C86124wJ.A01((float) size, f) < 0.5f) {
                return true;
            }
        } else if (mode == Integer.MIN_VALUE && mode2 == i4 && ((float) size) >= f) {
            return true;
        }
        if (mode2 != Integer.MIN_VALUE || mode != Integer.MIN_VALUE || size2 <= size || f > ((float) size)) {
            return false;
        }
        return true;
    }
}
