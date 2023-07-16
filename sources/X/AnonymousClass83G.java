package X;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* renamed from: X.83G  reason: invalid class name */
public final class AnonymousClass83G implements Runnable {
    public final long A00;
    public final int A01;
    public final C12270lc A02;
    public final LinkedList A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;

    public AnonymousClass83G(C12270lc r2, LinkedList linkedList, Map map, Map map2, Map map3, int i, long j) {
        C04220Ms.A0B(r2, 1);
        this.A02 = r2;
        this.A06 = map;
        this.A01 = i;
        this.A05 = map2;
        this.A00 = j;
        this.A04 = map3;
        this.A03 = linkedList;
    }

    public final void run() {
        Long valueOf;
        C12270lc r8 = this.A02;
        long j = this.A00;
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (r8) {
            Set set = r8.A02;
            valueOf = Long.valueOf(j);
            if (set.contains(valueOf)) {
                r8.A00.markerEndForUserFlow(i, i2, 113);
            }
            set.remove(valueOf);
            r8.A01.remove(valueOf);
        }
        this.A05.remove(valueOf);
        this.A06.remove(Integer.valueOf(this.A01));
        this.A04.remove(valueOf);
        LinkedList linkedList = this.A03;
        linkedList.addFirst(valueOf);
        if (linkedList.size() > 200) {
            linkedList.removeLast();
        }
    }
}
