package X;

import java.util.ArrayList;

/* renamed from: X.7zA  reason: invalid class name and case insensitive filesystem */
public final class C135277zA implements Runnable {
    public final /* synthetic */ C110526lp A00;

    public C135277zA(C110526lp r1) {
        this.A00 = r1;
    }

    public final void run() {
        C110526lp r3 = this.A00;
        synchronized (r3.A03) {
            ArrayList arrayList = r3.A01;
            r3.A01 = r3.A00;
            r3.A00 = arrayList;
        }
        int i = 0;
        int size = r3.A01.size();
        while (true) {
            ArrayList arrayList2 = r3.A01;
            if (i < size) {
                ((C135287zB) arrayList2.get(i)).A00.A01();
                i++;
            } else {
                arrayList2.clear();
                return;
            }
        }
    }
}
