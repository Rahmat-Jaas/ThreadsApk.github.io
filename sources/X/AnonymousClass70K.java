package X;

import java.util.List;

/* renamed from: X.70K  reason: invalid class name */
public final class AnonymousClass70K {
    public static String A00(Object obj) {
        if (obj instanceof Number) {
            return obj.toString();
        }
        return (String) obj;
    }

    public static String A01(List list, int i) {
        return A00(list.get(i));
    }
}
