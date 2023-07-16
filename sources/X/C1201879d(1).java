package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.79d  reason: invalid class name and case insensitive filesystem */
public final class C1201879d {
    public static final C1201879d A03 = new C1201879d(C18220wO.A0y(), AnonymousClass0wJ.A0y());
    public final LinkedHashMap A00;
    public final Set A01 = C18200wM.A0u();
    public final Map A02;

    public final boolean A01(C29004Fft fft) {
        for (AbstractCollection it : this.A00.values()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next() == fft) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void A00(Set set) {
        Set entrySet = this.A00.entrySet();
        C04220Ms.A06(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            if (!set.contains(A0o.getKey())) {
                it.remove();
            } else {
                Iterator it2 = ((AbstractCollection) A0o.getValue()).iterator();
                C04220Ms.A06(it2);
                while (it2.hasNext()) {
                    Object next = it2.next();
                    C04220Ms.A06(next);
                    if (!set.contains(next)) {
                        it2.remove();
                    }
                }
            }
        }
    }

    public C1201879d(LinkedHashMap linkedHashMap, Map map) {
        this.A00 = linkedHashMap;
        this.A02 = map;
    }

    public final boolean A02(C29004Fft fft, C29004Fft fft2) {
        AnonymousClass0wJ.A1N(fft, fft2);
        Map map = this.A02;
        Set set = (Set) map.get(fft);
        Set set2 = (Set) map.get(fft2);
        if (set == null || set2 == null || !set.contains(fft2) || !set2.contains(fft)) {
            return true;
        }
        return false;
    }
}
