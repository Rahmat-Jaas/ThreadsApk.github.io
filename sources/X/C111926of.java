package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6of  reason: invalid class name and case insensitive filesystem */
public final class C111926of {
    public HashMap A00 = AnonymousClass0wJ.A0y();

    public final synchronized void A00(Set set) {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator A0u = C18190wL.A0u(this.A00);
        while (A0u.hasNext()) {
            if (((Long) C18180wK.A0o(A0u).getValue()).longValue() < currentTimeMillis - 86400000) {
                A0u.remove();
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            if (!this.A00.containsKey(A0k)) {
                this.A00.put(A0k, Long.valueOf(currentTimeMillis));
            }
        }
    }
}
