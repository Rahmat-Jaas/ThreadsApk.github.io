package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6HC  reason: invalid class name */
public final class AnonymousClass6HC {
    public static final long A00(AnonymousClass78x r12) {
        C04220Ms.A0B(r12, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        List<C107136gE> list = r12.A02;
        ArrayList A0x = AnonymousClass0wJ.A0x(list, 10);
        for (C107136gE r0 : list) {
            C04220Ms.A0B(r0, 0);
            A0x.add(new C107136gE(r0.A01, r0.A00));
        }
        A0v.addAll(A0x);
        List<C107136gE> list2 = r12.A04;
        ArrayList A0x2 = AnonymousClass0wJ.A0x(list2, 10);
        for (C107136gE r02 : list2) {
            C04220Ms.A0B(r02, 0);
            A0x2.add(new C107136gE(r02.A01, r02.A00));
        }
        A0v.addAll(A0x2);
        C001300p.A0y(A0v, AnonymousClass722.A01(C139018Mi.A00, C139028Mj.A00));
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            C107136gE r10 = (C107136gE) it.next();
            long j = r10.A00;
            if (j != -1) {
                if (!A0v2.isEmpty()) {
                    C107136gE r5 = (C107136gE) A0v2.get(A0v2.size() - 1);
                    long j2 = r5.A00;
                    if (j2 >= r10.A01) {
                        r5.A00 = Math.max(j2, j);
                    }
                }
                A0v2.add(r10);
            }
        }
        ArrayList<Object> A0x3 = AnonymousClass0wJ.A0x(A0v2, 10);
        Iterator it2 = A0v2.iterator();
        while (it2.hasNext()) {
            C107136gE r03 = (C107136gE) it2.next();
            C86144wL.A1U(A0x3, r03.A00 - r03.A01);
        }
        long j3 = 0;
        for (Object A08 : A0x3) {
            j3 += C18190wL.A08(A08);
        }
        return j3;
    }
}
