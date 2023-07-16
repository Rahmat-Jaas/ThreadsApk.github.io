package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0iH  reason: invalid class name and case insensitive filesystem */
public final class C10400iH {
    public List A00 = new CopyOnWriteArrayList();

    public final void A00(C10420iJ r3) {
        List list = this.A00;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final void A01(C10420iJ r3) {
        List list = this.A00;
        if (list.contains(r3)) {
            list.remove(r3);
        }
    }
}
