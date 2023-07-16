package X;

import androidx.paging.PageEvent$Insert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7cK  reason: invalid class name and case insensitive filesystem */
public final class C125047cK implements C41800MdR {
    public static final C125047cK A04;
    public int A00;
    public int A01;
    public int A02;
    public final List A03;

    public C125047cK(List list, int i, int i2) {
        C04220Ms.A0B(list, 1);
        this.A03 = C18200wM.A0s(list);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 = C86164wN.A06(((C1202779m) it.next()).A01, i3);
        }
        this.A02 = i3;
        this.A01 = i;
        this.A00 = i2;
    }

    static {
        PageEvent$Insert pageEvent$Insert = PageEvent$Insert.A06;
        C04220Ms.A0B(pageEvent$Insert, 1);
        A04 = new C125047cK(pageEvent$Insert.A05, 0, 0);
    }

    public static final int A00(C125047cK r6, AnonymousClass8bH r7) {
        Iterator it = r6.A03.iterator();
        int i = 0;
        while (it.hasNext()) {
            C1202779m r4 = (C1202779m) it.next();
            int[] iArr = r4.A03;
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (r7.A06(iArr[i2])) {
                    i = C86164wN.A06(r4.A01, i);
                    it.remove();
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    public final C885959j A01(int i) {
        List list;
        int i2 = i - this.A01;
        int i3 = 0;
        while (true) {
            list = this.A03;
            if (i2 < ((C1202779m) list.get(i3)).A01.size() || i3 >= C86104wH.A0B(list)) {
                C1202779m r1 = (C1202779m) list.get(i3);
                int i4 = i - this.A01;
                int size = ((getSize() - i) - this.A00) - 1;
                int A0A = C86134wK.A0A(AnonymousClass8AP.A04(((C1202779m) AnonymousClass00J.A0C(list)).A03));
                int A0A2 = C86134wK.A0A(AnonymousClass8AP.A03(((C1202779m) AnonymousClass00J.A0E(list)).A03));
                int i5 = r1.A00;
                List list2 = r1.A02;
            } else {
                i2 -= ((C1202779m) list.get(i3)).A01.size();
                i3++;
            }
        }
        C1202779m r12 = (C1202779m) list.get(i3);
        int i42 = i - this.A01;
        int size2 = ((getSize() - i) - this.A00) - 1;
        int A0A3 = C86134wK.A0A(AnonymousClass8AP.A04(((C1202779m) AnonymousClass00J.A0C(list)).A03));
        int A0A22 = C86134wK.A0A(AnonymousClass8AP.A03(((C1202779m) AnonymousClass00J.A0E(list)).A03));
        int i52 = r12.A00;
        List list22 = r12.A02;
        if (list22 != null && new AnonymousClass8bH(0, list22.size() - 1).A06(i2)) {
            i2 = AnonymousClass0wJ.A04(list22.get(i2));
        }
        return new C885959j(i52, i2, i42, size2, A0A3, A0A22);
    }

    public final Object Ajz(int i) {
        List list = this.A03;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((C1202779m) list.get(i2)).A01.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((C1202779m) list.get(i2)).A01.get(i);
    }

    public final int B1n() {
        return this.A00;
    }

    public final int B1o() {
        return this.A01;
    }

    public final int BE3() {
        return this.A02;
    }

    public final int getSize() {
        return this.A01 + this.A02 + this.A00;
    }

    public final String toString() {
        int i = this.A02;
        ArrayList A0k = C18240wQ.A0k(i);
        for (int i2 = 0; i2 < i; i2++) {
            A0k.add(Ajz(i2));
        }
        String A0H = AnonymousClass00J.A0H((CharSequence) null, (CharSequence) null, (CharSequence) null, A0k, (AnonymousClass0YY) null, 63);
        StringBuilder A0s = C18190wL.A0s("[(");
        A0s.append(this.A01);
        A0s.append(" placeholders), ");
        A0s.append(A0H);
        A0s.append(", (");
        A0s.append(this.A00);
        return C18180wK.A0i(" placeholders)]", A0s);
    }
}
