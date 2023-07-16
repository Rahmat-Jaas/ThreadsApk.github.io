package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.77i  reason: invalid class name and case insensitive filesystem */
public final class C1198577i {
    public final List A00 = AnonymousClass0wJ.A0v();
    public final Map A01 = AnonymousClass0wJ.A0y();

    public final synchronized void A01(String str, Object obj) {
        Map map;
        if (obj == null) {
            map = this.A01;
            if (!map.containsKey(str)) {
            }
        } else {
            map = this.A01;
            if (obj.equals(map.get(str))) {
            }
        }
        map.put(str, obj);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C109306jn r1 = (C109306jn) it.next();
            AnonymousClass7HV r2 = (AnonymousClass7HV) r1.A01.get();
            if (r1.A00.A00 || r2 == null) {
                it.remove();
            } else {
                Set set = (Set) r1.A02.get(str);
                if (set != null) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        r2.A0B(C18180wK.A0k(it2), obj);
                    }
                }
            }
        }
    }

    public static C108136hs A00(AnonymousClass7HV r5, C1198577i r6, Object obj, String str, String str2) {
        C109306jn r3;
        List list = r6.A00;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                r3 = new C109306jn(r5);
                list.add(r3);
                break;
            }
            r3 = (C109306jn) it.next();
            Object obj2 = r3.A01.get();
            if (r3.A00.A00 || obj2 == null) {
                it.remove();
            } else if (obj2 == r5) {
                break;
            }
        }
        Map map = r3.A02;
        Set set = (Set) map.get(str);
        HashSet hashSet = set;
        if (set == null) {
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(str2);
            map.put(str, hashSet2);
            hashSet = hashSet2;
        }
        hashSet.add(str2);
        return new C108136hs(r3.A00, obj);
    }
}
