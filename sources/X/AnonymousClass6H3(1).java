package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.6H3  reason: invalid class name */
public final class AnonymousClass6H3 {
    public static final void A00(Drawable drawable, float f) {
        drawable.setLevel(AnonymousClass8bA.A03(f, (float) 10000));
        boolean z = false;
        if (drawable.getLevel() <= 9990) {
            z = true;
        }
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (z) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }
}
