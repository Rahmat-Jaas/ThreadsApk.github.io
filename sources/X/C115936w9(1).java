package X;

import android.graphics.Path;

/* renamed from: X.6w9  reason: invalid class name and case insensitive filesystem */
public final class C115936w9 {
    public static final boolean A00(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float A00 = C86104wH.A00(j);
        float intBitsToFloat = Float.intBitsToFloat(C86104wH.A08(j));
        if (((f5 * f5) / (A00 * A00)) + ((f6 * f6) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C147018nF r3, float f, float f2) {
        AnonymousClass7F6 r1 = new AnonymousClass7F6(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        AnonymousClass7X1 r2 = new AnonymousClass7X1(C86144wL.A0G());
        r2.A7N(r1);
        AnonymousClass7X1 r12 = new AnonymousClass7X1(C86144wL.A0G());
        r12.CVP(r3, r2, 1);
        Path path = r12.A01;
        boolean isEmpty = path.isEmpty();
        path.reset();
        r2.A01.reset();
        return !isEmpty;
    }
}
