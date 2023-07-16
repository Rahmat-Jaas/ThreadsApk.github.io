package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.00C  reason: invalid class name */
public abstract class AnonymousClass00C {
    public AnonymousClass0ZU A00;
    public boolean A01;
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();

    public abstract void A01();

    public final void A00() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((AnonymousClass001) it.next()).cancel();
        }
    }

    public final void A02(boolean z) {
        this.A01 = z;
        AnonymousClass0ZU r0 = this.A00;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public AnonymousClass00C(boolean z) {
        this.A01 = z;
    }
}
