package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.forker.Process;

/* renamed from: X.8bA  reason: invalid class name */
public final class AnonymousClass8bA extends C102606Vv {
    public static int A01(float f) {
        return A02((float) Math.ceil((double) f));
    }

    public static int A03(float f, float f2) {
        return A02(f * f2);
    }

    public static void A05(RectF rectF, Drawable drawable, float f, float f2, float f3) {
        drawable.setBounds(A02(f - f2), A02(rectF.top - f3), A02(rectF.right + f3), A02(rectF.bottom + f3));
    }

    public static final int A00(double d) {
        if (Double.isNaN(d)) {
            throw C18190wL.A0a("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Process.WAIT_RESULT_TIMEOUT;
            }
            return (int) Math.round(d);
        }
    }

    public static final int A02(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw C18190wL.A0a("Cannot round NaN value.");
    }

    public static final long A04(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw C18190wL.A0a("Cannot round NaN value.");
    }
}
