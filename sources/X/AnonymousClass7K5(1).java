package X;

import java.util.Arrays;

/* renamed from: X.7K5  reason: invalid class name */
public final class AnonymousClass7K5 {
    public static final AnonymousClass6EI A00 = new AnonymousClass6EI();

    public static final C83224qz A00(C147188nY r4, C27952Ew2 ew2) {
        C27437EnT enT;
        AnonymousClass868 r1 = C148838sG.A00;
        if (ew2.AOA(r1) != null) {
            C27437EnT enT2 = new C27437EnT((C148838sG) null);
            enT2.A0M(new C25463Dm5(false, C18190wL.A0a("CoroutineContext supplied to rememberCoroutineScope may not include a parent job")));
            enT = enT2;
        } else {
            C27952Ew2 A07 = ((AnonymousClass7W3) r4).A0c.A07();
            enT = A07.CWl(new C27437EnT((C148838sG) A07.AOA(r1))).CWl(ew2);
        }
        return AnonymousClass7Ja.A03(enT);
    }

    public static final void A01(C147188nY r4, Object obj, Object obj2, Object obj3, AnonymousClass0YP r8) {
        C04220Ms.A0B(r8, 3);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r4, -54093371);
        C27952Ew2 A07 = A0Z.A0c.A07();
        boolean A12 = C147188nY.A12(r4, obj3, C147188nY.A10(r4, obj, obj2, 1618982084));
        Object A13 = A0Z.A13();
        if (A12 || A13 == AnonymousClass7GN.A00) {
            A0Z.A14(new AnonymousClass7WL(A07, r8));
        }
        AnonymousClass7W3.A0g(A0Z);
    }

    public static final void A04(C147188nY r2, Object obj, AnonymousClass0YY r4) {
        C04220Ms.A0B(r4, 1);
        r2.Cvb(-1371986847);
        boolean A0y = C147188nY.A0y(r2, obj);
        AnonymousClass7W3 r22 = (AnonymousClass7W3) r2;
        Object A13 = r22.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            r22.A14(new AnonymousClass7WK(r4));
        }
        AnonymousClass7W3.A0g(r22);
    }

    public static final void A05(C147188nY r4, Object obj, AnonymousClass0YP r6) {
        C04220Ms.A0B(r6, 1);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r4, 1179185413);
        C27952Ew2 A07 = A0Z.A0c.A07();
        boolean A0y = C147188nY.A0y(r4, obj);
        Object A13 = A0Z.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A0Z.A14(new AnonymousClass7WL(A07, r6));
        }
        AnonymousClass7W3.A0g(A0Z);
    }

    public static final void A06(C147188nY r3, AnonymousClass0ZU r4) {
        C04220Ms.A0B(r4, 0);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r3, -1288466761);
        AnonymousClass7W3.A0r(A0Z, C86164wN.A0w(r4, 14));
        AnonymousClass7W3.A0w(A0Z, false);
    }

    public static final void A07(C147188nY r8, AnonymousClass0YP r9, Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r8, -139560008);
        C27952Ew2 A07 = A0Z.A0c.A07();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        r8.Cvb(-568225417);
        boolean z = false;
        for (Object A12 : copyOf) {
            z = C147188nY.A12(r8, A12, z);
        }
        Object A13 = A0Z.A13();
        if (z || A13 == AnonymousClass7GN.A00) {
            A0Z.A14(new AnonymousClass7WL(A07, r9));
        }
        AnonymousClass7W3.A0w(A0Z, false);
        AnonymousClass7W3.A0w(A0Z, false);
    }

    public static final void A02(C147188nY r2, Object obj, Object obj2, AnonymousClass0YY r5) {
        r2.Cvb(1429097729);
        boolean A10 = C147188nY.A10(r2, obj, obj2, 511388516);
        AnonymousClass7W3 r22 = (AnonymousClass7W3) r2;
        Object A13 = r22.A13();
        if (A10 || A13 == AnonymousClass7GN.A00) {
            r22.A14(new AnonymousClass7WK(r5));
        }
        AnonymousClass7W3.A0g(r22);
    }

    public static final void A03(C147188nY r4, Object obj, Object obj2, AnonymousClass0YP r7) {
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r4, 590241125);
        C27952Ew2 A07 = A0Z.A0c.A07();
        boolean A10 = C147188nY.A10(r4, obj, obj2, 511388516);
        Object A13 = A0Z.A13();
        if (A10 || A13 == AnonymousClass7GN.A00) {
            A0Z.A14(new AnonymousClass7WL(A07, r7));
        }
        AnonymousClass7W3.A0g(A0Z);
    }
}
