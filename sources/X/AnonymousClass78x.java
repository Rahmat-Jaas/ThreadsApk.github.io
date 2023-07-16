package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.78x  reason: invalid class name */
public final class AnonymousClass78x {
    public long A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;

    public static final void A00(String str, StringBuilder sb, List list) {
        String str2;
        sb.append(AnonymousClass00U.A0L(str, ":  "));
        sb.append(10);
        sb.append("intervals: ");
        ArrayList A0x = AnonymousClass0wJ.A0x(list, 10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C107136gE r3 = (C107136gE) it.next();
            StringBuilder A0s = C18190wL.A0s("(");
            A0s.append(r3.A01);
            A0s.append(", ");
            A0s.append(r3.A00);
            A0x.add(AnonymousClass0wJ.A0u(A0s));
        }
        sb.append(C18200wM.A0l(", ", A0x));
        sb.append(10);
        sb.append("durations: ");
        ArrayList A0x2 = AnonymousClass0wJ.A0x(list, 10);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C107136gE r1 = (C107136gE) it2.next();
            long j = r1.A01;
            if (j != -1) {
                long j2 = r1.A00;
                if (j2 != -1) {
                    str2 = String.valueOf(j2 - j);
                    A0x2.add(str2);
                }
            }
            str2 = "N/A";
            A0x2.add(str2);
        }
        sb.append(A0x2);
        sb.append(10);
    }

    public final boolean A01() {
        if (!this.A06.isEmpty() || !this.A02.isEmpty() || !this.A04.isEmpty() || !this.A03.isEmpty() || !this.A05.isEmpty() || this.A00 != -1) {
            return false;
        }
        return true;
    }

    public AnonymousClass78x(String str, List list, List list2, List list3, List list4, List list5, long j) {
        this.A01 = str;
        this.A06 = list;
        this.A02 = list2;
        this.A04 = list3;
        this.A03 = list4;
        this.A05 = list5;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A00("p0", A0r, this.A06);
        A00("p50", A0r, this.A02);
        A00("p100", A0r, this.A04);
        A00("p50c", A0r, this.A03);
        A00("p100c", A0r, this.A05);
        C86154wM.A1W(A0r, AnonymousClass00U.A08(this.A00, "full impression: "));
        return C18190wL.A0n(A0r);
    }
}
