package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Lz  reason: invalid class name and case insensitive filesystem */
public class C72064Lz implements C27947Evx {
    public int B8O(int i, int i2) {
        if (i2 != 2) {
            return (int) Math.floor(((double) (i2 + 1)) / 2.0d);
        }
        return 2;
    }

    public final Integer BJ0() {
        if (this instanceof C28991vw) {
            return AnonymousClass006.A0C;
        }
        return AnonymousClass006.A00;
    }

    public final boolean BY4(C27947Evx evx) {
        Object obj;
        boolean z = this instanceof C28991vw;
        Class<?> cls = evx.getClass();
        if (z) {
            obj = C28991vw.class;
        } else {
            obj = C72064Lz.class;
        }
        return cls.equals(obj);
    }

    public List B8Q(List list, Set set, int i, int i2) {
        Object obj;
        int min;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (set.size() == 2) {
            Iterator it = set.iterator();
            int A04 = AnonymousClass0wJ.A04(it.next());
            int A042 = AnonymousClass0wJ.A04(it.next());
            if (i == 0) {
                min = Math.max(A04, A042);
            } else {
                min = Math.min(A04, A042);
            }
            obj = Integer.valueOf(min);
        } else {
            if (!list.isEmpty()) {
                int B8O = ((B8O(i2, set.size()) - 1) - i) << 1;
                A0v.add(list.get(B8O));
                int i3 = B8O + 1;
                if (i3 < list.size()) {
                    obj = list.get(i3);
                }
            }
            return A0v;
        }
        A0v.add(obj);
        return A0v;
    }
}
