package X;

import java.util.Comparator;

/* renamed from: X.4TZ  reason: invalid class name */
public final class AnonymousClass4TZ implements Comparator {
    public static final AnonymousClass4TZ A00 = new AnonymousClass4TZ();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String A0N = ((C127397h3) obj).A0N(38);
        String A0N2 = ((C127397h3) obj2).A0N(38);
        if (!(A0N == null || A0N2 == null)) {
            if (A0N.equals("emphasized")) {
                return -1;
            }
            if (!A0N.equals("neutral") || A0N2.equals("emphasized")) {
                return 1;
            }
            return -1;
        }
        return 1;
    }
}
