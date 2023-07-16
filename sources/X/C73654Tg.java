package X;

import java.util.Comparator;

/* renamed from: X.4Tg  reason: invalid class name and case insensitive filesystem */
public final class C73654Tg implements Comparator {
    public static final C73654Tg A00 = new C73654Tg();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        AnonymousClass0wJ.A1N(obj, comparable);
        return comparable.compareTo(obj);
    }

    public final Comparator reversed() {
        return C73644Tf.A00;
    }
}
