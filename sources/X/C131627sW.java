package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7sW  reason: invalid class name and case insensitive filesystem */
public final class C131627sW implements C145938lM {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public final void BkD(C63893iY r3, C109326jp r4, Object obj, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C145938lM) it.next()).BkD(r3, r4, obj, str);
            }
        }
    }

    public final void BmM(C63893iY r3, C109326jp r4, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C145938lM) it.next()).BmM(r3, r4, str);
            }
        }
    }

    public final void CIc(C109326jp r3, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C145938lM) it.next()).CIc(r3, str);
            }
        }
    }
}
