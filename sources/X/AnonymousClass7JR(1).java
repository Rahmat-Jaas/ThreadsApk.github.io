package X;

import kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1;
import kotlin.jvm.internal.KtLambdaShape21S0101000_I2;

/* renamed from: X.7JR  reason: invalid class name */
public final class AnonymousClass7JR {
    public static final C148858sI A00(C147188nY r5, Object obj, int i) {
        AnonymousClass7WY r1;
        C04220Ms.A0B(r5, 0);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r5, i);
        Object A13 = A0Z.A13();
        if (A13 == AnonymousClass7GN.A00) {
            r1 = new AnonymousClass7WY(i, true);
            A0Z.A14(r1);
        } else {
            C04220Ms.A0C(A13, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            r1 = (AnonymousClass7WY) A13;
        }
        r1.A0B(obj);
        AnonymousClass7W3.A0w(A0Z, false);
        return r1;
    }

    public static final C148858sI A03(Object obj, int i, boolean z) {
        C04220Ms.A0B(obj, 2);
        return AnonymousClass7WY.A01(obj, i, z);
    }

    public static C148858sI A01(C147188nY r1, Object obj, int i, int i2) {
        return A00(r1, new KtLambdaShape168S0100000_I2_1(obj, i), i2);
    }

    public static C148858sI A02(C147188nY r1, Object obj, int i, int i2, int i3) {
        return A00(r1, new KtLambdaShape21S0101000_I2(obj, i, i2), i3);
    }

    public static final boolean A06(C142828ff r3, C142828ff r4) {
        C104036b8 r0;
        if (r3 == null) {
            return true;
        }
        if (!(r3 instanceof AnonymousClass7WO) || !(r4 instanceof AnonymousClass7WO)) {
            return false;
        }
        AnonymousClass7WO r2 = (AnonymousClass7WO) r3;
        if (r2.A03 == null || (r0 = r2.A02) == null || r0.A00 == Integer.MIN_VALUE || r3.equals(r4) || C04220Ms.A0I(r2.A02, ((AnonymousClass7WO) r4).A02)) {
            return true;
        }
        return false;
    }

    public static void A04(C147188nY r2, C121807If r3, Object obj, int i) {
        AnonymousClass7I9.A03(r2, r3, A00(r2, obj, i), 48);
    }

    public static void A05(C147188nY r2, Object obj, AnonymousClass7DS[] r4, int i) {
        AnonymousClass7Ai.A02(r2, A00(r2, obj, i), r4, 56);
    }
}
