package X;

import kotlin.Unit;

/* renamed from: X.6ME  reason: invalid class name */
public final class AnonymousClass6ME {
    public static final void A00(C146258lv r6, C147188nY r7, int i) {
        C04220Ms.A0B(r6, 0);
        r7.Cvd(-1135248530);
        if (r6.BY9()) {
            r7.Cvb(-1059476185);
            Object AEA = r7.AEA(C102836Ws.A00);
            if (AEA == null) {
                r7.Cvb(1835581880);
                C106886fn r2 = (C106886fn) r7.AEA(AnonymousClass7DE.A09);
                if (r2 == null) {
                    AnonymousClass7W3.A0z(r7, false);
                    AEA = null;
                } else {
                    boolean A0y = C147188nY.A0y(r7, r2);
                    AnonymousClass7W3 r1 = (AnonymousClass7W3) r7;
                    AEA = r1.A13();
                    if (A0y || AEA == AnonymousClass7GN.A00) {
                        AEA = new AnonymousClass7YW(r2);
                        r1.A14(AEA);
                    }
                    AnonymousClass7W3.A0w(r1, false);
                    AnonymousClass7W3.A0w(r1, false);
                }
            }
            AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r7, false);
            Unit unit = Unit.A00;
            boolean A0y2 = C147188nY.A0y(r7, AEA);
            Object A13 = A04.A13();
            if (A0y2 || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A07(A04, AEA, 7);
            }
            AnonymousClass7W3.A0b(r7, A04, A13, unit, false);
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, r6, i, 26);
        }
    }
}
