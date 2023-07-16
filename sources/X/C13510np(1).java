package X;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.concurrent.Executor;

/* renamed from: X.0np  reason: invalid class name and case insensitive filesystem */
public final class C13510np {
    public static C13510np A05;
    public boolean A00 = false;
    public final ArrayList A01 = new ArrayList();
    public final BitSet A02 = new BitSet(0);
    public final BitSet A03 = new BitSet(0);
    public final BitSet A04 = new BitSet(0);

    public final synchronized void A01(C13500no r3, Executor executor) {
        this.A01.add(new C13520nq(r3, executor));
    }

    public static synchronized C13510np A00() {
        C13510np r0;
        synchronized (C13510np.class) {
            r0 = A05;
            if (r0 == null) {
                r0 = new C13510np();
                A05 = r0;
            }
        }
        return r0;
    }
}
