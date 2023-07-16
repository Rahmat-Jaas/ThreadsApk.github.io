package X;

/* renamed from: X.7FU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7FU {
    public static long A02(C147168nV r3, long j) {
        if (j != AnonymousClass7JK.A01) {
            return C86104wH.A0C(r3.CxD(AnonymousClass7JK.A02(j)), r3.CxD(AnonymousClass7JK.A00(j)));
        }
        return AnonymousClass7HB.A01;
    }

    public static long A03(C147168nV r3, long j) {
        if (j != AnonymousClass7HB.A01) {
            return C86104wH.A0C(r3.CxL(AnonymousClass7HB.A01(j)), r3.CxL(AnonymousClass7HB.A00(j)));
        }
        return AnonymousClass7JK.A01;
    }

    public static float A00(C147168nV r5, long j) {
        if (AnonymousClass7HC.A00(j) == 4294967296L) {
            return Float.intBitsToFloat(C86104wH.A08(j)) * r5.AjK() * r5.Acr();
        }
        throw C18180wK.A0a("Only Sp can convert to Px");
    }

    public static int A01(C147168nV r0, float f) {
        float CxL = r0.CxL(f);
        if (Float.isInfinite(CxL)) {
            return Integer.MAX_VALUE;
        }
        return AnonymousClass8bA.A02(CxL);
    }
}
