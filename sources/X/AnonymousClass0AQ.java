package X;

import com.facebook.redex.IDxComparatorShape93S0000000_I2;
import com.facebook.redex.IDxFFilterShape148S0000000_I2;
import java.io.FileFilter;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.0AQ  reason: invalid class name */
public final class AnonymousClass0AQ implements Iterator {
    public static final FileFilter A03 = new IDxFFilterShape148S0000000_I2(1);
    public static final Comparator A04 = new IDxComparatorShape93S0000000_I2(1);
    public AnonymousClass0AO A00;
    public boolean A01;
    public final ArrayDeque A02 = new ArrayDeque();

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r0 = new X.AnonymousClass0AO(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r6 = this;
            boolean r0 = r6.A01
            r4 = 1
            if (r0 != 0) goto L_0x0052
            r6.A01 = r4
        L_0x0007:
            java.util.ArrayDeque r5 = r6.A02
            boolean r1 = r5.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x0050
            java.lang.Object r3 = r5.getFirst()
            X.0AP r3 = (X.AnonymousClass0AP) r3
            X.0AM r2 = r3.A02
            java.util.Iterator r0 = r3.A01
            if (r0 != 0) goto L_0x0022
            java.util.Iterator r0 = r2.A00()
            r3.A01 = r0
        L_0x0022:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0058
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            java.util.Iterator r0 = r3.A01
            if (r0 != 0) goto L_0x0038
            java.util.Iterator r0 = r2.A00()
            r3.A01 = r0
        L_0x0038:
            java.lang.Object r1 = r0.next()
            X.0AM r1 = (X.AnonymousClass0AM) r1
            X.0AP r0 = new X.0AP
            r0.<init>(r1)
            r5.addFirst(r0)
            int r0 = r3.A00
            if (r0 != r4) goto L_0x0007
            r1 = 1
        L_0x004b:
            X.0AO r0 = new X.0AO
            r0.<init>(r2, r1)
        L_0x0050:
            r6.A00 = r0
        L_0x0052:
            X.0AO r0 = r6.A00
            if (r0 != 0) goto L_0x0057
            r4 = 0
        L_0x0057:
            return r4
        L_0x0058:
            r5.removeFirst()
            boolean r0 = r2 instanceof X.AnonymousClass0U1
            r1 = 3
            if (r0 == 0) goto L_0x004b
            r1 = 2
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AQ.hasNext():boolean");
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass0AQ(C05000Qh r5) {
        Iterator A002 = r5.A00();
        while (A002.hasNext()) {
            this.A02.addLast(new AnonymousClass0AP((AnonymousClass0AM) A002.next()));
        }
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            AnonymousClass0AO r1 = this.A00;
            this.A00 = null;
            this.A01 = false;
            return r1;
        }
        throw new IllegalStateException();
    }
}
