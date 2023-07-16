package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.76H  reason: invalid class name */
public final class AnonymousClass76H {
    public final AnonymousClass74e A00 = new AnonymousClass74e(8);
    public final C143078g4 A01;
    public final C147168nV A02;
    public final AnonymousClass69J A03;

    public AnonymousClass76H(C143078g4 r3, C147168nV r4, AnonymousClass69J r5) {
        AnonymousClass0wJ.A1O(r3, r4);
        C04220Ms.A0B(r5, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public static /* synthetic */ AnonymousClass7AW A00(AnonymousClass76H r20, C121807If r21, String str) {
        int i;
        long A04 = Constraints.A01.A04(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        AnonymousClass76H r8 = r20;
        AnonymousClass69J r5 = r8.A03;
        C147168nV r15 = r8.A02;
        C143078g4 r14 = r8.A01;
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        C115396uz r11 = new C115396uz(new C134747yH((List) null, 6, str2), r21, r14, r15, r5, AnonymousClass0ZV.A00, Integer.MAX_VALUE, 1, A04, true);
        C115496vG r52 = r8.A00.A00;
        AnonymousClass7AW r3 = (AnonymousClass7AW) r52.A01(new C113326rA(r11));
        if (r3 != null) {
            AnonymousClass7EK r4 = r3.A03;
            if (!r4.A03.AmN()) {
                return new AnonymousClass7AW(r4, r11, AnonymousClass7JT.A04(A04, AnonymousClass7FV.A00(C86124wJ.A03(r4.A01), C86124wJ.A03(r4.A00))));
            }
        }
        C123717Yf r12 = new C123717Yf(r11.A03, AnonymousClass6FN.A00(r11.A04, r11.A07), r11.A05, r11.A06, r11.A08);
        long j = r11.A02;
        int A042 = Constraints.A04(j);
        if (C18180wK.A1V(((int) (j >> 33)) & Constraints.A04[(int) (j & 3)])) {
            i = Constraints.A02(j);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (A042 != i) {
            i = AnonymousClass8bI.A02(C86124wJ.A03(r12.Atb()), A042, i);
        }
        AnonymousClass7EK r13 = new AnonymousClass7EK(r12, Integer.MAX_VALUE, AnonymousClass7JT.A02(0, i, 0, Constraints.A01(j)), false);
        AnonymousClass7AW r2 = new AnonymousClass7AW(r13, r11, AnonymousClass7JT.A04(j, AnonymousClass7FV.A00(C86124wJ.A03(r13.A01), C86124wJ.A03(r13.A00))));
        r52.A02(new C113326rA(r11), r2);
        return r2;
    }
}
