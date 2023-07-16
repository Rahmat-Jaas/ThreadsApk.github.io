package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7lY  reason: invalid class name and case insensitive filesystem */
public final class C129237lY implements C143768hH {
    public static AtomicReference A00 = new AtomicReference();

    public final void BmA(boolean z) {
        synchronized (C121787Id.A09) {
            Iterator it = C18200wM.A0s(C121787Id.A0A.values()).iterator();
            while (it.hasNext()) {
                C121787Id r1 = (C121787Id) it.next();
                if (r1.A06.get()) {
                    Iterator it2 = r1.A05.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw C18210wN.A0W("onBackgroundStateChanged");
                    }
                }
            }
        }
    }
}
