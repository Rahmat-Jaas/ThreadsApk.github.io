package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.74A  reason: invalid class name */
public final class AnonymousClass74A {
    public static Method A00;
    public static Method A01;
    public static boolean A02;

    public static void A00(Canvas canvas, boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            if (!A02) {
                try {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Class[].class});
                    Class<Canvas> cls = Canvas.class;
                    A01 = C86154wM.A0p("insertReorderBarrier", cls, declaredMethod);
                    Method A0p = C86154wM.A0p("insertInorderBarrier", cls, declaredMethod);
                    A00 = A0p;
                    Method method = A01;
                    if (!(method == null || A0p == null)) {
                        method.setAccessible(true);
                        A00.setAccessible(true);
                        A02 = true;
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            if (z) {
                try {
                    Method method2 = A01;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else {
                Method method3 = A00;
                if (method3 != null) {
                    method3.invoke(canvas, new Object[0]);
                }
            }
        } else if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
