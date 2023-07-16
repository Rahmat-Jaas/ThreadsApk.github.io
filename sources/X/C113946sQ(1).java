package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6sQ  reason: invalid class name and case insensitive filesystem */
public final class C113946sQ {
    public final C113876sJ A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C112596ps A04;
    public final AnonymousClass8ci A05;
    public final List A06;
    public final boolean A07;

    public final long A00(int i, int i2) {
        int A042;
        List list = this.A06;
        int A043 = AnonymousClass0wJ.A04(list.get((i + i2) - 1));
        if (i == 0) {
            A042 = 0;
        } else {
            A042 = AnonymousClass0wJ.A04(list.get(i - 1));
        }
        int i3 = (A043 - A042) + (this.A01 * (i2 - 1));
        if (i3 < 0) {
            i3 = 0;
        }
        boolean z = this.A07;
        C1203579v r0 = Constraints.A01;
        if (z) {
            return r0.A02(i3);
        }
        return r0.A01(i3);
    }

    public final C113086qh A01(int i) {
        List list;
        int i2;
        C113876sJ r6 = this.A00;
        C147288p6 r0 = r6.A02;
        int i3 = r6.A00;
        int i4 = i;
        int i5 = i * i3;
        int itemCount = r0.getItemCount() - i5;
        if (i3 > itemCount) {
            i3 = itemCount;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 == r6.A01.size()) {
            list = r6.A01;
        } else {
            ArrayList A0k = C18240wQ.A0k(i3);
            for (int i6 = 0; i6 < i3; i6++) {
                A0k.add(new C114096sg((long) 1));
            }
            r6.A01 = A0k;
            list = A0k;
        }
        int size = list.size();
        if (size == 0 || i5 + size == this.A02) {
            i2 = 0;
        } else {
            i2 = this.A03;
        }
        C113156qq[] r11 = new C113156qq[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int i9 = (int) ((C114096sg) list.get(i8)).A00;
            long A002 = A00(i7, i9);
            i7 += i9;
            r11[i8] = this.A04.A00(i5 + i8, i2, A002);
        }
        AnonymousClass7VT r2 = (AnonymousClass7VT) this.A05;
        boolean z = r2.A03;
        return new C113086qh(r2.A01.getLayoutDirection(), list, r11, i4, r2.A02.size(), i2, r2.A00, z);
    }

    public C113946sQ(C113876sJ r1, C112596ps r2, AnonymousClass8ci r3, List list, int i, int i2, int i3, boolean z) {
        this.A07 = z;
        this.A06 = list;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = r2;
        this.A00 = r1;
        this.A05 = r3;
    }
}
