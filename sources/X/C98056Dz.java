package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.pager.PagerState;

/* renamed from: X.6Dz  reason: invalid class name and case insensitive filesystem */
public final class C98056Dz {
    public static final SnapFlingBehavior A00(C142638fL r11, PagerState pagerState, C147188nY r13, int i) {
        AnonymousClass8cU r9;
        C142638fL r7 = r11;
        C123137Vl r3 = null;
        C122777Tu r8 = null;
        C04220Ms.A0B(pagerState, 0);
        r13.Cvb(-344874176);
        if ((i & 2) != 0) {
            r3 = new C123137Vl();
        }
        int i2 = 0;
        if ((i & 4) != 0) {
            r7 = new C122747Tr(AnonymousClass6aT.A01, 500, 0);
        }
        if ((i & 8) != 0) {
            r9 = AnonymousClass72K.A00(r13);
        } else {
            r9 = null;
        }
        if ((i & 16) != 0) {
            r8 = C122777Tu.A01((Object) null);
        }
        C147168nV r112 = (C147168nV) r13.AEA(AnonymousClass7DE.A02);
        Object[] objArr = {r7, r9, r8, r3, r112};
        r13.Cvb(-568225417);
        boolean z = false;
        do {
            z = C147188nY.A12(r13, objArr[i2], z);
            i2++;
        } while (i2 < 5);
        AnonymousClass7W3 r132 = (AnonymousClass7W3) r13;
        Object A13 = r132.A13();
        if (z || A13 == AnonymousClass7GN.A00) {
            A13 = new SnapFlingBehavior(r7, r8, r9, new C122897Uk(r9, r3, pagerState), r112);
            r132.A14(A13);
        }
        AnonymousClass7W3.A0w(r132, false);
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) A13;
        AnonymousClass7W3.A0w(r132, false);
        return snapFlingBehavior;
    }
}
