package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.00p  reason: invalid class name and case insensitive filesystem */
public class C001300p extends AnonymousClass01O {
    public static final void A0x(List list) {
        C04220Ms.A0B(list, 0);
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void A0y(List list, Comparator comparator) {
        C04220Ms.A0B(list, 0);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
