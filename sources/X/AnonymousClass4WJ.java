package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* renamed from: X.4WJ  reason: invalid class name */
public class AnonymousClass4WJ extends AnonymousClass4WK {
    public static final Object A07(Object obj, Map map) {
        C04220Ms.A0B(map, 0);
        if (map instanceof C73714Tp) {
            C73714Tp r3 = (C73714Tp) map;
            Map map2 = r3.A00;
            Object obj2 = map2.get(obj);
            if (obj2 != null || map2.containsKey(obj)) {
                return obj2;
            }
            return r3.A01.invoke(obj);
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        StringBuilder A0s = C18190wL.A0s("Key ");
        A0s.append(obj);
        throw new NoSuchElementException(C18180wK.A0i(" is missing in the map.", A0s));
    }

    public static final HashMap A09(Pair... pairArr) {
        HashMap hashMap = new HashMap(AnonymousClass4WK.A0N(pairArr.length));
        A0K(hashMap, pairArr);
        return hashMap;
    }

    public static final Map A0B(Iterable iterable) {
        Object next;
        C04220Ms.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return AnonymousClass4To.A00();
            }
            if (size != 1) {
                LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(collection.size()));
                A0J(iterable, A0v);
                return A0v;
            }
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                next = iterable.iterator().next();
            }
            return AnonymousClass4WK.A0O((Pair) next);
        }
        LinkedHashMap A0y = C18220wO.A0y();
        A0J(iterable, A0y);
        return A0D(A0y);
    }

    public static final Map A0C(Object obj, Map map) {
        C04220Ms.A0B(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return A0D(linkedHashMap);
    }

    public static final Map A0F(Map map, Pair pair) {
        C04220Ms.A0B(map, 0);
        if (map.isEmpty()) {
            return AnonymousClass4WK.A0O(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.A00, pair.A01);
        return linkedHashMap;
    }

    public static final Map A0H(Pair... pairArr) {
        int length = pairArr.length;
        if (length <= 0) {
            return AnonymousClass4To.A00();
        }
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(length));
        A0K(A0v, pairArr);
        return A0v;
    }

    public static final Map A0I(Pair... pairArr) {
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(pairArr.length));
        A0K(A0v, pairArr);
        return A0v;
    }

    public static final void A0J(Iterable iterable, Map map) {
        C04220Ms.A0B(iterable, 1);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.A00, pair.A01);
        }
    }

    public static final void A0K(Map map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.A00, pair.A01);
        }
    }

    public static HashMap A08(Pair pair, Pair pair2) {
        return A09(pair, pair2);
    }

    public static final Map A0A() {
        return AnonymousClass4To.A00();
    }

    public static final Map A0D(Map map) {
        int size = map.size();
        if (size == 0) {
            return AnonymousClass4To.A00();
        }
        if (size != 1) {
            return map;
        }
        Map.Entry A0o = C18180wK.A0o(AnonymousClass0wJ.A0z(map));
        Map singletonMap = Collections.singletonMap(A0o.getKey(), A0o.getValue());
        C04220Ms.A06(singletonMap);
        return singletonMap;
    }

    public static final Map A0E(Map map) {
        int size = map.size();
        if (size == 0) {
            return AnonymousClass4To.A00();
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry A0o = C18180wK.A0o(AnonymousClass0wJ.A0z(map));
        Map singletonMap = Collections.singletonMap(A0o.getKey(), A0o.getValue());
        C04220Ms.A06(singletonMap);
        return singletonMap;
    }

    public static Map A0G(Pair pair, Pair pair2) {
        return A0H(pair, pair2);
    }
}
