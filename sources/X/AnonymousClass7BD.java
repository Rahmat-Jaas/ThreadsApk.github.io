package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7BD  reason: invalid class name */
public final class AnonymousClass7BD {
    public static final List A02(Object obj, List list, AnonymousClass0YP r7, int i) {
        C04220Ms.A0B(r7, 2);
        ArrayList A0s = C18200wM.A0s(list);
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AnonymousClass0wJ.A1X(r7.invoke(it.next(), obj))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i > list.size()) {
            i = 0;
        }
        if (i2 != -1) {
            A0s.set(i2, obj);
        } else {
            A0s.add(i, obj);
        }
        return AnonymousClass00J.A0N(A0s);
    }

    public static final List A00(Object obj, List list, AnonymousClass0YY r8, AnonymousClass0YP r9) {
        ArrayList A0s = C18200wM.A0s(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AnonymousClass0wJ.A1X(r8.invoke(next))) {
                if (next != null) {
                    Iterator it2 = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (!AnonymousClass0wJ.A1X(r9.invoke(it2.next(), next))) {
                            i++;
                        } else if (i != -1) {
                            A0s.set(i, obj);
                        }
                    }
                    throw C18180wK.A0a("Check failed.");
                }
            }
        }
        return AnonymousClass00J.A0N(A0s);
    }

    public static final List A01(Object obj, List list, AnonymousClass0YP r7) {
        ArrayList A0s = C18200wM.A0s(list);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!AnonymousClass0wJ.A1X(r7.invoke(it.next(), obj))) {
                i++;
            } else if (i != -1) {
                A0s.remove(i);
            }
        }
        return AnonymousClass00J.A0N(A0s);
    }
}
