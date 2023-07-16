package X;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.733  reason: invalid class name */
public final class AnonymousClass733 {
    public static Field A00;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mKeyedTags");
            A00 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }
}
