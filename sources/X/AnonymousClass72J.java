package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.72J  reason: invalid class name */
public final class AnonymousClass72J {
    public static Method A00;

    static {
        Class<Rect> cls = Rect.class;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            A00 = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                A00.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }
}
