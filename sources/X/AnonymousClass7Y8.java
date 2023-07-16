package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7Y8  reason: invalid class name */
public final class AnonymousClass7Y8 implements SubcomposeSlotReusePolicy {
    public final C113626rp A00;
    public final Map A01 = C18220wO.A0y();

    public AnonymousClass7Y8(C113626rp r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean A9A(Object obj, Object obj2) {
        C113626rp r0 = this.A00;
        return C04220Ms.A0I(r0.A00(obj), r0.A00(obj2));
    }

    public final void BCP(AnonymousClass83Z r6) {
        int i;
        Map map = this.A01;
        map.clear();
        Iterator it = r6.iterator();
        while (it.hasNext()) {
            Object A002 = this.A00.A00(it.next());
            Number A0j = C86124wJ.A0j(A002, map);
            if (A0j != null) {
                i = A0j.intValue();
                if (i == 7) {
                    it.remove();
                }
            } else {
                i = 0;
            }
            C86154wM.A1T(A002, map, i + 1);
        }
    }
}
