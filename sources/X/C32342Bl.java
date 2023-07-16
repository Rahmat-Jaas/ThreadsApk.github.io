package X;

/* renamed from: X.2Bl  reason: invalid class name and case insensitive filesystem */
public final class C32342Bl {
    public static final Object A00(C63893iY r6) {
        C04220Ms.A0B(r6, 0);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r6, 0));
        String A0D = C63893iY.A0D(r6, 1);
        Object A09 = C63893iY.A09(r6);
        C04220Ms.A0C(A09, "null cannot be cast to non-null type kotlin.Long");
        long A08 = C18190wL.A08(A09);
        AnonymousClass3FZ r1 = AnonymousClass794.A00().A01;
        if (A0D == null) {
            return null;
        }
        try {
            r1.A00(A04, Integer.parseInt(A0D), A08);
            return null;
        } catch (NumberFormatException e) {
            C30967GcS.A03("BloksTTRCFunctionsUtil", e);
            return null;
        }
    }
}
