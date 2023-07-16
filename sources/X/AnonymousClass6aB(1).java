package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.6aB  reason: invalid class name */
public final class AnonymousClass6aB {
    public static Method A00;
    public static Method A01;
    public static boolean A02;

    public static final void A00(Canvas canvas, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C98096Ee.A00(canvas, z);
            return;
        }
        if (!A02) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                Class<Canvas> cls = Canvas.class;
                A01 = C86154wM.A0p("insertReorderBarrier", cls, declaredMethod);
                A00 = C86154wM.A0p("insertInorderBarrier", cls, declaredMethod);
                Method method = A01;
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = A00;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            A02 = true;
        }
        if (z) {
            try {
                Method method3 = A01;
                if (method3 != null) {
                    method3.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        } else {
            Method method4 = A00;
            if (method4 != null) {
                method4.invoke(canvas, new Object[0]);
            }
        }
    }
}
