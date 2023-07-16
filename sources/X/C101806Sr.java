package X;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.6Sr  reason: invalid class name and case insensitive filesystem */
public final class C101806Sr {
    public static final void A00(DisplayMetrics displayMetrics, int[] iArr, int i, int i2) {
        C04220Ms.A0B(displayMetrics, 2);
        int i3 = displayMetrics.widthPixels;
        int A02 = AnonymousClass8bA.A02(TypedValue.applyDimension(1, (float) 2, displayMetrics));
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size);
        } else if (mode == 1073741824) {
            i3 = size;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            A02 = Math.min(A02, size2);
        } else if (mode2 == 1073741824) {
            A02 = size2;
        }
        iArr[0] = i3;
        iArr[1] = A02;
    }
}
