package X;

import java.util.List;

/* renamed from: X.6EA  reason: invalid class name */
public final class AnonymousClass6EA {
    public static final float A00(AnonymousClass7AW r6, int i, boolean z, boolean z2) {
        int i2;
        int A01;
        boolean z3 = false;
        if (!z ? !z2 : z2) {
            i2 = Math.max(i - 1, 0);
        } else {
            i2 = i;
        }
        if (r6.A0B(i2) == r6.A0C(i)) {
            z3 = true;
        }
        AnonymousClass7EK r1 = r6.A03;
        AnonymousClass7EK.A00(r1, i);
        int length = r1.A03.A00.length();
        List list = r1.A04;
        if (i == length) {
            C04220Ms.A0B(list, 0);
            A01 = C86104wH.A0B(list);
        } else {
            A01 = C115956wB.A01(list, i);
        }
        C115346uu r0 = (C115346uu) list.get(A01);
        C143058g2 r3 = r0.A06;
        int i3 = r0.A05;
        int A02 = AnonymousClass8bI.A02(i, i3, r0.A04) - i3;
        C115526vM r02 = ((C123707Ye) r3).A01;
        if (z3) {
            return r02.A03(A02, false);
        }
        return r02.A04(A02, false);
    }
}
