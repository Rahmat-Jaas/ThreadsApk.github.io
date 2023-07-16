package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4M0  reason: invalid class name */
public final class AnonymousClass4M0 implements C27947Evx {
    public final int B8O(int i, int i2) {
        if (i2 != 2) {
            return (int) Math.floor(((double) (i2 + 1)) / 2.0d);
        }
        return 2;
    }

    public final Integer BJ0() {
        return AnonymousClass006.A00;
    }

    public final List B8Q(List list, Set set, int i, int i2) {
        Object obj;
        int max;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (set.size() == 2) {
            Iterator it = set.iterator();
            int A04 = AnonymousClass0wJ.A04(it.next());
            int A042 = AnonymousClass0wJ.A04(it.next());
            if (i == 0) {
                max = Math.min(A04, A042);
            } else {
                max = Math.max(A04, A042);
            }
            obj = Integer.valueOf(max);
        } else {
            if (!list.isEmpty()) {
                int i3 = i << 1;
                if (list.size() % 2 == 0) {
                    A0v.add(list.get(i3));
                    i3++;
                } else if (i == 0) {
                    i3 = 0;
                } else {
                    A0v.add(list.get(i3 - 1));
                }
                obj = list.get(i3);
            }
            return A0v;
        }
        A0v.add(obj);
        return A0v;
    }

    public final boolean BY4(C27947Evx evx) {
        return evx.getClass().equals(AnonymousClass4M0.class);
    }
}
