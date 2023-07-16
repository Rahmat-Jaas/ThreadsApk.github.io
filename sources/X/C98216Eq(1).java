package X;

import java.util.List;

/* renamed from: X.6Eq  reason: invalid class name and case insensitive filesystem */
public final class C98216Eq {
    public static final void A00(C121197Es r10, C113636rr r11) {
        AnonymousClass0wJ.A1N(r11, r10);
        if (C121667Hg.A01(r10)) {
            r11.A00 = r10.A05;
            r11.A00();
        }
        long j = r10.A06;
        long j2 = j;
        List list = r10.A02;
        if (list == null) {
            list = AnonymousClass0ZV.A00;
        }
        int i = 0;
        int size = list.size();
        while (i < size) {
            C112016oq r9 = (C112016oq) list.get(i);
            j = r9.A00;
            long A05 = AnonymousClass7KC.A05(r11.A00, AnonymousClass7KC.A04(j, j2));
            r11.A00 = A05;
            r11.A01(r9.A01, A05);
            i++;
            j2 = j;
        }
        long A052 = AnonymousClass7KC.A05(r11.A00, AnonymousClass7KC.A04(r10.A05, j));
        r11.A00 = A052;
        r11.A01(r10.A09, A052);
    }
}
