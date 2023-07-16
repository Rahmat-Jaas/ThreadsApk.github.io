package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4M1  reason: invalid class name */
public final class AnonymousClass4M1 implements C27947Evx {
    public static final int[][] A00 = {new int[]{0, 2}, new int[]{1, 3}};

    public final int B8O(int i, int i2) {
        if (i2 == 2 || i == 1) {
            return 2;
        }
        return (int) Math.ceil(((double) (i + 1)) / 2.0d);
    }

    public final Integer BJ0() {
        return AnonymousClass006.A00;
    }

    public final List B8Q(List list, Set set, int i, int i2) {
        int min;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (set.size() == 2) {
            Iterator it = set.iterator();
            int A04 = AnonymousClass0wJ.A04(it.next());
            int A042 = AnonymousClass0wJ.A04(it.next());
            if (i == 0) {
                min = Math.max(A04, A042);
            } else {
                min = Math.min(A04, A042);
            }
            C18200wM.A1U(A0v, min);
        } else {
            int B8O = (B8O(i2, set.size()) - 1) - i;
            int i3 = B8O << 1;
            int[] iArr = {i3, i3 + 1};
            if (B8O < 2) {
                iArr = A00[B8O];
            }
            if (set.contains(Integer.valueOf(iArr[0]))) {
                C18200wM.A1U(A0v, iArr[0]);
            }
            if (set.contains(Integer.valueOf(iArr[1]))) {
                C18200wM.A1U(A0v, iArr[1]);
                return A0v;
            }
        }
        return A0v;
    }

    public final boolean BY4(C27947Evx evx) {
        return evx.getClass().equals(AnonymousClass4M1.class);
    }
}
