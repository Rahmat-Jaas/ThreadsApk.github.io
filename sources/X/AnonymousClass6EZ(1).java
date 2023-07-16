package X;

/* renamed from: X.6EZ  reason: invalid class name */
public final class AnonymousClass6EZ {
    public static final boolean A00(C1203079q r5) {
        long j = r5.A06;
        float A02 = C86124wJ.A02(j);
        if (A02 != Float.intBitsToFloat(C86104wH.A08(j))) {
            return false;
        }
        long j2 = r5.A07;
        if (A02 != C86124wJ.A02(j2) || A02 != Float.intBitsToFloat(C86104wH.A08(j2))) {
            return false;
        }
        long j3 = r5.A05;
        if (A02 != C86124wJ.A02(j3) || A02 != Float.intBitsToFloat(C86104wH.A08(j3))) {
            return false;
        }
        long j4 = r5.A04;
        if (A02 == C86124wJ.A02(j4) && A02 == Float.intBitsToFloat(C86104wH.A08(j4))) {
            return true;
        }
        return false;
    }
}
