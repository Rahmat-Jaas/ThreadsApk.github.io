package X;

import java.util.List;

/* renamed from: X.6wB  reason: invalid class name and case insensitive filesystem */
public final class C115956wB {
    public static final int A00(List list, float f) {
        C04220Ms.A0B(list, 0);
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C115346uu r1 = (C115346uu) list.get(i2);
            if (r1.A01 > f) {
                size = i2 - 1;
            } else if (r1.A00 > f) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public static final int A01(List list, int i) {
        C04220Ms.A0B(list, 0);
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C115346uu r1 = (C115346uu) list.get(i3);
            if (r1.A05 > i) {
                size = i3 - 1;
            } else if (r1.A04 > i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }
}
