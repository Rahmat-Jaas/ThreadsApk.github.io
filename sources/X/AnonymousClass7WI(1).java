package X;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7WI  reason: invalid class name */
public final class AnonymousClass7WI implements C142838fg {
    public List A00;
    public List A01;
    public final List A02 = AnonymousClass0wJ.A0v();
    public final List A03 = AnonymousClass0wJ.A0v();
    public final List A04 = AnonymousClass0wJ.A0v();
    public final Set A05;

    public final void ANW(C145728kz r3) {
        C04220Ms.A0B(r3, 0);
        List list = this.A03;
        int lastIndexOf = list.lastIndexOf(r3);
        if (lastIndexOf >= 0) {
            list.remove(lastIndexOf);
            this.A05.remove(r3);
            return;
        }
        this.A02.add(r3);
    }

    public final void A00() {
        Set set = this.A05;
        if (C18190wL.A1a(set)) {
            C13790oJ.A01("Compose:abandons", 1854082573);
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((C145728kz) it.next()).Biz();
                }
            } finally {
                C13790oJ.A00(1166705813);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r2.isEmpty() != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r5 = this;
            java.util.List r2 = r5.A00
            r4 = 1
            if (r2 == 0) goto L_0x000c
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r3 = -1
            if (r0 != 0) goto L_0x0033
            java.lang.String r1 = "Compose:deactivations"
            r0 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.C13790oJ.A01(r1, r0)
            int r1 = X.C86144wL.A0C(r2, r4)     // Catch:{ all -> 0x0061 }
        L_0x001c:
            if (r3 >= r1) goto L_0x002a
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0061 }
            X.8ky r0 = (X.C145718ky) r0     // Catch:{ all -> 0x0061 }
            r0.BtB()     // Catch:{ all -> 0x0061 }
            int r1 = r1 + -1
            goto L_0x001c
        L_0x002a:
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.C13790oJ.A00(r0)
            r2.clear()
        L_0x0033:
            java.util.List r2 = r5.A01
            if (r2 == 0) goto L_0x0069
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.lang.String r1 = "Compose:releases"
            r0 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.C13790oJ.A01(r1, r0)
            int r1 = X.C86144wL.A0C(r2, r4)     // Catch:{ all -> 0x0061 }
        L_0x0049:
            if (r3 >= r1) goto L_0x0057
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0061 }
            X.8ky r0 = (X.C145718ky) r0     // Catch:{ all -> 0x0061 }
            r0.CFI()     // Catch:{ all -> 0x0061 }
            int r1 = r1 + -1
            goto L_0x0049
        L_0x0057:
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.C13790oJ.A00(r0)
            r2.clear()
            return
        L_0x0061:
            r1 = move-exception
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.C13790oJ.A00(r0)
            throw r1
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WI.A01():void");
    }

    public final void A02() {
        List list = this.A02;
        if (C18190wL.A1a(list)) {
            C13790oJ.A01("Compose:onForgotten", 1854082573);
            try {
                int size = list.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    C145728kz r1 = (C145728kz) list.get(size);
                    if (!this.A05.contains(r1)) {
                        r1.Bzv();
                    }
                }
            } finally {
                C13790oJ.A00(1166705813);
            }
        }
        List list2 = this.A03;
        if (C18190wL.A1a(list2)) {
            C13790oJ.A01("Compose:onRemembered", 1854082573);
            int size2 = list2.size();
            for (int i = 0; i < size2; i++) {
                C145728kz r12 = (C145728kz) list2.get(i);
                this.A05.remove(r12);
                r12.CFR();
            }
            C13790oJ.A00(1166705813);
        }
    }

    public AnonymousClass7WI(Set set) {
        this.A05 = set;
    }
}
