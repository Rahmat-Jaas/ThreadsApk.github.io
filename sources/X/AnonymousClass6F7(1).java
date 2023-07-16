package X;

import java.util.Arrays;

/* renamed from: X.6F7  reason: invalid class name */
public final class AnonymousClass6F7 {
    public static final String A00(Object obj) {
        String simpleName;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass()) {
            simpleName = cls.getName();
        } else {
            simpleName = cls.getSimpleName();
        }
        String format = String.format("%07x", Arrays.copyOf(C18210wN.A1X(System.identityHashCode(obj)), 1));
        C04220Ms.A06(format);
        return AnonymousClass00U.A0N(simpleName, format, '@');
    }
}
