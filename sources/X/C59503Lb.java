package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Lb  reason: invalid class name and case insensitive filesystem */
public final class C59503Lb {
    public static void A00(C19472Awv awv) {
        HashSet hashSet;
        int i = 50;
        C19472Awv awv2 = awv;
        synchronized (awv2) {
            hashSet = new HashSet(awv.A03.entrySet());
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = hashSet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            if (A0o.getValue() instanceof Long) {
                if (((Long) A0o.getValue()).compareTo(Long.MAX_VALUE) > 0) {
                    i2++;
                }
                A0v.add(A0o.getValue());
            } else {
                it.remove();
            }
        }
        Collections.sort(A0v);
        if (i2 > 0) {
            int min = Math.min(i2, 50);
            A01(awv2, hashSet, Long.MAX_VALUE, C18190wL.A08(A0v.get(((A0v.size() - i2) + min) - 1)));
            i = 50 - min;
            if (i <= 0) {
                return;
            }
        }
        A01(awv2, hashSet, 0, ((Number) A0v.get(i - 1)).longValue());
    }

    public static void A01(C19472Awv awv, Set set, long j, long j2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            Long l = (Long) A0o.getValue();
            if (l.compareTo(Long.valueOf(j)) >= 0 && l.compareTo(Long.valueOf(j2)) <= 0) {
                awv.A07(C18200wM.A0p(A0o));
            }
        }
    }
}
