package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6pN  reason: invalid class name and case insensitive filesystem */
public final class C112316pN {
    public boolean A00;
    public final C106806fe A01;
    public final Map A02;

    public final boolean A00(long j) {
        Object obj;
        List list = this.A01.A01;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((C115386uy) obj).A02 == j) {
                break;
            }
            i++;
        }
        C115386uy r4 = (C115386uy) obj;
        if (r4 != null) {
            return r4.A09;
        }
        return false;
    }

    public C112316pN(C106806fe r1, Map map) {
        this.A02 = map;
        this.A01 = r1;
    }
}
