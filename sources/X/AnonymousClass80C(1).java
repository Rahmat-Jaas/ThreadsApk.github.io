package X;

import java.util.Iterator;

/* renamed from: X.80C  reason: invalid class name */
public final class AnonymousClass80C implements Runnable {
    public final /* synthetic */ C32337HGt A00;

    public AnonymousClass80C(C32337HGt hGt) {
        this.A00 = hGt;
    }

    public final void run() {
        C32337HGt hGt = this.A00;
        synchronized (hGt) {
            Iterator it = hGt.A0H.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("onTransactionDelete");
            }
        }
    }
}
