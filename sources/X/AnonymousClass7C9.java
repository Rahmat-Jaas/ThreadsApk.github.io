package X;

import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Pair;

/* renamed from: X.7C9  reason: invalid class name */
public final class AnonymousClass7C9 {
    public static final Pair A00;

    public static final C114016sY A00(C114016sY r6, C134747yH r7, C121807If r8, C143078g4 r9, C147168nV r10, List list, int i, int i2, int i3, boolean z) {
        C114016sY r1 = r6;
        C04220Ms.A0B(r6, 0);
        C121807If r3 = r8;
        C147168nV r5 = r10;
        AnonymousClass0wJ.A1Q(r8, r10);
        C143078g4 r4 = r9;
        List list2 = list;
        C86114wI.A1I(r9, 4, list);
        C134747yH r2 = r7;
        boolean A0I = C04220Ms.A0I(r1.A05, r7);
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        boolean z2 = z;
        if (A0I && C04220Ms.A0I(r1.A06, r3) && r1.A0A == z && r1.A04 == i && r1.A02 == i2 && r1.A03 == i3 && C04220Ms.A0I(r1.A08, r5) && C04220Ms.A0I(r1.A09, list) && r1.A07 == r4) {
            return r1;
        }
        return new C114016sY(r2, r3, r4, r5, list2, i5, i6, i4, z2);
    }

    static {
        AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
        A00 = new Pair(r1, r1);
    }

    public static final void A01(C147188nY r13, C134747yH r14, List list, int i) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, list);
        r13.Cvd(-110905764);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass7HE A0H = C86154wM.A0H(list, i2);
            int i3 = A0H.A01;
            int i4 = A0H.A00;
            C123547Xn r12 = C123547Xn.A00;
            C123327Wm A02 = Modifier.A02(r13, -1323940314);
            Object AEA = r13.AEA(AnonymousClass7DE.A02);
            Object A0n = C147188nY.A0n(r13);
            Object A0m = C147188nY.A0m(r13);
            AnonymousClass0ZU r0 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A02);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r13;
            C147188nY.A0w(r13, r2, r0);
            ((AnonymousClass0YM) A0H.A02).invoke(r14.subSequence(i3, i4).A00, r13, C147188nY.A0l(r13, AnonymousClass7KP.A02(r13, r12, AEA, A0n, A0m), A002));
            AnonymousClass7W3.A0u(r2, A1Z);
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r14, list, i, 13);
        }
    }
}
