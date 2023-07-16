package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.6uA  reason: invalid class name and case insensitive filesystem */
public final class C114936uA {
    public volatile Object A00;
    public volatile CountDownLatch A01 = new CountDownLatch(1);
    public volatile ArrayList A02 = AnonymousClass0wJ.A0v();

    public final void A00() {
        this.A01.countDown();
        if (!this.A02.isEmpty()) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((C143268gR) it.next()).run(this.A00);
            }
        }
    }

    public final void A01(C143268gR r6) {
        if (this.A01.getCount() == 0) {
            r6.run(this.A00);
        } else {
            this.A02.add(r6);
        }
    }

    public final void A02(Object obj) {
        this.A00 = obj;
        A00();
    }
}
