package X;

import java.util.List;

/* renamed from: X.6qB  reason: invalid class name and case insensitive filesystem */
public final class C112786qB {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C112786qB)) {
            return false;
        }
        C112786qB r4 = (C112786qB) obj;
        if (!C04220Ms.A0I(this.A04, r4.A04) || !C04220Ms.A0I(this.A03, r4.A03) || !C04220Ms.A0I(this.A02, r4.A02) || this.A01 != r4.A01 || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public C112786qB(Object obj, Object obj2, List list, int i, int i2) {
        this.A04 = list;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 && i != Integer.MIN_VALUE) {
            throw C18190wL.A0a("Position must be non-negative");
        } else if (list.isEmpty() && i2 > 0) {
            throw C18190wL.A0a("Initial result cannot be empty if items are present in data set.");
        } else if (i2 < 0 && i2 != Integer.MIN_VALUE) {
            throw C18190wL.A0a("List size + position too large, last item in list beyond totalCount.");
        }
    }
}
