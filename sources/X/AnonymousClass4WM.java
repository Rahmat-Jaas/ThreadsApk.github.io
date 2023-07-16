package X;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.4WM  reason: invalid class name */
public class AnonymousClass4WM extends C40536LiT {
    public static final HashSet A04(Object... objArr) {
        HashSet hashSet = new HashSet(AnonymousClass4WK.A0N(r3));
        for (Object add : objArr) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public static final Set A07(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass4WK.A0N(r3));
        for (Object add : objArr) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }

    public static final Set A08(Object... objArr) {
        if (objArr.length > 0) {
            return AnonymousClass8AP.A0C(objArr);
        }
        return AnonymousClass84Y.A00;
    }

    public static final Set A05() {
        return AnonymousClass84Y.A00;
    }

    public static final Set A06(Set set) {
        int size = set.size();
        if (size == 0) {
            return AnonymousClass84Y.A00;
        }
        if (size == 1) {
            return C18250wR.A0c(set.iterator().next());
        }
        return set;
    }
}
