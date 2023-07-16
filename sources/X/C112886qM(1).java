package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6qM  reason: invalid class name and case insensitive filesystem */
public final class C112886qM {
    public int A00;
    public final int A01;
    public final HashMap A02;
    public final List A03;
    public final List A04;
    public final C04530Oa A05;

    public final boolean A00(int i, int i2) {
        int i3;
        HashMap hashMap = this.A02;
        C108546iX r5 = (C108546iX) C86164wN.A0c(hashMap, i);
        if (r5 == null) {
            return false;
        }
        int i4 = r5.A01;
        int i5 = i2 - r5.A00;
        r5.A00 = i2;
        if (i5 == 0) {
            return true;
        }
        Iterator A0t = C86134wK.A0t(hashMap.values());
        while (A0t.hasNext()) {
            C108546iX r1 = (C108546iX) A0t.next();
            if (r1.A01 >= i4 && !r1.equals(r5) && (i3 = r1.A01 + i5) >= 0) {
                r1.A01 = i3;
            }
        }
        return true;
    }

    public C112886qM(List list, int i) {
        this.A03 = list;
        this.A01 = i;
        if (i >= 0) {
            this.A04 = AnonymousClass0wJ.A0v();
            HashMap A0y = AnonymousClass0wJ.A0y();
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C109626kJ r1 = (C109626kJ) this.A03.get(i3);
                Integer valueOf = Integer.valueOf(r1.A01);
                int i4 = r1.A02;
                A0y.put(valueOf, new C108546iX(i3, i2, i4));
                i2 += i4;
            }
            this.A02 = A0y;
            this.A05 = AnonymousClass0OY.A02(C86154wM.A13(this, 9));
            return;
        }
        throw C18190wL.A0a("Invalid start index");
    }
}
