package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2JJ  reason: invalid class name */
public final class AnonymousClass2JJ {
    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        Object A0B = C63893iY.A0B(r11, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Number");
        int A04 = AnonymousClass0wJ.A04(A0B);
        int A042 = AnonymousClass0wJ.A04(C63893iY.A0C(r11, "null cannot be cast to non-null type kotlin.Number", A1Z ? 1 : 0));
        String A0E = C63893iY.A0E(r11, 2);
        C127397h3 A03 = C63893iY.A03(r11, 3);
        C109326jp A0L = A03.A0L(36);
        String A0o = C18220wO.A0o(A03);
        if (A0L != null) {
            Object A00 = C61043Rr.A00(r10, C63893iY.A01, A0L);
            if (A00 == null) {
                C30967GcS.A02("BloksInterpreter", "Evaluation of BKBloksDataQplMarkerPointParamsConstants.TIMESTAMP returned null");
            } else if (A00 instanceof Number) {
                long A08 = C18190wL.A08(A00);
                if (A08 > 0) {
                    AnonymousClass01V.A0p.markerPoint(A04, A042, A0E, A0o, A08, TimeUnit.MILLISECONDS);
                    return null;
                }
            }
            return null;
        }
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        if (A0o != null) {
            r0.markerPoint(A04, A0E, A0o);
            return null;
        }
        r0.markerPoint(A04, A042, A0E);
        return null;
    }
}
