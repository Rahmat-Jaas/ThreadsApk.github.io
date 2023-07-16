package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3w5  reason: invalid class name and case insensitive filesystem */
public final class C65853w5 implements C146078lb {
    public final Map A00;
    public final Map A01;
    public final AnonymousClass0YY A02;

    public final Object AEF(String str) {
        Map map = this.A01;
        List list = (List) map.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            map.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    public final boolean ABk(Object obj) {
        return AnonymousClass0wJ.A1X(this.A02.invoke(obj));
    }

    public final Map CWd() {
        ArrayList A0k;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.A01);
        Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object key = A0o.getKey();
            List list = (List) A0o.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object invoke = ((AnonymousClass0ZU) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (ABk(invoke)) {
                    A0k = C06750aI.A14(invoke);
                } else {
                    throw C18180wK.A0a("Check failed.");
                }
            } else {
                int size = list.size();
                A0k = C18240wQ.A0k(size);
                while (i < size) {
                    Object invoke2 = ((AnonymousClass0ZU) list.get(i)).invoke();
                    if (invoke2 == null || ABk(invoke2)) {
                        A0k.add(invoke2);
                        i++;
                    } else {
                        throw C18180wK.A0a("Check failed.");
                    }
                }
            }
            linkedHashMap.put(key, A0k);
        }
        return linkedHashMap;
    }

    public C65853w5(Map map, AnonymousClass0YY r3) {
        LinkedHashMap A0y;
        this.A02 = r3;
        if (map != null) {
            A0y = new LinkedHashMap(map);
        } else {
            A0y = C18220wO.A0y();
        }
        this.A01 = A0y;
        this.A00 = C18220wO.A0y();
    }

    public final C142858fi CaL(String str, AnonymousClass0ZU r4) {
        AnonymousClass0wJ.A1N(str, r4);
        if (!AnonymousClass8bQ.A0n(str)) {
            Map map = this.A00;
            Object obj = map.get(str);
            if (obj == null) {
                obj = AnonymousClass0wJ.A0v();
                map.put(str, obj);
            }
            ((List) obj).add(r4);
            return new C65843w4(this, str, r4);
        }
        throw C18190wL.A0a("Registered key is empty or blank");
    }
}
