package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.17J  reason: invalid class name */
public final class AnonymousClass17J extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C83654rl A03;
    public final List A04;
    public final C04530Oa A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass17J(C83654rl r2, int i) {
        this(r2, (List) null, i, i);
        C04220Ms.A0B(r2, 1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass17J) {
                AnonymousClass17J r5 = (AnonymousClass17J) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || this.A01 != r5.A01 || !C04220Ms.A0I(this.A04, r5.A04) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int i;
        int i2 = this.A02;
        List<AnonymousClass17J> list = this.A04;
        if (list != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(list);
            for (AnonymousClass17J r0 : list) {
                C18200wM.A1U(A0w, r0.A02);
            }
            Iterator it = A0w.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = Integer.valueOf(AnonymousClass0wJ.A04(next) + AnonymousClass0wJ.A04(it.next()));
                }
                i = AnonymousClass0wJ.A04(next);
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Badge(useCase=");
        A0s.append(this.A03);
        A0s.append(", count=");
        A0s.append(this.A01);
        A0s.append(", childCount=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass17J(C83654rl r5, List list, int i, int i2) {
        int i3;
        C04220Ms.A0B(r5, 1);
        this.A03 = r5;
        this.A01 = i;
        this.A04 = list;
        this.A02 = i2;
        if (list != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass17J r0 = (AnonymousClass17J) it.next();
                C18200wM.A1U(A0w, r0.A01 + r0.A00);
            }
            Iterator it2 = A0w.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = Integer.valueOf(AnonymousClass0wJ.A04(next) + AnonymousClass0wJ.A04(it2.next()));
                }
                i3 = AnonymousClass0wJ.A04(next);
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        } else {
            i3 = 0;
        }
        this.A00 = i3;
        this.A05 = C18190wL.A0x(this, 6);
    }
}
