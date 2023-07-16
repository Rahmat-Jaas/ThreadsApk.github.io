package X;

import android.graphics.Paint;
import android.os.Build;

/* renamed from: X.6Eb  reason: invalid class name */
public final class AnonymousClass6Eb {
    public static final void A00(int i, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            C98116Eg.A00(i, paint);
        } else {
            C86144wL.A18(paint, C41034Luz.A01(i));
        }
    }
}
