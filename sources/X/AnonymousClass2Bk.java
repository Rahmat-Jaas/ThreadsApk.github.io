package X;

/* renamed from: X.2Bk  reason: invalid class name */
public final class AnonymousClass2Bk {
    public static final Object A00(C63893iY r11) {
        C04220Ms.A0B(r11, 0);
        boolean z = false;
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r11, 0));
        Object A08 = C63893iY.A08(r11);
        C04220Ms.A0C(A08, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A08;
        String str2 = (String) C63893iY.A0C(r11, "null cannot be cast to non-null type kotlin.String", 2);
        Object A0B = C63893iY.A0B(r11, 3);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Long");
        long A082 = C18190wL.A08(A0B);
        C127397h3 A02 = C63893iY.A02(r11, 4);
        long now = AnonymousClass794.A00().A01.A00.now();
        if (A02 != null) {
            z = A02.A0T(35, false);
        }
        C04220Ms.A0B(str2, 2);
        C84684tg A00 = C63223h1.A00(str, A04);
        if (A00 == null) {
            return null;
        }
        A00.ABT(A082, str2, z, now);
        return null;
    }
}
