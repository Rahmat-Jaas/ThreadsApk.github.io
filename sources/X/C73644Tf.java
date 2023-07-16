package X;

import java.util.Comparator;

/* renamed from: X.4Tf  reason: invalid class name and case insensitive filesystem */
public final class C73644Tf implements Comparator {
    public static final C73644Tf A00 = new C73644Tf();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        AnonymousClass0wJ.A1N(comparable, obj2);
        return comparable.compareTo(obj2);
    }

    public final Comparator reversed() {
        return C73654Tg.A00;
    }
}
