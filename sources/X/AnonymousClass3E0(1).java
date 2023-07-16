package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.3E0  reason: invalid class name */
public final class AnonymousClass3E0 {
    public final List A00(Set set) {
        C04220Ms.A0B(set, 0);
        List list = C60983Rj.A03;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            if (set.contains(((C62273Yb) next).A04)) {
                A0v.add(next);
            }
        }
        return A0v;
    }
}
