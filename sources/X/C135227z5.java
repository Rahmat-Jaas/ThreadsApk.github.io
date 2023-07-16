package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7z5  reason: invalid class name and case insensitive filesystem */
public final class C135227z5 implements Runnable {
    public final /* synthetic */ C113046qd A00;

    public C135227z5(C113046qd r1) {
        this.A00 = r1;
    }

    public final void run() {
        List list = this.A00.A03;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("onDomContentLoaded");
            }
        }
    }
}
