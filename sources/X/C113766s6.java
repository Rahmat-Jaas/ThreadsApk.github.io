package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.6s6  reason: invalid class name and case insensitive filesystem */
public final class C113766s6 {
    public long A00 = 250;
    public HashMap A01 = AnonymousClass0wJ.A0y();
    public List A02 = AnonymousClass0wJ.A0v();

    public final synchronized Set A00(String str) {
        Set set;
        if (this.A01.containsKey(str)) {
            C111926of r1 = (C111926of) this.A01.get(str);
            synchronized (r1) {
                set = Collections.unmodifiableSet(r1.A00.keySet());
            }
        } else {
            set = C18200wM.A0u();
        }
        return set;
    }

    public final synchronized void A01(Set set, String str) {
        while (((long) this.A02.size()) >= this.A00) {
            List list = this.A02;
            this.A01.remove((String) list.remove(C86104wH.A0B(list)));
        }
        this.A02.remove(str);
        this.A02.add(0, str);
        if (this.A01.containsKey(str)) {
            ((C111926of) this.A01.get(str)).A00(set);
        } else {
            C111926of r1 = new C111926of();
            r1.A00(set);
            this.A01.put(str, r1);
        }
    }
}
