package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.6vj  reason: invalid class name and case insensitive filesystem */
public final class C115676vj {
    public static final C142708fS A01(LazyListState lazyListState, C147188nY r11) {
        r11.Cvb(1148456277);
        boolean A0y = C147188nY.A0y(r11, lazyListState);
        AnonymousClass7W3 r3 = (AnonymousClass7W3) r11;
        Object A13 = r3.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = new C122887Uj(lazyListState, AnonymousClass8ZQ.A00);
            r3.A14(A13);
        }
        AnonymousClass7W3.A0w(r3, false);
        C145698kw r9 = (C145698kw) A13;
        C04220Ms.A0B(r9, 0);
        C147168nV r10 = (C147168nV) C147188nY.A0q(r11, -473984552);
        AnonymousClass8cU A00 = AnonymousClass72K.A00(r11);
        boolean A12 = C147188nY.A12(r11, r10, C147188nY.A10(r11, r9, A00, 1618982084));
        Object A132 = r3.A13();
        if (A12 || A132 == AnonymousClass7GN.A00) {
            A132 = new SnapFlingBehavior(new C122747Tr(AnonymousClass6aT.A01, 300, 0), C122777Tu.A01((Object) null), A00, r9, r10);
            r3.A14(A132);
        }
        AnonymousClass7W3.A0w(r3, false);
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) A132;
        AnonymousClass7W3.A0w(r3, false);
        AnonymousClass7W3.A0w(r3, false);
        return snapFlingBehavior;
    }

    public static final float A00(AnonymousClass8cc r5, C147158nU r6, C147168nV r7, AnonymousClass0YM r8) {
        long j;
        AnonymousClass0wJ.A1N(r7, r6);
        C04220Ms.A0B(r5, 2);
        C967266l Ays = r6.Ays();
        C967266l r0 = C967266l.Vertical;
        long BLg = r6.BLg();
        if (Ays == r0) {
            j = BLg & 4294967295L;
        } else {
            j = BLg >> 32;
        }
        AnonymousClass7VH r52 = (AnonymousClass7VH) r5;
        return ((float) r52.A01) - C18240wQ.A00(r8.invoke(r7, Float.valueOf((float) ((((int) j) - r6.ATC()) - r6.APz())), Float.valueOf((float) r52.A02)));
    }
}
