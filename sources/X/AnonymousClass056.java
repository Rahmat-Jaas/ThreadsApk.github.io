package X;

import java.lang.reflect.Field;

/* renamed from: X.056  reason: invalid class name */
public final class AnonymousClass056 {
    public static boolean A00(C12560m7 r3) {
        if (!(r3 instanceof AnonymousClass0RX)) {
            return false;
        }
        try {
            Field declaredField = C12560m7.class.getDeclaredField("mExecutingActions");
            declaredField.setAccessible(true);
            return ((Boolean) declaredField.get(r3)).booleanValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    public static boolean A01(C12560m7 r2) {
        if (!(r2 instanceof AnonymousClass0RX) || r2.A15() || r2.A0F) {
            return false;
        }
        return true;
    }
}
