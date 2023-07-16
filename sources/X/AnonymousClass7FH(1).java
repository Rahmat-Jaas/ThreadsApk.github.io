package X;

import androidx.compose.animation.core.MutableTransitionState;

/* renamed from: X.7FH  reason: invalid class name */
public final class AnonymousClass7FH {
    public static final C115556vT A01(MutableTransitionState mutableTransitionState, C147188nY r6, String str) {
        r6.Cvb(882913843);
        boolean A0z = C147188nY.A0z(r6, mutableTransitionState, 1157296644);
        AnonymousClass7W3 r3 = (AnonymousClass7W3) r6;
        Object A13 = r3.A13();
        if (A0z || A13 == AnonymousClass7GN.A00) {
            A13 = new C115556vT(mutableTransitionState, str);
            r3.A14(A13);
        }
        AnonymousClass7W3.A0w(r3, false);
        C115556vT r2 = (C115556vT) A13;
        r2.A02(r6, mutableTransitionState.A02.getValue(), 0);
        boolean A0z2 = C147188nY.A0z(r6, r2, 1157296644);
        Object A132 = r3.A13();
        if (A0z2 || A132 == AnonymousClass7GN.A00) {
            A132 = C86144wL.A16(r2, 18);
            r3.A14(A132);
        }
        AnonymousClass7W3.A0c(r6, r3, A132, r2, false);
        AnonymousClass7W3.A0w(r3, false);
        return r2;
    }

    public static final C81784oM A03(C147218oz r5, C115556vT r6, AnonymousClass8cW r7, C147188nY r8, Object obj, Object obj2, String str) {
        AnonymousClass0wJ.A1R(r5, r7);
        C04220Ms.A0B(str, 5);
        r8.Cvb(-304821198);
        boolean A0y = C147188nY.A0y(r8, r6);
        AnonymousClass7W3 r4 = (AnonymousClass7W3) r8;
        Object A13 = r4.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            C1203479u A00 = AnonymousClass7U0.A00(r7, obj2);
            C04220Ms.A0B(A00, 0);
            A13 = new AnonymousClass7WX(C1203479u.A00(A00), r6, r7, obj);
            r4.A14(A13);
        }
        AnonymousClass7W3.A0w(r4, false);
        AnonymousClass7WX r2 = (AnonymousClass7WX) A13;
        if (C86104wH.A1X(r6.A02)) {
            r2.A03(r5, obj, obj2);
        } else {
            r2.A02(r5, obj2);
        }
        boolean A10 = C147188nY.A10(r8, r6, r2, 511388516);
        Object A132 = r4.A13();
        if (A10 || A132 == AnonymousClass7GN.A00) {
            A132 = C86164wN.A10(r6, r2, 15);
            r4.A14(A132);
        }
        AnonymousClass7W3.A0c(r8, r4, A132, r2, false);
        AnonymousClass7W3.A0w(r4, false);
        return r2;
    }

    public static final C112586pr A00(C115556vT r7, AnonymousClass8cW r8, C147188nY r9, String str, int i) {
        AnonymousClass7WU r92;
        boolean A1V = C18210wN.A1V(r8);
        r9.Cvb(-1714122528);
        if ((i & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean A0y = C147188nY.A0y(r9, r7);
        AnonymousClass7W3 r6 = (AnonymousClass7W3) r9;
        Object A13 = r6.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = new C112586pr(r7, r8, str);
            r6.A14(A13);
        }
        AnonymousClass7W3.A0w(r6, A1V);
        C112586pr r4 = (C112586pr) A13;
        AnonymousClass7K5.A04(r9, r4, C86164wN.A10(r4, r7, 14));
        if (C86104wH.A1X(r7.A02) && (r92 = (AnonymousClass7WU) r4.A00.getValue()) != null) {
            C115556vT r0 = r4.A03;
            AnonymousClass7WX r82 = r92.A02;
            AnonymousClass0YY r1 = r92.A00;
            C147368pE r72 = r0.A04;
            r82.A03((C147218oz) r92.A01.invoke(r72.getValue()), r1.invoke(((C145678ku) r72.getValue()).Aot()), r92.A00.invoke(((C145678ku) r72.getValue()).BFg()));
        }
        AnonymousClass7W3.A0w(r6, A1V);
        return r4;
    }

    public static final C115556vT A02(C147188nY r6, Object obj, String str, int i, int i2) {
        r6.Cvb(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r6);
        Object A13 = A0Y.A13();
        Object obj2 = AnonymousClass7GN.A00;
        if (A13 == obj2) {
            A13 = new C115556vT(new MutableTransitionState(obj), str);
            A0Y.A14(A13);
        }
        AnonymousClass7W3.A0w(A0Y, false);
        C115556vT r4 = (C115556vT) A13;
        r4.A02(r6, obj, (i & 8) | 48 | (i & 14));
        boolean A0y = C147188nY.A0y(r6, r4);
        Object A132 = A0Y.A13();
        if (A0y || A132 == obj2) {
            A132 = C86144wL.A16(r4, 17);
            A0Y.A14(A132);
        }
        AnonymousClass7W3.A0c(r6, A0Y, A132, r4, false);
        AnonymousClass7W3.A0w(A0Y, false);
        return r4;
    }
}
