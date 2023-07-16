package X;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: X.6Fx  reason: invalid class name and case insensitive filesystem */
public final class C98526Fx {
    public static void A00(Canvas canvas, boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            throw C18180wK.A0a("This method doesn't work on Pie!");
        } else if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
