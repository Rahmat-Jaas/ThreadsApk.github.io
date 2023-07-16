package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fi  reason: invalid class name and case insensitive filesystem */
public final class C09560fi {
    public static boolean A03(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static Object A00(C41836MeS meS, List list) {
        Object obj;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            obj = list.get(size);
        } while (!meS.apply(obj));
        return obj;
    }

    public static Object A01(List list) {
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public static List A02(C41836MeS meS, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object next : list) {
            if (meS.apply(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
