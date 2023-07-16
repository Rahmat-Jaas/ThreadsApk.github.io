package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Pu  reason: invalid class name and case insensitive filesystem */
public final class C60613Pu {
    public static final List A00() {
        ArrayList A0s = C18200wM.A0s(Collections.nCopies(7, 0L));
        int[] A02 = AnonymousClass3VQ.A01.A02(0);
        int length = A02.length - 1;
        int i = 6;
        while (length >= 0) {
            A0s.set(i, C18230wP.A0f(A02[length]));
            i--;
            length--;
            if (i < 0) {
                break;
            }
        }
        return A0s;
    }

    public static List A01(List list, List list2, int i) {
        ArrayList A0s = C18200wM.A0s(Collections.nCopies(7, C18210wN.A0V()));
        int i2 = 6;
        while (i > 0 && i2 >= 0) {
            A0s.set(i2, list.get(i2));
            i2--;
            i--;
        }
        int size = list2.size() - 1;
        while (i2 >= 0 && size >= 0) {
            A0s.set(i2, Long.valueOf(C18190wL.A08(list.get(i2)) + C18190wL.A08(list2.get(size))));
            size--;
            i2--;
        }
        return A0s;
    }
}
