package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0hf  reason: invalid class name and case insensitive filesystem */
public final class C10060hf {
    public volatile Object A00;
    public volatile ArrayList A01 = new ArrayList();
    public volatile CountDownLatch A02 = new CountDownLatch(1);

    public final void A00(C10070hg r6) {
        if (this.A02.getCount() == 0) {
            r6.run(this.A00);
        } else {
            this.A01.add(r6);
        }
    }

    public final void A01(Object obj) {
        this.A00 = obj;
        this.A02.countDown();
        if (!this.A01.isEmpty()) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((C10070hg) it.next()).run(this.A00);
            }
        }
    }
}
