package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: X.6O6  reason: invalid class name */
public final class AnonymousClass6O6 {
    public static void A00(Context context) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                for (Field field : inputMethodManager.getClass().getDeclaredFields()) {
                    try {
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                        Object obj = field.get(inputMethodManager);
                        if ((obj instanceof View) && ((View) obj).getContext() == context) {
                            field.set(inputMethodManager, (Object) null);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
